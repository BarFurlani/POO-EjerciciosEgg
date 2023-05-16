package Service6;

import Entidad6.Cafetera;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class servCafetera {
    
    Scanner leer = new Scanner(System.in);
    
    Cafetera c1 = new Cafetera(2000, 1200); //son las cant max y actual respectivamente
    
    public void llenarCafetera(Cafetera c1){
        c1.setCantidadActual(c1.getCapasidadMaxima());
        System.out.println("La cafetera está llena");
    }
        
    public void servirTaza(){
        int cantidad = (int) c1.getCantidadActual();
        System.out.println("Ingrese el tamaño de la taza en ml. Ej 200"); 
        int taza = leer.nextInt();
        cantidad = cantidad-taza;
        if (cantidad<taza) {
            System.out.println("No se puede llenar la taza, solo se llenó con " + cantidad + " ml");     
        } else {
            System.out.println("La taza se llenó");
        }     
    }
    
    public void vaciarCafetera(){
        c1.setCantidadActual(0);
        System.out.println("Vaciado de cafetera completo");
    }

    public void agregarCafe(){
        if (c1.getCantidadActual()<c1.getCapasidadMaxima()) {
            int falta, cafe;
            falta = (int)c1.getCapasidadMaxima()- (int)c1.getCantidadActual();
            cafe = falta/10;
            System.out.println("Debe agregar " + cafe + " gramos de café y " + falta + "ml de agua");
        }else{
            System.out.println("La cafetera esta llena");
        }
    }
}
