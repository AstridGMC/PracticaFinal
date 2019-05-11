
package proyectofinal.backend.Escenario;

import java.awt.Color;

public class Agua extends Elemento {

    public Agua(int vida, boolean ocupado) {
        super(50, Color.CYAN, ocupado);
    }
    
    public Agua(){    
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public Color getTerreno() {
        return Color.CYAN;
    }

    @Override
    public void setTerreno(Color terreno) {
        this.terreno = terreno;
    }

    @Override
    public boolean isOcupado() {
        return ocupado;
    }

    @Override
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
    
   

    
}
