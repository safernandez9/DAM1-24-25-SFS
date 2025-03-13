package ud5.herenciaejercicios.EP0825a7a8_puntos;

public class Punto {
    int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distancia(Punto otroPunto) {
        if (otroPunto == null)
            return -1;
        else
            return Math.sqrt(Math.pow(x - otroPunto.x, 2) + Math.pow(y - otroPunto.y, 2));
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto other = (Punto) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Punto p2D = new Punto(2, 2);
        Punto p2D2 = new Punto(2, 2);
        Punto3D p3D = new Punto3D(3, 3, 3);
        Punto3D p3D2 = new Punto3D(5, 5, 5);
        Punto3D p3D3 = new Punto3D(2, 2, 5);
        Punto3D p3D4 = new Punto3D(3, 3, 3);
        Suceso suc1 = new Suceso(1, 1, 1, 1, "Pruebas");
        Suceso suc2 = new Suceso(1, 1, 1, 1, "Nuevas Pruebas");

        System.out.println("Distancia 1: " + p3D.distancia(p3D2));
        //System.out.println("Distancia 2: " + p3D.distancia(p2D)); // ClassCastException

        System.out.println("p2D.equals(p2D2)? " + p2D.equals(p2D2));
        System.out.println("p2D.equals(p3D3)? " + p2D.equals(p3D3));
        System.out.println("p3D.equals(p3D4)? " + p3D.equals(p3D4));

        System.out.println("suc1.equals(suc2)? " + suc1.equals(suc2));

    }

}
