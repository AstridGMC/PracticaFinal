/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.backend.Escenario;


public abstract class Kit {
    
    
    protected String nombreKit;

    public Kit(String nombreKit) {
        this.nombreKit = nombreKit;
    }
    
    public abstract void restaurarAuto(Vehiculo miVehiculo);

    
    public String toStringK() {
        return "Kit";
    }
     
     
     
    
}