package com.turnengine.client.api.local.creation.data;

import com.turnengine.client.api.local.location.ILocationCreationData;
import com.turnengine.client.api.local.mobile.IMobileCreationData;
import com.turnengine.client.api.local.player.IPlayerCreationData;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public interface ICreationTargetData {

	int getId();

	UnitType getType();

	IUnitListSet getListSet();

	boolean isPlayer();

	boolean isLocation();

	boolean isMobile();

	int getPlayerId();

	int getLocationId();

	int getMobileId();

	IPlayerCreationData getPlayer();

	ILocationCreationData getLocation();

	IMobileCreationData getMobile();

	ICreationTargetData copy();

	boolean isModified();

	void update();

}
