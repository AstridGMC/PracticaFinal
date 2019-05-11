
package proyectofinal.fronend.menus;

import javax.swing.JOptionPane;

public class CompraMuniciones extends javax.swing.JPanel {

    protected int MUNICIONESMAYOR = 100;
    protected int MUNICIONESMENOR = 50;
    
    
    /**
     * Creates new form Municiones
     */
    public CompraMuniciones() {
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

        municionesTipo = new javax.swing.ButtonGroup();
        municionesPaquete = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTipo = new javax.swing.JLabel();
        btnMetralleta = new javax.swing.JRadioButton();
        btnCañon = new javax.swing.JRadioButton();
        btnMisil = new javax.swing.JRadioButton();
        rBtnCreadas = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        LabelPaquete = new javax.swing.JLabel();
        rbtnMayor = new javax.swing.JRadioButton();
        rbtnMenor = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();

        setBackground(new java.awt.Color(198, 253, 220));

        jLabel1.setFont(new java.awt.Font("Dyuthi", 1, 24)); // NOI18N
        jLabel1.setText("Compra Municiones Para tus armas");

        jPanel1.setBackground(new java.awt.Color(198, 253, 220));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 200, 222)));

        labelTipo.setFont(new java.awt.Font("Dyuthi", 1, 24)); // NOI18N
        labelTipo.setText("Tipo de municion:");

        btnMetralleta.setBackground(new java.awt.Color(198, 253, 220));
        municionesTipo.add(btnMetralleta);
        btnMetralleta.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btnMetralleta.setText("municion para ametralladora");
        btnMetralleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetralletaActionPerformed(evt);
            }
        });

        btnCañon.setBackground(new java.awt.Color(198, 253, 220));
        municionesTipo.add(btnCañon);
        btnCañon.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btnCañon.setText("municion para cañon");

        btnMisil.setBackground(new java.awt.Color(198, 253, 220));
        municionesTipo.add(btnMisil);
        btnMisil.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btnMisil.setText("municion para misil");

        rBtnCreadas.setBackground(new java.awt.Color(198, 253, 220));
        municionesTipo.add(rBtnCreadas);
        rBtnCreadas.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        rBtnCreadas.setText("municion para armas Creadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipo)
                    .addComponent(btnMisil)
                    .addComponent(btnCañon)
                    .addComponent(btnMetralleta)
                    .addComponent(rBtnCreadas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMetralleta)
                .addGap(18, 18, 18)
                .addComponent(btnCañon)
                .addGap(18, 18, 18)
                .addComponent(btnMisil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBtnCreadas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(198, 253, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 200, 222)));

        LabelPaquete.setFont(new java.awt.Font("Dyuthi", 1, 24)); // NOI18N
        LabelPaquete.setText("tipo de paquete:");

        rbtnMayor.setBackground(new java.awt.Color(198, 253, 220));
        municionesPaquete.add(rbtnMayor);
        rbtnMayor.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        rbtnMayor.setText("paquete de 30 Municiones");
        rbtnMayor.setText("paquete de 30 Municiones " + MUNICIONESMAYOR+ " monedas");

        rbtnMenor.setBackground(new java.awt.Color(198, 253, 220));
        municionesPaquete.add(rbtnMenor);
        rbtnMenor.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        rbtnMenor.setText("paquete de 15 Municiones");
        rbtnMenor.setText("paquete de 15 Municiones " + MUNICIONESMENOR+ " monedas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LabelPaquete)
                .addContainerGap(100, Short.MAX_VALUE))
            .addComponent(rbtnMenor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rbtnMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPaquete)
                .addGap(18, 18, 18)
                .addComponent(rbtnMayor)
                .addGap(37, 37, 37)
                .addComponent(rbtnMenor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setText("COMPRAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(btnMetralleta.isSelected()){
            if(rbtnMayor.isSelected()){
                System.out.println("metralleta mayor");
                this.setVisible(false);
            }else if (rbtnMenor.isSelected()){
                System.out.println("metralletaMenor");
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"es necesario rellenar los campos");
            }
        } else if(btnMisil.isSelected()){
            if(rbtnMayor.isSelected()){
                System.out.println("Misil mayor");
                this.setVisible(false);
            }else if (rbtnMenor.isSelected()){
                System.out.println("Misil menor");
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"es necesario rellenar los campos");
            }
        } else if(btnCañon.isSelected()){
            if(rbtnMayor.isSelected()){
                System.out.println("Cañon mayor");
                this.setVisible(false);
            }else if (rbtnMenor.isSelected()){
                System.out.println("Cañon menor");
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"es necesario rellenar los campos");
            }
        } else if(rBtnCreadas.isSelected()){
             if(rbtnMayor.isSelected()){
                System.out.println("Creadas mayor");
                this.setVisible(false);
            }else if (rbtnMenor.isSelected()){
                System.out.println("Creadas menor");
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"es necesario rellenar los campos");
            }
        }else{
            JOptionPane.showMessageDialog(null,"es necesario rellenar los campos");
        }
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnMetralletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetralletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMetralletaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPaquete;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JRadioButton btnCañon;
    private javax.swing.JRadioButton btnMetralleta;
    private javax.swing.JRadioButton btnMisil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTipo;
    private javax.swing.ButtonGroup municionesPaquete;
    public static javax.swing.ButtonGroup municionesTipo;
    private javax.swing.JRadioButton rBtnCreadas;
    private javax.swing.JRadioButton rbtnMayor;
    private javax.swing.JRadioButton rbtnMenor;
    // End of variables declaration//GEN-END:variables
}