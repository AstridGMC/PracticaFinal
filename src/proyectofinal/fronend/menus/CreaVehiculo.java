/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.fronend.menus;

import javax.swing.JOptionPane;
import proyectofinal.backend.Escenario.Avion;
import proyectofinal.backend.Escenario.Jugador;
import proyectofinal.backend.Escenario.Tanque;
import proyectofinal.fronend.menus.PedirNombre;

/**
 *
 * @author astridmc
 */
public class CreaVehiculo extends javax.swing.JDialog {
    PedirNombre nombre = new PedirNombre();
    protected Jugador actual = nombre.nuevoJugador;
    protected String nombreVehiculo;
    protected int i=0;
    /**
     * Creates new form CreaVehiculo
     * @param parent
     */
    public CreaVehiculo(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        txtGuardado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoVehiculos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        txtNombreVehiculo = new javax.swing.JTextField();
        btnTanque = new javax.swing.JRadioButton();
        btnAvion = new javax.swing.JRadioButton();
        lblNombre = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtGuardado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEspecificaciones = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(129, 239, 237));

        lblTitulo.setFont(new java.awt.Font("Dyuthi", 0, 36)); // NOI18N
        lblTitulo.setText("CREA TU PROPIO VEHICULO");

        lbltipo.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        lbltipo.setText("QUE TIPO DE VEHICULO DESEAS?");

        txtNombreVehiculo.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        txtNombreVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVehiculoActionPerformed(evt);
            }
        });

        grupoVehiculos.add(btnTanque);
        btnTanque.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        btnTanque.setText("TANQUE");
        btnTanque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTanqueMouseClicked(evt);
            }
        });
        btnTanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanqueActionPerformed(evt);
            }
        });

        grupoVehiculos.add(btnAvion);
        btnAvion.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        btnAvion.setText("AVION");
        btnAvion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAvionMouseClicked(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        lblNombre.setText("NOMBRE DE TU VEHICULO?");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("* Debes crear al menos tres vehiculos");

        txtGuardado.setText("Su nuevo  Vehiculo se ha agregado a sus vehiculos");

        jScrollPane1.setViewportView(txtEspecificaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbltipo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAvion)
                                .addComponent(btnTanque))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(lblTitulo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(txtGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(txtNombreVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(25, 25, 25)
                .addComponent(lbltipo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTanque, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAvion))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtGuardado)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTanqueActionPerformed

    private void txtNombreVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVehiculoActionPerformed

    private void btnAvionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvionMouseClicked
         if(btnAvion.isSelected()){
            txtEspecificaciones.setText("este vehiculo no tiene mucha potencia de disparo pero tiene excelente punteria y mucha velocidad de ataque ");
        }   
    }//GEN-LAST:event_btnAvionMouseClicked

    private void btnTanqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTanqueMouseClicked
         if(btnTanque.isSelected()){
            txtEspecificaciones.setText("vehiculo pesado con con mucha defensa, es capaz de disparar armas con mucha potencia \n posee defensa alta pero tiene poca punteria ");
        }   
    }//GEN-LAST:event_btnTanqueMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtNombreVehiculo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Nombre Requerido");
        }else if(i<3){
            if(btnAvion.isSelected()){
                nombreVehiculo = txtNombreVehiculo.getText();
                txtGuardado.setVisible(true);
                Avion avion = new Avion (nombreVehiculo);
                actual.setVehiculos(i, avion);
                txtNombreVehiculo.setText("");
                i++;
            }else if(btnTanque.isSelected()){
                nombreVehiculo = txtNombreVehiculo.getText();
                txtGuardado.setVisible(true);
                Tanque tanque = new Tanque (nombreVehiculo);
                actual.setVehiculos(i, tanque);
                txtNombreVehiculo.setText("");
                i++;
            }
        }else{
            JOptionPane.showMessageDialog(null,"su espacio para vehiculos esta lleno");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAvion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JRadioButton btnTanque;
    private javax.swing.ButtonGroup grupoVehiculos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JTextPane txtEspecificaciones;
    private javax.swing.JLabel txtGuardado;
    private javax.swing.JTextField txtNombreVehiculo;
    // End of variables declaration//GEN-END:variables
}