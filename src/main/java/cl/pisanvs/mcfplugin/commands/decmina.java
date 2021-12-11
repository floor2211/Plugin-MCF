package cl.pisanvs.mcfplugin.commands;

import org.bukkit.command.CommandExecutor;

import net.md_5.bungee.api.ChatColor;

public class decmina implements CommandExecutor {
    @Override
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (!sender.isOp()) {
            sender.sendMessage("No tienes permisos para ejecutar este comando hijo del" + ChatColor.GREEN + "eme.");
            return true;
        }

        
        
        return false;
    }
}
