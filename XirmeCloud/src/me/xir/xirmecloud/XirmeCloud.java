package me.xir.xirmecloud;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class XirmeCloud extends Plugin {

	@Override
	public void onEnable() {
		ProxyServer.getInstance().getPluginManager().registerCommand(new TestCommand(this));
	}
	
}
