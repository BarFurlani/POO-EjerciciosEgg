/*
Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set.
 */
package PersonaEnt;

import java.util.Date;

/**
 *
 * @author ACER ASPIRE V
 */
public class Persona {
   
    private String nombre;

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", naciemiento=" + naciemiento + '}';
    }
    private Date naciemiento;

    public Persona() {
    }

    public Persona(String nombre, Date naciemiento) {
        this.nombre = nombre;
        this.naciemiento = naciemiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNaciemiento() {
        return naciemiento;
    }

    public void setNaciemiento(Date naciemiento) {
        this.naciemiento = naciemiento;
    }
    
    
    
}
