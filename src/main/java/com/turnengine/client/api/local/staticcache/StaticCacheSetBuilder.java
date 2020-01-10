package com.turnengine.client.api.local.staticcache;

import java.util.List;

import com.google.common.base.Supplier;
import com.robindrew.common.util.Check;
import com.turnengine.client.api.local.ILocalBeanExecutorSetLookup;
import com.turnengine.client.api.local.action.ActionCache;
import com.turnengine.client.api.local.action.IAction;
import com.turnengine.client.api.local.action.IActionCache;
import com.turnengine.client.api.local.action.IActionCondition;
import com.turnengine.client.api.local.action.IActionTarget;
import com.turnengine.client.api.local.action.ILocalActionExecutorSet;
import com.turnengine.client.api.local.faction.FactionCache;
import com.turnengine.client.api.local.faction.IFactionCache;
import com.turnengine.client.api.local.faction.ILocalFactionExecutorSet;
import com.turnengine.client.api.local.group.GroupCache;
import com.turnengine.client.api.local.group.IGroupCache;
import com.turnengine.client.api.local.group.ILocalGroupExecutorSet;
import com.turnengine.client.api.local.score.ILocalScoreExecutorSet;
import com.turnengine.client.api.local.score.IScoreCache;
import com.turnengine.client.api.local.score.IUnitScore;
import com.turnengine.client.api.local.score.ScoreCache;
import com.turnengine.client.api.local.storage.ILocalStorageExecutorSet;
import com.turnengine.client.api.local.storage.IStorageCache;
import com.turnengine.client.api.local.storage.IStorageGroup;
import com.turnengine.client.api.local.storage.IStorageItem;
import com.turnengine.client.api.local.storage.StorageCache;
import com.turnengine.client.api.local.unit.ILocalUnitExecutorSet;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.UnitCache;
import com.turnengine.client.api.local.upkeep.ILocalUpkeepExecutorSet;
import com.turnengine.client.api.local.upkeep.IUpkeep;
import com.turnengine.client.api.local.upkeep.IUpkeepCache;
import com.turnengine.client.api.local.upkeep.IUpkeepCondition;
import com.turnengine.client.api.local.upkeep.UpkeepCache;

public class StaticCacheSetBuilder implements Supplier<IStaticCacheSet> {

	private final long loginId;
	private final int instanceId;
	private final ILocalBeanExecutorSetLookup lookup;

	public StaticCacheSetBuilder(long loginId, int instanceId, ILocalBeanExecutorSetLookup lookup) {
		this.loginId = loginId;
		this.instanceId = instanceId;
		this.lookup = Check.notNull("lookup", lookup);
	}

	@Override
	public IStaticCacheSet get() {
		IFactionCache faction = getFactionCache();
		IGroupCache group = getGroupCache();
		IUnitCache unit = getUnitCache();
		IStorageCache storage = getStorageCache();
		IUpkeepCache upkeep = getUpkeepCache();
		IActionCache action = getActionCache();
		IScoreCache score = getScoreCache();
		return new StaticCacheSet(faction, group, unit, storage, upkeep, action, score);
	}

	private IScoreCache getScoreCache() {
		ILocalScoreExecutorSet commands = lookup.getScoreSet();
		List<IUnitScore> scores = commands.getUnitScores(loginId, instanceId);
		return new ScoreCache(scores);
	}

	private IActionCache getActionCache() {
		ILocalActionExecutorSet commands = lookup.getActionSet();
		List<IAction> upkeeps = commands.getActionList(loginId, instanceId);
		List<IActionTarget> targets = commands.getActionTargetList(loginId, instanceId);
		List<IActionCondition> conditions = commands.getActionConditionList(loginId, instanceId);
		return new ActionCache(upkeeps, targets, conditions);
	}

	private IUpkeepCache getUpkeepCache() {
		ILocalUpkeepExecutorSet commands = lookup.getUpkeepSet();
		List<IUpkeep> upkeeps = commands.getUpkeepList(loginId, instanceId);
		List<IUpkeepCondition> conditions = commands.getUpkeepConditionList(loginId, instanceId);
		return new UpkeepCache(upkeeps, conditions);
	}

	private IStorageCache getStorageCache() {
		ILocalStorageExecutorSet commands = lookup.getStorageSet();
		List<IStorageGroup> groups = commands.getStorageGroups(loginId, instanceId);
		List<IStorageItem> items = commands.getStorageItems(loginId, instanceId);
		return new StorageCache(groups, items);
	}

	private IFactionCache getFactionCache() {
		ILocalFactionExecutorSet commands = lookup.getFactionSet();
		return new FactionCache(commands.getFactions(loginId, instanceId));
	}

	private IGroupCache getGroupCache() {
		ILocalGroupExecutorSet commands = lookup.getGroupSet();
		return new GroupCache(commands.getGroups(loginId, instanceId));
	}

	private IUnitCache getUnitCache() {
		ILocalUnitExecutorSet commands = lookup.getUnitSet();
		return new UnitCache(commands.getUnits(loginId, instanceId));
	}
}
