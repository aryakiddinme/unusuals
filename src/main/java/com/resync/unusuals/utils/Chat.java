package com.resync.unusuals.utils;

import net.md_5.bungee.api.ChatColor;

public class Chat {

    public static String colorize(String toColorize) {
        return ChatColor.translateAlternateColorCodes('&', toColorize);
    }
}
