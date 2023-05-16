package Service;

import Entidad.Ahorcado;
import java.util.Scanner;
import java.util.Arrays;

public class ServicioAhorcado {
 
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        
        System.out.println("Ingrese la palabra a buscar");
        String palabra = leer.nextLine();
        System.out.println("Ingrese la cantidad máxima de turnos");
        int turno = leer.nextInt();
        
        int longi = palabra.length();
        String[] palabraVector = new String[longi];
        
        for (int i = 0; i < longi; i++) {
            palabraVector[i] = palabra.substring(i, i+1);
        }
        
      return new Ahorcado(palabraVector, 0, turno);
    }

    public void longitud (Ahorcado a){
        System.out.println("Longitud de la palabra a encontrar es: " + a.getPalabra().length);
    }
    
    public void buscarLetra (String let, Ahorcado a){
        String palabra = "";
        for (int i = 0; i < a.getPalabra().length; i++) {
            palabra += a.getPalabra()[i];
        }
        
        int longi = palabra.length();
        int cont = 0;
        for (int i = 0; i < longi; i++) {
            if (palabra.substring(i, i+1).equals(let)) {
                cont ++;
            }
        }
        if (cont>0) {
            System.out.println("La letra se encuentra " + cont + " vez/veces en la palabra");
        } else{
            System.out.println("La letra no se encuetra");
        }
    }  
  
    public void encontradas (String let, Ahorcado a){
        boolean encontrada = false;
        String palabra = "";
        
        for (int i = 0; i < a.getPalabra().length; i++) {
            palabra += a.getPalabra()[i];
        }
        
        int longi = a.getPalabra().length;
        for (int i = 0; i < longi; i++) {
            if (palabra.substring(i, i+1).equals(let)) {
                a.setLetrasEncontradas(a.getLetrasEncontradas()+1);
                encontrada = true;
            }
        }
        
        if (encontrada == false) {
            a.setCantidadJugadas(a.getCantidadJugadas()-1);
            System.out.println("Ha perdido un turno. Siga intentando");
        } else {
            System.out.println("Letras encontradas: " + a.getLetrasEncontradas());
            System.out.println("Letras restantes: " + (longi - a.getLetrasEncontradas()));
        }
    }
    
    public void intentos (Ahorcado a){
        System.out.println("Le quedan " + a.getCantidadJugadas() + " turnos");
    }
    
    public void juego (Ahorcado a, String let){
        longitud(a);
        buscarLetra(let,a);
        encontradas(let, a);
        intentos(a);
        
        String palabra = "";
        
        for (int i = 0; i < a.getPalabra().length; i++) {
            palabra += a.getPalabra()[i];
        }
        
        int longi = a.getPalabra().length;
        
        if (a.getCantidadJugadas() == 0 && a.getLetrasEncontradas() == longi) {
            System.out.println("Has ganado! La palabra es: " + palabra);
        } else if (a.getCantidadJugadas() == 0 && a.getLetrasEncontradas() < longi) {
            System.out.println("AHORCADO. Se ha quedado sin turnos");
        } else if (a.getCantidadJugadas() > 0 && a.getLetrasEncontradas() == longi) {
            System.out.println("Ha encontrado la palabra: " + palabra);
        } else {
            System.out.println("Ingrese la siguiente letra");
        }
    }
}
