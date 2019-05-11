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
import proyectofinal.backend.Escenario.Movimiento;
import proyectofinal.backend.Escenario.Tanque;
import proyectofinal.backend.Escenario.TerrenoNormal;
import proyectofinal.fronend.VentanaPrincipal;

/**
 *
 * @author astridmc
 */
public class EscenarioMontañoso {
    Montaña miMontaña = new Montaña();
    TerrenoNormal miTerrenoNormal = new TerrenoNormal();
    Movimiento movimiento = new Movimiento();
    Avion miAvion = new Avion();
    Tanque miTanque = new Tanque();
    protected int[][] tipoTerreno= new int[8][9];
    protected int tipo;
    public static JLabel[][] casillas;
    static JLabel terrenoClase; 
    protected int fila;
    protected int columna;
    public  int vehiculos =0;
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
                    tipoTerreno[y][x]=7;
                }else if (terrenoRandom == 2){
                    tipo = terrenoRandom;
                    terrenoClase.setBackground(miTerrenoNormal.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                    tipoTerreno[y][x]=6;
                } else{
                    tipo = terrenoRandom;
                    terrenoClase.setBackground(miMontaña.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                    tipoTerreno[y][x]=7;
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
    
    public void listenerCasilla(JLabel casilla,int i, int j){
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(VentanaPrincipal.vehiculoId==1){
                if(vehiculos ==0){
                    obtenerCasilla(i,j);
                    System.out.println(i+j);
                    miAvion.agregarImagen(casillas, terrenoClase, i, j);
                    vehiculos++;
                }}else if(VentanaPrincipal.vehiculoId==2){
                   if(vehiculos ==0){
                    obtenerCasilla(i,j);
                    System.out.println(i+j);
                    miTanque.agregarImagen(casillas, terrenoClase, i, j);
                    vehiculos++;
                   }
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
                    
                    //miAvion.movimientoArriba(casillas, casillas[fila][columna], fila, columna);
                     if(VentanaPrincipal.vehiculoId==1){
                        if(tipoTerreno[fila-1][columna]!=7){
                            casillas[fila][columna].setIcon(null);
                        movimiento.movimientoArriba(miAvion, casillas, casillas[fila][columna], fila, columna);
                         fila = fila-1;}else{fila = fila;}
                     }else if(VentanaPrincipal.vehiculoId==2){
                         casillas[fila][columna].setIcon(null);
                        movimiento.movimientoArriba(miTanque, casillas, casillas[fila][columna], fila, columna);
                        fila = fila-1;
                    }
                    
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println("IZQUIERDA");
                    
                    if(VentanaPrincipal.vehiculoId==1){
                        if(tipoTerreno[fila][columna+1]!=7){
                             casillas[fila][columna].setIcon(null);
                            movimiento.movimientoIzquierdo(miAvion,casillas, casillas[fila][columna], fila, columna);
                            columna = columna-1;
                        }else{fila = fila;}
                    }else if(VentanaPrincipal.vehiculoId==2){
                        casillas[fila][columna].setIcon(null);
                        movimiento.movimientoIzquierdo(miTanque,casillas, casillas[fila][columna], fila, columna);
                        columna = columna-1;
                    }
                    
                }
                 if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println("DERECHA");
                    
                    if(VentanaPrincipal.vehiculoId==1){
                        if(tipoTerreno[fila][columna+1]!=7){
                            casillas[fila][columna].setIcon(null);
                        movimiento.movimientoDerecha(miAvion,casillas, casillas[fila][columna], fila, columna);
                        columna = columna+1;
                        }else{fila = fila;}
                    }else if(VentanaPrincipal.vehiculoId==2){
                        casillas[fila][columna].setIcon(null);
                        movimiento.movimientoDerecha(miTanque,casillas, casillas[fila][columna], fila, columna);
                        columna = columna+1;
                    }
                    
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
