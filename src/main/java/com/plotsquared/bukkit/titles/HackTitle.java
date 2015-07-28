package com.plotsquared.bukkit.titles;

import com.intellectualcrafters.plot.PS;
import com.intellectualcrafters.plot.config.Settings;
import com.intellectualcrafters.plot.object.PlotPlayer;
import com.plotsquared.bukkit.object.BukkitPlayer;
import org.bukkit.ChatColor;

public class HackTitle extends AbstractTitle {
    @Override
    public void sendTitle(final PlotPlayer player, final String head, final String sub, int in, int delay, int out) {
        try {
            final HackTitleManager title = new HackTitleManager(head, sub, in, delay, out);
            title.send(((BukkitPlayer) player).player);
        } catch (final Throwable e) {
            PS.log("&cYour server version does not support titles!");
            Settings.TITLES = false;
            AbstractTitle.TITLE_CLASS = null;
        }
    }
}