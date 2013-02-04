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
		if(!sender.hasPermission("xirmecloud.testcommand")){
			//set permission node
			sender.sendMessage(ChatColor.RED+"You dont have permission to do that!");
			//if sender does not have perms, return this
			return;
		}
		//do stuff
		sender.sendMessage(ChatColor.BLACK+"It works!");
	}
}