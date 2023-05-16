/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entidad.Operaciones;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Calculadora {
 
    /* Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.  
*/
    Scanner leer = new Scanner(System.in);

    public Operaciones crearOperacion(){      //Creamos un método nombrado como la clase de entidad, que pasa a hacer el tipo para poder importarlo
       Operaciones objeto1 = new Operaciones();
       System.out.println("Ingrese los números con los que desea operar");
          objeto1.setNum1(leer.nextInt());
          objeto1.setNum2(leer.nextInt());
      return objeto1;         
    }
    
    public void metodoSuma(Operaciones objeto1){
        int suma = objeto1.getNum1() + objeto1.getNum2();
        System.out.println("La suma de los n° es: " + suma);
    }
    
    public void metodoResta(Operaciones objeto1){
        int resta = objeto1.getNum1() - objeto1.getNum2();
        System.out.println("La resta de los n° es: " + resta);
    }
    
    /*
     Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
    */
    
    public void metodoMultiplicar(Operaciones objeto1){
        if(objeto1.getNum1() != 0 && objeto1.getNum2() != 0){
            int mult = objeto1.getNum1() * objeto1.getNum2();
            System.out.println("La multiplicación da: " + mult);
        } else{
            System.out.println("Todo número multiplicado por cero es CERO");
        }
    }
    
    /*
    Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    */
    
     public void metodoDividir(Operaciones objeto1){
        if(objeto1.getNum1() != 0 && objeto1.getNum2() != 0){
            int div = objeto1.getNum1() / objeto1.getNum2();
            System.out.println("La división da: " + div);
        } else{
            System.out.println("ERROR. No se puede dividir por cero");
        }
    }
}
