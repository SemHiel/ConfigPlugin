package me.sequos.config;

import jdk.tools.jlink.plugin.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConfigurationPlugin extends JavaPlugin implements Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.print("ConfigurationPlugin Plugin has been loaded.");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(command.getName().equals("printMessageFromConfig")){
            Player player = (Player) sender;
            String food = getConfig().getString("Food");
            int number = getConfig().getInt("Number");
            boolean Boolean = getConfig().getBoolean("Boolean");
            String thirditem = getConfig().getStringList("FoodList").get(2);
            player.sendMessage(ChatColor.DARK_PURPLE + "The food in the config.yml is " + ChatColor.RED + food);
        }else if(command.getName().equals("setFood")){
            getConfig().set("Food", "Shrimp");
            Player player = (Player) sender;
            player.sendMessage(ChatColor.DARK_PURPLE + "Food ConfigurationPlugin has been changed to Shrimp");
        }


        return false;


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
