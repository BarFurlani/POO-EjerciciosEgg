
package Service;

import Entidad.ArreglosEnt;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author ACER ASPIRE V
 */
public class ServicesArrays {
    
    ArreglosEnt arreglos = new ArreglosEnt();
    
    public void rellenarArreglo(){
      
        double [] arregloAux = new double [50];
        
        for (int i = 0; i < 50; i++) {
            arregloAux[i] = Math.random()*100;
            arregloAux[i] = Math.round(arregloAux[i]);
            System.out.print("[" + arregloAux[i] + "]");
        }
        System.out.println(" ");
      
        Arrays.sort(arregloAux);  //Esta función debe importarse y su fx es ordenar los componentes del arreglo
     
       arreglos.setArregloA(arregloAux);
      
        System.out.println("Arreglo A ordenado");
        
        for (int i = 0; i < 50; i++) {
            
             System.out.print("[" + arregloAux[i] + "]");
         }
        System.out.println(" ");
    }
    public void rellenaB(){
        double [] arregloAux1 = new double [20];
        
        System.out.println("Arreglo B");
        
        for (int i = 0; i < 10; i++) {
            arregloAux1[i] = arreglos.getArregloA() [i];
            System.out.print("[" + arregloAux1[i] + "]"); 
        }
        
        for (int i = 10; i < 20; i++) {
            arregloAux1[i] = 0.5; 
            System.out.print("[" + arregloAux1[i] + "]"); 
        }
        
        System.out.println(" ");
        arreglos.setArregloB(arregloAux1);
        
    }
}
