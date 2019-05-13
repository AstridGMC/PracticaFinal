package proyectofinal.backend.Escenario;

import java.io.Serializable;
import java.util.ArrayList;


public class Arma implements Serializable{
    
    protected int municiones;
    protected  String nombreArma;
    protected  int punteriaArma;
    protected  int velocidadDisparoA;
    protected  int ataqueA;
    protected  int precioA;
    public static ArrayList <Arma> armas = new ArrayList();

    public Arma(String nombreArma, int punteriaArma, int VelocidadDisparoA, int AtaqueA) {
     
        this.nombreArma=nombreArma;
        this.punteriaArma=punteriaArma;
        this.velocidadDisparoA= VelocidadDisparoA;
        this.ataqueA=AtaqueA;
    }
    //constructor
    public Arma(String nombre) {
    }

    public Arma() {
    }
    
    

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }
    
    
    public int getMuniciones() {
        return municiones;
    }

    public void setMuniciones(int x) {
        this.municiones = municiones + x;
    }


    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public int getPunteriaArma() {
        return punteriaArma;
    }

    public void setPunteriaArma(int punteriaArma) {
        this.punteriaArma = 50;
    }

    public int getVelocidadDisparoA() {
        return 20;
    }

    public void setVelocidadDisparoA(int velocidadDisparoA) {
        this.velocidadDisparoA = velocidadDisparoA;
    }

    public int getAtaqueA() {
        return 30;
    }

    public void setAtaqueA(int ataqueA) {
        this.ataqueA = ataqueA;
    }

    public int getPrecioA() {
        return 200;
    }

    public void setPrecioA(int precio) {
        this.precioA = precio;
    }
    
    public int agregarMuniciones(int compra){
        municiones = municiones +compra;
        return municiones;
    }
    
    public void agregarArmas(Arma armaNueva){
        
        armas.add(armaNueva);
    }
    
    public int restarDisparos(){
        return municiones = (municiones - 1);
    }
    
    public String toStringA() {
        return "" + "   punteriaArma :" + punteriaArma + "  velocidadDisparo :" + velocidadDisparoA + "  ataque =  " + ataqueA +'.';
    } 

}

