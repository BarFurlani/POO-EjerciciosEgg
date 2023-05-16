/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia.
e) Método perimetro(): para calcular el perímetro.
 */
package poo.ejercicio2;

import Entidad.CircunferenciaEnt;
import Service.CircunferenciaService;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
       CircunferenciaService serv = new CircunferenciaService();
       
       CircunferenciaEnt obj1 = serv.crearCircunferencia();
      
       System.out.println("CIRCUNFERENCIA");    
       
       serv.area(obj1);
       serv.perimetro(obj1);
        
    }
    
}
