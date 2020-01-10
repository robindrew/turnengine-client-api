package com.turnengine.client.api.local.unit.list.set;

import static com.turnengine.client.api.local.unit.UnitType.GAME;
import static com.turnengine.client.api.local.unit.UnitType.LOCATION;
import static com.turnengine.client.api.local.unit.UnitType.MOBILE;
import static com.turnengine.client.api.local.unit.UnitType.PLAYER;

import java.util.List;

import com.turnengine.client.api.local.location.ILocation;
import com.turnengine.client.api.local.mobile.IMobile;
import com.turnengine.client.api.local.player.IPlayer;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitListAdaptor;
import com.turnengine.client.api.local.unit.list.count.UnitListAdaptor;

public class UnitListSetBuilder implements IUnitListSetBuilder {

	private final IUnitListAdaptor adaptor;
	private IUnitList gameUnits = null;
	private IUnitList playerUnits = null;
	private IUnitList locationUnits = null;
	private IUnitList mobileUnits = null;

	public UnitListSetBuilder(IUnitCache cache) {
		this.adaptor = new UnitListAdaptor(cache);
	}

	@Override
	public IUnitListSetBuilder setPlayerUnits(IPlayer player) {
		return setPlayerUnits(player.getUnitList());
	}

	@Override
	public IUnitListSetBuilder setGameUnits(List<IUnitCount> units) {
		this.gameUnits = adaptor.adapt(units, GAME);
		return this;
	}

	@Override
	public IUnitListSetBuilder setPlayerUnits(List<IUnitCount> units) {
		this.playerUnits = adaptor.adapt(units, PLAYER);
		return this;
	}

	@Override
	public IUnitListSetBuilder setLocationUnits(ILocation location) {
		return setLocationUnits(location.getLocationUnitList(), location.getMobileUnitList());
	}

	@Override
	public IUnitListSetBuilder setLocationUnits(List<IUnitCount> locationUnits, List<IUnitCount> mobileUnits) {
		this.locationUnits = adaptor.adapt(locationUnits, LOCATION);
		this.mobileUnits = adaptor.adapt(mobileUnits, MOBILE);
		return this;
	}

	@Override
	public IUnitListSetBuilder setMobileUnits(IMobile mobile) {
		return setMobileUnits(mobile.getUnitList());
	}

	@Override
	public IUnitListSetBuilder setMobileUnits(List<IUnitCount> units) {
		this.mobileUnits = adaptor.adapt(units, PLAYER);
		return this;
	}

	public UnitType getUnitType() {
		if (locationUnits != null) {
			return LOCATION;
		}
		if (mobileUnits != null) {
			return MOBILE;
		}
		return PLAYER;
	}

	@Override
	public IUnitListSet get() {
		// Must ALWAYS set game units ...
		if (gameUnits == null) {
			throw new IllegalStateException("game units not set");
		}
		// Must ALWAYS set player units ...
		if (playerUnits == null) {
			throw new IllegalStateException("player units not set");
		}
		return new UnitListSet(getUnitType(), gameUnits, playerUnits, locationUnits, mobileUnits);
	}
}
