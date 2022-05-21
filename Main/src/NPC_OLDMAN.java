import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Rectangle;
import java.awt.Graphics2D;
public class NPC_OLDMAN extends Entity{

    public NPC_OLDMAN(GamePanel gp){
        super (gp);

        direction = "down";
        speed = 1;

        public void getImage(){

            up1 = ImageIO.read(getClass().getResourceAsStream("oldman_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("oldman_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("oldman_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("oldman_down_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("oldman_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("oldman_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("oldman_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("oldman_right_2.png"));
        }
    }
    
}
