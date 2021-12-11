package cl.pisanvs.mcfplugin;

import java.io.File;
import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

import cl.pisanvs.mcfplugin.utils.databaseT;
import cl.pisanvs.mcfplugin.commands.test;

public class App extends JavaPlugin {

    public static databaseT db;
    private String dbpath = getDataFolder().getAbsolutePath() + File.separator + "main.db";

    @Override
    public void onEnable() {
        getLogger().info("Plugin MCFPlugin activado");


        // check if database exists
        File file = new File(getDataFolder(), dbpath);
        if (!file.exists()) {
            getLogger().info("Database does not exist, creating...");
            File dbfile = new File(dbpath);
            try {
                dbfile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            db = new databaseT();
            db.saveData(dbpath);
        } else {
            getLogger().info("Database exists, opening...");
            db = databaseT.loadData(dbpath);
        }

        getLogger().info("Database loaded");
        getLogger().info(db.c);

        // register commands
        getCommand("test").setExecutor(new test());
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin MCFPlugin desactivado");
        db.saveData(dbpath);
    }

}