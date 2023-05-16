/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes. 
 */
package poo.extra1;

import Entidad.Cancion;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cancion name = new Cancion();  //por parámetro
        name.setAutor("Shakira ");
        name.setTitulo("Donde están los ladrones?");
        
        System.out.println(name.getAutor() + name.getTitulo());
    }
    
}
