package factions.me.joseph.factioncommands.utils;

import me.lucko.helper.command.Command;

public interface FactionSubCommand {

	Command getCommand();
	String[] subCommandNames();
	String subCommandPermission();

}
