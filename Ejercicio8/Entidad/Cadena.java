package Entidad;

/**
 *
 * @author ACER ASPIRE V
 */
public class Cadena {

    public String frase;
    public int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud, String letra) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

 //Métodos:
    public int mostrarVocales(Cadena c) {
        int contador = 0;
        String frase1 = c.getFrase().toLowerCase();
        for (int i = 0; i < c.getLongitud(); i++) {
            switch (frase1.substring(i, i + 1)) {
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
                default:
                    break;
            }
        }
        return contador;
    }
    
    public String invertirFrase(Cadena c){
        String fraseInvert = "";
        for (int i = c.getLongitud()-1; i >= 0; i--) {  //for invertido
            fraseInvert += c.getFrase().charAt(i);
        }
        return fraseInvert;
    }
    
    public int vecesRepetidas(Cadena c, String letra){
        int contador = 0;
        String frase = c.getFrase().toUpperCase();
        for (int i = 0; i < c.getLongitud(); i++) {
            
            if (frase.substring(i, i+1).equals(letra)) {
                contador ++;
            }
        }
        return contador;
    }
    
    public boolean compararLongitud(String frase, Cadena c){
        boolean igualLong;
        igualLong = c.getLongitud() == frase.length();
        
        return igualLong;      
    }
    
    public String unirFrases(String frase, Cadena c){
        String frase2 = c.getFrase() + " " + frase;
        
        return frase2;        
    }
    
    public String reemplazar(String letra, Cadena c){
        String frase1 = "";
        String fras = c.getFrase();
        for ( int i = 0; i < c.getLongitud(); i++){
            if (fras.substring(i, i+1).equalsIgnoreCase("a")){
                frase1 += letra;
            } else {
                frase1 += fras.charAt(i);
            }
        }
        return frase1;
    }
    
    public boolean contieneLetra (String letra, Cadena c){
        boolean contiene = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                contiene = true;
                break;
            }
        }
        return contiene;
    }
}
