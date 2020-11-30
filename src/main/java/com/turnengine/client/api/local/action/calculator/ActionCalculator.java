package com.turnengine.client.api.local.action.calculator;

import static com.turnengine.client.api.local.action.ActionConditionExecute.FINISH;
import static com.turnengine.client.api.local.action.ActionConditionExecute.START;
import static com.turnengine.client.api.local.action.ActionTargetType.SOURCE;
import static com.turnengine.client.api.local.action.ActionTargetType.TARGET;

import java.util.List;

import com.turnengine.client.api.local.action.ActionConditionExecute;
import com.turnengine.client.api.local.action.ActionStatus;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.action.IActionStatus;
import com.turnengine.client.api.local.action.data.ActionCreationData;
import com.turnengine.client.api.local.action.data.IActionData;
import com.turnengine.client.api.local.action.plugin.IActionPlugin;
import com.turnengine.client.api.local.action.plugin.IActionPluginManager;
import com.turnengine.client.api.local.calculator.Calculator;
import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.calculator.CreationCalculator;
import com.turnengine.client.api.local.creation.calculator.ICreationCalculator;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.calculator.IStorageCalculator;
import com.turnengine.client.api.local.storage.calculator.StorageCalculator;

public class ActionCalculator extends Calculator implements IActionCalculator {

	private final IActionPluginManager plugins;
	private final IStorageCalculator storage;
	private final ICreationCalculator creation;
	private final TargetValidator validator = new TargetValidator();

	public ActionCalculator(IStaticCacheSet set, IActionPluginManager plugins) {
		super(set);
		if (plugins == null) {
			throw new NullPointerException("plugins");
		}
		this.plugins = plugins;
		this.storage = new StorageCalculator(set);
		this.creation = new CreationCalculator(set);
	}

	public IActionPluginManager getPlugins() {
		return plugins;
	}

	public IStorageCalculator getStorage() {
		return storage;
	}

	public ICreationCalculator getCreation() {
		return creation;
	}

	public TargetValidator getValidator() {
		return validator;
	}

	@Override
	public long countActions(IActionData action) {

		// We cannot count actions if target not set
		if (action.hasTarget() && !action.hasTargetSet()) {
			return 0;
		}

		// Validate targets
		if (!validator.validateTargets(action)) {
			return 0;
		}

		// Limit
		int limit = action.getDefinition().getAction().getLimit();

		// Calculate amount from source
		ICreationData source = getData(SOURCE, START, action);
		long amount = creation.countCreation(source, limit);
		if (amount == 0) {
			return 0;
		}

		// If there is a target, calculate amount from target and filter
		if (action.hasTarget()) {
			ICreationData target = getData(TARGET, START, action);
			long targetAmount = creation.countCreation(target, limit);
			if (amount > targetAmount) {
				amount = targetAmount;
			}
		}
		return amount;
	}

	@Override
	public IActionStatus startAction(IActionData action) {
		long amount = action.getAmount();
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}

		// Validate targets
		validator.validateTargets(action);

		// Lookup the plugin
		IActionPlugin plugin = plugins.getPlugin(action.getAction());

		// Execute at source
		ICreationData source = getData(SOURCE, START, action);
		creation.applyCreation(source, action.getAmount(), false);

		// Execute at target
		if (action.hasTarget()) {
			ICreationData target = getData(TARGET, START, action);
			creation.applyCreation(target, action.getAmount(), false);
		}

		// Run the plugin (after creation)
		if (plugin != null) {
			return plugin.startAction(action);
		}

		ActionStatus status = new ActionStatus();
		status.setAmount(amount);
		return status;
	}

	@Override
	public void finishAction(IActionData action) {
		long amount = action.getAmount();
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}

		// Validate targets
		validator.validateTargets(action);

		// Lookup the plugin
		IActionPlugin plugin = plugins.getPlugin(action.getAction());

		// Execute at source
		ICreationData source = getData(SOURCE, FINISH, action);
		creation.applyCreation(source, action.getAmount(), true);

		// Execute at target
		if (action.hasTarget()) {
			ICreationData target = getData(TARGET, FINISH, action);
			creation.applyCreation(target, action.getAmount(), true);
		}

		// Run the plugin (after creation)
		if (plugin != null) {
			plugin.finishAction(action);
		}
	}

	@Override
	public void cancelAction(IActionData action) {
		long amount = action.getAmount();
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}

		// Validate targets
		validator.validateTargets(action);

		// Lookup the plugin
		IActionPlugin plugin = plugins.getPlugin(action.getAction());

		// Execute at source
		ICreationData source = getData(SOURCE, START, action);
		creation.undoCreation(source, action.getAmount(), true);

		// Execute at target
		if (action.hasTarget()) {
			ICreationData target = getData(TARGET, START, action);
			creation.undoCreation(target, action.getAmount(), true);
		}

		// Run the plugin (after creation)
		if (plugin != null) {
			plugin.cancelAction(action);
		}
	}

	public ICreationData getData(ActionTargetType type, ActionConditionExecute execute, IActionData action) {

		ICreationTargetData sourceData = action.getTargetData(SOURCE);
		ICreationTargetData targetData = action.getTargetData(TARGET);
		ICreationTargetData data = type.equals(SOURCE) ? sourceData : targetData;

		List<? extends ICreationCondition> conditions = action.getDefinition().getConditions(type, execute);
		return new ActionCreationData(action.getPlayerId(), action.getDefinition(), action.getAmount(), data, sourceData, targetData, conditions, action.isTurnUpdating());
	}

}
