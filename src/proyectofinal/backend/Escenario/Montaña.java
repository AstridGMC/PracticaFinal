
package proyectofinal.backend.Escenario;

import java.awt.Color;


public class Montaña extends Elemento{

    public Montaña(int vida, Color terreno, boolean ocupado) {
        super(vida, Color.lightGray, ocupado);
    }

    public Montaña() {
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
        return Color.lightGray;
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
