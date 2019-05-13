
package proyectofinal.backend.Escenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class AlmacenJugadores {
    
    
    public void escribirJugador(){
       
            File jugadoresArchivo = new File("Jugadores.txt");
            FileOutputStream salida = null;
            FileInputStream entrada = null;
            ObjectOutputStream escritor = null;
            ObjectInputStream lector = null;
        try{
            jugadoresArchivo.createNewFile();
            salida = new FileOutputStream(jugadoresArchivo);
            escritor = new ObjectOutputStream(salida);
            
        }catch(Exception e){
            System.err.println(e.getMessage());
            }
        }
}
