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
public interface Defense {
    public boolean reduceHP(int ammount);
    public int getHP();
    public int getPosX();
    public int getPosY();
    public void delete();
    public boolean isTerrestrial();
    
}
