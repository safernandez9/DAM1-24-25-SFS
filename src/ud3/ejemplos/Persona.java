package ud3.ejemplos;

public class Persona {
    //Datos 
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private double estatura = 1.80;
    private final String dni = null;

    public static int contadorPersonas;
    

    // CONSTRUCTORES
    Persona() {
    }    

    Persona(String nombre) {
        this.nombre = nombre;
    }    
    Persona (String nombre, int edad, double estatura) {
        this.nombre = nombre; //asigna el parámetro al atributo
        this.edad = edad;
        this.estatura = estatura;
     }
  
    Persona(String nombre, int edad) {                                                                     
        this.nombre = nombre;
        this.edad = edad;
        contadorPersonas++;
    }    



    // Otros Métodos

    public void inicializar(String n, String a1, String a2, int e){                                            
           nombre = n;
           apellido1 = a1;
           apellido2 = a2;
           edad = e;
           contadorPersonas++;
    }
    
    public String nombreCompleto() {
           return nombre + " " + apellido1 + " " + apellido2;
    }
    
    public boolean esMayorEdad() {
           if (edad >= 18){
               return true;
           }else{
               return false;
           }
    }

    public void cumplirAnhos() {
        edad++;
    }

    public int getEdad() {
        return edad;
    }



    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {

        if (estatura > 0)
            this.estatura = estatura;
    }

    void crecer(double incremento) {
        estatura += incremento; 
    }
    
    

    public static void incrementarContador(){
        contadorPersonas++;
    }    

    void saludar() {
        System.out.println("Hola. Mi nombre es " + nombre);
        System.out.println("Encantado de conocerte.");
    }


}
