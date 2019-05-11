/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.backend.Escenario;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        System.out.println(posicionX);
        for(int i=0; i<= etiqueta.getHeight(); i++){
            etiqueta.setLocation(posicionX, posicionY - i);  
        }
        casillas[x-1][y].setIcon(new ImageIcon(vehiculo.getImagen().getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
    }
    
    public void movimientoDerecha(Vehiculo vehiculo,JLabel[][] casillas,JLabel etiqueta,int x, int y){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        System.out.println(posicionX);
        for(int i=0; i<= etiqueta.getHeight(); i++){
            etiqueta.setLocation(posicionX+1, posicionY );  
        }
        casillas[x][y+1].setIcon(new ImageIcon(vehiculo.getImagen().getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
    }
    
    public void movimientoIzquierdo(Vehiculo vehiculo,JLabel[][] casillas,JLabel etiqueta,int x, int y){
        posicionX = etiqueta.getX();
        posicionY = etiqueta.getY();
        for(int i=0; i<= etiqueta.getHeight(); i++){
            etiqueta.setLocation(posicionX-1, posicionY );  
        
        }
        casillas[x][y-1].setIcon(new ImageIcon(vehiculo.getImagen().getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH)));
    }
}
