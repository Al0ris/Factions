package factions.me.joseph;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
public class Faction {

	//Other Stuff
	private int power, memberAmount;
	private String name;
	private String description;
	private ArrayList<Faction> enemies;
	private ArrayList<Faction> truces;
	private ArrayList<Faction> allies;
	private ArrayList<UUID> members;


	//Faction Upgrades
	private int cropSpeed;
	private boolean fFly;
	private int warps;
	private int size;
	private int xpGain;
	private int spawnerSpeed;




}
