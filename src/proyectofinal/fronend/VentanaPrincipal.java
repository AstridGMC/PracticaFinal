
package proyectofinal.fronend;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyectofinal.fronend.menus.NuevoJuego;
import proyectofinal.fronend.menus.PedirNombre;
import proyectofinal.fronend.menus.Salir;
import proyectofinal.fronend.menus.TipoTablero;
import proyectofinal.fronend.tableros.EscenarioJungla;
import proyectofinal.fronend.tableros.EscenarioMontañoso;
import proyectofinal.fronend.tableros.EscenarioPlaya;

public class VentanaPrincipal extends javax.swing.JFrame {
    protected int numeroVehiculos=0;
    public static int vehiculoId =0;
    PedirNombre agregarJugador = new PedirNombre(this);
    NuevoJuego iniciarJuego = new NuevoJuego(this);
    TipoTablero miTablero = new TipoTablero(this);
    EscenarioPlaya nuevaPlaya = new EscenarioPlaya();
    EscenarioJungla nuevaJungla = new EscenarioJungla();
    EscenarioMontañoso nuevoMontañoso = new EscenarioMontañoso();
    Salir salida = new Salir(this);
    Tienda miTienda = new Tienda(this);
    
    public VentanaPrincipal() { 
        initComponents();
        diseño();
    }

    public JPanel getImagenPanel() {
        return imagenPanel;
    }

    public void setImagenPanel(JPanel imagenPanel) {
        this.imagenPanel = imagenPanel;
    }

    public int getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        imagenPanel = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        menuCrear = new javax.swing.JMenu();
        nuevoJugador = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuJugadores = new javax.swing.JMenu();
        btnMejoresJugadores = new javax.swing.JMenuItem();
        btnVerJugadores = new javax.swing.JMenuItem();
        btnTienda = new javax.swing.JMenu();
        irTiendabtn = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        btnSalida = new javax.swing.JMenuItem();
        menuAgregar = new javax.swing.JMenu();
        btTanque = new javax.swing.JMenuItem();
        btnAvion = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setBackground(new java.awt.Color(254, 171, 9));
        btnInicio.setFont(new java.awt.Font("Dyuthi", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(165, 3, 20));
        btnInicio.setText("INICIAR PARTIDA");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imagenPanelLayout = new javax.swing.GroupLayout(imagenPanel);
        imagenPanel.setLayout(imagenPanelLayout);
        imagenPanelLayout.setHorizontalGroup(
            imagenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        imagenPanelLayout.setVerticalGroup(
            imagenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenPanelLayout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("jButton1");

        MenuBar.setBackground(new java.awt.Color(2, 77, 5));

        menuCrear.setBackground(new java.awt.Color(26, 53, 10));
        menuCrear.setForeground(new java.awt.Color(225, 177, 51));
        menuCrear.setText("CREAR");
        menuCrear.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N

        nuevoJugador.setBackground(new java.awt.Color(12, 53, 3));
        nuevoJugador.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        nuevoJugador.setForeground(new java.awt.Color(217, 183, 108));
        nuevoJugador.setText("JUGADOR");
        nuevoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoJugadorActionPerformed(evt);
            }
        });
        menuCrear.add(nuevoJugador);

