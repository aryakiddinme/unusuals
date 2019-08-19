package com.resync.unusuals;

import com.resync.unusuals.events.PlayerJoin;
import com.resync.unusuals.events.PlayerQuit;
import com.resync.unusuals.events.UnusualEquip;
import com.resync.unusuals.listeners.UnusualListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListeners();
    }

    @Override
    public void onDisable() {

    }

    private void registerListeners() {

        // Makes it easier to register events programmatically

        Listener[] listeners = {
                new PlayerJoin(),
                new PlayerQuit(),
                new UnusualListener(),
        };

        for (Listener listener : listeners)
            this.getServer().getPluginManager().registerEvents(listener, this);
    }

}
