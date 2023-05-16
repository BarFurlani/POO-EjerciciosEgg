/*
 Lo primero que debe hacerse es crear una clase con método main
 Posteriormente crearemos la clase persona
 */
package poo.manosobra;

import Entidad.Persona;
import Service.PersonaService;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOManosObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
     INSTANCIACION DE UN OBJETO (Creación)  ==> llama al método constructor
        Consiste en asignarles un espacio de memoria, al que hace referencia por el nombre 
        del objeto
        Para crear un objeto, debe declarse una variable de alguno de los tipos de
        clase definidas:
            <NombreClase> <nombreObjeto>;
        Para asignarle un espacio de memoria hay que instanciarlo con el operador new:
            <nombreObjerto> = new <nombreClase()>;
        Todo esto puede hacerse en un solo paso:
                Nombre Clase nombreObjeto = new NombreClase();
        
        Al realizar esto, aparecerá una señal en el contador de líneas, pidiendo 
        importar la clase (es = que para importar un -scanner)
    */
    
    Persona persona1 = new Persona(); //Instanciación usando el constructor vacío, se llama a la Entidad
    
    Persona persona2 = new Persona("Mariano"); //Instanciación con constructor por parámetro
    
    persona1.setNombre("Lucio");    //Ejemplo de invocación del método desde la clase hacia el main
    persona2.getNombre();
    
    //Se debe instanciar un objeto del Servicio, para acceder a sus métodos:
  /*servicio       nombreX   = new     servicio  ()atributos vacios; */
    PersonaService persCreada = new PersonaService(); 
    
    //Alojamiento del retorno:
  /*entidad  nombreY =  nombreX.nombreMétodo*/
       Persona persona3 = persCreada.crearPersona();
    //Muestra lo creado en el Service
       persCreada.mostrarPersona(persona3);
    }
        
}
