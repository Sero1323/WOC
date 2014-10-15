/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import graphic_woc.GameFrame;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class UserInfo {
    
    private int idUsuario;
    private String usuario;
    private String contrasena;
    private String tipo;
    private ArrayList<GameFrame> games;
    
    public UserInfo(int idUsuario, String usuario, String contrasena, String tipo) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<GameFrame> getGames() {
        return games;
    }

    public void setGames(ArrayList<GameFrame> games) {
        this.games = games;
    }
    
    @Override
    public String toString() {
        return usuario;
    }
    
}
