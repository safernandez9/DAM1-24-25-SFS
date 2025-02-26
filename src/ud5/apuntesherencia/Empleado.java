package ud5.apuntesherencia;

public class Empleado extends Persona {
    double salario;
    String estatura;

    Empleado() {

    }

    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, String estatura, double salario) {
        super(nombre, edad);
        this.estatura = estatura;
        this.salario = salario;
    }

    
    @Override
    public String toString() {
        return super.toString() + " - Salario=" + salario;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("EMPLEADO:");
        System.out.println(nombre);
        System.out.println(estatura);
        // super.mostrarDatos();
        // System.out.println(getApellido2());
        System.out.println(salario + " euros anuales.");
    }

    public static void main(String[] args) {
        Empleado maria = new Empleado("María", 30000);
        Empleado pepe = new Empleado("Pepe", 25, "XL", 30000);
        // System.out.println(pepe.edad);
        // pepe.saludar();

        System.out.println(pepe.estatura);
        pepe.mostrarDatos();

        Persona p = pepe;
        System.out.println(p.estatura);
        p.mostrarDatos();
        System.out.println(p.getClass().getSimpleName());

        Empleado nuevoPepe = (Empleado) p;
        System.out.println(nuevoPepe.estatura);
        nuevoPepe.mostrarDatos();

    }
}
