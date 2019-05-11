
package proyectofinal.backend.Escenario;

import java.awt.Color;


public class TerrenoNormal extends Elemento {

    public TerrenoNormal(int vida, Color terreno, boolean ocupado) {
        super(0, Color.green, ocupado);
    }

    public TerrenoNormal() {
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
        return Color.GREEN;
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
