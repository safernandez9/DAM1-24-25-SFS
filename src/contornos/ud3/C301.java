package contornos.ud3;

import java.util.Scanner;

public class C301 {

static int Contador(int x, int y) {
    Scanner entrada = new Scanner(System.in);
    int num, c = 0;
    if (x > 0 && y > 0) {
        System.out.println("Introduce un número");
        num = entrada.nextInt();
        if (num >= x && num <= y) {
            System.out.println("\tNúmero no intervalo");
            c++;
        } else
            System.out.println("\tNúmero fóra do intervalo");
    } else
        c = -1;
    entrada.close();
    return c;
}

}
