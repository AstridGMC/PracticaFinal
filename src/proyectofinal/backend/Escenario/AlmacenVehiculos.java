
package proyectofinal.backend.Escenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static proyectofinal.backend.Escenario.AlmacenArma.armasArchivo;

public class AlmacenVehiculos {
    
    static File vehiculosArchivo = new File("Vehiculos.txt");
    static FileOutputStream salida = null;
    static FileInputStream entrada = null;
    static ObjectOutputStream escritor = null;
    static ObjectInputStream lector = null;
    
    public static  void alamacenarArmas(Vehiculo vehiculo, ArrayList <Vehiculo> vehiculos){
        try {
            armasArchivo.createNewFile();
            salida = new FileOutputStream(vehiculosArchivo);
            escritor = new ObjectOutputStream(salida);
            escritor.writeObject(vehiculos);
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
    public void leerArmas(Vehiculo vehiculo, ArrayList <Vehiculo> vehiculos){
        try {
            entrada = new FileInputStream(armasArchivo);
            lector = new ObjectInputStream(entrada);
            vehiculos = (ArrayList <Vehiculo> )lector.readObject();
            System.out.println(vehiculo.toString());
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
    

