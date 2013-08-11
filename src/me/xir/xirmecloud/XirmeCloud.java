package me.xir.xirmecloud;

import me.xir.xirmecloud.commands.*;
import me.xir.xirmecloud.commands.info.*;
import me.xir.xirmecloud.commands.teleportation.*;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class XirmeCloud extends Plugin{
	
	@Override
	public void onDisable() {
		//null atm
	}
	
	@Override
	public void onEnable() {
		
		//Register commands
		//ProxyServer.getInstance().getPluginManager().registerCommand(new cmd_test("testcommand"));
		//ProxyServer.getInstance().getPluginManager().registerCommand(new cmd_website("website"));
		//ProxyServer.getInstance().getPluginManager().registerCommand(new cmd_pvp("pvp"));
	}
}