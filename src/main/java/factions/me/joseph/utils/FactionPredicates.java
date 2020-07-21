package factions.me.joseph.utils;

import java.util.function.Predicate;

public class FactionPredicates {

	public static final Predicate<String> create = create -> {
		return create.equalsIgnoreCase("create");
	};
}
