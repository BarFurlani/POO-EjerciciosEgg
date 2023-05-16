package Service;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class ServClase {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso c = new Curso();

    public void cargarAlumnos(String[] alumnos){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno n° " + (i+1) + ":");
            alumnos[i] = leer.next();
        }
    }

    public void crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nom = leer.next();
        System.out.println("Ingrese la cantidad de hs por día");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días/semana");
        c.setCantidadDiasporSemana(leer.nextInt());
        System.out.println("Ingrese el turno: mañana o tarde");
        String turno = leer.next().toUpperCase();
        System.out.println("Ingrese el precio por hr");
        c.setPrecioPorHora(leer.nextInt());
        String[] alumnos = new String[5];
        cargarAlumnos (alumnos);
    }

    public float calcularGananciaSemanal(){
        float ganancia = c.getCantidadHorasPorDia() * c.getCantidadDiasporSemana() * c.getPrecioPorHora()* 5;
        return ganancia;
    }
}
