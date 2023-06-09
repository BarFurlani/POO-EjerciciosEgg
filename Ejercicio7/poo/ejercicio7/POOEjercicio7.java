/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */

/*
EJERCICIO INCOMPLETO. SÓLO SETTEA A LA ÚLTIMA PERSONA CREADA => NO HACE LOS CÁLCULOS, PERO SI SE CREAN POR PARÁMETRO SALE
*/
package poo.ejercicio7;

import Entidad.Persona;
import service.ServPersona;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServPersona sp = new ServPersona();
        Persona[] pers = new Persona[4]; //importo a la entidad, creando ya el array, que me permite crear c/u de los objetos

        for (int i = 0; i < 4; i++) {
            System.out.println("Persona n° " + (i + 1) + " :");
            pers[i] = sp.crearPersona();
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona n° " + (i+1) + " : " + pers[i]);
        }

        int[] imc = {sp.calcularIMC(pers[0]), sp.calcularIMC(pers[1]), sp.calcularIMC(pers[2]), sp.calcularIMC(pers[3])};
        int[] edades = {pers[0].getEdad(), pers[1].getEdad(), pers[2].getEdad(), pers[3].getEdad()};

        int pesoBajo = 0, pesoN = 0, sobrePeso = 0, mayor = 0, menor = 0;

        for (int i = 0; i < 4; i++) {
            if (imc[i] == 0) {
                pesoN +=1;
            }
            if (imc[i] == 1) {
                sobrePeso +=1;
            } else {
                pesoBajo +=1;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (edades[i] >= 18) {
                mayor +=1;
            } else {
                menor +=1;
            }
        }

        System.out.println("Menores de edad: " + (menor * 100 / 4) + "%");
        System.out.println("Mayores de edad: " + (mayor * 100 / 4) + "%");
        System.out.println("IMC bajo: " + ((pesoBajo * 100) / 4) + "%");
        System.out.println("IMC normal: " + ((pesoN * 100) / 4) + "%");
        System.out.println("IMC alto: " + ((sobrePeso * 100) / 4) + "%");
    }
}
