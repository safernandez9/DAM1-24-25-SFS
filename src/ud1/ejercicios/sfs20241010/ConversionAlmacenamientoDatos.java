/* package ud1.ejercicios.sfs20241010;
import java.util.Scanner;
import java.util.String;

public class ConversionAlmacenamientoDatos{

    public static void main(String[] args){
        
        double cantidad;
        String medida;   
        String medidaResultado;     
        double resultado = -1;
        
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número de bytes, kilobytes, megabytes o gigabytes:");
        cantidad = sc.nextDouble();
        
        System.out.println("Introduzca la unidad de medida de su número mediante los carácteres: b para bytes, k para kilobytes, m para megabytes o g para gigabytes:");
        medida = sc.nextString();

        System.out.println("Introduzca la unidad de medida a la que quiere convertir su número mediante los carácteres: b para bytes, k para kilobytes, m para megabytes o g para gigabytes:");
        medidaResultado = sc.nextString();

        sc.close();

        resultado = (medida.equals(medidaResultado))?():();


    }
}

Desarrolla un programa en Java que convierta unidades de almacenamiento entre bytes, kilobytes (KB), megabytes (MB) y gigabytes (GB). 
Solicita al usuario la cantidad de datos y la unidad de origen y destino.

1 KB = 1024 bytes
1 MB = 1024 KB
1 GB = 1024 MB
El programa deberá realizar la conversión correspondiente y mostrar el resultado.
*/
