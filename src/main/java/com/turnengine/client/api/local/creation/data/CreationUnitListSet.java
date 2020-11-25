package com.turnengine.client.api.local.creation.data;

import com.turnengine.client.api.local.player.IPlayerCreationData;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;
import com.turnengine.client.api.local.unit.list.set.UnitListSet;

public class CreationUnitListSet implements ICreationUnitListSet {

	private final int id;
	private final UnitType type;
	private int playerId = -1;
	private int locationId = -1;
	private int mobileId = -1;
	private int allianceId = -1;
	private int factionId = -1;
	private IUnitListSet listSet = null;

	public CreationUnitListSet(ICreationUnitListSet set) {
		this.id = set.getId();
		this.type = set.getType();
		this.playerId = set.getPlayerId();
		this.locationId = set.getLocationId();
		this.mobileId = set.getMobileId();
		this.allianceId = set.getAllianceId();
		this.factionId = set.getFactionId();
		if (set.hasListSet()) {
			this.listSet = new UnitListSet(set.getListSet());
		}
	}

	public CreationUnitListSet(int id, UnitType type) {
		this.id = id;
		this.type = type;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public UnitType getType() {
		return type;
	}

	@Override
	public IUnitListSet getListSet() {
		if (listSet == null) {
			throw new NullPointerException("listSet");
		}
		return listSet;
	}

	@Override
	public int getPlayerId() {
		return playerId;
	}

	@Override
	public int getLocationId() {
		return locationId;
	}

	@Override
	public int getMobileId() {
		return mobileId;
	}

	public void setPlayerId(int id) {
		this.playerId = id;
	}

	public void setLocationId(int id) {
		this.locationId = id;
	}

	public void setLocationIds(int playerId, int allianceId, int factionId, int locationId) {
		if (!type.equals(UnitType.LOCATION)) {
			throw new IllegalArgumentException("Attempt to set location ids when type is " + type);
		}
		this.playerId = playerId;
		this.locationId = locationId;
		this.allianceId = allianceId;
		this.factionId = factionId;
	}

	public void setLocationIds(IPlayerCreationData player, int locationId) {
		setLocationIds(player.getId(), player.getAllianceId(), player.getFactionId(), locationId);
	}

	public void setMobileId(int id) {
		this.mobileId = id;
	}

	@Override
	public int getAllianceId() {
		return allianceId;
	}

	@Override
	public int getFactionId() {
		return factionId;
	}

	public void setMobileIds(int playerId, int allianceId, int factionId, int mobileId) {
		if (!type.equals(UnitType.MOBILE)) {
			throw new IllegalArgumentException("Attempt to set mobile ids when type is " + type);
		}
		this.playerId = playerId;
		this.mobileId = mobileId;
		this.allianceId = allianceId;
		this.factionId = factionId;
	}

	public void setMobileIds(IPlayerCreationData player, int mobileId) {
		setMobileIds(player.getId(), player.getAllianceId(), player.getFactionId(), mobileId);
	}

	public void setListSet(IUnitListSet set) {
		if (set == null) {
			throw new NullPointerException("set");
		}
		this.listSet = set;
	}

	public void setLocationListSet(IUnitList gameUnitList, IUnitList playerUnitList, IUnitList locationUnitList, IUnitList mobileUnitList) {
		this.listSet = new UnitListSet(type, gameUnitList, playerUnitList, locationUnitList, mobileUnitList);
	}

	public void setMobileListSet(IUnitList gameUnitList, IUnitList playerUnitList, IUnitList mobileUnitList) {
		this.listSet = new UnitListSet(type, gameUnitList, playerUnitList, null, mobileUnitList);
	}

	public void setPlayerListSet(IUnitList gameUnitList, IUnitList playerUnitList) {
		this.listSet = new UnitListSet(type, gameUnitList, playerUnitList, null, null);
	}

	@Override
	public boolean hasListSet() {
		return listSet != null;
	}

	public String toString() {
		return type + "[" + id + "]";
	}

	public void setAllianceId(int allianceId) {
		this.allianceId = allianceId;
	}

	public void setFactionId(int factionId) {
		this.factionId = factionId;
	}

	@Override
	public boolean hasPlayerId() {
		return playerId != -1;
	}

	@Override
	public boolean hasLocationId() {
		return locationId != -1;
	}

	@Override
	public boolean hasAllianceId() {
		return allianceId != -1;
	}

	@Override
	public boolean hasFactionId() {
		return factionId != -1;
	}

}
