package factions.me.joseph.factioncommands;

import factions.me.joseph.factioncommands.utils.FactionSubCommand;
import me.lucko.helper.command.Command;

public class FactionInvite implements FactionSubCommand {

	@Override
	public Command getCommand() {
		return null;
	}

	@Override
	public String[] subCommandNames() {
		return new String[0];
	}

	@Override
	public String subCommandPermission() {
		return null;
	}
}
