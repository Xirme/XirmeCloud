package me.xir.xirmecloud.commands.teleportation;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class cmd_pvp extends Command {
	
	public cmd_pvp(String name) {
		super(name);
	}
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		if (sender.hasPermission("xirmecloud.commands.pvp")) {
			player.connect(BungeeCord.getInstance().config.getServers().get("pvp"))
;		} else {
			sender.sendMessage(ChatColor.RED+"You don't have sufficient permissions to use this command."+ChatColor.RESET);
		}
	}
}