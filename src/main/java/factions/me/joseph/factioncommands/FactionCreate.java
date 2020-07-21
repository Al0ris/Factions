package factions.me.joseph.factioncommands;

import factions.me.joseph.Faction;
import factions.me.joseph.factioncommands.utils.FactionSubCommand;
import factions.me.joseph.utils.FactionUtils;
import me.lucko.helper.Commands;
import me.lucko.helper.command.Command;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FactionCreate implements FactionSubCommand {

	private Command command;
	private final String[] names = new String[]{"create"};
	private final String permission = "Factions.Factions.Create";

	public FactionCreate() {
		this.command = Commands.create()
				.assertPlayer()
				.assertPermission(permission, "You do not have permission to perform this command")
				//.assertPlayer(Check if they have a faction)
				.assertUsage("Faction create name")
				//Check if a faction with that name already exists
				.handler(c -> {
					String factionName = c.rawArg(1);
					Player player = c.sender();

					Faction faction = Faction.builder()
							.power(0)
							.memberAmount(1)
							.name(factionName)
							.description(null)
							.enemies(new ArrayList<>())
							.truces(new ArrayList<>())
							.allies(new ArrayList<>())
							.xpGain(0)
							.cropSpeed(0)
							.fFly(false)
							.size(0)
							.spawnerSpeed(0)
							.warps(0)
							.build();

					FactionUtils.factionMembers.put(faction, new ArrayList<>());
					FactionUtils.addMember(faction, player);
				});
		}

	}


	@Override
	public Command getCommand() {
		return command;
	}

	@Override
	public String[] subCommandNames() {
		return names;
	}

	@Override
	public String subCommandPermission() {
		return permission;
	}
}
