
package proyectofinal.fronend;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyectofinal.backend.Escenario.CombateComputadora;
import proyectofinal.backend.Escenario.Jugador;
import proyectofinal.fronend.menus.CreaArmas;
import proyectofinal.fronend.menus.CreaVehiculo;
import proyectofinal.fronend.menus.EscogerJugador;
import proyectofinal.fronend.menus.Modalidad;
import proyectofinal.fronend.menus.PedirNombre;
import proyectofinal.fronend.menus.Salir;
import proyectofinal.fronend.menus.TipoTablero;
import proyectofinal.fronend.tableros.Dado;
import proyectofinal.fronend.tableros.EscenarioJungla;
import proyectofinal.fronend.tableros.EscenarioMontañoso;
import proyectofinal.fronend.tableros.EscenarioPlaya;

public class VentanaPrincipal extends javax.swing.JFrame {
    protected int numeroVehiculos=0;
    public static int vehiculoId =0;
    CombateComputadora computadora = new CombateComputadora();
    CreaVehiculo crearVehiculo = new CreaVehiculo(this);
    PedirNombre agregarJugador = new PedirNombre(this);
    Modalidad iniciarJuego = new Modalidad(this);
    CreaArmas nuevaArma = new CreaArmas(this);
    TipoTablero miTablero = new TipoTablero(this);
    EscenarioPlaya nuevaPlaya = new EscenarioPlaya();
    EscenarioJungla nuevaJungla = new EscenarioJungla();
    EscenarioMontañoso nuevoMontañoso = new EscenarioMontañoso();
    EscogerJugador jugadorEnCurso = new EscogerJugador(this);
    Dado dado = new Dado();
    private static int disparado=9;
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
        VentanaPrincipal.vehiculoId = vehiculoId;
    }

    public JLabel getLblJugadorEnTurno() {
        return lblJugadorEnTurno;
    }

    public void setLblJugadorEnTurno(JLabel lblJugadorEnTurno) {
        this.lblJugadorEnTurno = lblJugadorEnTurno;
    }

    public static int getDisparado() {
        return disparado;
    }

    public static void setDisparado(int disparado) {
        VentanaPrincipal.disparado = disparado;
    }
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        imagenPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        lblJugador1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblTurnoDe = new javax.swing.JLabel();
        lblJugadorEnTurno = new javax.swing.JLabel();
        btnCambiarVehiculo = new javax.swing.JButton();
        btnDisparar = new javax.swing.JButton();
        combVehiculo = new javax.swing.JComboBox<>();
        panelDado = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnDado = new javax.swing.JButton();
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
        menuInicioSecion = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout imagenPanelLayout = new javax.swing.GroupLayout(imagenPanel);
        imagenPanel.setLayout(imagenPanelLayout);
        imagenPanelLayout.setHorizontalGroup(
            imagenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        imagenPanelLayout.setVerticalGroup(
            imagenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        panelInfo.setBackground(new java.awt.Color(8, 99, 16));

        lblJugador1.setFont(new java.awt.Font("Dyuthi", 0, 20)); // NOI18N
        lblJugador1.setForeground(new java.awt.Color(254, 254, 254));
        lblJugador1.setText("NOMBRE JUGADOR 1");

        lblNombre1.setForeground(new java.awt.Color(254, 254, 254));
        lblNombre1.setText(".................");

        lblJugador2.setFont(new java.awt.Font("Dyuthi", 0, 20)); // NOI18N
        lblJugador2.setForeground(new java.awt.Color(254, 254, 254));
        lblJugador2.setText("NOMBRE JUGADOR 2");

        lblNombre2.setForeground(new java.awt.Color(254, 254, 254));
        lblNombre2.setText("jLabel2");

        lblTurnoDe.setFont(new java.awt.Font("Dyuthi", 0, 20)); // NOI18N
        lblTurnoDe.setForeground(new java.awt.Color(254, 254, 254));
        lblTurnoDe.setText("JUGADOR EN TURNO");

        lblJugadorEnTurno.setForeground(new java.awt.Color(254, 254, 254));
        lblJugadorEnTurno.setText("jLabel2");

        btnCambiarVehiculo.setText("CAMBIAR VEHICULO");

        btnDisparar.setText("DISPARAR");
        btnDisparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispararActionPerformed(evt);
            }
        });

        combVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJugador1)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblJugador2)
                            .addComponent(lblTurnoDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJugadorEnTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnCambiarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisparar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre1)
                .addGap(33, 33, 33)
                .addComponent(lblJugador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre2)
                .addGap(26, 26, 26)
                .addComponent(lblTurnoDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblJugadorEnTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambiarVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDisparar)
                .addContainerGap())
        );

        panelDado.setBackground(new java.awt.Color(8, 99, 16));

        btnInicio.setBackground(new java.awt.Color(254, 171, 9));
        btnInicio.setFont(new java.awt.Font("Dyuthi", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(165, 3, 20));
        btnInicio.setText("INICIAR PARTIDA");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnDado.setBackground(new java.awt.Color(154, 233, 33));
        btnDado.setText("TIRAR DADO");
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDadoLayout = new javax.swing.GroupLayout(panelDado);
        panelDado.setLayout(panelDadoLayout);
        panelDadoLayout.setHorizontalGroup(
            panelDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInicio))
                    .addComponent(btnDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDadoLayout.setVerticalGroup(
            panelDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDado)
                .addGap(46, 46, 46)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
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

        jMenuItem3.setBackground(new java.awt.Color(5, 76, 14));
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

        menuInicioSecion.setBackground(new java.awt.Color(5, 76, 14));
        menuInicioSecion.setForeground(new java.awt.Color(229, 171, 41));
        menuInicioSecion.setText("INICIO SECION");
        menuInicioSecion.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N

        jMenu3.setBackground(new java.awt.Color(5, 76, 14));
        jMenu3.setForeground(new java.awt.Color(238, 207, 102));
        jMenu3.setText("USUARIO");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        menuInicioSecion.add(jMenu3);

        MenuBar.add(menuInicioSecion);

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
                    .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imagenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVehiculoActionPerformed
        crearVehiculo.setVisible(true);
    }//GEN-LAST:event_btnCrearVehiculoActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if(Jugador.jugadores.isEmpty()){
            JOptionPane.showMessageDialog(null,"NO HA CREADO JUGADORES");
        } else if(Jugador.jugadores.get(0)!=null){
            iniciarJuego.setVisible(true);
            
            if(Modalidad.getElegido()==1 ){
                tableroElegido();
            }
            else if ( Modalidad.getElegido()==2){
                tableroElegido();
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
    
    private void btnDispararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispararActionPerformed
        
        computadora.combate(disparado, lblTurnoDe, lblNombre1, lblNombre2);
    }//GEN-LAST:event_btnDispararActionPerformed

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed
        dado.tresCaras( panelDado);
    }//GEN-LAST:event_btnDadoActionPerformed
   /* public void combate(){
        System.out.println("INICIA LA PARTIDA:");
        Vehiculo miVehiculo = new Vehiculo();
        do{
            disparado=0;
           if(disparado ==1){
                    miVehiculo.disparar();
                    System.out.println("eee");
                    
           }else{
            if(Enemigo.disparar() == true){
                JOptionPane.showMessageDialog(null,"Enemigo ha acertado");
                miVehiculo.setHP(miVehiculo.getHP()-1);
            }else{
                JOptionPane.showMessageDialog(null,"nenemigo Ha Fallado");
            }
           }
            
        }while (miVehiculo.getHP()!=0 || Enemigo.getVIDA()!=0);
        
        if(Enemigo.getVIDA()==0){
            JOptionPane.showMessageDialog(null,"has ganado la batalla FELICIDADES");
            JOptionPane.showMessageDialog(null,"se le han acreditado 200 monedas y 50 puntos de experiencia");
            Jugador.jugadores.get(0).setMyOro(Jugador.jugadores.get(0).getMyOro()+ 200);
            Jugador.jugadores.get(0).setExperiencia(Jugador.jugadores.get(0).getExperiencia()+50);
            componentes();
        } else {
            JOptionPane.showMessageDialog(null,"ha sido derrotado");
            componentes();
        }
    }*/
    
    public void diseño(){
        ocultarEtiquetas();
        setTitle("JUEGO RPG");
        setLocation(400,100);
        JLabel imagen = new JLabel();
        ImageIcon portada = new ImageIcon("portada.png");
        setIconImage(new ImageIcon("portada.png").getImage());
        imagen.setBounds(0, 0, imagenPanel.getWidth(), imagenPanel.getHeight());
        imagen.setIcon(new ImageIcon(portada.getImage().getScaledInstance(imagenPanel.getWidth(), imagenPanel.getHeight(), Image.SCALE_SMOOTH)));
        imagenPanel.add(imagen);
    }
    
    public void ocultarEtiquetas(){
        btnDisparar.setVisible(false);
        lblNombre2.setVisible(false);
        lblNombre1.setVisible(false);
        btnDado.setVisible(false);
        lblJugador1.setVisible(false);
        lblJugador2.setVisible(false);
        lblJugadorEnTurno.setVisible(false);
        lblTurnoDe.setVisible(false);
        lblNombre1.setVisible(false);
        btnCambiarVehiculo.setVisible(false);
        menuAgregar.setVisible(false);
        btTanque.setVisible(false);
        btnAvion.setVisible(false);
        salir.setVisible(false);
        btnSalida.setVisible(false);
        this.setResizable(false); 
    }
    
    public void inicializarEtiquetas(){
        btnDisparar.setVisible(true);
        menuCrear.setVisible(false);
        menuJugadores.setVisible(false);
        btnTienda.setVisible(false);
        menuInicioSecion.setVisible(false);
        lblNombre2.setVisible(true);
        lblNombre1.setVisible(true);
        btnDado.setVisible(true);
        lblJugador1.setVisible(true);
        lblJugador2.setVisible(true);
        lblJugadorEnTurno.setVisible(true);
        lblTurnoDe.setVisible(true);
        lblNombre1.setVisible(true);
        btnCambiarVehiculo.setVisible(true);
        menuAgregar.setVisible(true);
        btTanque.setVisible(true);
        btnAvion.setVisible(true);
        salir.setVisible(true);
        btnSalida.setVisible(true);
        btnInicio.setVisible(false);
    }
    
    public void tableroElegido(){
        this.setResizable(true); 
            miTablero.setVisible(true);
            inicializarEtiquetas();
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
        ocultarEtiquetas();
        initComponents();
        diseño();
        imagenPanel.setVisible(true);
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem btTanque;
    private javax.swing.JMenuItem btnAvion;
    private javax.swing.JButton btnCambiarVehiculo;
    private javax.swing.JMenuItem btnCrearVehiculo;
    private javax.swing.JButton btnDado;
    private javax.swing.JButton btnDisparar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JMenuItem btnMejoresJugadores;
    private javax.swing.JMenuItem btnSalida;
    private javax.swing.JMenu btnTienda;
    private javax.swing.JMenuItem btnVerJugadores;
    private javax.swing.JComboBox<String> combVehiculo;
    private javax.swing.JPanel imagenPanel;
    private javax.swing.JMenuItem irTiendabtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugadorEnTurno;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblTurnoDe;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenu menuCrear;
    private javax.swing.JMenu menuInicioSecion;
    private javax.swing.JMenu menuJugadores;
    private javax.swing.JMenuItem nuevoJugador;
    private javax.swing.JPanel panelDado;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
