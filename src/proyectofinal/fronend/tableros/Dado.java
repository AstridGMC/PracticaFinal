/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.fronend.tableros;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import proyectofinal.backend.Escenario.Vehiculo;

/**
 *
 * @author astridmc
 */
public class Dado extends javax.swing.JPanel {
int numeroSorteado = (int) (Math.random() * 5 + 1);
    /**
     * Creates new form Dado
     */
    public Dado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumero = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setBackground(new java.awt.Color(200, 42, 42));

        lblNumero.setFont(new java.awt.Font("Dyuthi", 0, 60)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(254, 254, 254));

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void seisCaras(){
        for(int i =0 ; i<numeroSorteado;i++){
            int numeroRandom = (int) (Math.random() * 5 + 1);
            lblNumero.setText(Integer.toString(numeroRandom));
        }
    }
    
    public void cienCaras(){
        for(int i =0 ; i<numeroSorteado;i++){
            int numeroRandom = (int) (Math.random() * 99 + 1);
            lblNumero.setText(Integer.toString(numeroRandom));
        }
    }
    
    public void tresCaras(JPanel panel){
        this.setBounds(panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight());
            panel.add(this);
        Movimiento dado = new Movimiento();
        dado.start();
    }
    
    class Movimiento extends Thread{
    
    public Movimiento() {
    }
    
    @Override
    public void run(){   
       for(int i =0 ; i<numeroSorteado;i++){
            
            try {
               int numeroRandom = (int) (Math.random() *2 + 1);
                lblNumero.setText(Integer.toString(numeroRandom)); 
        
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }  
    }
   }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel lblNumero;
    // End of variables declaration//GEN-END:variables
}
