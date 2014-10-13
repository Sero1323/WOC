/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphic_woc;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class ImagePane extends JPanel {
  boolean select;
  Image img;

  public ImagePane() {
  }
  
  public ImagePane(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePane(Image img) {
    select = false;
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }
  @Override
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

  
  


}
