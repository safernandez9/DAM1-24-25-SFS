package ud2.funciones;

public class Recursividad {

    static void cuentaAtrasRecursiva(int n) {
        System.out.println(n);
        if (n > 0)
            cuentaAtrasRecursiva(n-1);
    }    
    
}
