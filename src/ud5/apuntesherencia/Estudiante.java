package ud5.apuntesherencia;

public class Estudiante extends Persona{
    String curso;

    public Estudiante(String nombre, String curso) {
        super(nombre);
        this.curso = curso;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ESTUDIANTE");
        System.out.println(nombre + " - " + curso);
    }

    public static void main(String[] args) {
        Persona[] p = new Persona[5];

        p[0] = new Persona("Marta");
        p[1] = new Empleado("Pepe", 26, "XL", 25000);
        p[2] = new Estudiante("Pablo", "DAM");
        p[3] = new Empleado("Sandra", 29, "M", 34000);
        p[4] = new Estudiante("Juan", "ASIR");
        
        for(int i = 0; i < 5; i++){
            p[i].mostrarDatos();        
        }
                
    }
    
}
