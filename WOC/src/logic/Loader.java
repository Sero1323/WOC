/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import woc.Building;
import woc.Soldier;

/**
 *
 * @author Felipe
 */
public class Loader {
    
    private ArrayList<Soldier> soldiers;
    private ArrayList<Building> buildings;
    private BufferedImage[] elements;
    private static Loader manager;
    
    private Loader() {
        loadSoldiers();
        loadBuildings();
    }
    
    public File addFile(String name, String direction) {
        File data = new File(direction + "/" + name);
        try {
            data.createNewFile();
        } catch (Exception e) {
        }
        return data;
    }
    
    private void loadSoldiers() {
        InputStream data = null;
        BufferedInputStream buffer = null;
        ObjectInput stream = null;
        File location = new File("soldados");
        File information = null;
        if (!location.exists()) {
            location.mkdir();
            information = addFile("datos.txt", "soldados");
        }
        try {
            data = new FileInputStream(information);
            buffer = new BufferedInputStream(data);
            stream = new ObjectInputStream(buffer);
            soldiers = (ArrayList<Soldier>) stream.readObject();
        } catch (Exception e) {
        }
    }
    
    private void loadBuildings() {
        InputStream data = null;
        BufferedInputStream buffer = null;
        ObjectInput stream = null;
        File location = new File("estructuras");
        File information = null;
        if (!location.exists()) {
            location.mkdir();
            information = addFile("datos.txt", "estructuras");
        }
        try {
            data = new FileInputStream(information);
            buffer = new BufferedInputStream(data);
            stream = new ObjectInputStream(buffer);
            buildings = (ArrayList<Building>) stream.readObject();
        } catch (Exception e) {
        }
    }
    
    public BufferedImage loadImage(File data, int width, int height) {
        BufferedImage buffer = null;
        try {
            buffer = ImageIO.read(data);
            if (buffer.getWidth() > width && buffer.getHeight() > height) {
                return null;
            }
        } catch (Exception e) {
        }
        return buffer;
    }
    
    public boolean loadImages(File[] data, int width, int height) {
        int size = data.length;
        elements = new BufferedImage[size];
        try {
            BufferedImage buffer = null;
            for (int i = 0; i < size; i++) {
                buffer = ImageIO.read(data[i]);
                if (buffer.getWidth() <= width && buffer.getHeight() <= height) {
                    elements[i] = buffer;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
        }
        return true;
    }

    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(ArrayList<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public BufferedImage[] getElements() {
        return elements;
    }

    public void setElements(BufferedImage[] elements) {
        this.elements = elements;
    }
    
    public static Loader getManager() {
        if (manager == null) {
            manager = new Loader();
        }
        return manager;
    }
    
}
