// import src.GamePanel;
// import Main.KeyHandler;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.Rectangle;

public class Entity {
   
    GamePanel gp;
    public int worldX, worldY;
    public int speed;

    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    public String direction;

    public int spriteCounter = 0;
    public int spriteNum = 1;
    

    public Rectangle solidArea = new Rectangle(0, 0, 30, 30);
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collision = false;

    public Entity(GamePanel gp){
        this.gp = gp;
    }
    
}