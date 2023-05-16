/*
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia.
e) Método perimetro(): para calcular el perímetro.
*/

package Service;

import Entidad.CircunferenciaEnt;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class CircunferenciaService {
    
  //  CircunferenciaEnt obj1 = new CircunferenciaEnt(); No necesito llamarlo acá, porque lo 
                                                      //hago en el método crearCircunferencia
       Scanner leer = new Scanner(System.in);         //por eso mismo el return se hace de ese modo

    public CircunferenciaEnt crearCircunferencia(){ //creo el método llamando a la entidad
        System.out.println("Ingrese la medida del radio");  
        double radio = leer.nextDouble();
        
        return new CircunferenciaEnt(radio);    
    }
    
    public void area(CircunferenciaEnt obj1){       
        System.out.println("El área de la circunferencia es: " + (Math.PI * Math.pow(obj1.getRadio(), 2)));
    }
    
    public void perimetro(CircunferenciaEnt obj1){
        System.out.println("El perímetro de la circunferencia es: " + (2 * Math.PI * obj1.getRadio()));
    }
}
 