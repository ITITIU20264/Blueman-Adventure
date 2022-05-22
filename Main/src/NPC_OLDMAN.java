import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Rectangle;
import java.awt.Graphics2D;
public class NPC_OLDMAN extends Entity{

    public NPC_OLDMAN(GamePanel gp){
        super (gp);

        direction = "left";
        speed = 1;
        getImage();
    }
    public void getImage() {

        up1 = setup("oldman_up_1");
        up2 = setup("oldman_up_2");
        down1 = setup("oldman_down_1");
        down2 = setup("oldman_down_2");
        left1 = setup("oldman_left_1");
        left2 = setup("oldman_left_2");
        right1 = setup("oldman_right_1");
        right2 = setup("oldman_right_2");

    }
    
}
