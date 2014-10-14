/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import data.AccessDB;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public abstract class AbstractManager {
    
    protected AccessDB db;
    
    protected AbstractManager(String set) {
        db = new AccessDB(set);
    }
    
    public ArrayList<String[]> find(String cols, String condition) {
        String[] columns = cols.split(",");
        String[] information = null;
        ArrayList<String[]> list = new ArrayList<String[]>();
        ResultSet data = db.find(cols, condition);
        try {
            while (data.next()) {
                information = new String[columns.length];
                for (int i = 0; i < columns.length; i++) {
                    information[i] = data.getString(columns[i]);
                }
                list.add(information);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public abstract void insert(String vals);
    public abstract void edit(String values);
    public abstract void remove(String condition);
}
