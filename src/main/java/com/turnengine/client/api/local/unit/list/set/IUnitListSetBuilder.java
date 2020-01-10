package com.turnengine.client.api.local.unit.list.set;

import java.util.List;

import com.google.common.base.Supplier;
import com.turnengine.client.api.local.location.ILocation;
import com.turnengine.client.api.local.mobile.IMobile;
import com.turnengine.client.api.local.player.IPlayer;
import com.turnengine.client.api.local.unit.IUnitCount;

public interface IUnitListSetBuilder extends Supplier<IUnitListSet> {

	IUnitListSetBuilder setGameUnits(List<IUnitCount> units);

	IUnitListSetBuilder setPlayerUnits(IPlayer player);

	IUnitListSetBuilder setPlayerUnits(List<IUnitCount> units);

	IUnitListSetBuilder setLocationUnits(ILocation location);

	IUnitListSetBuilder setLocationUnits(List<IUnitCount> locationUnits, List<IUnitCount> mobileUnits);

	IUnitListSetBuilder setMobileUnits(IMobile mobile);

	IUnitListSetBuilder setMobileUnits(List<IUnitCount> units);
}
