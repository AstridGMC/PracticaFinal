/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.fronend.tableros;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import proyectofinal.backend.Escenario.Avion;
import proyectofinal.backend.Escenario.Montaña;
import proyectofinal.backend.Escenario.TerrenoNormal;

/**
 *
 * @author astridmc
 */
public class EscenarioMontañoso {
    Montaña miMontaña = new Montaña();
    TerrenoNormal miTerrenoNormal = new TerrenoNormal();
    Avion miAvion = new Avion();
    protected int tipo;
    public static JLabel[][] casillas;
    static JLabel terrenoClase; 
    protected int fila;
    protected int columna;
    public String NOMBRE = "MONTAÑOSO";

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    

    public Montaña getMiMontaña() {
        return miMontaña;
    }

    public void setMiMontaña(Montaña miMontaña) {
        this.miMontaña = miMontaña;
    }

    public TerrenoNormal getMiTerrenoNormal() {
        return miTerrenoNormal;
    }

    public void setMiTerrenoNormal(TerrenoNormal miTerrenoNormal) {
        this.miTerrenoNormal = miTerrenoNormal;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public static JLabel[][] getCasillas() {
        return casillas;
    }

    public static void setCasillas(JLabel[][] casillas) {
        EscenarioMontañoso.casillas = casillas;
    }

    public static JLabel getTerrenoClase() {
        return terrenoClase;
    }

    public static void setTerrenoClase(JLabel terrenoClase) {
        EscenarioMontañoso.terrenoClase = terrenoClase;
    }
    
    
    
    
    public JPanel montañoso(){
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        JPanel miMontañoso = new JPanel();
        casillas = new JLabel[8][9];
        listenerTeclado(miMontañoso);
        for(int y=0; y < casillas.length; y++) {
            for(int x=0; x < casillas[y].length; x++) {
                terrenoClase = new JLabel();
                miMontañoso.add(terrenoClase);
                listenerCasilla(terrenoClase, y,  x);
                int terrenoRandom = (int) (Math.random() * 2 + 1);;
                if(terrenoRandom == 1){
                    tipo = terrenoRandom;
                    terrenoClase.setBackground(miMontaña.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                }else if (terrenoRandom == 2){
                    tipo = terrenoRandom;
                    terrenoClase.setBackground(miTerrenoNormal.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                } else{
                    tipo = terrenoRandom;
                    terrenoClase.setBackground(miMontaña.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                }
            }
        }
        miMontañoso.setLayout(new GridLayout(8, 9));
    return miMontañoso;
    }

    
     public  void obtenerCasilla(int i, int j){
        fila = i;
        columna =j;
    }
     int aviones =0;
    public void listenerCasilla(JLabel casilla,int i, int j){
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
                if(aviones ==0){
                    obtenerCasilla(i,j);
                    System.out.println(i+j);
                    miAvion.agregarImagen(casillas, terrenoClase, i, j);
                    aviones++;
                }
                
                
               // pieza.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(i+j);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              
            }

            @Override
            public void mouseExited(MouseEvent e) {
                }
            
        };
         casilla.addMouseListener(oyenteDeRaton);
    }
    
    
        public void listenerTeclado(JPanel miPanel) {
        //Invocamos el método, ahora si funcionara
        miPanel.setFocusable(true);
        
        miPanel.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                //Aqui no funcionara
            }
            @Override
            public void keyPressed(KeyEvent e){
                
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println(e.getKeyCode());
                    casillas[fila][columna].setIcon(null);
                    miAvion.movimientoArriba(casillas, casillas[fila][columna], fila, columna);
                    fila = fila-1;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println("IZQUIERDA");
                    casillas[fila][columna].setIcon(null);
                    miAvion.movimientoIzquierdo(casillas, casillas[fila][columna], fila, columna);
                    columna = columna-1;
                }
                 if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println("DERECHA");
                    casillas[fila][columna].setIcon(null);
                    miAvion.movimientoDerecha(casillas, casillas[fila][columna], fila, columna);
                    columna = columna+1;
                }
                 if(e.getKeyCode() == KeyEvent.VK_DOWN){
                     
                 }
                }
            @Override
                public void keyReleased(KeyEvent e){
                    //Aqui tambien puedes insertar el codigo
                }
        });
    }
}
