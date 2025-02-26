package ud5.apuntesherencia;

public class Estudiante extends Persona {
    String curso;

    public Estudiante(String nombre, String curso) {
        super(nombre);
        this.curso = curso;
    }


    
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", curso=" + curso + "]";
    }



    @Override
    public void mostrarDatos() {
        System.out.println("ESTUDIANTE");
        System.out.println(nombre + " - " + curso);
    }

    public static void main(String[] args) {
        Persona[] p = new Persona[6];

        p[0] = new Persona("Marta", 30);
        p[1] = new Empleado("Pepe", 26, "XL", 25000);
        p[2] = new Estudiante("Pablo", "DAM");
        p[3] = new Empleado("Sandra", 29, "M", 34000);
        p[4] = new Estudiante("Juan", "ASIR");
        p[5] = new Persona("Marta", 30);        

        System.out.println("POLIMORFISMO: mostrarDatos()");
        for (Persona per : p) {
            per.mostrarDatos();
        }

        // Cómo separar los Empleados de los Estudiantes en dos arrays distintos?

        System.out.println("POLIMORFISMO: toString()");
        for (Persona per : p) {
            System.out.println(per);
            if (per instanceof Estudiante)
                System.out.println("Practica!!");
        }

        System.out.println(p[0] == p[5]);
        p[0].dni = "3333333";
        p[5].dni = "3333333";
        System.out.println(p[0].equals(p[5]));            

    }

}
