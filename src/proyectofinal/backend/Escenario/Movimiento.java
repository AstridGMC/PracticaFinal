/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.backend.Escenario;


import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static proyectofinal.backend.Escenario.Vehiculo.vehiculo;

/**
 *
 * @author astridmc
 */
public class Movimiento {
    
    
    
    
    
    protected int posicionX;
    protected int posicionY;
    JLabel nuevos = new JLabel();

    public void agregarImagen(Vehiculo vehiculo,JLabel[][] casillas, JLabel terreno, int x, int y){
        
        nuevos.setBounds(terreno.getX(), terreno.getY(), 100, 100);
        
        casillas[x][y].setIcon(new ImageIcon(vehiculo.getImagen().getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
//        Escenario.getEscenarios()[x][y]=8;
        System.out.println(casillas[x][y]);
    }
    
    public void movimientoArriba(Vehiculo vehiculo,JLabel[][] casillas,JLabel etiqueta,int x, int y){
        movSuperior superior = new movSuperior( vehiculo,casillas, etiqueta,x,  y);
       
        System.out.println(posicionX);
        //superior.start();
        casillas[x-1][y].setIcon(new ImageIcon(vehiculo.getImagen().getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
    }
    
    public void movimientoDerecha(Vehiculo vehiculo,JLabel[][] casillas,JLabel etiqueta,int x, int y){
        movDerecho derecho = new movDerecho(vehiculo,casillas, etiqueta,x,y);
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        System.out.println(posicionX);
        //derecho.start();
        casillas[x][y+1].setIcon(new ImageIcon(vehiculo.getImagen().getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
    }
    
    public void movimientoIzquierdo(Vehiculo vehiculo,JLabel[][] casillas,JLabel etiqueta,int x, int y){
        movIzquierdo izquierdo = new movIzquierdo(vehiculo,casillas, etiqueta,x,y);
        //izquierdo.start();
        casillas[x][y-1].setIcon(new ImageIcon(vehiculo.getImagen().getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
    }
    
    public void movimientoAbajo(Vehiculo vehiculo,JLabel[][] casillas,JLabel etiqueta,int x, int y){
        movInferior inferior = new movInferior(vehiculo,casillas, etiqueta,x,y);
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        //inferior.start();
        casillas[x+1][y].setIcon(new ImageIcon(vehiculo.getImagen().getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
    }

}

class movSuperior extends Thread{
    JLabel etiqueta ;
    Vehiculo vehiculo;

    public movSuperior(Vehiculo vehiculo,JLabel[][] casillas,JLabel etiqueta,int x, int y) {
    this.etiqueta = etiqueta;  
    }
    
    @Override
    public void run(){   
       for(int i=0; i<= etiqueta.getHeight(); i++){
            try {
                etiqueta.setLocation(etiqueta.getX(), etiqueta.getY() - i);  
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(movSuperior.class.getName()).log(Level.SEVERE, null, ex);
            }  
    }
   }
}

class movDerecho extends Thread{
    
    JLabel etiqueta ;
    Vehiculo vehiculo;
    public movDerecho(Vehiculo vehiculo,JLabel[][] casillas, JLabel etiqueta, int x, int y) {
        this.etiqueta = etiqueta;
    }
    
    public void run(){   
    
       for(int i=0; i<= etiqueta.getWidth(); i++){
            try {
                etiqueta.setLocation(etiqueta.getX()+1, etiqueta.getY() );  
                   
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(movSuperior.class.getName()).log(Level.SEVERE, null, ex);
            }  
    }
   }
}

class movIzquierdo extends Thread{

    JLabel etiqueta ;
    Vehiculo vehiculo;
    public movIzquierdo(Vehiculo vehiculo,JLabel[][] casillas, JLabel etiqueta, int x, int y) {
        this.etiqueta = etiqueta;
    }
    
    public void run(){   
         
        for(int i=0; i<= etiqueta.getWidth(); i++){
            try {
                etiqueta.setLocation(etiqueta.getX()-1, etiqueta.getY() );  
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(movSuperior.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
   }
}
    
class movInferior extends Thread{
    JLabel etiqueta ;
    Vehiculo vehiculo;
    
    public movInferior(Vehiculo vehiculo,JLabel[][] casillas, JLabel etiqueta, int x, int y) {
        this.etiqueta = etiqueta;
    }
    
    public void run(){   
        
        for(int i=0; i<= etiqueta.getHeight(); i++){
            try {
                etiqueta.setLocation(etiqueta.getX(), etiqueta.getY() );
                
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(movSuperior.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }
}



    

