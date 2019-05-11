 
package proyectofinal.backend.Escenario;
 
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tanque extends Vehiculo{
    protected int posicionX;
    protected int posicionY;
    ImageIcon tanque = new ImageIcon("tanque.png");
    
    public void tanque(){
        
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public int getMuniciones() {
        return municiones;
    }

    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }

    public  ImageIcon getImagen() {
        return tanque;
    }

    public void setImagen(ImageIcon imagen) {
        this.tanque = imagen;
    }
    
    
    public void agregarImagen(JLabel[][] casillas,JLabel terreno, int x, int y){
        
        casillas[x][y].setIcon(new ImageIcon(tanque.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
        //Escenario.getEscenarios()[x][y]=8;
        System.out.println(casillas[x][y]);
    }
    
   
}
