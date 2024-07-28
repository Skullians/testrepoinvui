package net.skullian.invui;

import org.bukkit.plugin.java.JavaPlugin;

public final class InvUiTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("REGISTERING");
        getServer().getPluginManager().registerEvents(new Listener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
