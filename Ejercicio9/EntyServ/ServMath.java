package EntyServ;

/**
 * @author ACER ASPIRE V
 */

public class ServMath {

    public double devolverMayor(Matematica m) {
        double mayor = m.getN2();
        if (m.getN1() > m.getN2()) {
            mayor = m.getN1();
        }
        return mayor;
    }

    public double calcularPotencia(Matematica m) {
        double n1 = Math.floor(m.getN1());
        double n2 = Math.floor(m.getN2());
        double potencia;
        if (n1 > n2) {
            potencia = Math.pow(n1, n2);
        } else {
            potencia = Math.pow(n2, n1);
        }
        return potencia;
    }

    public double calcularRaiz(Matematica m) {
        double n1 = Math.floor(m.getN1());
        double n2 = Math.floor(m.getN2());
        double raiz;
        
        if (n1 > n2) {
            raiz = Math.sqrt(n2);
        } else {
            raiz = Math.sqrt(n1);
        }
        return raiz;
    }
}
