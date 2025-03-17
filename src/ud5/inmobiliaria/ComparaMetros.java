
package ud5.inmobiliaria;

import java.util.Comparator;

public class ComparaMetros implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Inmueble i1 = (Inmueble) o1;
        Inmueble i2 = (Inmueble) o2;
        return i1.m2 - i2.m2;
    }
    
}