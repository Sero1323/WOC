/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphic_woc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import woc.Building;
import woc.Castle;
import woc.Celd;
import static javax.swing.JOptionPane.showMessageDialog;
import woc.ArmyCamp;
import woc.ArrowTower;
import woc.Bomb;
import woc.Canon;
import woc.Soldier;
import woc.TownHall;
import woc.Wall;
/**
 *
 * @author Sergio
 */
public class InGameFrame extends javax.swing.JFrame  {
    Castle castle = new Castle("asd","asd","asd",this);
    ImageIcon ground = new ImageIcon("src/Buildings_IMG/ground.jpg");
    ImageIcon ground_select = new ImageIcon("src/Buildings_IMG/ground_select.jpg");
    Celd lastselect = new Celd();
    Building newBuilding;
    BuildingsFrame b;
    SoldiersFrame s;
    Building newBuildingtmp;
    
    public InGameFrame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                jLabel1.setText("Oro: "+castle.getGold());
                jLabel2.setText("Nivel: "+(int)Math.sqrt(castle.getExp()));
            }
        });
        
        castle = new Castle("asd","asd","asd",this);
        this.b = new BuildingsFrame(this);
        this.s = new SoldiersFrame();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 750));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                test(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
                moved(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Oro");

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nivel");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void test(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_test
    }//GEN-LAST:event_test

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.b.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    }//GEN-LAST:event_formMouseMoved

    private void moved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moved
        // TODO add your handling code here:
    }//GEN-LAST:event_moved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        InGameFrame n = new InGameFrame();
        
        castle.enemy = n.castle;
        n.castle.enemy = castle;
        
        n.jButton1.setVisible(false);
        n.jButton2.setVisible(false);
        n.setVisible(true);
        n.newBuilding = new TownHall("TownHall", 0, 0, 0,  5000, 5000, 1, n.castle);
        n.addNewBuilding(castle.getCelds()[((int)(Math.random() * 13))][((int)(Math.random() * 24))]);
        int d =Castle.dungeonlevel;
        while(d>0)
        {
            n.newBuilding = new Canon(10, 20, 1000, true, false, "Canon", 0, 0, 0, 1000, 1000, 1, n.castle);
            n.addNewBuilding(n.castle.getCelds()[((int)(Math.random() * 13))][((int)(Math.random() * 24))]);
            
            n.newBuilding =  new Bomb("Bomb", 0, 0, 0, 1, 1, 1000, 1000, 0, n.castle, 500);
            n.addNewBuilding(n.castle.getCelds()[((int)(Math.random() * 13))][((int)(Math.random() * 24))]);

            n.newBuilding =  new Bomb("Bomb", 0, 0, 0, 1, 1, 1000, 1000, 0, n.castle, 500);
            n.addNewBuilding(n.castle.getCelds()[((int)(Math.random() * 13))][((int)(Math.random() * 24))]);
            
            n.newBuilding =  new ArrowTower(10, 20, 1000, true, false, "ArrowTower", 0, 0, 0, 1000, 1000, 1, n.castle);
            n.addNewBuilding(n.castle.getCelds()[((int)(Math.random() * 13))][((int)(Math.random() * 24))]);
            int i = 10;
            while(i>0)
            {
                n.newBuilding =  new Wall("Wall", 0, 0, 0,  5000, 5000, 1, n.castle);
                n.addNewBuilding(n.castle.getCelds()[((int)(Math.random() * 13))][((int)(Math.random() * 24))]);
                i--;
            }

            n.newBuilding = new ArmyCamp("ArmyCamp", 0, 0, 0, 2, 2, 1000, 1000, 1, n.castle,15);
            ArmyCamp a= (ArmyCamp)n.addNewBuilding(n.castle.getCelds()[((int)(Math.random() * 13))][((int)(Math.random() * 24))]);

            i = 15;
            while(i>0)
            {
                System.out.println(a.addSoldier(1));

                i--;
            }

            d--;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new InGameFrame().setVisible(true);
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
    private void select(Celd c)
    {
        if(c.fill == null)
        {
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
        } else
            selectBuilding(c.fill);  
    }

    private Building addNewBuilding(Celd c)
    {
        try
        {
            newBuildingtmp = newBuilding;
            newBuilding = null;
            newBuildingtmp.panel.setLocation(48*c.x, 48*c.y);
            if(newBuildingtmp.getSizeX()== 2)
            {
                if(castle.getCelds()[c.y][c.x].fill == null && castle.getCelds()[c.y][c.x+1].fill == null && castle.getCelds()[c.y+1][c.x].fill == null && castle.getCelds()[c.y+1][c.x+1].fill == null)
                {
                    newBuildingtmp.c=castle.getCelds()[c.y+1][c.x+1];
                    newBuildingtmp.panel.setSize(96, 96);
                    newBuildingtmp.panel.setVisible(true);
                    newBuildingtmp.panel.setRequestFocusEnabled(true);
                    this.getContentPane().add(newBuildingtmp.panel, 0);
                    newBuildingtmp.panel.repaint();
                    castle.getCelds()[c.y][c.x].fill = newBuildingtmp;
                    castle.getCelds()[c.y][c.x+1].fill = newBuildingtmp;
                    castle.getCelds()[c.y+1][c.x].fill = newBuildingtmp;
                    castle.getCelds()[c.y+1][c.x+1].fill = newBuildingtmp;
                    this.pack();
                }
            } else
                if(newBuildingtmp.getSizeX()== 1 && castle.getCelds()[c.y][c.x].fill == null)
                {
                    newBuildingtmp.c=c;
                    newBuildingtmp.panel.setSize(48, 48);
                    newBuildingtmp.panel.setVisible(true);
                    newBuildingtmp.panel.setRequestFocusEnabled(true);
                    this.getContentPane().add(newBuildingtmp.panel, 0);
                    newBuildingtmp.panel.repaint();
                    castle.getCelds()[c.y][c.x].fill = newBuildingtmp;
                    this.pack();
                }
            
        } catch (ArrayIndexOutOfBoundsException e)
        {
            showMessageDialog(this, "No puedes ubicar esta estructura aqui", "Warning",0);
        }
        return newBuildingtmp;
    }
    private void selectBuilding(Building buttonBuilding)
    {
        if(!"ArmyCamp".equals(buttonBuilding.getName()))
        {
            showMessageDialog(this, "HP: "+buttonBuilding.getMaxHP()+"\nHP: "+buttonBuilding.getMaxHP(), buttonBuilding.getName()+" Info",1);
        } else
        {
            ArmyCamp a = (ArmyCamp)buttonBuilding;
            s.loadComponents(a);
        }
    }
}
