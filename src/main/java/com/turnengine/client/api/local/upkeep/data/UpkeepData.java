package com.turnengine.client.api.local.upkeep.data;

import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;
import com.turnengine.client.api.local.upkeep.IUpkeepDefinition;

public class UpkeepData implements IUpkeepData {

	private final int playerId;
	private final ICreationTargetData set;
	private final boolean turnUpdating;

	public UpkeepData(int playerId, ICreationTargetData set, boolean turnUpdating) {
		this.playerId = playerId;
		this.set = set;
		this.turnUpdating = turnUpdating;
	}

	@Override
	public int getPlayerId() {
		return playerId;
	}

	@Override
	public IUnitList getUpkeepUnitList() {
		IUnitListSet listSet = set.getListSet();
		UnitType type = listSet.getUnitType();
		switch (type) {
			case PLAYER:
				return listSet.getPlayerUnitList();
			case LOCATION:
			case MOBILE:
				return listSet.getMobileUnitList();
			default:
				throw new IllegalStateException("Type not supported: " + type);
		}
	}

	@Override
	public ICreationData toCreation(IUpkeepDefinition definition, long amount) {
		return new UpkeepCreationData(getPlayerId(), definition, amount, set, isTurnUpdating());
	}

	@Override
	public ICreationTargetData getUnitListSet() {
		return set;
	}

	@Override
	public boolean isTurnUpdating() {
		return turnUpdating;
	}

}
