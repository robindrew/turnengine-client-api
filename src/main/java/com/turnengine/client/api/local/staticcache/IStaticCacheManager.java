package com.turnengine.client.api.local.staticcache;

import java.util.List;

import com.turnengine.client.api.local.action.ActionConditionExecute;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.action.IAction;
import com.turnengine.client.api.local.action.IActionCondition;
import com.turnengine.client.api.local.action.IActionTarget;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.faction.FactionUnited;
import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.group.IGroup;
import com.turnengine.client.api.local.storage.IStorageGroup;
import com.turnengine.client.api.local.storage.IStorageItem;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.UnitMove;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.upkeep.IUpkeep;
import com.turnengine.client.api.local.upkeep.IUpkeepCondition;

public interface IStaticCacheManager extends IStaticCacheSet {

	IFaction addFaction(String name, String password, FactionUnited united, int playerLimit);

	IGroup addParentGroup(String name, IFaction faction);

	IUnit addUnit(String name, UnitNode node, UnitType type, UnitMove move, IGroup group, IFaction faction);

	void addStorageGroup(IUnit parent, IGroup group, long capacity, StorageType type);

	void addStorageItem(IUnit parent, IGroup group, IUnit unit, long size, long limit);

	List<IStorageGroup> getStorageGroups();

	List<IStorageItem> getStorageItems();

	IAction addAction(IUnit unit, int turns, int limit);

	void addActionTarget(IUnit unit, ActionTargetType target, UnitType type, UnitRelation relation);

	void addActionCondition(IUnit unit, ActionTargetType target, ActionConditionExecute execute, CreationConditionType type);

	void addActionCondition(IUnit unit, ActionTargetType target, ActionConditionExecute execute, CreationConditionType type, IUnit condition, long amount);

	void addActionCondition(IUnit unit, ActionTargetType target, ActionConditionExecute execute, CreationConditionType type, IUnit condition1, long amount1, IUnit condition2, long amount2);

	List<IAction> getActionList();

	List<IActionTarget> getActionTargetList();

	List<IActionCondition> getActionConditionList();

	IUpkeep addUpkeep(IUnit unit, long limit);

	void addUpkeepCondition(IUnit unit, CreationConditionType type, IUnit condition, long amount, boolean optional);

	void addUpkeepCondition(IUnit unit, CreationConditionType type, IUnit condition1, long amount1, IUnit condition2, long amount2, boolean optional);

	void addUpkeepCondition(IUnit unit, CreationConditionType type, IUnit condition1, long amount1, IUnit condition2, long amount2, IUnit condition3, long amount3, boolean optional);

	List<IUpkeep> getUpkeepList();

	List<IUpkeepCondition> getUpkeepConditionList();

}
