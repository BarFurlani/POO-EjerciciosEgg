/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package poo.ejercicio1;

import Entidad.Libro;
import Service.ServiceLibro;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        ServiceLibro sl = new ServiceLibro();
        
        Libro book = sl.cargarLibro();
        
        System.out.println(book.toString());
        
    }
    
}
