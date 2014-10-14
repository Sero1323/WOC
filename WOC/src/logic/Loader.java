/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import data.GameFile;
import java.util.ArrayList;
import woc.Soldier;

/**
 *
 * @author Felipe
 */
public class Loader {
    
    public static ArrayList<Soldier> loadSoldiers() {
        return GameFile.loadGame("soldados");
    }
    
}
