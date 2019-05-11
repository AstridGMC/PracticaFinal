
package proyectofinal.backend.Escenario;


public class Escenario<T> {
    public static int[][] escenarios;

    public static int[][] getEscenarios() {
        return escenarios;
    }

    public static void setEscenarios(int[][] escenarios) {
        Escenario.escenarios = escenarios;
    }
    
    
    
    public int[][] escenario(){
        escenarios = new int[6][4];
        for(int i=0; i < 6 ; i++){
            for(int j=0; j<4; j++){
                    escenarios[i][j] = 0;
            }
        }
        return escenarios;
    }
  
}
