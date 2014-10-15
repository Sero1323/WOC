/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
    
    public void addFile(File data) {
        try {
            data.createNewFile();
        } catch (Exception e) {
        }
    }
    
    private void loadSoldiers() {
        InputStream data = null;
        BufferedInputStream buffer = null;
        ObjectInput stream = null;
        File location = new File("soldados/datos.txt");
        if (!location.exists()) {
            addFile(location);
        } else {
            try {
                data = new FileInputStream(location);
                buffer = new BufferedInputStream(data);
                stream = new ObjectInputStream(buffer);
                soldiers = (ArrayList<Soldier>) stream.readObject();
            } catch (Exception e) {
            }
        }
        if (soldiers == null ){
            soldiers = new ArrayList<Soldier>();
        }
    }
    
    private void loadBuildings() {
        InputStream data = null;
        BufferedInputStream buffer = null;
        ObjectInput stream = null;
        File location = new File("estructuras/datos.txt");
        if (!location.exists()) {
            addFile(location);
        } else {
            try {
                data = new FileInputStream(location);
                buffer = new BufferedInputStream(data);
                stream = new ObjectInputStream(buffer);
                buildings = (ArrayList<Building>) stream.readObject();
            } catch (Exception e) {
            }
        }
        if (buildings == null) {
            buildings = new ArrayList<Building>();
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
    
    public void saveSoldiers() {
        OutputStream file = null;
        BufferedOutputStream buffer = null;
        ObjectOutput stream = null;
        File location = new File("soldados/datos.txt");
        try {
            file = new FileOutputStream(location);
            buffer = new BufferedOutputStream(file);
            stream = new ObjectOutputStream(buffer);
            stream.writeObject(soldiers);
        } catch (Exception e) {
        }
    }
    
    public void saveBuildings() {
        OutputStream file = null;
        BufferedOutputStream buffer = null;
        ObjectOutput stream = null;
        File location = new File("estructuras/datos.txt");
        try {
            file = new FileOutputStream(location);
            buffer = new BufferedOutputStream(file);
            stream = new ObjectOutputStream(buffer);
            stream.writeObject(buildings);
        } catch (Exception e) {
        }
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
