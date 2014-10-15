/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;

import graphic_woc.ImagePane;
import javax.swing.ImageIcon;

/**
 *
 * @author Sergio
 */
public class ArrowTower extends Canon{

    public ArrowTower(int range, int attackDamage, int attackSpeed, boolean terrestrial, boolean anytarget, String name, int id, int posX, int posY, int currentHP, int maxHP, int level, Castle house) {
        super(range, attackDamage, attackSpeed, terrestrial, anytarget, name, id, posX, posY, currentHP, maxHP, level, house);
        this.panel = new ImagePane(new ImageIcon("src/Buildings_IMG/ArrowTower.png").getImage());
    }

    public ArrowTower() {
    }
    
    
}
