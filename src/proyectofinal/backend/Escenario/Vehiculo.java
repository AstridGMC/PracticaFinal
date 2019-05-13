  
package proyectofinal.backend.Escenario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectofinal.backend.Escenario.Jugador;

public class Vehiculo {
    
    
    protected int ataque;
    protected int defensa;
    protected int punteria;
    protected int municiones;
    protected  int HP = (50 );
    protected  int PP = (3 + 2 );
    protected  int velocidadDisparo;
    static ImageIcon imagen = new ImageIcon("portada.png");
    
    public static void vehiculo(){
        
    }
    
    public void disparar(Arma miArma ){
      //  Arma miArma= new Arma();
        int disparo = (int) (Math.random() * 100 + 1);
        if (miArma.municiones>0){
            
            if(disparo<=(miArma.getPunteriaArma()+punteria)){
           JOptionPane.showMessageDialog(null,"ha acertado");
            Enemigo.setVIDA(Enemigo.VIDA- ataque);
            miArma.municiones--;
        }else if(disparo>60){
            JOptionPane.showMessageDialog(null,"ha fallado");}
        }else{
            
        }
    }
    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
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

  

}
