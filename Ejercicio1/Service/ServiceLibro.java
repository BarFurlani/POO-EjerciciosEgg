package Service;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class ServiceLibro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro(){
        System.out.println("Ingrese el título del libro");
        String libro = leer.nextLine();
        System.out.println("Ingrese el autor");
        String autor = leer.nextLine();
        System.out.println("Ingrese el ISBN");
        String isbn = leer.nextLine();
        System.out.println("Ingrese el número de páginas");
        int paginas = leer.nextInt();
        
        return new Libro(isbn, libro, autor, paginas);
    }
    
}
