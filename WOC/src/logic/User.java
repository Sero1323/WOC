/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import usuario.UserInfo;

/**
 *
 * @author Felipe
 */
public class User extends AbstractManager {

    private static User manager;
    
    private User() {
        super("Usuario");
    }

    @Override
    public void insert(String vals) {
        if (!db.insert("nombre, contrasena, tipo", vals)) {
            JOptionPane.showMessageDialog(null, "Problema al agregar");
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
    
    public UserInfo login(String user, String password) {
        UserInfo userData = null;
        ResultSet data = db.find("idUsuario, nombre, contrasena, tipo", "");
        try {
            while (data.next()) {
                if (user.equals(data.getString("nombre")) && password.equals(data.getString("contrasena"))) {
                    int idUsuario = data.getInt("idUsuario");
                    String tipo = data.getString("tipo");
                    userData = new UserInfo(idUsuario, user, tipo);
                    break;
                }
            }
        } catch (Exception e) {
        }
        return userData;
    }
    
    public static User getManager() {
        if (manager == null) {
            manager = new User();
        }
        return manager;
    }
    
}
