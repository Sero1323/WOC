/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;

/**
 *
 * @author Sergio
 */
public class Building implements Defense{
    private String name;
    private int id;
    int posX;
    int posY;
    private int sizeX;
    private int sizeY;
    private int currentHP;
    private int maxHP;
    private int level;
    Castle house;

    public Building() {
        
    }

    public Building(String name, int id, int posX, int posY, int sizeX, int sizeY, int currentHP, int maxHP, int level, Castle house) {
        this.name = name;
        this.id = id;
        this.posX = posX;
        this.posY = posY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.currentHP = currentHP;
        this.maxHP = maxHP;
        this.level = level;
        this.house = house;
        this.house.getBuildings().add(this);
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }



    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getMaxHP() {
        return maxHP;
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
        this.house.getBuildings().remove(this);
        
    }

    @Override
    public boolean isTerrestrial() {//Who cares?
        return true;
    }
    
}