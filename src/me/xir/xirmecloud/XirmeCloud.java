package me.xir.xirmecloud;

import me.xir.xirmecloud.commands.*;
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
		ProxyServer.getInstance().getPluginManager().registerCommand(new commands_test("testcommand"));
		ProxyServer.getInstance().getPluginManager().registerCommand(new commands_website("website"));
	}
}