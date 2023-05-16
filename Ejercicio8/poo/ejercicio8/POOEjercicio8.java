/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package poo.ejercicio8;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
        
        c1.setFrase(frase);
        c1.setLongitud(frase.length());
        
        System.out.println("La frase contiene " + c1.mostrarVocales(c1) + " vocales.");
        System.out.println("La frase invertida es: " + c1.invertirFrase(c1));
       
        System.out.println("Ingrese una letra");
        String letra = leer.next().toUpperCase().substring(0, 1);
        System.out.println("La letra: " + letra + " se repite " + c1.vecesRepetidas(c1, letra) + " vez/veces");
        
        System.out.println("Ingrese una nueva palabra o frase");
        frase = leer.next();
        
        if (c1.compararLongitud(frase, c1) == true) {
            System.out.println("Las frasees tienen la misma cantidad de caracteres");
        } else {
            System.out.println("La frase no tiene la misma longitud");
        }
        
        System.out.println("La 1° frase/palabra unida a la 2° queda así: " + c1.unirFrases(frase, c1));
        System.out.println("Ingrese una letra para ver si se encuentra en la frase");
        letra = leer.next();
        
        if (c1.contieneLetra(letra, c1) == true) {
            System.out.println("La frase contiene la letra ingresada");
        } else {
            System.out.println("Esa letra no se encuentra en la frase");
        }
    }   
}
