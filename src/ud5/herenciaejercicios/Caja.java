package ud5.herenciaejercicios;

/**
 * EP0812. Las empresas de transporte, para evitar daños en los paquetes, embalan todas
 * sus mercancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un
 * ancho, un alto y un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada
 * una etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del
 * destinatario, dirección, etc. Implementa la clase Caja con los siguientes métodos:
 * 
 * ● Caja(int ancho, int alto, int fondo, Unidad unidad): que
 * construye una caja con las dimensiones especificadas, que pueden encontrarse en
 * “cm” (centímetros) o “m” (metros).
 * 
 * ● double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.
 * 
 * ● void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de
 * la caja.
 * 
 * ● String toString(): que devuelve una cadena con la representación de la caja.
 */

public class Caja {
    
    int ancho;
    int alto;
    int fondo;
    String etiqueta;
    Unidad unidad;
    

    
    public enum Unidad{
        cm, m;
    }

    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getVolumen(){
        
        double medida;

        medida = (this.unidad == Unidad.m)?(1.0):(0.01);

        return (ancho * medida) * (alto * medida) * (fondo * medida);
    }

    public void setEtiqueta(String etiqueta){
        if(etiqueta.length() <= 30){
            this.etiqueta = etiqueta;
        }
        else{
            System.out.println("Error, introduzca menos de 31 caracteres.");       
        }
    }

    @Override
    public String toString(){
        return("Caja: Ancho = " + this.ancho + " " + this.unidad 
        + " ,Alto = " + this.alto + " " + this.unidad 
        + " ,Fondo = " + this.fondo + " " + this.unidad 
        + " ,Informacion extra: " + this.etiqueta);
    }
}
