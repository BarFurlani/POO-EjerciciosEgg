
package Service;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class RaicesService {
    Scanner leer = new Scanner(System.in);
        Raices obj1 = new Raices(); //definir el obj fuera, para usarlo en todos lo met
    public Raices construir(Raices obj1){
      // Raices obj1 = new Raices();
       System.out.println("Ingrese 3 valores para la ecuación");
       obj1.setA(leer.nextDouble());
       obj1.setB(leer.nextDouble());
       obj1.setC(leer.nextDouble());
    return obj1; 
    }
    
    public double getDiscriminante(Raices obj1){
        //(b^2)-4*a*c
        
        double resultado = (Math.pow(obj1.getB(), 2)) -  4 * obj1.getA() * obj1.getC();
        //RaicesService ecuacion = new RaicesService();
      //  ecuacion.tieneRaices(resultado); //llamo el método tienenRaices para que con solo el getDiscriminante se muestre la 
         return resultado;                  //solución por pantalla 
                /*Al cambiar el metodo de void por double, devuelo el resultado, esto me va a permitir
                llamar el metodo booleano sin problema, ya que en el main, el "resultado"
                lo voy a pasar por parametro al metodo y al main*/     
    }
    
    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor que 0
    */
    public boolean tieneRaices(Raices obj1){  //este método no se va a llamar por si solo en el main, si no que lo voy                                                 
       boolean bandera = false;               //a llamar en el métdo donde hago la ecuacion
       if(getDiscriminante(obj1)>=0){
           bandera = true;
           System.out.println("El resultado posee 2 soluciones");
       } else
            System.out.println("El resultado no tiene 2 soluciones");
       return bandera;
    }
    /*
     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
    */
    
    public boolean tieneRaiz(Raices obj1){
        boolean bandera = false;                    
       if(getDiscriminante(obj1)==0){
           bandera = true;
           System.out.println("El resultado posee una única solución");
       } 
       return bandera; 
    }
    
    /*
     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
    */  
    public double[] obtenerRaices(Raices obj1){  //en el métdo debo aclarar que es un array
       double[] raices = new double[2];
        
            //(-b + Math.sqrt(discriminante))/(2*a)
            //(-b - Math.sqrt(discriminante))/(2*a)        
         raices[0] = (- obj1.getB() + Math.sqrt(getDiscriminante(obj1)))/(2*obj1.getA());
         raices[1] = (- obj1.getB() - Math.sqrt(getDiscriminante(obj1)))/(2*obj1.getA());
       
      return raices; 
    }
    /*
     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
    */
    public double obtenerRaiz(Raices obj1){
        double raiz = (- obj1.getB() / (2*obj1.getA()));
     return raiz;      
    }
    /*       
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
*/
    public void calcular(Raices obj1){
      if (tieneRaices(obj1)){
          double[] raices = obtenerRaices(obj1);
          System.out.println ("Las raices son " + String.format("%.3f", raices[0]) + " y " + String.format("%.3f", raices[1]));
      } else { 
          if(tieneRaiz(obj1)){
              System.out.println("La raiz es: " + String.format("%.3f", obtenerRaiz(obj1))); //fx para poder mostrar este tipo de resultado
              System.out.println("La ecuación no tiene solución");
          }
        } 
    }}

