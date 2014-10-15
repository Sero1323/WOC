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

    public ArmyCamp(String name, int id, int posX, int posY, int sizeX, int sizeY, int currentHP, int maxHP, int level, Castle house,int maxWarriors) {
        super(name, id, posX, posY, 2, 2, currentHP, maxHP, level, house);
        this.panel = new ImagePane(new ImageIcon("src/Buildings_IMG/ArmyCamp.png").getImage());
        soldiers = new ArrayList <>();
        this.maxWarriors= maxWarriors;
        
    }

        

    public ArmyCamp() {
    }


    public void decWarriorsNumb(int warriorsNumb) {
        this.warriorsNumb -= warriorsNumb;
    }

    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }

    public int getMaxWarriors() {
        return maxWarriors;
    }
    

    
    public boolean addSoldier(int type)
    {
        Soldier s;
        switch (type)
        {
            case 0:
                s = new Soldier("Soldier", soldiers.size(), 100, 100, 1, 25, 100, 100,1,true,this,this.house,new ImageIcon("src/Buildings_IMG/Soldier_ShortRange_Mini.gif"));
                break;
            default:
                s = new Soldier("Warrior", soldiers.size(), 100, 100, 1, 25, 100, 100,1,true,this,this.house,new ImageIcon("src/Buildings_IMG/Soldier_ShortRange_Mini.gif"));
                break;
        }
        if (warriorsNumb + s.getSize() <= maxWarriors)
        {
            warriorsNumb += s.getSize();
            soldiers.add(s);
        }
        else
            return false;
        s.label.setLocation((int) (48*c.x -48+ (Math.random() * 72)), (int) (48*c.y+ (Math.random() * 24)));
        s.label.setSize(27, 25);
        s.label.setVisible(true);
        s.label.setRequestFocusEnabled(true);
        this.house.frame.getContentPane().add(s.label,0);
        s.label.repaint();
        return true;
        
    }
}
