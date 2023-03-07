
package Business;

/**
 *
 * @author juand
 */

import Data.Contacto;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo {
    
      File archivo;
    
      public void crearArchivo() {
        try {
            archivo = new File("AgendaContactos.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null,"Archivo Creado ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
      }
      
      public void escribirEnArchivo(ArrayList<Contacto> contactos){
          
        PrintWriter salida = null;   
        try {
            salida = new PrintWriter(new BufferedWriter(new FileWriter("AgendaContactos.txt")));
            for (int i = 0; i < contactos.size(); i++) {
                salida.println(contactos.get(i).getNombre() + "-" + contactos.get(i).getApellido()+ "-" + contactos.get(i).getNumero());
            }
            salida.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "DATOS NO COMPATIBLES");
        } finally {
            salida.close();
        }
      }
      
}
