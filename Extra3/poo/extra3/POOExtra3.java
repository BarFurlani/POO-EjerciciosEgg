/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package poo.extra3;

import Entidad.Raices;
import Service.RaicesService;

/**
 *
 * @author ACER ASPIRE V
 */
public class POOExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  
        RaicesService coeficientes = new RaicesService(); 
        Raices constu = new Raices();
        coeficientes.construir(constu);
        double discriminante = coeficientes.getDiscriminante(constu); //creo un double con un nombreX, para poder traer el
                                                                      //booleano, y debo inicializarlo, en este caso, debe ser
                                                                      //con el resultado del discrimiante.
        //  coeficientes.getDiscriminante(constu);    No se llama aparte, porque ya lo llame igualando arriba 
      
        System.out.println("El discriminante es: " + coeficientes.getDiscriminante(constu));
       
        System.out.println("-------POSEE RAICES-------");
        System.out.println(coeficientes.tieneRaices(constu));  
        System.out.println(coeficientes.tieneRaiz(constu));
      
        coeficientes.obtenerRaices(constu);
        
        System.out.println(coeficientes.tieneRaiz(constu));
        
       coeficientes.calcular(constu);
    }      
}
          