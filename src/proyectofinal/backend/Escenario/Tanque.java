 
package proyectofinal.backend.Escenario;
 
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tanque extends Vehiculo{
    protected int posicionX;
    protected int posicionY;
    
    public void tanque(){
        
    }
    
    public static void agregarImagen(JLabel[][] casillas,JLabel terreno, int x, int y){
        ImageIcon tanque = new ImageIcon("tanque.png");
        casillas[x][y].setIcon(new ImageIcon(tanque.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH)));
        //Escenario.getEscenarios()[x][y]=8;
        System.out.println(casillas[x][y]);
    }
    
    public void movimientoArriba(JLabel etiqueta){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        etiqueta.setLocation(posicionX, posicionY - etiqueta.getHeight());  
    }
    
    public void movimientoDerecha(JLabel etiqueta){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        
        etiqueta.setLocation(posicionX + etiqueta.getWidth(), posicionY);
    }
    
    public void movimientoIzquierdo(JLabel etiqueta){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        etiqueta.setLocation(posicionX + etiqueta.getWidth(), posicionY);
    }
}
