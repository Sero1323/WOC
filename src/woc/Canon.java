/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;

import graphic_woc.ImagePane;
import static java.lang.Math.abs;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;

/**
 *
 * @author Sergio
 */
public class Canon extends Building{
    private int range;
    private int attackDamage;
    private int attackSpeed;// Inverse 1000 is slower than 1
    private boolean terrestrial;
    private boolean anytarget;

    public Canon(int range, int attackDamage, int attackSpeed, boolean terrestrial, boolean anytarget, String name, int id, int posX, int posY, int currentHP, int maxHP, int level, Castle house) {
        super(name, id, posX, posY, 2, 2, currentHP, maxHP, level, house);
        this.range = range;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.terrestrial = terrestrial;
        this.anytarget = anytarget;
        this.panel = new ImagePane(new ImageIcon("src/Buildings_IMG/Canon.png").getImage());
        
    }

    public Canon() {
    }


    
    
        public Defense findTarget()
    {   
        Defense target = null;
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < house.getEnemy().getSizeX(); i++)
            for (int j = 0; j < house.getEnemy().getSizeY(); j++)
                if(!house.getEnemy().getCelds()[i][j].content.isEmpty() && abs(i-this.posX)+abs(j-this.posY) < dist && (this.terrestrial == target.isTerrestrial() || anytarget))
                    {
                        dist = abs(i-this.posX)+abs(j-this.posY);
                        target = house.getEnemy().getCelds()[i][j].content.get(0);
                    }
        if (dist > range)
            target = null;
        return target;
     }
    
    public void attack()
    {
        Defense target = findTarget();
        try {
                
            while (target != null && target.getHP() > 0)
            {
                if(target.reduceHP(attackDamage))
                {
                    house.getEnemy().getCelds()[target.getPosX()][target.getPosY()].content.remove(target);
                    target.delete();
                }
                sleep(attackSpeed);
            }
            
        } catch (InterruptedException | NullPointerException ex) {      
        }
    }

    
}