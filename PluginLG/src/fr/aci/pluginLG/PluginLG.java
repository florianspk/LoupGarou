package fr.aci.pluginLG;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginLG extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(" has been enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("InventoryManager has been disabled");
    }



}