/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphic_woc;

import javax.swing.ImageIcon;
import woc.ArmyCamp;
import woc.Bomb;
import woc.Building;
import woc.Canon;
import woc.TownHall;
import woc.Wall;

/**
 *
 * @author Sergio
 */
public class BuildingsFrame extends javax.swing.JFrame {
    private final GameFrame g;

    /**
     * Creates new form NewJFrame
     * @param g
     */

    public BuildingsFrame(GameFrame g) {
        this.setVisible(false);
        this.setTitle("Buildings");
        initComponents();
        ArmyCamp_BTN.setIcon(new ImageIcon("src/Buildings_IMG/ArmyCamp.png"));
        ArrorTower_BTN.setIcon(new ImageIcon("src/Buildings_IMG/ArrowTower.png"));
        Canon_BTN.setIcon(new ImageIcon("src/Buildings_IMG/Canon.png"));
        Wall_BTN.setIcon(new ImageIcon("src/Buildings_IMG/Wall.png"));
        TownHall_BTN.setIcon(new ImageIcon("src/Buildings_IMG/TownHall.png"));
        Bomb_BTN.setIcon(new ImageIcon("src/Buildings_IMG/Bomb.png"));
        this.g = g;
    }

    BuildingsFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
 regenerated buildingsFy the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        ArmyCamp_BTN = new javax.swing.JButton();
        Canon_BTN = new javax.swing.JButton();
        ArrorTower_BTN = new javax.swing.JButton();
        Wall_BTN = new javax.swing.JButton();
        TownHall_BTN = new javax.swing.JButton();
        Bomb_BTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jToggleButton5.setText("jToggleButton1");

        jToggleButton6.setText("jToggleButton1");

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        ArmyCamp_BTN.setText("0");
        ArmyCamp_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmyCamp_BTNActionPerformed(evt);
            }
        });

        Canon_BTN.setText("0");
        Canon_BTN.setActionCommand("jButton2");
        Canon_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Canon_BTNActionPerformed(evt);
            }
        });

        ArrorTower_BTN.setText("0");
        ArrorTower_BTN.setActionCommand("jButton3");

        Wall_BTN.setText("0");
        Wall_BTN.setActionCommand("jButton5");

        TownHall_BTN.setText("0");
        TownHall_BTN.setActionCommand("jButton6");
        TownHall_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TownHall_BTNActionPerformed(evt);
            }
        });

        Bomb_BTN.setText("0");
        Bomb_BTN.setActionCommand("jButton4");
        Bomb_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bomb_BTNActionPerformed(evt);
            }
        });

        jLabel1.setText("0");

        jLabel2.setText("0");

        jLabel3.setText("0");

        jLabel4.setText("0");

        jLabel5.setText("0");

        jLabel6.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ArmyCamp_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Canon_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ArrorTower_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bomb_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Wall_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TownHall_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArmyCamp_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Canon_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArrorTower_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Wall_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TownHall_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bomb_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        jLabel1.setText((int)Math.sqrt(g.c.getExp()/2+1)  - builingCounter(new ArmyCamp().getClass()) + "");
        jLabel2.setText((int)Math.sqrt(g.c.getExp()/2+1)  - builingCounter(new Canon().getClass()) + "");
        jLabel3.setText((int)Math.sqrt(g.c.getExp()/2+1)  - builingCounter(new Canon().getClass()) + "");
        jLabel4.setText((int)Math.sqrt(g.c.getExp()/2+1)  - builingCounter(new Bomb().getClass()) + "");
        jLabel5.setText((int)Math.sqrt(g.c.getExp()+1)*10  - builingCounter(new Wall().getClass()) + "");
        jLabel6.setText((builingCounter(new TownHall().getClass())==1 ? 0:1)+"");
    }//GEN-LAST:event_formMouseMoved

    private void ArmyCamp_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmyCamp_BTNActionPerformed
        if (Integer.parseInt(jLabel1.getText()) > 0)
        {
            this.setVisible(false);
            
        }
        
    }//GEN-LAST:event_ArmyCamp_BTNActionPerformed

    private void Canon_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Canon_BTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Canon_BTNActionPerformed

    private void Bomb_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bomb_BTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bomb_BTNActionPerformed

    private void TownHall_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TownHall_BTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TownHall_BTNActionPerformed

    public int builingCounter(Class c)
    {
        int count= 0;
        if (g.c.getBuildings()!= null)
            for (Building temp : g.c.getBuildings())
                if (temp.getClass() == c)
                    count++;
        return count;
    }
    
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
            java.util.logging.Logger.getLogger(BuildingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuildingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArmyCamp_BTN;
    private javax.swing.JButton ArrorTower_BTN;
    private javax.swing.JButton Bomb_BTN;
    private javax.swing.JButton Canon_BTN;
    private javax.swing.JButton TownHall_BTN;
    private javax.swing.JButton Wall_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    // End of variables declaration//GEN-END:variables
}
