 
package proyectofinal.backend.Escenario;
 
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tanque extends Vehiculo{
    protected String Tanque;
    protected int posicionX;
    protected int posicionY;
    ImageIcon tanque = new ImageIcon("tanque.png");
   

    public Tanque(String Tanque) {
        this.Tanque = Tanque;
    }

    public Tanque() {
    }
    
    

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public int getPunteria() {
        return punteria;
    }

    @Override
    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    @Override
    public int getMuniciones() {
        return municiones;
    }

    @Override
    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public int getPP() {
        return PP;
    }

    @Override
    public void setPP(int PP) {
        this.PP = PP;
    }

    @Override
    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    @Override
    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }

    @Override
    public  ImageIcon getImagen() {
        return tanque;
    }

    @Override
    public void setImagen(ImageIcon imagen) {
        this.tanque = imagen;
    }
    
    
    public void agregarImagen(JLabel[][] casillas,JLabel terreno, int x, int y){
        
        casillas[x][y].setIcon(new ImageIcon(tanque.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
        //Escenario.getEscenarios()[x][y]=8;
        System.out.println(casillas[x][y]);
    }
    
   
}
