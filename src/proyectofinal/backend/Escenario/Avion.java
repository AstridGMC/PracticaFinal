
package proyectofinal.backend.Escenario;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avion extends Vehiculo {
   protected int posicionX;
   protected int posicionY;
   protected String nombre;
   JLabel nuevos = new JLabel();
   ImageIcon avion = new ImageIcon("avion.png");

    public Avion(String nombre) {
        this.nombre = nombre;
    }

    public Avion() {
    }
   
    
    
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
    

}
