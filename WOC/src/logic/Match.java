/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import data.GameFile;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Match extends AbstractManager {

    private static Match manager;
    
    private Match() {
        super("Partida");
    }
    
    @Override
    public void insert(String vals) {
        if (!db.insert("nombre, idUsuario_fk", vals)) {
            JOptionPane.showMessageDialog(null, "Problema al agregar");
        } else {
            GameFile.addMatchFile(vals.split(",")[0]);
        }
    }

    @Override
    public void edit(String values) {
        if (!db.edit(values)) {
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
        ArrayList<String> files = new ArrayList<String>();
        ResultSet data = db.find("nombre", "WHERE idUsuario_fk = " + id);
        try {
            while (data.next()) {
                files.add(data.getString("nombre"));
            }
        } catch (Exception e) {
        }
        return files;
    }
    
    public static Match getManager() {
        if (manager == null) {
            manager = new Match();
        }
        return manager;
    }
    
}
