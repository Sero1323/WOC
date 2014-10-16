/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;

import java.awt.image.BufferedImage;
import static java.lang.Math.abs;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Sergio
 */
public class Soldier{
    private String name;
    private int id;
    private int posX;
    private int posY;
    private int currentHP;
    private int maxHP;
    private int size;
    private int attackDamage;
    private int attackSpeed;// Inverse 1000 is slower than 1
    private int level;
    private int movementSpeed;
    private boolean terrestrial;
    private BufferedImage[] frames;
    private ArmyCamp camp;
    public Castle house;
    private Celd position;
    JLabel label;
    
    public Soldier(String name, int id, int currentHP, int maxHP, int size, int attackDamage, int attckSpeed, int movementSpeed, int level, boolean terrestrial, ArmyCamp camp, Castle house,Icon icon) {
        this.name = name;
        this.id = id;
        this.currentHP = currentHP;
        this.maxHP = maxHP;
        this.size = size;
        this.attackDamage = attackDamage*level/2;
        this.attackSpeed = attckSpeed/level*2;
        this.movementSpeed = movementSpeed;
        this.level = level;
        this.terrestrial = terrestrial;
        this.camp = camp;
        this.label = new JLabel(icon);
    }

    public int getSize() {
        return size;
    }

    public int getLevel() {
        return level;
    }
    
    public Defense findTarget()
    {   
        
        Defense target = null;
        Celd c = null;
        int dist = Integer.MAX_VALUE;
        try{
        for (int i = 0; i < house.getEnemy().getSizeX(); i++)
            for (int j = 0; j < house.getEnemy().getSizeY(); j++)
                if(!house.getEnemy().getCelds()[i][j].content.isEmpty() && abs(i-this.posX)+abs(j-this.posY) < dist)
                    {
                        dist = abs(i-this.label.getX()/48)+abs(j-this.label.getY()/48);
                        target = house.getEnemy().getCelds()[i][j].content.get(0);
                        c=house.getEnemy().getCelds()[i][j];
                    }
        if(target != null && c!= null)
            move(target,c);
        }catch(NullPointerException e){}
        return target;
     }
    private void move(Defense target,Celd c)
    {
        if ((c.x == this.label.getX()/48)&&(c.y == this.label.getY()/48))
            return;
        if(c.x > this.label.getX()/48)
            this.label.setAlignmentX(this.label.getX()+1);
        else
            this.label.setAlignmentX(this.label.getX()-1);
        if(c.y > this.label.getY()/48)
            this.label.setAlignmentY(this.label.getY()+1);
        else
            this.label.setAlignmentY(this.label.getY()-1);
        try
        {
        sleep(movementSpeed);
        } catch (InterruptedException e) {      
        }
        this.findTarget();
    }
    public boolean attack()
    {
        Defense target = findTarget();
        if (target == null)
            return false;
        try
        {
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
        return true;
    }

    public boolean reduceHP(int ammount) {
        currentHP -= ammount;
        return currentHP <= 0;
    }

    public int getHP() {
        return currentHP;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void delete() {
        this.camp.decWarriorsNumb(this.size);
        this.camp.getSoldiers().remove(this);
    }

    public boolean isTerrestrial() {
        return this.terrestrial;
    }

    public BufferedImage[] getFrames() {
        return frames;
    }

    public void setFrames(BufferedImage[] frames) {
        this.frames = frames;
    }
    
    @Override
    public String toString()
    {
        return "Soldier{" + "name=" + name + ", id=" + id + ", posX=" + posX + ", posY=" + posY + ", currentHP=" + currentHP + ", maxHP=" + maxHP + ", size=" + size + ", attackDamage=" + attackDamage + ", attackSpeed=" + attackSpeed + ", level=" + level + ", movementSpeed=" + movementSpeed + ", terrestrial=" + terrestrial + ", camp=" + camp + ", house=" + house + ", position=" + position + '}';
    }

        public void run() {
        while(true)
        {
            attack();
            try {
                sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
