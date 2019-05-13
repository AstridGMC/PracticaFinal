
package proyectofinal.backend.Escenario;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyectofinal.fronend.VentanaPrincipal;
import proyectofinal.fronend.menus.PedirNombre;
import static proyectofinal.fronend.tableros.EscenarioPlaya.casillas;

/**
 *
 * @author astridmc
 */
public class CombateComputadora {
    
    protected Jugador actualJugador = new Jugador();
    Enemigo enemigo = new Enemigo();
    
    
    
    protected int contador=1;
    Jugador jugador;
    protected int opcion;
    
    public  void combate(int disparado, JLabel turno,JLabel jugador1, JLabel jugador2){
        jugador= Jugador.jugadores.get(0);
        jugador1.setText(jugador.getNombre());
        jugador2.setText("COMPUTADORA");
        System.out.println("INICIA LA PARTIDA:");
                turno.setText(jugador.getNombre());
                
                    turno.setText("TURNO  "+ jugador.getNombre());
                    jugador.Vehiculos[0].disparar(jugador.armasJugador.get(0));
                    System.out.println("eee");
                    contador++;
                    
                turno.setText("COMPUTADORA");
                if(Enemigo.disparar() == true){
                    JOptionPane.showMessageDialog(null,"Enemigo ha acertado");
                    jugador.Vehiculos[0].setHP(jugador.Vehiculos[0].getHP()-1);
                }else{
                    JOptionPane.showMessageDialog(null,"nenemigo Ha Fallado");
                }
                contador++;
           
        
        
        if(Enemigo.getVIDA()==0){
            JOptionPane.showMessageDialog(null,"has ganado la batalla FELICIDADES");
            JOptionPane.showMessageDialog(null,"se le han acreditado 200 monedas y 50 puntos de experiencia");
            Jugador.jugadores.get(0).setMyOro(Jugador.jugadores.get(0).getMyOro()+ 200);
            Jugador.jugadores.get(0).setExperiencia(Jugador.jugadores.get(0).getExperiencia()+50);
        } else if (Jugador.jugadores.get(0).getVehiculos()[0].getHP()==0) {
            JOptionPane.showMessageDialog(null,"ha sido derrotado");
            
        }
         
    }
        
    
    
    public void disparar(){
        
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
                
                if (e.getKeyCode() == 32) {
                    System.out.println("dkkkkkkkkkkkkkdd");
                }
                
            
                }
            @Override
                public void keyReleased(KeyEvent e){
                    //Aqui tambien puedes insertar el codigo
                }
        });
    }

}
