package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import java.util.List;

public interface ILocalActionExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	IAction addAction(long loginId, int instanceId, String name, int turns, int limit);

	IActionTarget addActionTarget(long loginId, int instanceId, String name, ActionTargetType target, UnitType type, UnitRelation relation);

	IActionCondition addActionCondition(long loginId, int instanceId, String name, ActionTargetType target, ActionConditionExecute execute, CreationConditionType condition, String conditionName1, long conditionAmount1, String conditionName2, long conditionAmount2, String conditionName3, long conditionAmount3, boolean optional);

	List<IAction> getActionList(long loginId, int instanceId);

	List<IActionTarget> getActionTargetList(long loginId, int instanceId);

	List<IActionCondition> getActionConditionList(long loginId, int instanceId);

	IActionStatus startActionAtPlayer(long loginId, int instanceId, int actionId, long amount, boolean addToQueue);

	Boolean clearActionQueuedAtPlayer(long loginId, int instanceId, int index);

	IActionStatus startActionAtLocation(long loginId, int instanceId, int locationId, int actionId, long amount, boolean addToQueue);

	Boolean clearActionQueuedAtLocation(long loginId, int instanceId, int locationId, int index);

	List<IActionAvailable> listActionsAvailableAtLocation(long loginId, int instanceId, int locationId);

	List<IActionAvailable> listActionsAvailableAtPlayer(long loginId, int instanceId);

	List<IActionExecuting> listActionsExecutingAtLocation(long loginId, int instanceId, int locationId);

	List<IActionExecuting> listActionsExecutingAtPlayer(long loginId, int instanceId);

	List<IActionQueued> listActionsQueuedAtLocation(long loginId, int instanceId, int locationId);

	List<IActionQueued> listActionsQueuedAtPlayer(long loginId, int instanceId);

	Boolean clearActionsQueuedAtLocation(long loginId, int instanceId, int locationId, int groupId);

	Boolean clearActionsQueuedAtPlayer(long loginId, int instanceId, int groupId);

	IActionStatus startActionAtMobileToLocation(long loginId, int instanceId, int mobileId, int locationId, int actionId, long amount, boolean addToQueue);

	List<IActionAvailable> listActionsAvailableAtMobile(long loginId, int instanceId, int mobileId);

	Boolean addActionPlugin(long loginId, int instanceId, String name, String pluginName, String plugin);

	IActionStatus startActionAtLocationToLocation(long loginId, int instanceId, int fromLocationId, int toLocationId, int actionId, long amount, boolean addToQueue);

	IPluginDetails getActionPlugin(long loginId, int instanceId, int id);

	Boolean cancelActionAtPlayer(long loginId, int instanceId, int actionId, long amount);

	Boolean cancelActionAtLocation(long loginId, int instanceId, int locationId, int actionId, long amount);
}
