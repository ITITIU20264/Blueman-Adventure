// import src.GamePanel;
// import Main.KeyHandler;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.Rectangle;
import java.io.IOException;
import javax.imageio.ImageIO;

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

    public void draw(Graphics2D g2, GamePanel gamePanel) {

        BufferedImage image = null;
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if(worldX  + gp.tileSize > gp.player.worldX - gp.player.screenX && 
                worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

                    switch(direction){
                        case "up":
                            if(spriteNum == 1){
                                image = up1;
                            }
                            if(spriteNum == 2){
                                image = up2;
                            }
                            break;
                        case "down":
                            if(spriteNum == 1){
                                image = down1;
                            }
                            if(spriteNum == 2){
                                image = down2;
                            }
                            break;
                        case "left":
                            if(spriteNum == 1){
                                image = left1;
                            }
                            if(spriteNum == 2){
                                image = left2;
                            }
                            break;
                        case "right":
                            if(spriteNum == 1){
                                image = right1;
                            }
                            if(spriteNum == 2){
                                image = right2;
                            }
                            break;
                    }
                
                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);

            }

    }

    public BufferedImage setup(String imagePath){
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;

        try{
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
            image = uTool.scaledImage(image, gp.tileSize, gp.tileSize);
        }catch (IOException e){
            e.printStackTrace();
        }
        return image; 
    }
    
}