/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;

import graphic_woc.InGameFrame;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Castle implements java.io.Serializable{
    public InGameFrame frame;
    private final String user;
    private final String password;
    private final String name;
    private static int id = 0;
    private final int sizeX;
    private final int sizeY;
    private int exp;
    private int gold;
    private Celd[][] celds;
    private ArrayList <Building> buildings;
    public Castle enemy;
    ArmyCamp a;
    public static int dungeonlevel = 1;


    public Castle(String user, String password, String name,InGameFrame frame) {
        this.user = user;
        this.password = password;
        this.name = name;
        id = id++;
        this.sizeX = 28;
        this.sizeY = 15;
        this.exp = 10;
        this.gold = 10000;
        celds = new Celd[sizeY][sizeX];
        this.buildings = new ArrayList <>();
        this.frame = frame;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public int getExp() {
        return exp;
    }

    public int getGold() {
        return gold;
    }

    public Castle getEnemy() {
        return enemy;
    }

    public Celd[][] getCelds() {
        return celds;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    
    public void setEnemy(Castle enemy) {
        this.enemy = enemy;
    }
    
    public void increaseExp(int nExp)
    {
        this.exp += nExp;
    }
    
    public void increaseGold(int nGold)
    {
        this.gold += nGold;
    }
}
