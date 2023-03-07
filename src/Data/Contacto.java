
package Data;

/**
 *
 * @author juand
 */

public class Contacto {
    private int indice;
    private String nombre;
    private String apellido;
    private String numero;


    public Contacto(int indice, String nombre, String apellido,String numero) {
        this.indice = indice;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    
    
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
    
}
