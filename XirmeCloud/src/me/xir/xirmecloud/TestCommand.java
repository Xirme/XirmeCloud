//EXAMPLE COMMAND SETUP

package me.xir.xirmecloud;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class TestCommand extends Command {
	
	public TestCommand(String name) {
		super(name);
	}
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		sender.sendMessage(args.toString());
	}
}