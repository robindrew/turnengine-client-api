package com.turnengine.client.api.local.cache;

import static com.robindrew.common.dependency.DependencyFactory.setDependency;

import java.util.List;

import com.turnengine.client.api.local.action.Action;
import com.turnengine.client.api.local.action.ActionCondition;
import com.turnengine.client.api.local.action.ActionConditionExecute;
import com.turnengine.client.api.local.action.ActionTarget;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.action.IAction;
import com.turnengine.client.api.local.action.IActionCache;
import com.turnengine.client.api.local.action.IActionCondition;
import com.turnengine.client.api.local.action.IActionTarget;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.faction.Faction;
import com.turnengine.client.api.local.faction.FactionUnited;
import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.faction.IFactionCache;
import com.turnengine.client.api.local.group.Group;
import com.turnengine.client.api.local.group.IGroup;
import com.turnengine.client.api.local.group.IGroupCache;
import com.turnengine.client.api.local.score.IScoreCache;
import com.turnengine.client.api.local.staticcache.IStaticCacheManager;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.staticcache.StaticCacheSet;
import com.turnengine.client.api.local.storage.IStorageCache;
import com.turnengine.client.api.local.storage.IStorageGroup;
import com.turnengine.client.api.local.storage.IStorageItem;
import com.turnengine.client.api.local.storage.StorageGroup;
import com.turnengine.client.api.local.storage.StorageItem;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.Unit;
import com.turnengine.client.api.local.unit.UnitMove;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.upkeep.IUpkeep;
import com.turnengine.client.api.local.upkeep.IUpkeepCache;
import com.turnengine.client.api.local.upkeep.IUpkeepCondition;
import com.turnengine.client.api.local.upkeep.Upkeep;
import com.turnengine.client.api.local.upkeep.UpkeepCondition;

/**
 * A local implementation of a cache manager backed by a cache set.
 */
public class CacheSetManager implements IStaticCacheManager {

	private final StaticCacheSet set = new StaticCacheSet();

	protected IStaticCacheSet getCacheSet() {
		return set;
	}

	public void setDependencies() {
		setDependency(IFactionCache.class, getFactionCache());
		setDependency(IGroupCache.class, getGroupCache());
		setDependency(IUnitCache.class, getUnitCache());
		setDependency(IStorageCache.class, getStorageCache());
		setDependency(IUpkeepCache.class, getUpkeepCache());
		setDependency(IActionCache.class, getActionCache());
		setDependency(IScoreCache.class, getScoreCache());
		setDependency(IStaticCacheSet.class, this);
	}

	@Override
	public IFactionCache getFactionCache() {
		return getCacheSet().getFactionCache();
	}

	@Override
	public IGroupCache getGroupCache() {
		return getCacheSet().getGroupCache();
	}

	@Override
	public IUnitCache getUnitCache() {
		return getCacheSet().getUnitCache();
	}

	@Override
	public IStorageCache getStorageCache() {
		return getCacheSet().getStorageCache();
	}

	@Override
	public IUpkeepCache getUpkeepCache() {
		return getCacheSet().getUpkeepCache();
	}

	@Override
	public IScoreCache getScoreCache() {
		return getCacheSet().getScoreCache();
	}

	@Override
	public IActionCache getActionCache() {
		return getCacheSet().getActionCache();
	}

	@Override
	public List<IAction> getActionList() {
		return getActionCache().getActions();
	}

	@Override
	public List<IActionTarget> getActionTargetList() {
		return getActionCache().getTargets();
	}

	@Override
	public List<IActionCondition> getActionConditionList() {
		return getActionCache().getConditions();
	}

	protected IAction addAction(IAction action) {
		IActionCache cache = getCacheSet().getActionCache();
		cache.addAction(action);
		return action;
	}

	@Override
	public IAction addAction(IUnit unit, int turns, int limit) {
		return addAction(new Action(unit.getId(), turns, limit));
	}

	protected void addActionTarget(IActionTarget target) {
		IActionCache cache = getCacheSet().getActionCache();
		cache.addTarget(target);
	}

	@Override
	public void addActionTarget(IUnit unit, ActionTargetType targetType, UnitType type, UnitRelation relation) {
		IActionTarget target = new ActionTarget(unit.getId(), targetType, type, relation);
		addActionTarget(target);
	}

	@Override
	public void addActionCondition(IUnit unit, ActionTargetType target, ActionConditionExecute execute, CreationConditionType type) {
		IActionCondition condition = new ActionCondition(unit.getId(), target, execute, type, -1, -1, -1, -1, -1, -1, false);
		addActionCondition(condition);
	}

	@Override
	public void addActionCondition(IUnit unit, ActionTargetType target, ActionConditionExecute execute, CreationConditionType type, IUnit condition1, long amount1) {
		IActionCondition condition = new ActionCondition(unit.getId(), target, execute, type, condition1.getId(), amount1, -1, -1, -1, -1, false);
		addActionCondition(condition);
	}

	@Override
	public void addActionCondition(IUnit unit, ActionTargetType target, ActionConditionExecute execute, CreationConditionType type, IUnit condition1, long amount1, IUnit condition2, long amount2) {
		IActionCondition condition = new ActionCondition(unit.getId(), target, execute, type, condition1.getId(), amount1, condition2.getId(), amount2, -1, -1, false);
		addActionCondition(condition);
	}

	@Override
	public List<IUpkeep> getUpkeepList() {
		return getUpkeepCache().getAll();
	}

