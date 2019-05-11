
package proyectofinal.backend.Escenario;

public class Cañon extends Arma{
    private  int municionesM=50; //municiones Misil
    private final int PRECIO = 100;

    public int getMunicionesM() {
        return municionesM;
    }

    public void setMunicionesM(int municionesM) {
        this.municionesM = municionesM;
    }


    @Override
    public String getNombreArma() {
        return nombreArma;
    }

    @Override
    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    @Override
    public int getPunteriaArma() {
        return punteriaArma;
    }

    @Override
    public void setPunteriaArma(int punteriaArma) {
        this.punteriaArma = punteriaArma;
    }

    @Override
    public int getVelocidadDisparoA() {
        return velocidadDisparoA;
    }

    @Override
    public void setVelocidadDisparoA(int velocidadDisparoA) {
        this.velocidadDisparoA = velocidadDisparoA;
    }

    @Override
    public int getAtaqueA() {
        return ataqueA;
    }

    @Override
    public void setAtaqueA(int ataqueA) {
        this.ataqueA = ataqueA;
    }

    @Override
    public int getPrecioA() {
        return precioA;
    }

    @Override
    public void setPrecioA(int precioA) {
        this.precioA = precioA;
    }
    
    
}
