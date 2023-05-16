package Entidad;

/**
 *
 * @author ACER ASPIRE V
 */
public class ArreglosEnt {
    
   private double [] arregloA;
   private double [] arregloB;

    public ArreglosEnt() {
        arregloA = new double[50];
        arregloB = new double[20];
    }

   
    public ArreglosEnt(double[] arregloA, double[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }
 
    
}
