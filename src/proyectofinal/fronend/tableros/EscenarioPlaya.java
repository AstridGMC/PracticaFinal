
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
import proyectofinal.backend.Escenario.Agua;
import proyectofinal.backend.Escenario.Avion;
import proyectofinal.backend.Escenario.Movimiento;
import proyectofinal.backend.Escenario.Tanque;
import proyectofinal.backend.Escenario.TerrenoNormal;
import proyectofinal.backend.Escenario.Vehiculo;
import proyectofinal.fronend.VentanaPrincipal;
import proyectofinal.fronend.menus.NuevoJuego;


public class EscenarioPlaya   {
    Agua miAgua = new Agua();
    Avion miAvion = new Avion();
    Tanque miTanque = new Tanque();
     Movimiento movimiento = new Movimiento();
    TerrenoNormal miTerrenoNormal = new TerrenoNormal();
    protected int[][] tipoTerreno= new int[8][9];
    public static JLabel[][] casillas;
    static JLabel terrenoClase; 
    protected Vehiculo miVehiculo = new Vehiculo();
    protected int tipo;
    protected int fila;
    protected int columna;
    public  int vehiculos =0;
    public String NOMBRE = "Playa";
    
    
    
    public JPanel playa(){
        vehiculos =0;
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        JPanel miPlaya = new JPanel();
        casillas = new JLabel[4][4];
        listenerTeclado(miPlaya);
        for(int y=0; y < casillas.length; y++) {
            for(int x=0; x < casillas[y].length; x++) {
                terrenoClase = new JLabel();
                miPlaya.add(terrenoClase);
                listenerCasilla(terrenoClase, y,x);
                int terrenoRandom = (int) (Math.random() * 2 + 1);
                //agrega a los enemigos al tablero
                 if(y==0 && x%2==1 && NuevoJuego.getElegido()==1){
                    tipo =terrenoRandom;
                    terrenoClase.setBackground(Color.RED);
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                }
                 else if(terrenoRandom == 1){
                    tipo =terrenoRandom;
                    terrenoClase.setBackground(miAgua.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                    tipoTerreno[y][x]=5;
                }else if (terrenoRandom == 2){
                    tipo =terrenoRandom;
                    terrenoClase.setBackground(miTerrenoNormal.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                    tipoTerreno[y][x]=6;
                }
                else {
                    tipo =terrenoRandom;
                    terrenoClase.setBackground(miAgua.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                    tipoTerreno[y][x]=5;
                }
            }
        }
        miPlaya.setLayout(new GridLayout(4, 4));
    return miPlaya;
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
    
    
    //oyente de accion del teclado
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
                    if(VentanaPrincipal.vehiculoId==1){
                        if(tipoTerreno[fila-1][columna]!=7){
                            casillas[fila][columna].setIcon(null);
                            movimiento.movimientoArriba(miAvion, casillas, casillas[fila][columna], fila, columna);
                            fila = fila-1;}else{fila = fila;}
                    }else if(VentanaPrincipal.vehiculoId==2){
                        if(tipoTerreno[fila-1][columna]!=5){
                           casillas[fila][columna].setIcon(null);
                           movimiento.movimientoArriba(miTanque, casillas, casillas[fila][columna], fila, columna);
                           fila = fila-1;
                        }else{fila = fila;}
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println("IZQUIERDA");
                    
                    if(VentanaPrincipal.vehiculoId==1){
                        if(tipoTerreno[fila][columna-1]!=7){
                             casillas[fila][columna].setIcon(null);
                            movimiento.movimientoIzquierdo(miAvion,casillas, casillas[fila][columna], fila, columna);
                            columna = columna-1;
                        }else{fila = fila;}
                    }else if(VentanaPrincipal.vehiculoId==2){
                        if(tipoTerreno[fila][columna-1]!=5){
                        casillas[fila][columna].setIcon(null);
                        movimiento.movimientoIzquierdo(miTanque,casillas, casillas[fila][columna], fila, columna);
                        columna = columna-1;}else{fila = fila;}
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
                        if(tipoTerreno[fila][columna+1]!=5){
                            casillas[fila][columna].setIcon(null);
                            movimiento.movimientoDerecha(miTanque,casillas, casillas[fila][columna], fila, columna);
                            columna = columna+1;
                        }else{fila = fila;}
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
