package ud3.apuntes;

public class Envolventes {
    public static void main(String[] args) {
        int k = 23;
        Integer num = k;

        String s = "-4.65";
        Float ft = Float.valueOf(s);
        float fPrim = ft;
        System.out.println("Float: " + ft.toString());
        System.out.println("float: " + fPrim);
        

        String s1 = "-25", s2= "89.2";
        int n = Integer.parseInt(s1);
        double d = Double.parseDouble(s2);                

        int a = Integer.parseInt("10FF", 16); // Genero un número en hexasdecimal

        System.out.println(a); // Imprimo en decimal
        System.out.println (Integer.toString(a,2)); // Imprimo en binario (base 2)


        System.out.println("Fin");
    }
}
