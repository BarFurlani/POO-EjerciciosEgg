package Entidad;

/**
 *
 * @author ACER ASPIRE V
 */
public class Curso {
    //mbreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos.
    
    private String nombreCurso, turno;
    private int cantidadHorasPorDia, cantidadDiasporSemana, precioPorHora;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasporSemana, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasporSemana = cantidadDiasporSemana;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasporSemana() {
        return cantidadDiasporSemana;
    }

    public void setCantidadDiasporSemana(int cantidadDiasporSemana) {
        this.cantidadDiasporSemana = cantidadDiasporSemana;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
