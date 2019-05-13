/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.backend.Escenario;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Enemigo {
    protected static int ATAQUE = 10;
    protected static int DEFENSA =5;
    protected static int VIDA = 25;
    protected static int punteria = (int) (Math.random() * 15 + 1);
    JLabel nuevos = new JLabel();
    ImageIcon imagen = new ImageIcon("enemigo.png");
    
    

    
    public void agregarImagen(JLabel[][] casillas, JLabel terreno, int x, int y){
        //nuevos.setBounds(terreno.getX(), terreno.getY(), 100, 100);
        
        casillas[x][y].setIcon(new ImageIcon(imagen.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
      
        System.out.println(casillas[x][y]);
    }

    
    public JLabel getNuevos() {
        return nuevos;
    }

    public ImageIcon getImagen() {
        return imagen;
    }
    

    public int getATAQUE() {
        return ATAQUE;
    }

    public void setATAQUE(int ATAQUE) {
        Enemigo.ATAQUE = ATAQUE;
    }

    public int getDEFENSA() {
        return DEFENSA;
    }

    public void setDEFENSA(int DEFENSA) {
        Enemigo.DEFENSA = DEFENSA;
    }

    public static int getVIDA() {
        return VIDA;
    }

    public static void setVIDA(int VIDA) {
        Enemigo.VIDA = VIDA;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        Enemigo.punteria = punteria;
    }
    

        
    public static boolean disparar( ){
        int disparo = (int) (Math.random() * 100 + 1);
            
        if(disparo<=60){
            System.out.println("ha acertado\n");
            return true;
          
        }else {
            System.out.println("\n RENEMIGO ha fallado\n ");
            return false;
        }
    }
    
    
}
