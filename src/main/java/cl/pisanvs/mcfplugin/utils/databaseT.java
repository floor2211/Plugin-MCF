package cl.pisanvs.mcfplugin.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;

import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;

import cl.pisanvs.mcfplugin.types.minesData;

public class databaseT implements Serializable {
    private static transient final long serialVersionUID = -1681012452879286330L;

    public String c = "caca";

    public void testsave(String t) {
        c = t;
    }

    public boolean saveData(String path) {
        try {
            BukkitObjectOutputStream out = new BukkitObjectOutputStream(new GZIPOutputStream(new FileOutputStream(path)));
            out.writeObject(this);
            out.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static databaseT loadData(String path) {
        try {
            BukkitObjectInputStream in = new BukkitObjectInputStream(new FileInputStream(path));
            databaseT config = (databaseT) in.readObject();
            in.close();
            return config;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static minesData mines = new minesData();

}
