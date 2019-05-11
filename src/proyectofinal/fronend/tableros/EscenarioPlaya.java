
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
import proyectofinal.backend.Escenario.TerrenoNormal;
import proyectofinal.backend.Escenario.Vehiculo;
import proyectofinal.fronend.menus.NuevoJuego;

public class EscenarioPlaya   {
    Agua miAgua = new Agua();
    TerrenoNormal miTerrenoNormal = new TerrenoNormal();
    public static JLabel[][] casillas;
    static JLabel terrenoClase; 
    protected Vehiculo miVehiculo = new Vehiculo();
    protected int tipo;
    protected int fila;
    protected int columna;
    public String NOMBRE = "Playa";
    
    
    
    public JPanel playa(){
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
                }else if (terrenoRandom == 2){
                    tipo =terrenoRandom;
                    terrenoClase.setBackground(miTerrenoNormal.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                }
                else {
                    tipo =terrenoRandom;
                    terrenoClase.setBackground(miAgua.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
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
                obtenerCasilla(i,j);
                System.out.println(i+j);
                
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
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println("IZQUIERDA");
                }
                 if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println("DERECHA");
                }
                }
            @Override
                public void keyReleased(KeyEvent e){
                    //Aqui tambien puedes insertar el codigo
                }
        });
    }
       
 /*
 public void oyenteTeclado(JLabel casilla, Vehiculo miVehiculo, JPanel miPanel){
        KeyListener flechas = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            
         }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                System.out.println(e.getKeyCode());
            }
            if (e.getKeyCode() == KeyEvent.VK_KP_LEFT) {
                System.out.println("abajo");
            }
            System.out.println("looo");
         }

        @Override
        public void keyReleased(KeyEvent e) {
         }
    };
   
    miPanel.addKeyListener(flechas);
    
 }*/
}
