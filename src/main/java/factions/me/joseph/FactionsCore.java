package factions.me.joseph;

import factions.me.joseph.factioncommands.utils.FactionCommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class FactionsCore extends JavaPlugin {

	@Override
	public void onEnable() {
		// Plugin startup logic
		new FactionCommands().register();
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic

	}
}
