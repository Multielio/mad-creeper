package fr.polielio.mc;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class mc extends JavaPlugin {
    @Override
    public void onEnable() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new Takedamage(), this);
        MetricsLite metrics = new MetricsLite(this);
    }
    @Override
    public void onDisable(){

    }
}
