public class AssetSetter{
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setobject(){
        gp.obj[0] = new OBJ_KEY();
        gp.obj[0].worldX = 9 * gp.tileSize;
        gp.obj[0].worldY = 6 * gp.tileSize;

        gp.obj[1] = new OBJ_DOOR();
        gp.obj[1].worldX = 1 * gp.tileSize;
        gp.obj[1].worldY = 0 * gp.tileSize;

    }
}