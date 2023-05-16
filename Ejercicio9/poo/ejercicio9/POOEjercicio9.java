/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package poo.ejercicio9;

import EntyServ.Matematica;
import EntyServ.ServMath;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica math = new Matematica();
        ServMath m1 = new ServMath();
        
        math.setN1(Math.random()*10);
        math.setN2(Math.random()*10);
        
        System.out.println("Los números son: " + math.toString());
        
        System.out.println("El número mayor es: " + m1.devolverMayor(math));
        System.out.println("Su potencia es: " + m1.calcularPotencia(math));
        System.out.println("Su raíz es: " + m1.calcularRaiz(math));
    }   
}
