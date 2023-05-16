/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
 */
package Entidad;

/**
 * @author ACER ASPIRE V
 */
public class CircunferenciaEnt {
    
    private double radio;

    public CircunferenciaEnt() {
    }

    public CircunferenciaEnt(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
