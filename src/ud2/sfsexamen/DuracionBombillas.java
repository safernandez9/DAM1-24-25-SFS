//Saúl Fernández Salgado

package ud2.sfsexamen;

public class DuracionBombillas {

    public static String causaFinBombilla(int nHoras, int nEncendidos, int horasEstimadas){

        int encendidosPosibles;
        String causa = "";

        //Manejo entradas incorrectas
        if(nHoras <= 0 || nEncendidos <= 0 || horasEstimadas > 10){
             return "ERROR";
        }

        encendidosPosibles = nHoras / horasEstimadas;
        
        //Manejo los 3 posibles casos
        if(encendidosPosibles < nEncendidos){
            causa = "HORAS";
        }
        else if(encendidosPosibles > nEncendidos){
            causa = "ENCENDIDOS";
        }
        else if(encendidosPosibles == nEncendidos){
            causa = "ENCENDIDOS + HORAS";
        }

        return causa;

    } 
}
