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
public class NewJFrame extends javax.swing.JFrame {
    Castle castle = new Castle("asd","asd","asd");
    ImageIcon ground = new ImageIcon("src/Buildings_IMG/ground.jpg");
    ImageIcon ground_select = new ImageIcon("src/Buildings_IMG/ground_select.jpg");
    Celd lastselect = new Celd();
    Building newBuilding;
    BuildingsFrame b;

    public NewJFrame() {
        castle = new Castle("asd","asd","asd");
        this.b = new BuildingsFrame(this);
        initComponents();
        jButton1.setIcon(new ImageIcon("src/Buildings_IMG/Defense_btn.png"));
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        addLanes();
        this.pack();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 768));
        setResizable(false);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.b.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

  
    /**
     * @param args the castleommand line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   

    private void addLanes()
    {
        for(int i=0;i<castle.getSizeY();i++)
            for(int j=0;j<castle.getSizeX();j++)
            {
                castle.getCelds()[i][j]= new Celd(ground.getImage(),j,i);
                castle.getCelds()[i][j].panel.setLocation(48*j, 48*i);
                castle.getCelds()[i][j].panel.setSize(48, 48);
                castle.getCelds()[i][j].panel.setVisible(true);
                castle.getCelds()[i][j].panel.setName(String.valueOf(i));
                this.getContentPane().add(castle.getCelds()[i][j].panel);
                this.pack();
                final int a = i;
                final int b = j;
                castle.getCelds()[i][j].panel.addMouseListener(new java.awt.event.MouseAdapter()
                {
                @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        select(castle.getCelds()[a][b]);
                    }
                });    
            }
    }
    private void select(Celd c) {
        if (newBuilding != null)
        {
            addNewBuilding(c);
            c = lastselect;
            return;
        }
        lastselect.panel.select = false;
        lastselect.panel.img = ground.getImage();
        lastselect.panel.repaint();
        
        if (c != lastselect)
        {
            c.panel.select = !c.panel.select;
            c.panel.img = (c.panel.select) ? ground_select.getImage() : ground.getImage();
            c.panel.repaint();
            lastselect = c;
            
        }else
            lastselect = new Celd();
            
    }

    private void addNewBuilding(Celd c) {
        if(castle.getCelds()[c.x][c.y].fill == null && castle.getCelds()[c.x+1][c.y].fill == null && castle.getCelds()[c.x][c.y+1].fill == null && castle.getCelds()[c.x+1][c.y+1].fill == null)
        {
            Building newBuildingtmp = newBuilding;
            newBuilding = null;
            newBuildingtmp.panel.setLocation(48*c.x, 48*c.y);
            if(newBuildingtmp.getSizeX()== 2)
                newBuildingtmp.panel.setSize(96, 96);
            else
                newBuildingtmp.panel.setSize(48, 48);
            
            
            newBuildingtmp.panel.setVisible(true);
            this.getContentPane().add(newBuildingtmp.panel);
            
            newBuildingtmp.panel.repaint();
            this.pack();
        }
    }
}
