package cl.pisanvs.mcfplugin.types;

import java.io.Serializable;

public class mineData implements Serializable{
    private static final long serialVersionUID = 8734892379182342499L;

    public String name;
    public String type;
    public String owner;
    public String world;
    public int x1;
    public int y1;
    public int z1;
    public int x2;
    public int y2;
    public int z2;
    public String status;

    public mineData(String name, String type, String owner, String world, int x1, int y1, int z1, int x2, int y2, int z2, String status) {
        this.name = name;
        this.type = type;
        this.owner = owner;
        this.world = world;
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
        this.status = status;
    }
}
