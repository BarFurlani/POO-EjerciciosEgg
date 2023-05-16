/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package poo.ejercicio6;

import Entidad6.Cafetera;
import Service6.servCafetera;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servCafetera sc = new servCafetera();
        Cafetera cafe = new Cafetera();
        int menu = 0;

        do {
            System.out.println("");
            System.out.println("NESPRESSO");
            System.out.println("Menú");
            System.out.println("1- Llenar cafetera");
            System.out.println("2- Servir taza");
            System.out.println("3- Vaciar cafetera");
            System.out.println("4- Agregar café");
            System.out.println("5- Salir");
            System.out.println("");
            System.out.println("Elija una opción del menú");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("---Llenar cafetera---");
                    sc.llenarCafetera(cafe);
                    break;
                case 2:
                    System.out.println("---Llenar taza---");
                    sc.servirTaza();
                    break;
                case 3:
                    System.out.println("---Vaciar cafetera---");
                    sc.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("---Agregar café---");
                    sc.agregarCafe();
                    break;
                case 5:
                    System.out.println("Gracias por usar NESPRESSO");
            }
        } while (menu != 5);

    }

}
