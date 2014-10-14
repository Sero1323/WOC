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
public class Bomb extends Building{
    private int damage;
    

    public Bomb(String name, int id, int posX, int posY, int sizeX, int sizeY, int currentHP, int maxHP, int level, Castle house, int damage) {
        super(name, id, posX, posY, 1, 1, currentHP, maxHP, level, house);
        this.damage = damage;
        this.panel = new ImagePane(new ImageIcon("src/Buildings_IMG/Bomb.png").getImage());
    }

    public Bomb() {
    }
}
