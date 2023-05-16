package Entidad6;

/**
 *
 * @author ACER ASPIRE V
 */
public class Cafetera {
    
   public double capasidadMaxima, cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capasidadMaxima, double cantidadActual) {
        this.capasidadMaxima = capasidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapasidadMaxima() {
        return capasidadMaxima;
    }

    public void setCapasidadMaxima(double capasidadMaxima) {
        this.capasidadMaxima = capasidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }  
}
