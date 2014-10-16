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
    private Connection db;
    
    public AccessDB(String table) {
        this.table = table;
        startQuery();
    }
    
    protected void startQuery() {
        try {
            Class.forName("org.sqlite.JDBC");
            
            if (db == null) {
                db = DriverManager.getConnection("jdbc:sqlite:juegobd");
            }
        } catch (Exception e) {
        }
    }
    
    public ResultSet find(String columns, String filter) {
        Statement search = null;
        ResultSet data = null;
        try {
            search = db.createStatement();
            data = search.executeQuery("SELECT " + columns + " " +
                                       "FROM " + table);
            data.first();
            search.close();
        } catch (Exception e) {
        }
        return data;
    }
    
    public boolean insert(String columns, String values) {
        Statement insert = null;
        try {
            insert = db.createStatement();
            String query = "INSERT INTO " + table + " (" + columns + ") " + 
                           "VALUES " + " (" + values + ")";
            insert.executeUpdate("INSERT INTO " + table + " (" + columns + ") " + "VALUES " + " (" + values + ")");
            insert.close();
            return true;
        } catch (Exception e) {
            try {
                db.rollback();
            } catch (Exception ex) {
            }
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean edit(String changes, String condition) {
        Statement edit = null;
        try {
            edit = db.createStatement();
            edit.executeUpdate("UPDATE " + table + " SET " + changes + " " + condition);
            edit.close();
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
        Statement remove = null;
        try {
            remove = db.createStatement();
            remove.executeUpdate("DELETE " + table + " " + filter);
            remove.close();
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
