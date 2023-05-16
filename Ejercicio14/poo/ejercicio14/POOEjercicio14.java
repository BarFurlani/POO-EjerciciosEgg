/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package poo.ejercicio14;

import Entidad.Movil;
import Servicio.ServMovil;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Movil mov1 = new Movil();
        ServMovil sm = new ServMovil();
        
        System.out.println("CARGANDO DATOS: MÓVIL");
        System.out.println("Cuantos móviles desea cargar?");
        int aux = leer.nextInt();
        
        for (int i = 0; i < aux; i++) {
            sm.cargarCelular();
        }
    }
}
