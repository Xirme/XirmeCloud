package me.xir.xirmecloud;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

class TestCommand extends Command {
	@SuppressWarnings("unused")
	private XirmeCloud plugin;
	
	public TestCommand(XirmeCloud plugin) {
		super("TestCommand");
		this.plugin = plugin;
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		// TODO Auto-generated method stub
		if (sender instanceof ProxiedPlayer) {
			ProxiedPlayer p = (ProxiedPlayer) sender;
			if (p.hasPermission("xirmecloud.testcommand")) {
				sender.sendMessage("It works!");
				
			}
		}

	}

}
