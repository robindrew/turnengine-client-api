package com.turnengine.client.api.local.unit.list.set;

import static com.turnengine.client.api.local.unit.UnitType.PLAYER;

import com.robindrew.common.text.Strings;
import com.robindrew.common.util.Check;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.UnitList;

public class UnitListSet implements IUnitListSet {

	private final UnitType type;
	private final IUnitList gameUnitList;
	private final IUnitList playerUnitList;
	private final IUnitList locationUnitList;
	private final IUnitList mobileUnitList;

	public UnitListSet(IUnitListSet set) {
		this.type = set.getUnitType();
		this.gameUnitList = copy(set.getGameUnitList());
		this.playerUnitList = copy(set.getPlayerUnitList());
		this.locationUnitList = copy(set.getLocationUnitList());
		this.mobileUnitList = copy(set.getMobileUnitList());
	}

	private IUnitList copy(IUnitList list) {
		return list == null ? null : new UnitList(list);
	}

	public UnitListSet(UnitType type, IUnitList game, IUnitList player, IUnitList location, IUnitList mobile) {
		this.type = Check.notNull("type", type);
		switch (type) {
			case GAME:
				this.gameUnitList = Check.notNull("game", game);
				this.playerUnitList = Check.isNull("player", player);
				this.locationUnitList = Check.isNull("location", location);
				this.mobileUnitList = Check.isNull("mobile", mobile);
				break;
			case PLAYER:
				this.gameUnitList = Check.notNull("game", game);
				this.playerUnitList = Check.notNull("player", player);
				this.locationUnitList = Check.isNull("location", location);
				this.mobileUnitList = Check.isNull("mobile", mobile);
				break;
			case LOCATION:
				// Player units (can be null at non-owned location)
				this.gameUnitList = Check.notNull("game", game);
				this.playerUnitList = player == null ? new UnitList(PLAYER) : player;
				this.locationUnitList = Check.notNull("location", location);
				this.mobileUnitList = Check.notNull("mobile", mobile);
				break;
			case MOBILE:
				this.gameUnitList = Check.notNull("game", game);
				this.playerUnitList = Check.notNull("player", player);
				this.locationUnitList = Check.isNull("location", location);
				this.mobileUnitList = Check.notNull("mobile", mobile);
				break;
			default:
				throw new IllegalArgumentException("type not supported: " + type);
		}
	}

	@Override
	public UnitType getUnitType() {
		return type;
	}

	@Override
	public IUnitList getGameUnitList() {
		return gameUnitList;
	}

	@Override
	public IUnitList getPlayerUnitList() {
		return playerUnitList;
	}

	@Override
	public IUnitList getLocationUnitList() {
		return locationUnitList;
	}

	@Override
	public IUnitList getMobileUnitList() {
		return mobileUnitList;
	}

	@Override
	public IUnitList getUnitList(UnitType type) {
		switch(type) {
			case GAME:
				return gameUnitList;
			case PLAYER:
				return playerUnitList;

			// Location type
			case LOCATION:
				if (locationUnitList == null) {
					throw new IllegalArgumentException("location unit list not set for type: " + getUnitType());
				}
				return locationUnitList;

			// Mobile type
			case MOBILE:
				if (mobileUnitList == null) {
					throw new IllegalArgumentException("mobile unit list not set for type: " + getUnitType());
				}
				return mobileUnitList;
				
			default:
				throw new IllegalArgumentException("type not supported: " + type);	
		}
	}

	@Override
	public String toString() {
		return Strings.toString(this);
	}

}
