
package proyectofinal.backend.Escenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AlmacenArma {
    protected ArrayList <Arma> armasJugador = new ArrayList();
    
    File armasArchivo = new File("Armas.txt");
    FileOutputStream salida = null;
    FileInputStream entrada = null;
    ObjectOutputStream escritor = null;
    ObjectInputStream lector = null;
      
            armasArchivo.createNewFile();
            salida = new FileOutputStream(armasArchivo);
            escritor = new ObjectOutputStream(salida);
            
        
}
