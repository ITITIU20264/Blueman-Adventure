import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_DOOR extends superobject {
    public OBJ_DOOR() {
        name = "Door";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("door.png"));
        }catch (IOException e){
            e.printStackTrace(); 
        }
        collision = true;
    }
}