        jMenuItem1.setBackground(new java.awt.Color(2, 45, 3));
        jMenuItem1.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(228, 180, 115));
        jMenuItem1.setText("VEHICULOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCrear.add(jMenuItem1);

        MenuBar.add(menuCrear);

        menuJugadores.setForeground(new java.awt.Color(224, 168, 40));
        menuJugadores.setText("JUGADORES");
        menuJugadores.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N

        btnMejoresJugadores.setBackground(new java.awt.Color(5, 76, 14));
        btnMejoresJugadores.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btnMejoresJugadores.setForeground(new java.awt.Color(238, 207, 102));
        btnMejoresJugadores.setText("MEJORES JUGADORES");
        menuJugadores.add(btnMejoresJugadores);

        btnVerJugadores.setBackground(new java.awt.Color(5, 57, 2));
        btnVerJugadores.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btnVerJugadores.setForeground(new java.awt.Color(220, 180, 76));
        btnVerJugadores.setText("VER JUGADORES");
        btnVerJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerJugadoresActionPerformed(evt);
            }
        });
        menuJugadores.add(btnVerJugadores);

        MenuBar.add(menuJugadores);

        btnTienda.setForeground(new java.awt.Color(229, 171, 41));
        btnTienda.setText("TIENDA");
        btnTienda.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N

        irTiendabtn.setFont(new java.awt.Font("Dyuthi", 1, 18)); // NOI18N
        irTiendabtn.setForeground(new java.awt.Color(238, 207, 102));
        irTiendabtn.setText("IR A LA TIENDA");
        irTiendabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irTiendabtnActionPerformed(evt);
            }
        });
        btnTienda.add(irTiendabtn);

        MenuBar.add(btnTienda);

        salir.setBackground(new java.awt.Color(5, 76, 14));
        salir.setForeground(new java.awt.Color(229, 171, 41));
        salir.setText("SALIR JUEGO");
        salir.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N

        btnSalida.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(238, 207, 102));
        btnSalida.setText("SALIR DEL JUEGO");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        salir.add(btnSalida);

        MenuBar.add(salir);

        menuAgregar.setBackground(new java.awt.Color(5, 76, 14));
        menuAgregar.setForeground(new java.awt.Color(229, 171, 41));
        menuAgregar.setText("AgregarVehiculo");
        menuAgregar.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N

        btTanque.setBackground(new java.awt.Color(5, 76, 14));
        btTanque.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btTanque.setForeground(new java.awt.Color(238, 207, 102));
        btTanque.setText("Tanque");
        btTanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTanqueActionPerformed(evt);
            }
        });
        menuAgregar.add(btTanque);

        btnAvion.setBackground(new java.awt.Color(5, 76, 14));
        btnAvion.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btnAvion.setForeground(new java.awt.Color(238, 207, 102));
        btnAvion.setText("Avion");
        btnAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvionActionPerformed(evt);
            }
        });
        menuAgregar.add(btnAvion);

        MenuBar.add(menuAgregar);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        iniciarJuego.setVisible(true);
        if(NuevoJuego.getElegido()==1 || NuevoJuego.getElegido()==2){
            this.setResizable(true); 
            miTablero.setVisible(true);
            if(miTablero.getElegido()==1 ){
                imagenPanel.removeAll();
                imagenPanel.setVisible(false);
                if(miTablero.numeroTablero ==1){
                    
                    agregarTableroJungla();
                }else if (miTablero.numeroTablero == 2){
                    agregarTableroPlaya();
                } else if(miTablero.numeroTablero==3){
                    agregarTableroMontañoso();
                }
                irTiendabtn.setVisible(false);
                btnTienda.setVisible(false);
                salir.setVisible(true);
                btnSalida.setVisible(true);
                
            }
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnVerJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerJugadoresActionPerformed
        
    }//GEN-LAST:event_btnVerJugadoresActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
         salida.setVisible(true);
        if(salida.salio ==1 ){
            componentes();
            
        }else{
            salida.setVisible(false);
        }
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void irTiendabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irTiendabtnActionPerformed
        miTienda.setVisible(true);
        miTienda.getPanelOpcion().setVisible(false);
    }//GEN-LAST:event_irTiendabtnActionPerformed

    private void nuevoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoJugadorActionPerformed
        agregarJugador.setVisible(true);
    }//GEN-LAST:event_nuevoJugadorActionPerformed

    private void btTanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTanqueActionPerformed
        numeroVehiculos++;
        vehiculoId = 2;
    }//GEN-LAST:event_btTanqueActionPerformed

    private void btnAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvionActionPerformed
        numeroVehiculos++;
        vehiculoId = 1;
    }//GEN-LAST:event_btnAvionActionPerformed

    public void diseño(){
        salir.setVisible(false);
        btnSalida.setVisible(false);
        this.setResizable(false); 
        setTitle("JUEGO RPG");
        setLocation(400,100);
        JLabel imagen = new JLabel();
        ImageIcon portada = new ImageIcon("portada.png");
        setIconImage(new ImageIcon("portada.png").getImage());
        imagen.setBounds(0, 0, imagenPanel.getWidth(), imagenPanel.getHeight());
        imagen.setIcon(new ImageIcon(portada.getImage().getScaledInstance(imagenPanel.getWidth(), imagenPanel.getHeight(), Image.SCALE_SMOOTH)));
        imagenPanel.add(imagen);
    }
    
    public void agregarTableroPlaya(){
        imagenPanel.setVisible(true);
        imagenPanel.setLayout(new GridLayout(1, 1));
        imagenPanel.add(nuevaPlaya.playa());
        imagenPanel.setPreferredSize(new Dimension(500, 500));
        imagenPanel.setVisible(true);
        if(imagenPanel.getHeight()>this.getHeight()){
            imagenPanel.setPreferredSize(new Dimension(this.getHeight(), this.getWidth()));
        }
    }
    
    public void agregarTableroJungla(){ 
        imagenPanel.setVisible(true);
        imagenPanel.setLayout(new GridLayout(1, 1));
        imagenPanel.add(nuevaJungla.jungla());
        imagenPanel.setSize(new Dimension(this.getHeight(), this.getWidth()));
        imagenPanel.setVisible(true);
        imagenPanel.setFocusable(false);
    }
    
    public void agregarTableroMontañoso(){
        imagenPanel.setVisible(true);
        imagenPanel.setLayout(new GridLayout(1, 1));
        imagenPanel.add(nuevoMontañoso.montañoso());
        imagenPanel.setPreferredSize(new Dimension(this.getHeight(), this.getWidth()));
        imagenPanel.setVisible(true);
        if(imagenPanel.getHeight()==this.getHeight()){
            imagenPanel.setPreferredSize(new Dimension(this.getHeight(), this.getWidth()));
        }
    }
      public  void componentes(){
        imagenPanel.setVisible(false);
        imagenPanel.removeAll();
        initComponents();
        diseño();
        imagenPanel.setVisible(true);
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem btTanque;
    private javax.swing.JMenuItem btnAvion;
    private javax.swing.JButton btnInicio;
    private javax.swing.JMenuItem btnMejoresJugadores;
    private javax.swing.JMenuItem btnSalida;
    private javax.swing.JMenu btnTienda;
    private javax.swing.JMenuItem btnVerJugadores;
    public javax.swing.JPanel imagenPanel;
    private javax.swing.JMenuItem irTiendabtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenu menuCrear;
    private javax.swing.JMenu menuJugadores;
    private javax.swing.JMenuItem nuevoJugador;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
