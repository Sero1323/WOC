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
public class ArrowTower extends Canon{

    public ArrowTower(int range, int attackDamage, int attackSpeed, boolean terrestrial, boolean anytarget, String name, int id, int posX, int posY, int currentHP, int maxHP, int level, Castle house) {
        super(range, attackDamage, attackSpeed, terrestrial, anytarget, name, id, posX, posY, currentHP, maxHP, level, house);
    }

    public ArrowTower() {
    }
    
    
}
