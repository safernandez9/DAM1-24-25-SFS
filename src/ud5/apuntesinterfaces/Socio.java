package ud5.apuntesinterfaces;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Socio implements Comparable {
    int id;
    String nombre;
    LocalDate fechaAlta;

    public Socio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Socio(int id, String nombre, LocalDate fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return id + "-" + nombre + "-" + fechaAlta;
    }

    public static void main(String[] args) {
        Socio s = new Socio(1, "María", LocalDate.of(2000, 1, 1));
        Socio s2 = new Socio(2, "Lolo", LocalDate.of(1990, 3, 25));

        if (s.compareTo(s2) == 0) {
            System.out.println("Son iguales");
        } else if (s.compareTo(s2) < 0) {
            System.out.println(s.nombre + " es menor que " + s2.nombre);
        } else {
            System.out.println(s.nombre + " es mayor que " + s2.nombre);
        }

        System.out.println("ARRAY DE SOCIOS ORDENADO");
        Socio[] socios = {
                s,
                s2,
                new Socio(5, "Paco", LocalDate.of(2010, 3, 25)),
                new Socio(4, "Laura", LocalDate.of(2005, 3, 25)),
                new Socio(9, "Jose", LocalDate.of(2010, 3, 25)),
                new Socio(3, "Jose", LocalDate.of(2010, 3, 25)),
                new Socio(8, "Jose", LocalDate.of(2010, 5, 25)),
        };

        System.out.println(Arrays.toString(socios));

        ComparaSociosFecha ordenFecha = new ComparaSociosFecha();
        Arrays.sort(socios, ordenFecha);
        System.out.println(Arrays.toString(socios));
        Arrays.sort(socios, ordenFecha.reversed());
        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios, new ComparaSociosNombre());
        System.out.println(Arrays.toString(socios));


        Arrays.sort(socios, getCompNombre());
        System.out.println(Arrays.toString(socios));
    }

    private static Comparator getCompNombre() {
        return new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Socio) o1).id - ((Socio) o2).id;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return id == socio.id && Objects.equals(nombre, socio.nombre) && Objects.equals(fechaAlta, socio.fechaAlta);
    }

    @Override
    public int compareTo(Object o) {
        Socio socio = (Socio) o;
        int res = fechaAlta.compareTo(socio.fechaAlta);
        if (res == 0) {
            res = this.nombre.compareTo(socio.nombre);
            if (res == 0) {
                res = this.id - socio.id;
            }
        }
        return res;
    }

    /*@Override
    public int compareTo(Object o) {
        Socio otroSocio = ((Socio) o);
        int res = nombre.compareTo(otroSocio.nombre);
        if (res == 0) {
            res = otroSocio.id - id;
        }
        return res;
    }*/

    /*@Override
    public int compareTo(Object o) {
        Socio otroSocio = ((Socio) o);
        int res = id - otroSocio.id;
        return res;
    }*/



}

