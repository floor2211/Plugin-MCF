package cl.pisanvs.mcfplugin.types;

import java.util.HashMap;

public class minesData implements java.io.Serializable {
    private static final long serialVersionUID = 237958672384L;

    public HashMap<String, mineData> data = new HashMap<String, mineData>();
    
    public void addMine(String name, mineData data) {
        this.data.put(name, data);
    }

    public mineData getMine(String name) {
        return this.data.get(name);
    }

}
