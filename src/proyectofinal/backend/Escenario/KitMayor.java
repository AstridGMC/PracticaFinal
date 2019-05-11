/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.backend.Escenario;


public class KitMayor extends Kit{
    protected int vida = 50;
    
    
    
    
    public KitMayor(String nombreKit) {
        super(nombreKit);
    }
    

    @Override
    public String toStringK() {
        return "KitMayor" ;
    }

    @Override
    public void restaurarAuto(Vehiculo miVehiculo) {
        miVehiculo.setHP(miVehiculo.getHP()+vida);
    }

    
    
}