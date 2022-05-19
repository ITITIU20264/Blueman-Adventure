// package src;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_KEY extends superobject {
    public OBJ_KEY() {
        name = "Key";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("key.png"));
        }catch (IOException e){
            e.printStackTrace(); 
        }
    }
}
