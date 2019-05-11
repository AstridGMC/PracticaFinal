/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.backend.Escenario;


public class Enemigo {
    protected static int ATAQUE = 10;
    protected static int DEFENSA =5;
    protected static int VIDA = 25;
    protected static int punteria = (int) (Math.random() * 15 + 1);

    
    public void agregarImagen(){
        
    }
    

    public int getATAQUE() {
        return ATAQUE;
    }

    public void setATAQUE(int ATAQUE) {
        Enemigo.ATAQUE = ATAQUE;
    }

    public int getDEFENSA() {
        return DEFENSA;
    }

    public void setDEFENSA(int DEFENSA) {
        Enemigo.DEFENSA = DEFENSA;
    }

    public int getVIDA() {
        return VIDA;
    }

    public static void setVIDA(int VIDA) {
        Enemigo.VIDA = VIDA;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        Enemigo.punteria = punteria;
    }
    

        
    public static boolean disparar( ){
        Arma miArma= new Arma();
        int disparo = (int) (Math.random() * 100 + 1);
            
        if(disparo<=60){
            System.out.println("ha acertado\n");
            miArma.municiones--;
            
            return true;
          
        }else {
            System.out.println("\n RENEMIGO ha fallado\n ");
            return false;
        }
    }
    
    
}
