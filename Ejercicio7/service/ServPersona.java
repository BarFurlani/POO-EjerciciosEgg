package service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class ServPersona {

    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo: H/M/O");
        String sexo = leer.next().toUpperCase().substring(0, 1);

        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.print("Ingrese una opción válida: ");
            sexo = leer.next().toUpperCase().substring(0, 1);
        }
        p1.setSexo(sexo);

        System.out.println("Ingrese la altura (en metros)");
        p1.setAltura(leer.nextDouble());

        System.out.println("Ingrese el peso (en Kg)");
        p1.setPeso(leer.nextDouble());
        
        return p1;
    }

    public int calcularIMC(Persona p1) {
 
        double imc = p1.getPeso() / (Math.pow(p1.getAltura(), 2));
        if (imc < 20) {
            return -1;
        }
        if (imc >= 20 && imc <= 25) {
            return 0;
        }
        return 1;
    }
        
    public boolean esMayorDeEdad(){
        return p1.getEdad() >= 18;
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println(p1.getNombre() + ", " + p1.getEdad() + " años, " + p1.getSexo() + ", " + p1.getAltura() + " mt., " + p1.getPeso() + " Kg.");
        int imc = calcularIMC(p1);
        
    }
}
