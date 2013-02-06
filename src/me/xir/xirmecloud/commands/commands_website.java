package me.xir.xirmecloud.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.ChatColor;

public class commands_website extends Command {
	
	public commands_website(String name) {
		super(name);
	}
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		if (sender.hasPermission("xirmecloud.commands.website")) {
			sender.sendMessage("Click this link to go to the website -->"+ChatColor.YELLOW+"http://xir.me/"+ChatColor.RESET);
		} else {
			sender.sendMessage(ChatColor.RED+"You don't have sufficient permissions to use this command."+ChatColor.RESET);
		}
	}
}

