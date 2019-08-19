package com.resync.unusuals.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class UnusualEquip extends Event {

    private static final HandlerList handlers = new HandlerList();

    private Item unusual;

    public UnusualEquip (Item unusual) {
        this.unusual = unusual;
    }

    public Item getUnusual() {
        return unusual;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}