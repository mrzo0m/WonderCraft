package com.github.mrzo0m;

/**
 * Created by mr.zoom on 11.01.2016.
 */

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
    public static final String MODID = "WonderCraft";
    public static final String VERSION = "0.1";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("Awesome development begin!");
    }
}
