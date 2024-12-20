package ud3.apuntes;

import java.util.Scanner;

import ud3.apuntes.Persona.Sexo;

public class EjemploEnum {
    public static void main(String[] args) {
        DiaDeLaSemana hoy;

        Scanner sc = new Scanner(System.in);
        System.out.println("Que dia de la semana es hoy?");
        hoy = DiaDeLaSemana.valueOf(sc.nextLine().toUpperCase());

        if (hoy == DiaDeLaSemana.VIERNES) {
            System.out.println("Por fin es viernes!!!");
        }


        Persona p = new Persona("Pepe", Sexo.HOMBRE);
        Persona pp = new Persona("Marta", "MUJER");

        System.out.println("FIN");

    }
}
