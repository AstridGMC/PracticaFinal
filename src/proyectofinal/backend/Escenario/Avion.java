
package proyectofinal.backend.Escenario;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avion extends Vehiculo {
   protected int posicionX;
   protected int posicionY;
   JLabel nuevos = new JLabel();
   ImageIcon avion = new ImageIcon("avion.png");
   
   
   public void avion(){
       
   }

    public ImageIcon getImagen() {
        return avion;
    }

    public void setImagen(ImageIcon imagen) {
        this.avion = imagen;
    }
   
    public void agregarImagen(JLabel[][] casillas, JLabel terreno, int x, int y){
        
        nuevos.setBounds(terreno.getX(), terreno.getY(), 100, 100);
        
        casillas[x][y].setIcon(new ImageIcon(avion.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
//        Escenario.getEscenarios()[x][y]=8;
        System.out.println(casillas[x][y]);
    }
    
    public void movimientoArriba(JLabel[][] casillas,JLabel etiqueta,int x, int y){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        System.out.println(posicionX);
        for(int i=0; i<= etiqueta.getHeight(); i++){
        etiqueta.setLocation(posicionX, posicionY - i);  
        casillas[x-1][y].setIcon(new ImageIcon(avion.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
        
        }
    }
    
    public void movimientoDerecha(JLabel[][] casillas,JLabel etiqueta,int x, int y){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        System.out.println(posicionX);
        for(int i=0; i<= etiqueta.getWidth(); i++){
        etiqueta.setLocation(posicionX+i, posicionY );  
        }
        casillas[x][y+1].setIcon(new ImageIcon(avion.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
    }
    
    public void movimientoIzquierdo(JLabel[][] casillas,JLabel etiqueta,int x, int y){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        for(int i=0; i<= etiqueta.getWidth(); i++){
            etiqueta.setLocation(posicionX-i, posicionY );  
            casillas[x][y-1].setIcon(new ImageIcon(avion.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
        }
        
    }
}
