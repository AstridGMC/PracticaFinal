
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
import proyectofinal.backend.Escenario.Montaña;
import proyectofinal.backend.Escenario.Tanque;
import proyectofinal.backend.Escenario.TerrenoNormal;

public class EscenarioJungla {
    Tanque miTanque = new Tanque();
    Montaña miMontaña = new Montaña();
    Agua miAgua = new Agua();
    TerrenoNormal miTerrenoNormal = new TerrenoNormal();
    public static JLabel[][] casillas;
    static JLabel terrenoClase;
    protected int anchoCasilla;
    protected int altoCasilla;
    protected int tipo;
    protected int fila;
    protected int columna;
    public String NOMBRE = "Jungla";
    
    public JPanel jungla(){
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        JPanel miJungla = new JPanel();
        listenerTeclado(miJungla);
        casillas = new JLabel[6][4];
        for(int y=0; y < casillas.length; y++) {
            for(int x=0; x < casillas[y].length; x++) {
                terrenoClase = new JLabel();
                miJungla.add(terrenoClase);
                int terrenoRandom = (int) (Math.random() * 2 + 1);
                 listenerCasilla(terrenoClase, y, x);
                altoCasilla = terrenoClase.getHeight();
                anchoCasilla = terrenoClase.getWidth();
                if(terrenoRandom == 1){
                    terrenoClase.setBackground(miAgua.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                }else if (terrenoRandom == 2){
                    terrenoClase.setBackground(miTerrenoNormal.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                    
                } else{
                    terrenoClase.setBackground(miMontaña.getTerreno());
                    terrenoClase.setBorder(border);
                    terrenoClase.setOpaque(true);
                    casillas[y][x]=terrenoClase;
                }
            }
        }
        miJungla.setLayout(new GridLayout(6, 4));
    return miJungla;
    }
    
    
     public  void obtenerCasilla(int i, int j){
        fila = i;
        columna =j;
    }
    
    public void listenerCasilla(JLabel casilla, int i, int j){
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerCasilla(i,j);
                System.out.println(i+j);
                miTanque.agregarImagen(casillas, terrenoClase, fila , columna);
                
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
}
        
