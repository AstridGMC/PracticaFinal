package proyectofinal.backend.Escenario;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
    protected  int nivel = 1;
    protected  int myOro = 100;
    protected  String nombre;
    protected  int experiencia =0;
    protected  int necesario = 50;    //experiencia necesaria para subir de nivel   
    public static ArrayList <Jugador> jugadores = new ArrayList();
    protected Vehiculo[] Vehiculos =new Vehiculo[3];
    protected ArrayList <Arma> armasJugador = new ArrayList();
    Cañon cañon = new Cañon();
    protected String ID;
    
    
    static Scanner miScaner = new Scanner(System.in);


    public Jugador() {
        armasJugador.add(cañon);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Arma> getArmasJugador() {
        return armasJugador;
    }

    public void setArmasJugador(ArrayList<Arma> armasJugador) {
        this.armasJugador = armasJugador;
    }

    
    public ArrayList<Arma> getArmas() {
        
        return armasJugador;
    }

    public void setArmas(ArrayList<Arma> armasJugador) {
        this.armasJugador = armasJugador;
    }
    

    public Jugador(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public Vehiculo[] getVehiculos() {
        return Vehiculos;
    }

    public void setVehiculos(int i, Vehiculo vehiculo) {
        this.Vehiculos[i] = vehiculo;
    }
    

    public  int getNivel() {
        return nivel;
    }

    public  void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMyOro() {
        return myOro;
    }

    public void setMyOro(int MyOro) {
        this.myOro = MyOro;
    }

    public String getNombre() {
        return nombre;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    public void pedirNombre(){
        System.out.println("Cual es tu nombre Jugador?");
        nombre= miScaner.nextLine();
    }
    
    public static void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public int subirNivel(){ //aumentar los requerimientos a la hoea de subir de nivel
        
        if (necesario ==experiencia){
            nivel= nivel+1;
            return necesario = (necesario*(3/2));
        } else {
            return necesario = necesario+0;
        }
    }
    /*        
    public static void mostrarDatos(){
        System.out.println("Hola     "+ Jugador.nombre +"     estos son tus Datos:\n");
        System.out.println("tu oro  "+ Jugador.getMyOro()+"  monedas"+"      tu nivel " + Jugador.getNivel()+ "     tu experiencia  "+ Jugador.getExperiencia()+ "\n");
        System.out.println("\nTUS VEHICULOS\n");
        CrearVehiculo.mostrarDatos();
        System.out.println("");
        System.out.println("\n Tus ARMAS:  \n");
        Arcenal.miArcenal();
        System.out.println("\nTus KITS de REPARACION  comprados\n");
        ComprarKit.mostrarMisKits();
        MenuPrincipal.regresarAlMenu();
    }*/

  
}
