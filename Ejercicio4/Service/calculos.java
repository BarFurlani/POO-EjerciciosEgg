
/*
La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura
*/
package Service;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class calculos {
    
    Scanner leer = new Scanner(System.in);
    Rectangulo rect = new Rectangulo();
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base y altura del rectángulo"); 
        rect.setBase(leer.nextInt());
        rect.setAltura(leer.nextInt());
        
        return rect;
    }
    
    public void calcularSuperficie(Rectangulo rect){
        System.out.println("La superficie es: " + (rect.getBase()*rect.getAltura()));
    }
    
    public void calcularPerimetro(Rectangulo rect){
        System.out.println("El perímetro es: " + ((rect.getBase()+rect.getAltura())*2));
    }
    
    public void mostrarRectangulo(Rectangulo rect){
        String aux;
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if(i==0 || i == rect.getAltura()){
                    System.out.println("* ");
                }else{
                    if(j==0 || j == rect.getBase()-1){
                        aux = "* ";
                    } else{
                        aux = " ";
                    }
                    System.out.println(aux);
                }     
            }
            System.out.println("");
        }
    }
}
