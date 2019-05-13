
package proyectofinal.backend.Escenario;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avion extends Vehiculo {
   protected int posicionX;
   protected int posicionY;
   protected String nombre;
   JLabel nuevos = new JLabel();
   ImageIcon avion = new ImageIcon("avion.png");
   protected  int velocidadDisparo;

    public Avion(String nombre) {
        this.nombre = nombre;
    }

    public Avion() {
    }

   @Override
    public int getAtaque() {
        return 7;
    }

   @Override
    public void setAtaque(int ataque) {
        this.ataque = 3;
    }

   @Override
    public int getDefensa() {
        return defensa;
    }

   @Override
    public void setDefensa(int defensa) {
        this.defensa = 70;
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

    public int getVelocidadDisparo() {
        return 1;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public static void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        Vehiculo.vehiculos = vehiculos;
    }
   
    
    
    public void avion(){

    }
   
   @Override
    public ImageIcon getImagen() {
        return avion;
    }

   @Override
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
