/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import data.GameFile;
import graphic_woc.InGameFrame;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Match extends AbstractManager<InGameFrame> {

    private static Match manager;
    
    private Match() {
        super("Partida");
    }
    
    @Override
    public ArrayList<InGameFrame> find(String condition) {
        ArrayList<InGameFrame> list = new ArrayList<InGameFrame>();
        ResultSet data = db.find("idPartida, nombre, idUsuario_fk", condition);
        InputStream file = null;
        BufferedInputStream buffer = null;
        ObjectInput stream = null;
        try {
            while (data.next()) {
                file = new FileInputStream(data.getString("nombre"));
                buffer = new BufferedInputStream(file);
                stream = new ObjectInputStream(buffer);
                list.add((InGameFrame) stream.readObject());
                stream.close();
                buffer.close();
                file.close();
            }
            data.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    @Override
    public void insert(String vals) {
        if (!db.insert("nombre, idUsuario_fk", vals)) {
            JOptionPane.showMessageDialog(null, "Problema al agregar");
        } else {
            File location = new File("juegos");
            if (!location.mkdir()) {
                location.mkdir();
            }
            String game = vals.split(",")[0];
            location = new File("juegos/" + game);
            try {
                location.createNewFile();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void edit(String values, String filter) {
        if (!db.edit(values, "WHERE " + filter)) {
            JOptionPane.showMessageDialog(null, "Problema al editar");
        }
    }

    @Override
    public void remove(String condition) {
        if (!db.remove(condition)) {
            JOptionPane.showMessageDialog(null, "Problema al eliminar");
        }
    }
    
    public ArrayList<String> plays(int id) {
        ArrayList<String> fileNames = new ArrayList<String>();
        ResultSet data = db.find("nombre", "WHERE idUsuario_fk = " + id);
        try {
            while (data.next()) {
                fileNames.add(data.getString("nombre"));
            }
        } catch (Exception e) {
        }
        return fileNames;
    }
    
    public static Match getManager() {
        if (manager == null) {
            manager = new Match();
        }
        return manager;
    }
    
}
