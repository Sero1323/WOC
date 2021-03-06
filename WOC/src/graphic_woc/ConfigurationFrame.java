/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphic_woc;

import usuario.UserInfo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logic.Loader;
import logic.Match;
import woc.Soldier;

/**
 *
 * @author Felipe
 */
public class ConfigurationFrame extends javax.swing.JFrame {
    
    private static UserInfo information;
    
    /**
     * Creates new form ConfigurationFrame
     */
    public ConfigurationFrame() {
        initComponents();
        lblUsuario.setText(information.getUsuario());
        btnJugar.setVisible(false);
    }

    public static void initUser(UserInfo user) {
        information = user;
    }
    
    private void mostrarOpciones() {
        if (information.getTipo().equals("Administrador")) {
            javax.swing.JPanel pnlOpciones = new javax.swing.JPanel();
            javax.swing.JPanel pnlUsuarios = new javax.swing.JPanel();
            javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
            javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
            javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
            javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
            javax.swing.JTextField jTextField3 = new javax.swing.JTextField();
            javax.swing.JButton btnAceptar = new javax.swing.JButton();
            javax.swing.JButton btnCancelar = new javax.swing.JButton();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInformacion = new javax.swing.JPanel();
        btnPartida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPartidas = new javax.swing.JList();
        lblUsuario = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        pnlOperacion = new javax.swing.JPanel();
        tbpModulos = new javax.swing.JTabbedPane();
        pnlPartidaImagen = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        pnlOpciones = new javax.swing.JPanel();
        tbpGame = new javax.swing.JTabbedPane();
        pnlSoldados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSoldados = new javax.swing.JList();
        pnlSoldadosInformacion = new javax.swing.JPanel();
        pnlEstructuras = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstEstructuras = new javax.swing.JList();
        pnlEstructurasInformacion = new javax.swing.JPanel();
        pnlUsuarios = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuraciones");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        pnlInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Partidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22))); // NOI18N
        pnlInformacion.setMinimumSize(new java.awt.Dimension(200, 150));
        pnlInformacion.setPreferredSize(new java.awt.Dimension(300, 275));

        btnPartida.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btnPartida.setText("Nueva partida");
        btnPartida.setMaximumSize(new java.awt.Dimension(100, 75));
        btnPartida.setMinimumSize(new java.awt.Dimension(100, 50));
        btnPartida.setPreferredSize(new java.awt.Dimension(150, 50));
        btnPartida.setRequestFocusEnabled(false);
        btnPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidaActionPerformed(evt);
            }
        });

        lstPartidas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lstPartidas.setModel(new javax.swing.AbstractListModel<GameFrame>() {
            ArrayList<GameFrame> plays = information.getGames();
            public int getSize() { return plays.size(); }
            public GameFrame getElementAt(int i) { return plays.get(i); }
        });
        lstPartidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lstPartidas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPartidasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPartidas);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblUsuario.setText("Usuario");
        lblUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienvenido"));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");

        javax.swing.GroupLayout pnlInformacionLayout = new javax.swing.GroupLayout(pnlInformacion);
        pnlInformacion.setLayout(pnlInformacionLayout);
        pnlInformacionLayout.setHorizontalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlInformacionLayout.setVerticalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacionLayout.createSequentialGroup()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuraciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22))); // NOI18N

        pnlPartidaImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPartidaImagenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPartidaImagenMouseExited(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(190, 150));
        jPanel1.setMinimumSize(new java.awt.Dimension(190, 150));
        jPanel1.setPreferredSize(new java.awt.Dimension(190, 150));

        btnJugar.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJugarMouseEntered(evt);
            }
        });
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnJugar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(btnJugar)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout pnlPartidaImagenLayout = new javax.swing.GroupLayout(pnlPartidaImagen);
        pnlPartidaImagen.setLayout(pnlPartidaImagenLayout);
        pnlPartidaImagenLayout.setHorizontalGroup(
            pnlPartidaImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPartidaImagenLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        pnlPartidaImagenLayout.setVerticalGroup(
            pnlPartidaImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPartidaImagenLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        tbpModulos.addTab("Partida", pnlPartidaImagen);

        lstSoldados.setModel(new javax.swing.AbstractListModel<Soldier>() {
            ArrayList<Soldier> soldiers = Loader.loadSoldiers();
            public int getSize() { return soldiers.size(); }
            public Soldier getElementAt(int i) { return soldiers.get(i); }
        });
        jScrollPane2.setViewportView(lstSoldados);

        pnlSoldadosInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion"));

        javax.swing.GroupLayout pnlSoldadosInformacionLayout = new javax.swing.GroupLayout(pnlSoldadosInformacion);
        pnlSoldadosInformacion.setLayout(pnlSoldadosInformacionLayout);
        pnlSoldadosInformacionLayout.setHorizontalGroup(
            pnlSoldadosInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        pnlSoldadosInformacionLayout.setVerticalGroup(
            pnlSoldadosInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlSoldadosLayout = new javax.swing.GroupLayout(pnlSoldados);
        pnlSoldados.setLayout(pnlSoldadosLayout);
        pnlSoldadosLayout.setHorizontalGroup(
            pnlSoldadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSoldadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlSoldadosInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSoldadosLayout.setVerticalGroup(
            pnlSoldadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSoldadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSoldadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(pnlSoldadosInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbpGame.addTab("Soldados", pnlSoldados);

        lstEstructuras.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstEstructuras);

        pnlEstructurasInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion"));

        javax.swing.GroupLayout pnlEstructurasInformacionLayout = new javax.swing.GroupLayout(pnlEstructurasInformacion);
        pnlEstructurasInformacion.setLayout(pnlEstructurasInformacionLayout);
        pnlEstructurasInformacionLayout.setHorizontalGroup(
            pnlEstructurasInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        pnlEstructurasInformacionLayout.setVerticalGroup(
            pnlEstructurasInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlEstructurasLayout = new javax.swing.GroupLayout(pnlEstructuras);
        pnlEstructuras.setLayout(pnlEstructurasLayout);
        pnlEstructurasLayout.setHorizontalGroup(
            pnlEstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstructurasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlEstructurasInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlEstructurasLayout.setVerticalGroup(
            pnlEstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstructurasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(pnlEstructurasInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbpGame.addTab("Estructuras", pnlEstructuras);

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpGame)
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpGame)
                .addContainerGap())
        );

        tbpModulos.addTab("Opciones", pnlOpciones);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion"));

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jLabel2.setText("jLabel2");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Jugador" }));

        jLabel3.setText("jLabel3");

        jTextField3.setText("jTextField3");

        btnAceptar.setText("Aceptar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        lstUsuarios.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstUsuarios);

        javax.swing.GroupLayout pnlUsuariosLayout = new javax.swing.GroupLayout(pnlUsuarios);
        pnlUsuarios.setLayout(pnlUsuariosLayout);
        pnlUsuariosLayout.setHorizontalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlUsuariosLayout.setVerticalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        tbpModulos.addTab("Usuarios", pnlUsuarios);

        javax.swing.GroupLayout pnlOperacionLayout = new javax.swing.GroupLayout(pnlOperacion);
        pnlOperacion.setLayout(pnlOperacionLayout);
        pnlOperacionLayout.setHorizontalGroup(
            pnlOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpModulos)
                .addContainerGap())
        );
        pnlOperacionLayout.setVerticalGroup(
            pnlOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpModulos)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        GameFrame game = new GameFrame();
        game.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidaActionPerformed
        String play = JOptionPane.showInputDialog(this, "Ingrese un identificador para la partida", "Partida", JOptionPane.INFORMATION_MESSAGE);
        Match.getManager().insert(play + "," + information.getIdUsuario());
    }//GEN-LAST:event_btnPartidaActionPerformed

    private void lstPartidasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPartidasValueChanged
        
    }//GEN-LAST:event_lstPartidasValueChanged

    private void pnlPartidaImagenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPartidaImagenMouseEntered
        btnJugar.setVisible(true);
    }//GEN-LAST:event_pnlPartidaImagenMouseEntered

    private void pnlPartidaImagenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPartidaImagenMouseExited
        btnJugar.setVisible(false);
    }//GEN-LAST:event_pnlPartidaImagenMouseExited

    private void btnJugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseEntered
        btnJugar.setVisible(true);
    }//GEN-LAST:event_btnJugarMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfigurationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigurationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigurationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigurationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigurationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnPartida;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList lstEstructuras;
    private javax.swing.JList lstPartidas;
    private javax.swing.JList lstSoldados;
    private javax.swing.JList lstUsuarios;
    private javax.swing.JPanel pnlEstructuras;
    private javax.swing.JPanel pnlEstructurasInformacion;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlOperacion;
    private javax.swing.JPanel pnlPartidaImagen;
    private javax.swing.JPanel pnlSoldados;
    private javax.swing.JPanel pnlSoldadosInformacion;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JTabbedPane tbpGame;
    private javax.swing.JTabbedPane tbpModulos;
    // End of variables declaration//GEN-END:variables
}
