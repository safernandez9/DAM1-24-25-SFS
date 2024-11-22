package ud2.funciones;

import ud2.Util;

public class LlamadasUtil {
    
    public static void main(String[] args) {
        
        Util.esPar(Util.plantillaComprobarTipoEntero("Introduzca un número entero"));
        Util.mayor(Util.plantillaComprobarTipoEntero("Introduzca un número entero"), Util.plantillaComprobarTipoEntero("Introduzca un número entero"));
        Util.esCasiCero(Util.plantillaComprobarTipoFloat("Introduzca un número:"));
    }
}
