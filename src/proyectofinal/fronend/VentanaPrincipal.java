
package proyectofinal.fronend;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyectofinal.fronend.menus.CreaArmas;
import proyectofinal.fronend.menus.CreaVehiculo;
import proyectofinal.fronend.menus.Modalidad;
import proyectofinal.fronend.menus.PedirNombre;
import proyectofinal.fronend.menus.Salir;
import proyectofinal.fronend.menus.TipoTablero;
import proyectofinal.fronend.tableros.EscenarioJungla;
import proyectofinal.fronend.tableros.EscenarioMontañoso;
import proyectofinal.fronend.tableros.EscenarioPlaya;

public class VentanaPrincipal extends javax.swing.JFrame {
    protected int numeroVehiculos=0;
    public static int vehiculoId =0;
    CreaVehiculo crearVehiculo = new CreaVehiculo(this);
    PedirNombre agregarJugador = new PedirNombre(this);
    Modalidad iniciarJuego = new Modalidad(this);
    CreaArmas nuevaArma = new CreaArmas(this);
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
        jMenu1 = new javax.swing.JMenu();
        imagenPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        menuCrear = new javax.swing.JMenu();
        nuevoJugador = new javax.swing.JMenuItem();
        btnCrearVehiculo = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
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

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout imagenPanelLayout = new javax.swing.GroupLayout(imagenPanel);
        imagenPanel.setLayout(imagenPanelLayout);
        imagenPanelLayout.setHorizontalGroup(
            imagenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        imagenPanelLayout.setVerticalGroup(
            imagenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jPanel1.setBackground(new java.awt.Color(8, 99, 16));

        jLabel1.setFont(new java.awt.Font("Dyuthi", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("NOMBRE JUGADOR 1");

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Dyuthi", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("NOMBRE JUGADOR 2");

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Dyuthi", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("JUGADOR EN TURNO");

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("jLabel2");

        jButton2.setText("CAMBIAR VEHICULO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(8, 99, 16));

        btnInicio.setBackground(new java.awt.Color(254, 171, 9));
        btnInicio.setFont(new java.awt.Font("Dyuthi", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(165, 3, 20));
        btnInicio.setText("INICIAR PARTIDA");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnInicio)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

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

        btnCrearVehiculo.setBackground(new java.awt.Color(2, 45, 3));
        btnCrearVehiculo.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        btnCrearVehiculo.setForeground(new java.awt.Color(228, 180, 115));
        btnCrearVehiculo.setText("VEHICULOS");
        btnCrearVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVehiculoActionPerformed(evt);
            }
        });
        menuCrear.add(btnCrearVehiculo);

        jMenuItem3.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(228, 180, 115));
        jMenuItem3.setText("ARMAS");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuCrear.add(jMenuItem3);

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
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVehiculoActionPerformed
        crearVehiculo.setVisible(true);
    }//GEN-LAST:event_btnCrearVehiculoActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        iniciarJuego.setVisible(true);
        if(Modalidad.getElegido()==1 || Modalidad.getElegido()==2){
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
                menuAgregar.setVisible(true);
                btTanque.setVisible(true);
                btnAvion.setVisible(true);
            }
            btnInicio.setVisible(false);
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnVerJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerJugadoresActionPerformed
        
    }//GEN-LAST:event_btnVerJugadoresActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        salida.setVisible(true);
        menuAgregar.setVisible(true);
        btTanque.setVisible(true);
        btnAvion.setVisible(true);
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

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        nuevaArma.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public void diseño(){
        menuAgregar.setVisible(false);
        btTanque.setVisible(false);
        btnAvion.setVisible(false);
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
    
    //agrega tablero playa al panel
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
    //agrega tablero Jungla al panel
    public void agregarTableroJungla(){ 
        imagenPanel.setVisible(true);
        imagenPanel.setLayout(new GridLayout(1, 1));
        imagenPanel.add(nuevaJungla.jungla());
        imagenPanel.setSize(new Dimension(this.getHeight(), this.getWidth()));
        imagenPanel.setVisible(true);
        imagenPanel.setFocusable(false);
    }
    //agrega tablero Montañoso al panel
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
    private javax.swing.JMenuItem btnCrearVehiculo;
    private javax.swing.JButton btnInicio;
    private javax.swing.JMenuItem btnMejoresJugadores;
    private javax.swing.JMenuItem btnSalida;
    private javax.swing.JMenu btnTienda;
    private javax.swing.JMenuItem btnVerJugadores;
    public javax.swing.JPanel imagenPanel;
    private javax.swing.JMenuItem irTiendabtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenu menuCrear;
    private javax.swing.JMenu menuJugadores;
    private javax.swing.JMenuItem nuevoJugador;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
