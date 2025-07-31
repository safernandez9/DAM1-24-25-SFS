//Saúl Fernández Salgado
package ud7.sfsexamen.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LogApache {
    public static void main(String[] args) {

        int accesos_incorrectos = 0;
        int accesos_totales = 0;
        boolean repetido = false;

        List <IP> listaIPs = new ArrayList<>();
        String [] lineasSeparandoIP;    
        String [] lineasSeparandoErrores;     
        IP i;
        

        //Declaro nombres de ficheros
        String entrada = "src\\ud7\\sfsexamen\\web\\bacharelato_access.log";

        //Try para la creacion del scanner que hace catch de que el fichero no exista y IOException para errorex variosx 
        try (Scanner sc = new Scanner(new File(entrada))){

            //Si no hay siguiente linea en sc (el de entrada) tiro excepcion
            if (!sc.hasNextLine()) {
                throw new IOException("El archivo está vacío.");
            }

            //Recorro con sc el fichero de entrada mientras haya algo
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                
                //Creo array de String para separar por -- y que en el puesto 0 quede la IP
                lineasSeparandoIP = linea.split("- -");
                lineasSeparandoErrores = linea.split("\"");

                 //Si hay menos de dos elementos la linea tiene formato incorrecto
                 if (lineasSeparandoIP.length < 2 || lineasSeparandoErrores.length < 3) {
                    System.out.println("Línea con formato incorrecto: " + linea);
                    continue;
                }

                //Contabilizo numero de accesos incorrectos y totales
                if(lineasSeparandoErrores[2].strip().startsWith("404")){
                    accesos_totales++;
                    accesos_incorrectos++;

                }
                else{
                    
                    accesos_totales++;
                }

                //Referencio con i un nuevo objeto IP pasandole el valor de la ip y lo añado a una lista
                i = new IP(lineasSeparandoIP[0].strip());
                for(IP ipRecorrer : listaIPs){
                    if(ipRecorrer.getIP().equals(i.getIP())){
                        ipRecorrer.incrementarRepeticiones();
                        repetido = true;
                    }
                    if(repetido){
                        break;
                    }
                }
                if(!repetido){
                    listaIPs.add(i);
                }

                repetido = false;
              
            }

            //Muestro datos
            System.out.println("Archivo analizado");
            System.out.println("Número de accesos al servidor: " + accesos_totales);
            System.out.println("Número de accesos incorrectos al servidor: " + accesos_incorrectos);
            Collections.sort(listaIPs);
            System.out.println(listaIPs);

        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + entrada + " no existe.");
        } catch (IOException e) {
            System.out.println("Error de entrada: " + e.getMessage());
        }
    }
}

