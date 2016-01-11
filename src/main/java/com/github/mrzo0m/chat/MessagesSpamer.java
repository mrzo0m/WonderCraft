package com.github.mrzo0m.chat;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by mr.zoom on 11.01.2016.
 */
public class MessagesSpamer {

    @SubscribeEvent
    public void sendMessage(BlockEvent.BreakEvent event) {
        event.getPlayer().addChatComponentMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "HO HO HO"));
    }
}
