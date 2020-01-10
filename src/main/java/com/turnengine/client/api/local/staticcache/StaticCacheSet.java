package com.turnengine.client.api.local.staticcache;

import com.turnengine.client.api.local.action.ActionCache;
import com.turnengine.client.api.local.action.IActionCache;
import com.turnengine.client.api.local.faction.FactionCache;
import com.turnengine.client.api.local.faction.IFactionCache;
import com.turnengine.client.api.local.group.GroupCache;
import com.turnengine.client.api.local.group.IGroupCache;
import com.turnengine.client.api.local.score.IScoreCache;
import com.turnengine.client.api.local.score.ScoreCache;
import com.turnengine.client.api.local.storage.IStorageCache;
import com.turnengine.client.api.local.storage.StorageCache;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.UnitCache;
import com.turnengine.client.api.local.upkeep.IUpkeepCache;
import com.turnengine.client.api.local.upkeep.UpkeepCache;

public class StaticCacheSet implements IStaticCacheSet {

	private final IFactionCache faction;
	private final IGroupCache group;
	private final IUnitCache unit;
	private final IStorageCache storage;
	private final IUpkeepCache upkeep;
	private final IActionCache action;
	private final IScoreCache score;

	public StaticCacheSet() {
		this.faction = new FactionCache();
		this.group = new GroupCache();
		this.unit = new UnitCache();
		this.storage = new StorageCache();
		this.upkeep = new UpkeepCache();
		this.action = new ActionCache();
		this.score = new ScoreCache();
	}

	public StaticCacheSet(IFactionCache faction, IGroupCache group, IUnitCache unit, IStorageCache storage, IUpkeepCache upkeep, IActionCache action, IScoreCache score) {
		this.faction = faction;
		this.group = group;
		this.unit = unit;
		this.storage = storage;
		this.upkeep = upkeep;
		this.action = action;
		this.score = score;
	}

	@Override
	public IUnitCache getUnitCache() {
		return unit;
	}

	@Override
	public IGroupCache getGroupCache() {
		return group;
	}

	@Override
	public IFactionCache getFactionCache() {
		return faction;
	}

	@Override
	public IActionCache getActionCache() {
		return action;
	}

	@Override
	public IUpkeepCache getUpkeepCache() {
		return upkeep;
	}

	@Override
	public IStorageCache getStorageCache() {
		return storage;
	}

	@Override
	public IScoreCache getScoreCache() {
		return score;
	}
}
