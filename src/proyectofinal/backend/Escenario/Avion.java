
package proyectofinal.backend.Escenario;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avion extends Vehiculo {
   protected int posicionX;
   protected int posicionY;
   
   public void avion(){
       
   }
   
    public static void agregarImagen(JLabel[][] casillas, JLabel terreno, int x, int y){
        JLabel nuevos = new JLabel();
        nuevos.setBounds(terreno.getX(), terreno.getY(), terreno.getHeight(), terreno.getWidth());
        ImageIcon tanque = new ImageIcon("tanque.png");
        casillas[x][y].setIcon(new ImageIcon(tanque.getImage().getScaledInstance(terreno.getHeight(), terreno.getWidth(), Image.SCALE_SMOOTH)));
        Escenario.getEscenarios()[x][y]=8;
        System.out.println(casillas[x][y]);
    }
    
    public void movimientoArriba(JLabel etiqueta){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        for(int i=0; i<= etiqueta.getHeight(); i++){
        etiqueta.setLocation(posicionX, posicionY - i);  
        }
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
