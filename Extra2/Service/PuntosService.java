package Service;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class PuntosService {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){    //crear los dos puntos instanciando su construcción y guardando c/dato en los setter correspondientes
       Puntos obj1 = new Puntos();
       System.out.println("Ingrese 2 números para identificar la ubicación del punto '1' (X1 e Y1)");
       obj1.setX1(leer.nextDouble());
       obj1.setY1(leer.nextDouble());
       System.out.println("Ingrese 2 números para identificar la ubicación del punto '2' (X2 e Y2)");
       obj1.setX2(leer.nextDouble());
       obj1.setY2(leer.nextDouble());
    return obj1;
    }
     public void metodoCalcularYMostrar (Puntos obj1){
         //d(P1,P2)=√ ((x2-x1)2 + (y2-y1)2)
         //desglosado de la fórmula
         double x = obj1.getX2() - obj1.getX1();
         double x2 = Math.pow(x, 2); //Eleva al cuadrado otra forma de hacerlo es x*x
         double y = obj1.getY2() - obj1.getY1(); 
         double y2= Math.pow(y, 2);
         double suma = x2 + y2;
         double resultado = Math.sqrt(suma); //calcula la raiz
       
         System.out.println("La distancia entre los dos puntos es igual a: " + resultado);
     }
}
  