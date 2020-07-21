package factions.me.joseph.factioncommands.utils;

import me.lucko.helper.command.Command;

public interface FactionCommand {

	Command getCommand();
	String[] commandNames();
	String commandPermissions();
	FactionSubCommand[] subCommands();

	default void register() {
		getCommand().register(commandNames());
	}
}
