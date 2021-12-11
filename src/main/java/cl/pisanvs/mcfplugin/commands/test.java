package cl.pisanvs.mcfplugin.commands;

import org.bukkit.command.CommandExecutor;

import cl.pisanvs.mcfplugin.App;

public class test implements CommandExecutor {
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
        sender.sendMessage("Saving to db...");
        App.db.c = args[0];

        return false;
    }
}