	@Override
	public List<IUpkeepCondition> getUpkeepConditionList() {
		return getUpkeepCache().getConditions();
	}

	protected void addActionCondition(IActionCondition condition) {
		IActionCache cache = getCacheSet().getActionCache();
		cache.addCondition(condition);
	}

	@Override
	public IUpkeep addUpkeep(IUnit unit, long limit) {
		IUpkeepCache cache = getCacheSet().getUpkeepCache();
		IUpkeep upkeep = new Upkeep(unit.getId(), limit);
		cache.addUpkeep(upkeep);
		return upkeep;
	}

	public IUpkeep addUpkeep(IUnit unit) {
		return addUpkeep(unit, 0);
	}

	@Override
	public void addUpkeepCondition(IUnit unit, CreationConditionType type, IUnit unit1, long amount1, boolean optional) {
		IUpkeepCondition condition = new UpkeepCondition(unit.getId(), type, unit1.getId(), amount1, -1, -1, -1, -1, optional);
		IUpkeepCache cache = getCacheSet().getUpkeepCache();
		cache.addCondition(condition);
	}

	@Override
	public void addUpkeepCondition(IUnit unit, CreationConditionType type, IUnit unit1, long amount1, IUnit unit2, long amount2, boolean optional) {
		IUpkeepCondition condition = new UpkeepCondition(unit.getId(), type, unit1.getId(), amount1, unit2.getId(), amount2, -1, -1, optional);
		IUpkeepCache cache = getCacheSet().getUpkeepCache();
		cache.addCondition(condition);
	}

	@Override
	public void addUpkeepCondition(IUnit unit, CreationConditionType type, IUnit unit1, long amount1, IUnit unit2, long amount2, IUnit unit3, long amount3, boolean optional) {
		IUpkeepCondition condition = new UpkeepCondition(unit.getId(), type, unit1.getId(), amount1, unit2.getId(), amount2, unit3.getId(), amount3, optional);
		IUpkeepCache cache = getCacheSet().getUpkeepCache();
		cache.addCondition(condition);
	}

	@Override
	public List<IStorageGroup> getStorageGroups() {
		return getStorageCache().getGroups();
	}

	@Override
	public List<IStorageItem> getStorageItems() {
		return getStorageCache().getItems();
	}

	protected long getStorageSize(IUnit parentUnit, IUnit childUnit) {
		IStorageCache cache = getCacheSet().getStorageCache();
		return cache.getStorage(parentUnit).getSize(childUnit);
	}

	@Override
	public void addStorageGroup(IUnit parent, IGroup group, long capacity, StorageType type) {
		IStorageCache cache = getCacheSet().getStorageCache();
		IStorageGroup storageGroup = new StorageGroup(parent.getId(), group.getId(), capacity, type);
		cache.addGroup(storageGroup);
	}

	@Override
	public void addStorageItem(IUnit parent, IGroup group, IUnit unit, long size, long limit) {
		IStorageCache cache = getCacheSet().getStorageCache();
		IStorageItem item = new StorageItem(parent.getId(), group.getId(), unit.getId(), size, limit);
		cache.addItem(item);
	}

	protected IGroup addGroup(IGroup group) {
		getCacheSet().getFactionCache().getById(group.getFactionId());
		IGroupCache cache = getCacheSet().getGroupCache();
		if (!cache.add(group)) {
			throw new IllegalArgumentException("group already exists with id: " + group);
		}
		return group;
	}

	@Override
	public IGroup addParentGroup(String name, IFaction faction) {
		int groupId = getGroupCache().size();
		return addGroup(new Group(groupId, name, faction.getId(), -1));
	}

	protected IFaction addFaction(IFaction faction) {
		IFactionCache cache = getCacheSet().getFactionCache();
		if (!cache.add(faction)) {
			throw new IllegalArgumentException("faction already exists with id: " + faction);
		}
		return faction;
	}

	@Override
	public IFaction addFaction(String name, String password, FactionUnited united, int playerLimit) {
		int factionId = getFactionCache().size();
		return addFaction(new Faction(factionId, name, password, united, playerLimit));
	}

	protected IFaction addFaction(String name) {
		return addFaction(name, "", FactionUnited.DIVIDED, 0);
	}

	protected IUnit addUnit(IUnit unit) {
		getCacheSet().getGroupCache().getById(unit.getGroupId());
		getCacheSet().getFactionCache().getById(unit.getFactionId());
		IUnitCache cache = getCacheSet().getUnitCache();
		if (!cache.add(unit)) {
			throw new IllegalArgumentException("unit already exists with id: " + unit);
		}
		return unit;
	}

	protected IUnit addUnit(String name, UnitNode node, UnitType type, UnitMove move, int groupId, int factionId) {
		int id = getUnitCache().size();
		IUnit unit = new Unit(id, name, node, type, move, groupId, factionId);
		return addUnit(unit);
	}

	@Override
	public IUnit addUnit(String name, UnitNode node, UnitType type, UnitMove move, IGroup group, IFaction faction) {
		return addUnit(name, node, type, move, group.getId(), faction.getId());
	}

	protected IUnit addUnit(String name, UnitNode node, UnitType type) {
		return addUnit(name, node, type, UnitMove.NOT_MOVE, 0, 0);
	}

	protected IUnit addParentUnit(String name) {
		return addUnit(name, UnitNode.PARENT, UnitType.PLAYER);
	}

	protected IUnit addChildUnit(String name) {
		return addUnit(name, UnitNode.CHILD, UnitType.PLAYER);
	}
}
