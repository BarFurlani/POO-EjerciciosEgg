
package Entidad;

//Es donde se alojan los MÉTODOS y ATRIBUTOS
                            //A menos que creemos la classe Servicio, que es la que va a contener los métodos
//Es la CLASE
/**
 * @author ACER ASPIRE V
 */

/*Crear un nuevo proyecto "Java Application"
    dentro de este crear un "método main"
    sobre la carpeta Source Packages crear un nuevo "Java Package" llamado: Entidad
    dentro de este crear un nuevo "Java Class", llamado: Persona

        *****   CON ESTO TENEMOS NUESTRO NUEVO CONTENEDOR: OBJETO   ***** 
*/

/*
Dentro de la carpeta entidad, voy a crear c/u de los objetos necesarios que 
requiera mi código
*/

public class Persona {  /*dentro del proceso, se cargaran los atributos,
                           constructores o métodos necesarios para crear el objeto*/
   
   /*CREACIÓN DE ATRIBUTOS:
         <modificador> puede ser de tipo "public, protected, private"
         <tipo> es el tipo de variable que vamos a ingresar "String, int", etc.
         <nombre> nombre que le vamos a dar a la variable
    */ 
                                    //ATRIBUTOS ESTÁTICOS: <static> indica que el método 
                                    //o atributo pertenece a la propia clase, y es única
    public String nombre;           //para todas las intancias (objetos) de la clase
    public int edad;                //ej: <private static String nombre;> 
    public double altura;  
                                    //ATRIBUTOS FINALES: determina que dicho atributo NO
                                    //puede ser sobreescrito/redefinido, tomándolo como
                                    //una cte, por ej:
                                    //<private final int edad;
    
    /* CONSTRUCTORES: métodos para crear el objeto (instanciación)
        se conforma de la sig manera:
             <modificador> <nombre de la clase> (<argumneto>){
                 por debajo va la <sentencia>
              }
        Este método se ejecuta c/v que se inicia un objeto de la clase
    
                    **********
        Los constructores pueden generarse automáticamente, haciendo click der sobre 
        la clase --> "Insert Code" --> "Constructor" --> se puede o no seleccionar el 
        atributo para generarlo por parámetro
    */
    public Persona() {  //Este es el constructor por defecto y debe ejecutarse c/v que se instancia un objeto
    }
    
    public Persona (String nombre){
        this.nombre = nombre;  //la palabra "this" se usa para diferenciarentre los atributos del objeto y los identificadores
    }

    public Persona(int edad, double altura) {
        this.edad = edad;
        this.altura = altura;
    }

    //Los 3 anteriores son los métodos constructores!
    
    /*INSTANCIAR (LLAMAR) 2 OBJETOS EN EL MÉTODO "MAIN": en la clase que creamos 
    cuando iniciamos el proyecto 
              (lo nombre POOManosObra)
    */    
    
    /*
    **** MODIFICADORES DE ACCESO ****
    Nos deja elegir como se accede a los datos, su visibilidad:
    public --> permite acceder a los elementos desde cualquier clase
    private --> sólo se pueden acceder desde la clase en la que se encuentran
    protected --> sólo pueden ser accedidos desde su mismo paquete y desde cualquier
        clase que extienda la clase en que sde encuentra
    Si no se especifica, se utiliza por defecto.
    
    Los MODIFICADORES nos permiten reunir/ENCAPSULAR en una estructura a todos los 
    elementos que se puedan considerar pertenecientes a una misma entidad
    */
    
    /*
     **** MÉTODOS PROPIOS ****
    Funciones que determinan el comportamiento de los objetos
    Todos los objetos de una misma clase tienen los mismos métodos y el mismo comportamiento
    
        <modificador> <tipo de retorno> <nombre> (<argumentos>){
            <sentencias>
            return valorRetorno;
        }
    
        Modificador: es el modificador de acceso (aunque existen otros)
        Tipo de retorno: indica el tipo de valor devuelto por el método, si no devuelve
        ningún valor se declara <void>. Por ejemplo si el valor de retorno es de tipo 
        <int>, el método debe ser <int>
        Nombre: es el identificador
        Argumentos: son los valores que voy a pasar para usar en el método, y están
        entre si separados por comas e identificados por su tipo e identificador
    
    Existen 3 tipos de métodos:
        de Consulta --> para extraer información de los objetos <GETTER>
        Modificadores --> para modificar el valor de los atributos del objeto <SETTER>
        Operacionales --> definen el comportamiento de un objeto
    */
                                    
    public String getNombre() {         //Estos métodos los ingreso automáticamente
        return nombre;                  //desde "Insert code: getter & setter" y allí selecciono 
    }                                   //todos los atributos

    public void setNombre(String nombre) {
        this.nombre = nombre;                   //Sí el método se invoca fuera de la clase
    }                                           //se debe indicar el nombre del objeto (ej. "persona")
                                                //y el nombre del método --> ir al main
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}      



