/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphic_woc;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class Frame extends JFrame implements Runnable, KeyListener  {


    private final int WIDTH = 1366;
    private final int HEIGHT = 730;
    Thread gameloop;
    
    int keyCode;
    char keyChar;
    String allKeys = "";

    BufferedImage doubleBuffer;
    Graphics2D doubleBufferG2D;

    ArrayList<Sprite> allSprites = new ArrayList<>();
    ArrayList<AnimatedSprite2> allAnimatedSprites = new ArrayList<>();

    
    public static Frame instance = null;
    
    private Frame(){
        super();   
        
   ImagePanel panel = new ImagePanel(new ImageIcon("images/background.png").getImage());

    
    this.getContentPane().add(panel);
    this.pack();
    this.setVisible(true);
    
        this.setSize(this.WIDTH, this.HEIGHT);
        
        /* Hide Toolbar*/
        //this.setUndecorated(true);
        //this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Create the backbuffer as a BufferedImage object */
        this.doubleBuffer = new BufferedImage(this.WIDTH, this.HEIGHT, BufferedImage.TYPE_INT_RGB);
        /* create a Graphics 2D object to draw INTO this backbuffer */
        this.doubleBufferG2D = (Graphics2D) doubleBuffer.createGraphics();

    this.setVisible(true);
       
    }

    public static Frame getInstance(){
        if (instance == null){
            instance = new Frame();
        }
        return instance;
    }


    public static void Frame(){
            Frame.getInstance().start();
           

            
    }

//    @Override
//    public void update(Graphics g){
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setColor(Color.red);
//        g2d.fillRect(0, 0, 50, 50);
//    }

    @Override
    /**
     *
     */
    public void paint(Graphics g){
        /*Get the Graphics object on which to draw on */

        Graphics2D g2d = (Graphics2D) g;

//        /*Delete everything off the background */
//        g2d.setColor(g2d.getBackground());
//        g2d.fillRect(0, 0, instance.WIDTH, instance.HEIGHT);
//        /*Causes horrible flicker!! Need double buffering */
//        g2d.setColor(Color.red);
//        g2d.fillRect(0, 0, 50, 50);
//        /*Lets display what we captured from the keyEvents  */
//
//        g2d.drawString("Key Code: " + keyCode,20, 90);
//        g2d.drawString("Key char: "+ keyChar, 20, 110);
//        g2d.drawString(allKeys, 20, 130);



        try {
        instance.paintToBackbuffer();
        g2d.drawImage(doubleBuffer, null , 0, 0);
        } catch (Exception ex){
        }
        
           
        
    }

    /** A private method to paint to the backbuffer first, before
     *  painting to the screen, used to eliminate flicker.
     * 
     * @param g
     */
    private void paintToBackbuffer(){
         /* The backbuffered version */
        //instance.doubleBufferG2D.setColor(Color.BLUE);

           //instance.getContentPane().add(panel);
 
        instance.doubleBufferG2D.fillRect(0, 0, instance.WIDTH, instance.HEIGHT);
        /*Causes horrible flicker!! Need double buffering */
        //instance.doubleBufferG2D.setColor(Color.red);
        //instance.doubleBufferG2D.fillRect(0, 0, 50, 50);
        /*Lets display what we captured from the keyEvents  */
/*
        instance.doubleBufferG2D.drawString("Key Code: " + keyCode,20, 90);
        instance.doubleBufferG2D.drawString("Key char: "+ keyChar, 20, 110);
        instance.doubleBufferG2D.drawString(allKeys, 20, 130);*/
        /*Test, try to draw the image by yourself, not wrapped inside the Sprite class  */
        //Image temp = Toolkit.getDefaultToolkit().getImage("src/Sprites/NFS.jpg");
        //instance.doubleBufferG2D.drawImage(temp, 50, 50, null);
        
        this.drawAllSprites();
    }




    /**repaint()
     * JFrame is a lightweight component, hence paint() is called by repaint(),
     * not update()
     *
     */
    public void run() {
        Thread current = Thread.currentThread();
        while (current == gameloop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
            
            /*Draw all of the sprites in the arrayList to the backbuffer */            
            repaint();  //draw to the screen
    }
}

        public void start() {
               addKeyListener(this);    /*start listening for key events  */
               gameloop = new Thread(this);
               gameloop.start();
               /*Create the sprites and get them ready for drawing */
               this.initializeSprites();
        }

        /** Create the Sprites for the game and place them in initial positions.
         *
         */
        public void initializeSprites(){
            //Sprite test = new Sprite(160,160,instance.doubleBuffer);
            //test.loadSpriteImage("NFS.jpg");
            //instance.addSprite(test);
            /*
            Sprite dragon = new Sprite(182, 116, instance.doubleBuffer);
            dragon.loadSpriteImage("DRAGGRMirrored.png");
            dragon.setSpriteXPosition(230);
            dragon.setSpriteYPosition(140);
            instance.addSprite(dragon);
            Sprite cavalry = new Sprite(134, 89, instance.doubleBuffer);
            cavalry.loadSpriteImage("CAVALRYB0010.png");
            instance.addSprite(cavalry);
            cavalry.setSpriteXPosition(150);
            cavalry.setSpriteYPosition(170);
            */
            AnimatedSprite2 cavAnimated = new AnimatedSprite2(6,140,180,845,180,instance.doubleBuffer);
            cavAnimated.loadSpriteImage("championAttackFramesPNGv2.png");
            instance.addAnimatedSprite(cavAnimated);
            cavAnimated.setSpriteXPosition(160);
            cavAnimated.setSpriteYPosition(230);

            AnimatedSprite2 dragonAnimated = new AnimatedSprite2(4,234,180,950,180, instance.doubleBuffer);
            dragonAnimated.loadSpriteImage("dragonAttackFramesReversePNG.png");
            instance.addAnimatedSprite(dragonAnimated);
            dragonAnimated.setSpriteXPosition(400);
            dragonAnimated.setSpriteYPosition(220);


        }

        /** Draw all the sprites contained in the allSprites and allAnimatedSprites lists.
         *
         */
        public void drawAllSprites(){
            
            for (AnimatedSprite2 current : allAnimatedSprites){
                current.updateAnimation();
                current.draw();
                
            }

            for (Sprite current : allSprites){
                //current.setSpriteXPosition(current.getSpriteXPosition() + 1);
                //current.setSpriteYPosition(current.getSpriteYPosition() + 1);
                current.draw();
                //this.doubleBufferG2D.drawString("X of image:" + current.getSpriteXPosition() + " Y of image:" + current.getSpriteYPosition(), 20 , 300);
            }
        }

     /**
     *
     * @param spriteToAdd
     */
    public void addSprite(Sprite spriteToAdd){
        instance.allSprites.add(spriteToAdd);
    }

    /**
     *
     * @param animatedSpriteToAdd
     */
    public void addAnimatedSprite(AnimatedSprite2 animatedSpriteToAdd){
        instance.allAnimatedSprites.add(animatedSpriteToAdd);
    }
    
    /**
     *
     * @param spriteToRemove
     */
    public void removeSprite(Sprite spriteToRemove){
        instance.allSprites.remove(spriteToRemove);
    }
        

    /**Useful to get keys typed for a chat message, returns ASCII characters
     *
     * @param e
     */
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        keyChar = e.getKeyChar();
        allKeys += keyChar;
        repaint();  //run the paint() method
    }

    /**Provides keycodes (e.g. VK_LEFT(left arrow), VK_DOWN, VK_ENTER, VK_KP_LEFT (keypad left)
     *Virtual keycodes are platform independent.
     *
     * @param e
     */
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        keyCode = e.getKeyCode();
        keyChar = ' '; //empty, this isn't the mothod to see the keyChars, keyTyped() is
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            allKeys = "";   //clear that line on enter
        }
        repaint(); //run the paint() method
    }

    public void keyReleased(KeyEvent e) {
        int dir = e.getKeyCode();
        switch(dir)
        {
            case 37:
                allAnimatedSprites.get(0).setSpriteXPosition(allAnimatedSprites.get(0).getSpriteXPosition()-4);
            break;
                
            case 38:
                allAnimatedSprites.get(0).setSpriteYPosition(allAnimatedSprites.get(0).getSpriteYPosition()-4);
            break;
                
            case 39:
                allAnimatedSprites.get(0).setSpriteXPosition(allAnimatedSprites.get(0).getSpriteXPosition()+4);
            break;
                
            case 40:
                allAnimatedSprites.get(0).setSpriteYPosition(allAnimatedSprites.get(0).getSpriteYPosition()+4);
            break;
            default:
            break;
            
        }
    }
  
}
class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
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