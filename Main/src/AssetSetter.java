public class AssetSetter{
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setobject(){
        gp.obj[0] = new OBJ_KEY();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 9 * gp.tileSize;

        gp.obj[1] = new OBJ_DOOR();
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 8 * gp.tileSize;

        gp.obj[1] = new OBJ_DOOR();
        gp.obj[1].worldX = 12 * gp.tileSize;
        gp.obj[1].worldY = 22 * gp.tileSize;

    } 
}