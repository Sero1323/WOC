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
public abstract class AbstractManager<T> {
    
    protected AccessDB db;
    
    protected AbstractManager(String set) {
        db = new AccessDB(set);
    }
    
    public abstract ArrayList<T> find(String condition);
    public abstract void insert(String vals);
    public abstract void edit(String vals, String filer);
    public abstract void remove(String condition);
}
