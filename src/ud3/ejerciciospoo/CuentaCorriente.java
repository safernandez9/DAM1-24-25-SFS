package ud3.ejerciciospoo;

/**
 * E0701. Diseñar la clase cuentacorriente, que almacena los datos: DNI y nombre del
 * titular, asi como el saldo. Las operaciones típicas con una cuenta corriente son:
 * ● Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
 * ● Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación,
 * si existe saldo suficiente.
 * ● Ingresar dinero: se incrementa el saldo.
 * ● Mostrar información: muestra la información disponible de la cuenta corrient
 */
public class CuentaCorriente {
    
    //Datos

    private String dni;
    private String nombreCompleto;
    private double saldo;


    //Constructor

    CuentaCorriente(String nombre, String dni){
        this.dni = dni;
        this.nombreCompleto = nombre;
        this.saldo = 0;
    }

    //Getter y Setter

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos

    public void sacarDinero(double dinero){

        if(dinero > 0 && this.saldo >= dinero){
            this.saldo -= dinero;
            System.out.println("Retirada efectuada correctamente. Saldo restante: " + this.saldo);
        }
        else{
            System.out.println("Retirada incorrecta. Número introducido menor que 0 o que el saldo de la cuenta. Saldo: " + this.saldo);
        }
    }

    public void ingresarDinero(double dinero){
        if(dinero > 0){
            this.saldo += dinero;
            System.out.println("Ingreso efectuado correctamente. Saldo: " + this.saldo);
        }
        else{
            System.out.println("Ingreso incorrecto. Número introducido menor que 0. Saldo: " + this.saldo);
        }
    }

    public void mostrarInfo(){
        
        System.out.println("Esta es su información:");
        System.out.println("Nombre:" + this.nombreCompleto);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo: " + this.saldo);
    }
}
