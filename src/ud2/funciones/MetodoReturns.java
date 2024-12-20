package ud2.funciones;

import java.util.Scanner;

public class MetodoReturns {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int año;
      System.out.print("Introduce año: ");
      año = sc.nextInt();
      sc.close();
      if (esBisiesto(año)) { // llamada al método
         System.out.println("Bisiesto");
      } else {
         System.out.println("No es bisiesto");
      }
   }

   /*
    * método que calcula si un año es o no bisiesto
    */
   public static boolean esBisiesto(int a) {
      if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
         return true;
      else
         return false;
   }

}
