package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class ServMovil {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Movil mov = new Movil();

    public void cargarCelular() {
        System.out.println("");
        System.out.println("Ingrese la marca:");
        mov.setMarca(leer.next());
        System.out.println("Ingrese el modelo:");
        mov.setModelo(leer.next());
        System.out.println("Ingrese la cantidad de memoria RAM (GB):");
        mov.setMemoriaRAM(leer.nextInt());
        System.out.println("Ingrese los GB de alamcenamiento interno:");
        mov.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el precio:");
        mov.setPrecio(leer.nextDouble());
        ingresarCodigo();
    }

    public void ingresarCodigo(){
        int[] codigo = new int[7];        
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el " + (i+1) + "° dígito del código:");
            int cd = leer.nextInt();
            codigo[i]= cd;
        }
    }
    
    public void mostrarCodigo(int[] codigo){
        for (int i = 0; i < 7; i++) {
            System.out.println("[" + codigo[i] + "]");
        }
        System.out.println("");
    }
}
