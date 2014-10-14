/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import graphic_woc.GameFrame;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import woc.Soldier;

/**
 *
 * @author Felipe
 */
public class GameFile {
    
    public static ArrayList<GameFrame> loadMatches(ArrayList<String> files) {
        InputStream data = null;
        BufferedInputStream buffer = null;
        ObjectInput stream = null;
        ArrayList<GameFrame> plays = new ArrayList<GameFrame>();
        int length = files.size();
        for (int i = 0; i < length; i++) {
            try {
                data = new FileInputStream(files.get(i));
                buffer = new BufferedInputStream(data);
                stream = new ObjectInputStream(buffer);
                plays.add((GameFrame) stream.readObject());
                data.close();
                buffer.close();
                stream.close();
            } catch (Exception ex) {
            }
        }
        return plays;
    }
    
    public static boolean addMatchFile(String match) {
        File location = new File("juegos");
        if (!location.exists()) {
            location.mkdir();
        }
        boolean success = false;
        location = new File("juegos/" + match);
        try {
            success = location.createNewFile();
        } catch (Exception e) {
        }
        return success;
    }
    
    public static ArrayList<Soldier> loadGame(String folder) {
        InputStream data = null;
        BufferedInputStream buffer = null;
        ObjectInput stream = null;
        File location = new File("soldados");
        if (!location.exists()) {
            location.mkdir();
        }
        ArrayList<Soldier> attack = new ArrayList<Soldier>();
        String[] team = location.list();
        if (team != null) {
            try {
                for (int i = 0; i < team.length; i++) {
                    data = new FileInputStream(team[i]);
                    buffer = new BufferedInputStream(data);
                    stream = new ObjectInputStream(buffer);
                    attack.add((Soldier) stream.readObject());
                }
                stream.close();
                buffer.close();
                data.close();
            } catch (Exception e) {
            }
        }
        return attack;
    }
    
}
