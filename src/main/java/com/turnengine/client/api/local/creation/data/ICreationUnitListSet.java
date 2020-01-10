package com.turnengine.client.api.local.creation.data;

import com.turnengine.client.api.local.action.calculator.IUnitListSetTarget;

public interface ICreationUnitListSet extends IUnitListSetTarget {

	int getPlayerId();

	int getLocationId();

	int getMobileId();

	int getAllianceId();

	int getFactionId();

	boolean hasPlayerId();

	boolean hasLocationId();

	boolean hasAllianceId();

	boolean hasFactionId();

	boolean hasListSet();
}
