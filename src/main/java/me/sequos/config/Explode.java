package me.sequos.config;

import jdk.tools.jlink.plugin.Plugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Explode implements CommandExecutor {

    Plugin plugin = ConfigurationPlugin.getPlugin(ConfigurationPlugin.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        String food = plugin.getCo


        Player player = (Player) sender;
        player.sendMessage();


        return false;
    }
}
