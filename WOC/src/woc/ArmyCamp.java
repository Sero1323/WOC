/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;

import graphic_woc.ImagePane;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Sergio
 */
public class ArmyCamp extends Building{
    private int warriorsNumb;
    private int maxWarriors;
    private ArrayList <Soldier> soldiers;
    public ImagePane panel;

    public ArmyCamp(String name, int id, int posX, int posY, int sizeX, int sizeY, int currentHP, int maxHP, int level, Castle house) {
        super(name, id, posX, posY, 2, 2, currentHP, maxHP, level, house);
        this.panel = new ImagePane(new ImageIcon("src/Buildings_IMG/ArmyCamp.png").getImage());
        
    }

    public ArmyCamp() {
    }


    public void decWarriorsNumb(int warriorsNumb) {
        this.warriorsNumb -= warriorsNumb;
    }

    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }
    

    
    public boolean addSoldier(int type)
    {
        Soldier s;
        switch (type)
        {
            case 0:
                s = new Soldier("Warrior", soldiers.size(), 100, 100, 1, 25, 100, 100,1,true,this,this.house);
                break;
            default:
                s = new Soldier("Warrior", soldiers.size(), 100, 100, 1, 25, 100, 100,1,true,this,this.house);
                break;
        }
        if (warriorsNumb + s.getSize() <= maxWarriors)
        {
            warriorsNumb += s.getSize();
            soldiers.add(s);
        }
        else
            return false;
        
        return true;
        
    }
}
