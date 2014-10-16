/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import usuario.UserInfo;

/**
 *
 * @author Felipe
 */
public class User extends AbstractManager<UserInfo> {
    
    private UserInfo data;
    private static User manager;
    
    private User() {
        super("Usuario");
    }
    
    @Override
    public ArrayList<UserInfo> find(String condition) {
        ArrayList<UserInfo> list = new ArrayList<UserInfo>();
        try (ResultSet data = db.find("idUsuario, nombre, contrasena, tipo", condition)) {
            while (data.next()) {
                UserInfo information = new UserInfo(data.getInt("idUsuario"), data.getString("nombre"), 
                                                    data.getString("contrasena"), data.getString("tipo"));
                list.add(information);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    @Override
    public void insert(String vals) {
        if (!db.insert("nombre, contrasena, tipo", vals)) {
            JOptionPane.showMessageDialog(null, "Problema al agregar");
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
    
    public UserInfo login(String user, String password) {
        UserInfo userData = null;
        try (ResultSet data = db.find("idUsuario, nombre, contrasena, tipo", "")) {
            while (data.next()) {
                if (user.equals(data.getString("nombre")) && password.equals(data.getString("contrasena"))) {
                    int idUsuario = data.getInt("idUsuario");
                    String tipo = data.getString("tipo");
                    userData = new UserInfo(idUsuario, user, password, tipo);
                    break;
                }
            }
        } catch (Exception e) {
        }
        return userData;
    }

    public UserInfo getData() {
        return data;
    }

    public void setData(UserInfo data) {
        this.data = data;
    }
    
    public static User getManager() {
        if (manager == null) {
            manager = new User();
        }
        return manager;
    }
    
}
