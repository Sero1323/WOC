/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Felipe
 */
public class AccessDB {
    
    private String table;
    
    public AccessDB(String table) {
        this.table = table;
    }
    
    protected Connection startQuery() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            
            con = DriverManager.getConnection("jdbc:sqlite:juegobd");
        } catch (Exception e) {
        }
        return con;
    }
    
    public ResultSet find(String columns, String filter) {
        Connection db = startQuery();
        Statement search = null;
        ResultSet data = null;
        try {
            search = db.createStatement();
            data = search.executeQuery("SELECT " + columns + " " +
                                       "FROM " + table);
            data.first();
            search.close();
            db.close();
        } catch (Exception e) {
        }
        return data;
    }
    
    public boolean insert(String columns, String values) {
        Connection db = startQuery();
        Statement insert = null;
        try {
            insert = db.createStatement();
            insert.executeUpdate("INSERT INTO " + table + " (" + columns + ") " + "VALUES " + " (" + values + ")");
            insert.close();
            db.close();
            return true;
        } catch (Exception e) {
            try {
                db.rollback();
            } catch (Exception ex) {
            }
        }
        return false;
    }
    
    public boolean edit(String changes, String condition) {
        Connection db = startQuery();
        Statement edit = null;
        try {
            edit = db.createStatement();
            edit.executeUpdate("UPDATE " + table + " SET " + changes + " " + condition);
            edit.close();
            db.close();
            return true;
        } catch (Exception e) {
            try {
                db.rollback();
            } catch (Exception ex) {
            }
        }
        return false;
    }
    
    public boolean remove(String filter) {
        Connection db = startQuery();
        Statement remove = null;
        try {
            remove = db.createStatement();
            remove.executeUpdate("DELETE " + table + " " + filter);
            remove.close();
            db.close();
            return true;
        } catch (Exception e) {
            try {
                db.rollback();
            } catch (Exception ex) {
            }
        }
        return false;
    }
    
}
