package main.java.me.xir.xirmecloud;

import main.java.me.xir.xirmecloud.commands.*;
import main.java.me.xir.xirmecloud.commands.info.*;
import main.java.me.xir.xirmecloud.commands.teleportation.*;

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
		ProxyServer.getInstance().getPluginManager().registerCommand(this ,new cmd_test("testcommand"));
		ProxyServer.getInstance().getPluginManager().registerCommand(this, new cmd_website("website"));
	}
}