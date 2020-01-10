package com.turnengine.client.api.local.action.calculator;

import static com.turnengine.client.api.local.action.ActionConditionExecute.FINISH;
import static com.turnengine.client.api.local.action.ActionConditionExecute.START;
import static com.turnengine.client.api.local.action.ActionTargetType.SOURCE;
import static com.turnengine.client.api.local.action.ActionTargetType.TARGET;

import com.turnengine.client.api.local.action.ActionStatus;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.action.IActionDefinition;
import com.turnengine.client.api.local.action.IActionStatus;
import com.turnengine.client.api.local.action.data.IActionData;
import com.turnengine.client.api.local.action.plugin.IActionPlugin;
import com.turnengine.client.api.local.action.plugin.IActionPluginManager;
import com.turnengine.client.api.local.calculator.Calculator;
import com.turnengine.client.api.local.creation.calculator.CreationCalculator;
import com.turnengine.client.api.local.creation.calculator.ICreationCalculator;
import com.turnengine.client.api.local.creation.data.ICreationData;
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

		// Calculate amount from source
		long amount = countConditions(SOURCE, action);
		if (amount == 0) {
			return 0;
		}

		// If there is a target, calculate amount from target and filter
		if (action.hasTarget()) {
			long targetAmount = countConditions(TARGET, action);
			if (amount > targetAmount) {
				amount = targetAmount;
			}
		}
		return amount;
	}

	private long countConditions(ActionTargetType type, IActionData action) {
		// ICreationUnitListSet target = action.getTarget(type);

		// Get starting conditions, unless the action is instant
		IActionDefinition definition = action.getDefinition();
		// final List<IActionCondition> conditions;
		// if (definition.isInstant()) {
		// conditions = definition.getConditions(type);
		// } else {
		// conditions = definition.getConditions(type, START);
		// }

		// IUnitListSet listSet = target.getListSet();
		int limit = definition.getAction().getLimit();

		ICreationData data = action.toCreation(type, START);
		return creation.countCreation(data, limit);
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
		ICreationData data = action.toCreation(SOURCE, START);
		creation.applyCreation(data, action.getAmount(), false);

		// Execute at target
		if (action.hasTarget()) {
			data = action.toCreation(TARGET, START);
			creation.applyCreation(data, action.getAmount(), false);
		}

		// Run the plugin (after creation)
		if (plugin != null) {
			return plugin.startAction(action);
		}
		return new ActionStatus(amount, null, null);
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
		ICreationData data = action.toCreation(SOURCE, FINISH);
		creation.applyCreation(data, action.getAmount(), true);

		// Execute at target
		if (action.hasTarget()) {
			data = action.toCreation(TARGET, FINISH);
			creation.applyCreation(data, action.getAmount(), true);
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
		ICreationData data = action.toCreation(SOURCE, START);
		creation.undoCreation(data, action.getAmount(), true);

		// Execute at target
		if (action.hasTarget()) {
			data = action.toCreation(TARGET, START);
			creation.undoCreation(data, action.getAmount(), true);
		}

		// Run the plugin (after creation)
		if (plugin != null) {
			plugin.cancelAction(action);
		}
	}

}
