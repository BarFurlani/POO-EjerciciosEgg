/*
La CLASE SERVICIO (control) es una clase auxiliar que nos ayuda con el manejo de
las clases. 
tener en cuenta Patrones GRASP (buenas prácticas de aplicación para el desarrollo)
                           General Responsibility Assignment Software Patterns
Esto sirve para normalizar quien hace que cosa en cada momento y como debe realizarse

Es DONDE vamos vamos a CREAR LOS OBJETOS --> MÉTODO
Se debe crear una clase servicio para cada objeto que creemos, la idea es que c/servicio se 
encargue de una sola clase(Objeto/entidad).

Llama los atributos de la entidad para crear los métodos, mientras que esta clase va a ser 
llamada en el main.

 */
package Service; //Se crea dentro de la carpeta que contiene las demás clases

import Entidad.Persona;
import java.util.Scanner;


/**
 * @author ACER ASPIRE V
 */
public class PersonaService {
    /*
    Tener en cuenta:
        PARÁMETROS Y ARGUMENTOS --> son los valores qhe se pasan a un método durante su invocación
            |->definen la cantidad y el tipo de datos de los valores que recibe un método para
                su ejecución
    El método puede tener tantos parámetros como sea necesario, y se define así:
        <tipo nombre [tipo nombre]>
    durante su invocación es importante que el n° y tipo de argumentos coincidan con el n° y
    tipo de parámetros declarados ("strongly tiped")
    */
    
   //-PASO PARÁMETRO- 
 
    Scanner leer = new Scanner(System.in);
 //modificador tipo (nombreMétodo) (){
 //}   
    public Persona crearPersona(){ //invoco el método, llamando la entidad(importarla)
                                   //además, se hace una copia de los valores de los argumentos
                                   //sin modificar el valor original
       
       Persona personaCompleta = new Persona();  //instanciamos objeto persona con atributos vacios
       
       //xej: pedimos al usuario que ingrese la info nec
        System.out.println("Ingrese el nombre de la persona");
        
        //usamos el obj para invocar el método SET y recibir la información
        personaCompleta.setNombre(leer.next());
       
       return personaCompleta; //va a devolver el objeto, si no quiero retornar un valor
                               //al método lo debo declarar void
    }
    //A esto lo vamos a llamar en el MAIN
    
    
/*Crear un método void que reciba un objeto tipo persona como parámetro y utilice el get para
mostrar sus atributos. Llama ese método desde el main*/
    public void mostrarPersona(Persona personaCompleta){
        String nombre = personaCompleta.getNombre();
        System.out.println(nombre);
    }
}
