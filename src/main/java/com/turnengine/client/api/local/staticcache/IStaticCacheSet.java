package com.turnengine.client.api.local.staticcache;

import com.turnengine.client.api.local.action.IActionCache;
import com.turnengine.client.api.local.faction.IFactionCache;
import com.turnengine.client.api.local.group.IGroupCache;
import com.turnengine.client.api.local.score.IScoreCache;
import com.turnengine.client.api.local.storage.IStorageCache;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.upkeep.IUpkeepCache;

public interface IStaticCacheSet {

	IFactionCache getFactionCache();

	IGroupCache getGroupCache();

	IUnitCache getUnitCache();

	IStorageCache getStorageCache();

	IUpkeepCache getUpkeepCache();

	IActionCache getActionCache();

	IScoreCache getScoreCache();

}
