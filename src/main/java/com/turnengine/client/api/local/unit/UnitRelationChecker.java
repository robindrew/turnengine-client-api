package com.turnengine.client.api.local.unit;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.Collection;

import com.turnengine.client.api.local.faction.FactionUnited;
import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.faction.IFactionCache;
import com.turnengine.client.api.local.player.IOwned;

public class UnitRelationChecker {

	private static final int NO_PLAYER_ID = -1;
	private static final int NO_ALLIANCE_ID = -1;
	private static final int NO_FACTION_ID = -1;

	private final IFactionCache factions;

	public UnitRelationChecker() {
		this.factions = getDependency(IFactionCache.class);
	}

	public UnitRelationChecker(IFactionCache factions) {
		if (factions == null) {
			throw new NullPointerException("factions");
		}
		this.factions = factions;
	}

	public boolean checkRelation(UnitRelation relation, IOwned from, IOwned... toArray) {
		if (from == null) {
			throw new NullPointerException("from");
		}
		if (toArray.length == 0) {
			throw new IllegalArgumentException("toArray is empty");
		}
		for (IOwned to : toArray) {
			if (!checkRelation(relation, from, to)) {
				return false;
			}
		}
		return true;
	}

	public boolean checkRelation(UnitRelation relation, IOwned from, Collection<? extends IOwned> toCollection) {
		if (from == null) {
			throw new NullPointerException("from");
		}
		if (toCollection.isEmpty()) {
			throw new IllegalArgumentException("toCollection is empty");
		}
		for (IOwned to : toCollection) {
			if (!checkRelation(relation, from, to)) {
				return false;
			}
		}
		return true;
	}

	public boolean checkRelation(UnitRelation relation, IOwned owned1, IOwned owned2) {
		if (owned1 == null) {
			throw new NullPointerException("owned1");
		}
		if (owned2 == null) {
			throw new NullPointerException("owned2");
		}
		switch (relation) {
			case ANY:
				return true;
			case OWNED:
				return isOwned(owned1, owned2);
			case ALLIED:
				return isAllied(owned1, owned2);
			case FACTION:
				return isFaction(owned1, owned2);
			case HOSTILE:
				return isHostile(owned1, owned2);
			case NEUTRAL:
				return isNeutral(owned1, owned2);
			case NOT_ALLIED:
				return !isAllied(owned1, owned2);
			case NOT_FACTION:
				return !isFaction(owned1, owned2);
			case NOT_HOSTILE:
				return !isHostile(owned1, owned2);
			case NOT_OWNED:
				return !isOwned(owned1, owned2);
			default:
				throw new IllegalArgumentException("relation not supported: " + relation);
		}
	}

	private boolean isNeutral(IOwned owned1, IOwned owned2) {
		return owned1.getPlayerId() == NO_PLAYER_ID || owned2.getPlayerId() == NO_PLAYER_ID;
	}

	private boolean isHostile(IOwned owned1, IOwned owned2) {
		return !isOwned(owned1, owned2) && !isAllied(owned1, owned2) && !isNeutral(owned1, owned2);
	}

	private boolean isAllied(IOwned owned1, IOwned owned2) {
		if (isOwned(owned1, owned2)) {
			return true;
		}
		if (owned1.getAllianceId() == NO_ALLIANCE_ID) {
			return false;
		}
		if (owned2.getAllianceId() == NO_ALLIANCE_ID) {
			return false;
		}
		if (owned1.getAllianceId() == owned2.getAllianceId()) {
			return true;
		}

		// Check faction (united is the same as allied)
		if (!isFaction(owned1, owned2)) {
			return false;
		}
		int factionId = owned1.getFactionId();
		IFaction faction = factions.getById(factionId);
		return faction.getUnited().equals(FactionUnited.UNITED);
	}

	private boolean isOwned(IOwned owned1, IOwned owned2) {
		if (owned1.getPlayerId() == NO_PLAYER_ID) {
			return false;
		}
		if (owned2.getPlayerId() == NO_PLAYER_ID) {
			return false;
		}
		return owned1.getPlayerId() == owned2.getPlayerId();
	}

	private boolean isFaction(IOwned owned1, IOwned owned2) {
		if (owned1.getFactionId() == NO_FACTION_ID) {
			return false;
		}
		if (owned2.getFactionId() == NO_FACTION_ID) {
			return false;
		}
		return owned1.getFactionId() == owned2.getFactionId();
	}
}
