/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphic_woc;

import javax.swing.ImageIcon;
import woc.Building;
import woc.Castle;
import woc.Celd;

/**
 *
 * @author Sergio
 */
public class GameFrame extends javax.swing.JFrame {
    Castle c;
    ImageIcon ground = new ImageIcon("src/Buildings_IMG/ground.jpg");
    ImageIcon ground_select = new ImageIcon("src/Buildings_IMG/ground_select.jpg");
    Celd lastselect = new Celd();
    Building newBuilding;
    BuildingsFrame buildingsF;

    public GameFrame() {
        c = new Castle("asd","asd","asd");
        this.buildingsF = new BuildingsFrame(this);
        initComponents();
        addButtons();
        defenseButton.setIcon(new ImageIcon("src/Buildings_IMG/Defense_btn.png"));
        defenseButton.setOpaque(false);
        defenseButton.setContentAreaFilled(false);
        defenseButton.setBorderPainted(false);
        addLanes();
        this.pack();
    }
    
    private void addButtons()
    {
        defenseButton = new javax.swing.JButton();
        defenseButton.setText("jButton1");
        defenseButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defenseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(defenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(defenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

    }
    
          
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
 regenerated buildingsFy the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConfiguracion = new javax.swing.JPanel();
        pnlOpciones = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPartidas = new javax.swing.JList();
        pnlOperacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Woi");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Partidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        pnlOpciones.setMinimumSize(new java.awt.Dimension(200, 150));
        pnlOpciones.setPreferredSize(new java.awt.Dimension(300, 275));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(100, 75));
        btnSalir.setMinimumSize(new java.awt.Dimension(100, 75));
        btnSalir.setPreferredSize(new java.awt.Dimension(150, 75));

        lstPartidas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            @Override
            public int getSize() { return strings.length; }
            @Override
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPartidas);

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        javax.swing.GroupLayout pnlOperacionLayout = new javax.swing.GroupLayout(pnlOperacion);
        pnlOperacion.setLayout(pnlOperacionLayout);
        pnlOperacionLayout.setHorizontalGroup(
            pnlOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1054, Short.MAX_VALUE)
        );
        pnlOperacionLayout.setVerticalGroup(
            pnlOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlConfiguracionLayout = new javax.swing.GroupLayout(pnlConfiguracion);
        pnlConfiguracion.setLayout(pnlConfiguracionLayout);
        pnlConfiguracionLayout.setHorizontalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConfiguracionLayout.setVerticalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addComponent(pnlOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstPartidas;
    private javax.swing.JPanel pnlConfiguracion;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlOperacion;
    private javax.swing.JButton defenseButton;
    // End of variables declaration//GEN-END:variables

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   

    private void defenseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.buildingsF.setVisible(true);
    }  
    
    private void addLanes()
    {
        for(int i=0;i<c.getSizeY();i++)
            for(int j=0;j<c.getSizeX();j++)
            {
                c.getCelds()[i][j]= new Celd(ground.getImage());
                c.getCelds()[i][j].panel.setLocation(48*j, 48*i);
                c.getCelds()[i][j].panel.setSize(48, 48);
                c.getCelds()[i][j].panel.setVisible(true);
                c.getCelds()[i][j].panel.setName(String.valueOf(i));
                this.getContentPane().add(c.getCelds()[i][j].panel);
                this.pack();
                final int a = i;
                final int b = j;
                c.getCelds()[i][j].panel.addMouseListener(new java.awt.event.MouseAdapter()
                {
                @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        select(c.getCelds()[a][b]);
                    }
                });    
            }
    }
    private void select(Celd c) {
        if (newBuilding != null)
        {
            addNewBuilding(c);
            c = lastselect;
        }
        lastselect.panel.select = false;
        lastselect.panel.img = ground.getImage();
        lastselect.panel.repaint();
        lastselect = new Celd();
        if (c != lastselect)
        {
            c.panel.select = !c.panel.select;
            c.panel.img = (c.panel.select) ? ground_select.getImage() : ground.getImage();
            c.panel.repaint();
            lastselect = c;
            
        }
            
    }

    private void addNewBuilding(Celd c) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}