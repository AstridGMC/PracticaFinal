
package proyectofinal.backend.Escenario;

import java.awt.Color;

public class Elemento {
    protected int vida;
     Color terreno;
    protected boolean ocupado;
    
    public void restarVida(){
        vida = vida--;
    }

    public Elemento(int vida, Color terreno, boolean ocupado) {
        this.vida = vida;
        this.terreno = terreno;
        this.ocupado = ocupado;
    }

    public Elemento() {
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Color getTerreno() {
        return terreno;
    }

    public void setTerreno(Color terreno) {
        this.terreno = terreno;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
}
