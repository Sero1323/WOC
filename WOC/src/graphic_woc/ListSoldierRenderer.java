/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphic_woc;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JList;
import woc.Soldier;

/**
 *
 * @author Felipe
 */
public class ListSoldierRenderer extends javax.swing.JLabel implements javax.swing.ListCellRenderer<Soldier> {

    private final Color click = new Color(0, 0, 128);
    
    public ListSoldierRenderer() {
        setIconTextGap(15);
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Soldier> list, Soldier value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.toString());
        setIcon(new ImageIcon(value.getFrames()[0]));
        if (isSelected) {
            setBackground(Color.red);
        }
        return this;
    }
    
}
