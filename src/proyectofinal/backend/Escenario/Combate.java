/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.backend.Escenario;

/**
 *
 * @author astridmc
 */
public class Combate {
    
    protected int opcion;
    
    
    Jugador nuevo = new Jugador();
    
    
    public  void combate(){
        
        
        System.out.println("INICIA LA PARTIDA:");
        Vehiculo miVehiculo = new Vehiculo();
        
            System.out.println("oprime 1 para disparar");
            System.out.println("oprome 3 para cambiar de vehiculo");
           // opcion = Integer.valueOf(.nextLine());
            switch(opcion){
                case 1:
                    miVehiculo.disparar();
                    break;
                case 2:
                    break;
                    
            }
            
            System.out.println("\nTURNO DE TU OPONENTE");
            if(Enemigo.disparar() == true){
                System.out.println("\nEnemigo ha acertado");
                miVehiculo.setHP(miVehiculo.getHP()-1);
            }else{
                System.out.println("\nenemigo Ha Fallado");
            }
            
           
        }

}
