package ud4.stringsapuntes;

public class Pruebas {
    public static void main(String[] args) {
        char ch = 'a' + 1;
        System.out.println(('a' + 1));          // 98
        System.out.println((char)('a' + 1));    // 'b'
        System.out.println(ch);                 // 'b'

        ch = (char) (ch + 'A' - 'a');
        System.out.println(ch);                 // 'B'

        for (int i = 0; i < 500; i++)
            System.out.println((char) i );
    }
}
