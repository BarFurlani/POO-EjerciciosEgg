/*
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.

Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.

Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Service;

import PersonaEnt.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class ServicePersona {
    
    Persona persona1 = new Persona();
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        
        System.out.println("¿Cuál es el nombre de la persona?");
        persona1.setNombre(leer.nextLine());
        
        System.out.println("¿Cuál es la fecha de nacimiento? (Formato dd/mm/aaaa)");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt(); 
        
        Date nac = new Date(anio-1900, mes-1, dia);
        
        persona1.setNaciemiento(nac);  
        return persona1;
    }
    
    public int calcularEdad(){
        
        Date fechaActual = new Date();
               
       int dif = (fechaActual.getYear()) - (persona1.getNaciemiento().getYear());
       
        System.out.println("Su edad es " + dif + " años");  
        return dif;
    }
    
    public boolean menorQue(int dif){
        System.out.println("Ingrese una edad aleatoria");
        int edad = leer.nextInt();
        return dif<edad;
    }
    
    public void mostrarPersona(){
        System.out.println(persona1);
    }
}
