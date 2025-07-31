//Saúl Fernández Salgado
package ud6.sfsexamenrec.genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class UtilGenerico {
    
    public static <T> int contarCoincidencias (Collection<T> t1, Collection<T> t2) {

        Set <T> s1 = new HashSet<>(t1);
        Set <T> s2 = new HashSet<>(t2);

        s1.retainAll(s2);
        return(s1.size());

    }

    public static <V,K> Map<V, List<K>> invertirOrden(Map <K,V> m1){

        Map <V, List<K>> m2 = new HashMap<>();
                return m2;

            


        
    }
    
    public static void main(String[] args) {
        
        int coincidencias;

        Map <Integer, String>  m = new HashMap<>();
        List <Integer> l1 = new ArrayList<>();
        List <Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        l2.add(1);
        l2.add(7);
        l2.add(4);
        l2.add(5);

        coincidencias = contarCoincidencias(l1, l2);

        System.out.println("Resultado 1:\n");
        System.out.println(coincidencias);


        m.put(1,"a");
        m.put(2,"b");
        m.put(3,"c");



        Map<String,List<Integer>> m2 = invertirOrden(m);

        System.out.println("\nResultado 2\n");
        System.out.println(m2);
    }
}
