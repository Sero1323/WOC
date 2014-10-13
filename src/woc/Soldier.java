/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;

import static java.lang.Math.abs;

/**
 *
 * @author Sergio
 */
public class Soldier extends Thread implements Defense{
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
    private ArmyCamp camp;
    private Castle house;
    private Celd position;
    
    public Soldier(String name, int id, int currentHP, int maxHP, int size, int attackDamage, int attckSpeed, int movementSpeed, int level, boolean terrestrial, ArmyCamp camp, Castle house) {
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
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < house.getEnemy().getSizeX(); i++)
            for (int j = 0; j < house.getEnemy().getSizeY(); j++)
                if(!house.getEnemy().getCelds()[i][j].content.isEmpty() && abs(i-this.posX)+abs(j-this.posY) < dist)
                    {
                        dist = abs(i-this.posX)+abs(j-this.posY);
                        target = house.getEnemy().getCelds()[i][j].content.get(0);
                    }
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

    @Override
    public boolean reduceHP(int ammount) {
        currentHP -= ammount;
        return currentHP <= 0;
    }

    @Override
    public int getHP() {
        return currentHP;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void delete() {
        this.camp.decWarriorsNumb(this.size);
        this.camp.getSoldiers().remove(this);
    }

    @Override
    public boolean isTerrestrial() {
        return this.terrestrial;
    }
}
