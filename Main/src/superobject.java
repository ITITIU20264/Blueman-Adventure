import java.awt.image.BufferedImage;
import java.awt.*;
public class superobject {
    public BufferedImage image1, image2;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    
    public void draw(Graphics2D g2, GamePanel gp) {
        g2.drawImage(image1, gp.obj[0].worldX, gp.obj[0].worldY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(image2, gp.obj[1].worldX, gp.obj[1].worldY, gp.tileSize, gp.tileSize, null);
    }
}
