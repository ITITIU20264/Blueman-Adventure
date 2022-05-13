import main.GamePanel;

public class TileManager {
    
    GamePanel gp;
    Tile[] tile;

    public TileManager(GamePanel gp) {
        
        this.gp = gp;

        tile = new Tile[tile.length];

        getTileImage();
    }

    public void getTileImage() {
        try {

            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/grass.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
