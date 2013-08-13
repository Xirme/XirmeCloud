package main.java.me.xir.xirmecloud.commands.teleportation;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class cmd_pvp extends Command {
	
	public cmd_pvp(String name) {
		super(name);
	}
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		if (sender.hasPermission("xirmecloud.commands.pvp")) {
			
			if ( !( sender instanceof ProxiedPlayer )) {
				    return;
		        }
			
		    ProxiedPlayer player = (ProxiedPlayer) sender;
		    
		    player.connect(ProxyServer.getInstance().getServerInfo("pvp"));
		    }
		}
	}	