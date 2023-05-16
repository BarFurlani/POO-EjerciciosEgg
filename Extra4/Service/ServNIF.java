package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class ServNIF {
    Scanner leer = new Scanner(System.in);
    String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    
    public NIF crearNIF(){             
        System.out.println("Ingrese el DNI");
        long dni = leer.nextLong();
        System.out.println("");
        System.out.println("....Calculando....");
        System.out.println("");
    
        int posNIF = (int)(dni % 23);
        String letra = letras[posNIF];
        
        return new NIF(dni, letra.charAt(0));
    }
    
    public void mostrarNIF (NIF n){
        System.out.println("NIF: " + n.getDNI() + "-" + n.getLetra());
    }
}
