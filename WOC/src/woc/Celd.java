/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;
import graphic_woc.ImagePane;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Celd {
  public boolean select;
  public ImagePane panel;
  ArrayList<Defense> content;
  public Building fill;
  public int x;
  public int y;

  public Celd() {
    this.panel = new ImagePane();
  }
  
  public Celd(ImagePane panel) {
    this.panel = panel;
  }

    public Celd(Image img) {
        this.panel= new ImagePane(img);
    }
    public Celd(Image img,int x, int y) {
        this.x = x;
        this.y = y;
        this.panel= new ImagePane(img);
    }
}
