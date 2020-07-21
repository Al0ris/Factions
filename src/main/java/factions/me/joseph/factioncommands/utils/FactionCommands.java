package factions.me.joseph.factioncommands.utils;

import factions.me.joseph.factioncommands.FactionCreate;
import factions.me.joseph.factioncommands.FactionInvite;
import lombok.Getter;
import me.lucko.helper.Commands;
import me.lucko.helper.command.Command;

public class FactionCommands implements FactionCommand {

	@Getter
	private final Command command;
	private final String[] commandNames = new String[]{"Faction", "f"};
	private final FactionSubCommand[] factionSubCommands;
	private final String permission = "Factions.Factions";

	public FactionCommands() {
		this.subCommands() = new FactionSubCommand[]{new FactionCreate(), new FactionInvite(), new FactionStatus(), new FactionClaim(), new FactionUpgrade(), new FactionRank(),
				new FactionTop(), new FactionWorth(), new FactionBank(), new FactionWho(), FactionJoin(), new FactionLeave(), new FactionDisband(), new FactionPromote(),
				new FactionDemote(), new FactionTax(), new FactionChat()};
		this.command = Commands.create()
				.assertPermission(permission)
				.handler(c -> {
					boolean calledSubCommand = false;
					for (FactionSubCommand subCommand : subCommands()) {
						for (String commandName : subCommand.subCommandNames()) {
							if (!commandName.equalsIgnoreCase(c.rawArg(0))) continue;
							subCommand.getCommand().call(c);
							calledSubCommand = true;
							break;
						}
						if (calledSubCommand) {
							break;
						}
						if (calledSubCommand) {
							return;
						}
					}
				});
	}

	@Override
	public Command getCommand() {
		return null;
	}

	@Override
	public String[] commandNames() {
		return new String[0];
	}

	@Override
	public String commandPermissions() {
		return null;
	}

	@Override
	public FactionSubCommand[] subCommands() {
		return new FactionSubCommand[0];
	}


}
