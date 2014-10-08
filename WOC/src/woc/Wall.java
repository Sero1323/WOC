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
public class Wall extends Building{
    public ImagePane panel;

    public Wall(String name, int id, int posX, int posY, int currentHP, int maxHP, int level, Castle house) {
        super(name, id, posX, posY, 1, 1, currentHP, maxHP, level, house);
        this.panel = new ImagePane(new ImageIcon("src/Buildings_IMG/Wall.png").getImage());
    }

    public Wall() {
    }
    
}
