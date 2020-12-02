package com.turnengine.client.api.local.upkeep.data;

import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;
import com.turnengine.client.api.local.upkeep.IUpkeepDefinition;

public class UpkeepData implements IUpkeepData {

	private final int playerId;
	private final ICreationTargetData data;
	private final boolean turnUpdating;

	public UpkeepData(int playerId, ICreationTargetData data, boolean turnUpdating) {
		this.playerId = playerId;
		this.data = data;
		this.turnUpdating = turnUpdating;
	}

	@Override
	public int getPlayerId() {
		return playerId;
	}

	@Override
	public IUnitList getUpkeepUnitList() {
		IUnitListSet unitLists = data.getListSet();
		UnitType type = unitLists.getUnitType();
		switch (type) {
			case PLAYER:
				return unitLists.getPlayerUnitList();
			case LOCATION:
				// Location units do not have upkeep applied to them
			case MOBILE:
				return unitLists.getMobileUnitList();
			default:
				throw new IllegalStateException("Type not supported: " + type);
		}
	}

	@Override
	public ICreationData toCreation(IUpkeepDefinition definition, long amount) {
		return new UpkeepCreationData(getPlayerId(), definition, amount, data, isTurnUpdating());
	}

	@Override
	public ICreationTargetData getUnitListSet() {
		return data;
	}

	@Override
	public boolean isTurnUpdating() {
		return turnUpdating;
	}

}
