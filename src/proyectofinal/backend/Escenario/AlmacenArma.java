
package proyectofinal.backend.Escenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AlmacenArma {

    protected ArrayList <Arma> armasJugador = new ArrayList();
    
    static File armasArchivo = new File("Armas.txt");
    static FileOutputStream salida = null;
    static FileInputStream entrada = null;
    static ObjectOutputStream escritor = null;
    static ObjectInputStream lector = null;
    
    public static  void alamacenarArmas(Arma arma, ArrayList <Arma> armas){
        try {
            armasArchivo.createNewFile();
            salida = new FileOutputStream(armasArchivo);
            escritor = new ObjectOutputStream(salida);
            escritor.writeObject(armas);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        finally{
            if(salida != null){
                try {
                    salida.close();
                    if (escritor != null){
                        escritor.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }
   // lectura del archivo
    public void leerArmas(Arma arma,ArrayList <Arma> armas){
        try {
            entrada = new FileInputStream(armasArchivo);
            lector = new ObjectInputStream(entrada);
            armas = (ArrayList <Arma> )lector.readObject();
            System.out.println(arma.toString());
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
