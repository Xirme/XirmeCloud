package main.java.me.xir.xirmecloud.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.ChatColor;

public class cmd_test extends Command {
	
	public cmd_test(String name) {
		super(name);
	}
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		if (sender.hasPermission("xirmecloud.commands.testcommand")) {
			sender.sendMessage("Nigga, yo' command works.");
		} else {
			sender.sendMessage(ChatColor.RED+"You don't have sufficient permissions to use this command."+ChatColor.RESET);
		}
	}
}

