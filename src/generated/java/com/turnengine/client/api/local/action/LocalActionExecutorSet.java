package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.common.plugin.IPluginDetails;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import java.util.List;

public class LocalActionExecutorSet implements ILocalActionExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalActionExecutorSet(IBeanExecutorLocator locator) {
		if (locator == null) {
			throw new NullPointerException("locator");
		}
		this.locator = locator;
	}

	/**
	 * Getter for the locator field.
	 * @return the value of the locator field.
	 */
	public IBeanExecutorLocator getLocator() {
		return locator;
	}

	@Override
	public IAction addAction(long loginId, int instanceId, String name, int turns, int limit) {
		AddAction bean = new AddAction(loginId, instanceId, name, turns, limit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IActionTarget addActionTarget(long loginId, int instanceId, String name, ActionTargetType target, UnitType type, UnitRelation relation) {
		AddActionTarget bean = new AddActionTarget(loginId, instanceId, name, target, type, relation);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IActionCondition addActionCondition(long loginId, int instanceId, String name, ActionTargetType target, ActionConditionExecute execute, CreationConditionType condition, String conditionName1, long conditionAmount1, String conditionName2, long conditionAmount2, String conditionName3, long conditionAmount3, boolean optional) {
		AddActionCondition bean = new AddActionCondition(loginId, instanceId, name, target, execute, condition, conditionName1, conditionAmount1, conditionName2, conditionAmount2, conditionName3, conditionAmount3, optional);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IAction> getActionList(long loginId, int instanceId) {
		GetActionList bean = new GetActionList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionTarget> getActionTargetList(long loginId, int instanceId) {
		GetActionTargetList bean = new GetActionTargetList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionCondition> getActionConditionList(long loginId, int instanceId) {
		GetActionConditionList bean = new GetActionConditionList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IActionStatus startActionAtPlayer(long loginId, int instanceId, int actionId, long amount, boolean addToQueue) {
		StartActionAtPlayer bean = new StartActionAtPlayer(loginId, instanceId, actionId, amount, addToQueue);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean clearActionQueuedAtPlayer(long loginId, int instanceId, int index) {
		ClearActionQueuedAtPlayer bean = new ClearActionQueuedAtPlayer(loginId, instanceId, index);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IActionStatus startActionAtLocation(long loginId, int instanceId, int locationId, int actionId, long amount, boolean addToQueue) {
		StartActionAtLocation bean = new StartActionAtLocation(loginId, instanceId, locationId, actionId, amount, addToQueue);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean clearActionQueuedAtLocation(long loginId, int instanceId, int locationId, int index) {
		ClearActionQueuedAtLocation bean = new ClearActionQueuedAtLocation(loginId, instanceId, locationId, index);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionAvailable> listActionsAvailableAtLocation(long loginId, int instanceId, int locationId) {
		ListActionsAvailableAtLocation bean = new ListActionsAvailableAtLocation(loginId, instanceId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionAvailable> listActionsAvailableAtPlayer(long loginId, int instanceId) {
		ListActionsAvailableAtPlayer bean = new ListActionsAvailableAtPlayer(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionExecuting> listActionsExecutingAtLocation(long loginId, int instanceId, int locationId) {
		ListActionsExecutingAtLocation bean = new ListActionsExecutingAtLocation(loginId, instanceId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionExecuting> listActionsExecutingAtPlayer(long loginId, int instanceId) {
		ListActionsExecutingAtPlayer bean = new ListActionsExecutingAtPlayer(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionQueued> listActionsQueuedAtLocation(long loginId, int instanceId, int locationId) {
		ListActionsQueuedAtLocation bean = new ListActionsQueuedAtLocation(loginId, instanceId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionQueued> listActionsQueuedAtPlayer(long loginId, int instanceId) {
		ListActionsQueuedAtPlayer bean = new ListActionsQueuedAtPlayer(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean clearActionsQueuedAtLocation(long loginId, int instanceId, int locationId, int groupId) {
		ClearActionsQueuedAtLocation bean = new ClearActionsQueuedAtLocation(loginId, instanceId, locationId, groupId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean clearActionsQueuedAtPlayer(long loginId, int instanceId, int groupId) {
		ClearActionsQueuedAtPlayer bean = new ClearActionsQueuedAtPlayer(loginId, instanceId, groupId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IActionStatus startActionAtMobileToLocation(long loginId, int instanceId, int mobileId, int locationId, int actionId, long amount, boolean addToQueue) {
		StartActionAtMobileToLocation bean = new StartActionAtMobileToLocation(loginId, instanceId, mobileId, locationId, actionId, amount, addToQueue);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionAvailable> listActionsAvailableAtMobile(long loginId, int instanceId, int mobileId) {
		ListActionsAvailableAtMobile bean = new ListActionsAvailableAtMobile(loginId, instanceId, mobileId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean addActionPlugin(long loginId, int instanceId, String name, String pluginName, String plugin) {
		AddActionPlugin bean = new AddActionPlugin(loginId, instanceId, name, pluginName, plugin);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IActionStatus startActionAtLocationToLocation(long loginId, int instanceId, int fromLocationId, int toLocationId, int actionId, long amount, boolean addToQueue) {
		StartActionAtLocationToLocation bean = new StartActionAtLocationToLocation(loginId, instanceId, fromLocationId, toLocationId, actionId, amount, addToQueue);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IPluginDetails getActionPlugin(long loginId, int instanceId, int id) {
		GetActionPlugin bean = new GetActionPlugin(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean cancelActionAtPlayer(long loginId, int instanceId, int actionId, long amount) {
		CancelActionAtPlayer bean = new CancelActionAtPlayer(loginId, instanceId, actionId, amount);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean cancelActionAtLocation(long loginId, int instanceId, int locationId, int actionId, long amount) {
		CancelActionAtLocation bean = new CancelActionAtLocation(loginId, instanceId, locationId, actionId, amount);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean addMoveRegion(long loginId, int instanceId, String name, int from, int to) {
		AddMoveRegion bean = new AddMoveRegion(loginId, instanceId, name, from, to);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IActionStatus startActionMovement(long loginId, int instanceId, int mobileId, int locationId, boolean addToQueue) {
		StartActionMovement bean = new StartActionMovement(loginId, instanceId, mobileId, locationId, addToQueue);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IActionQueued> listActionsQueuedAtMobile(long loginId, int instanceId, int mobileId) {
		ListActionsQueuedAtMobile bean = new ListActionsQueuedAtMobile(loginId, instanceId, mobileId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
