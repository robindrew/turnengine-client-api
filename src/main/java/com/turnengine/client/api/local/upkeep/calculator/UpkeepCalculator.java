package com.turnengine.client.api.local.upkeep.calculator;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.turnengine.client.api.local.calculator.Calculator;
import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.calculator.CreationCalculator;
import com.turnengine.client.api.local.creation.calculator.ICreationCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.IConditionCalculator;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.count.UnitCountList;
import com.turnengine.client.api.local.upkeep.IUpkeepDefinition;
import com.turnengine.client.api.local.upkeep.data.IUpkeepData;

public class UpkeepCalculator extends Calculator implements IUpkeepCalculator {

	private static final Logger log = LoggerFactory.getLogger(UpkeepCalculator.class);

	private final ICreationCalculator creation;

	public UpkeepCalculator(IStaticCacheSet set) {
		super(set);
		this.creation = new CreationCalculator(set);
	}

	@Override
	public void applyUpkeep(IUpkeepData set) {
		IUnitList unitList = set.getUpkeepUnitList();

		// Upkeep is applied by each unit type in order
		IUnitCache units = getCacheSet().getUnitCache();
		List<IUpkeepDefinition> definitions = getCacheSet().getUpkeepCache().getDefinitions();
		for (IUpkeepDefinition definition : definitions) {
			int unitId = definition.getUpkeep().getId();
			IUnit unit = units.getById(unitId);

			// Any units to apply upkeep to?
			long amount = unitList.getAmount(unit);
			if (amount < 1) {
				continue;
			}

			// Any limit on the upkeep?
			long limit = definition.getUpkeep().getLimit();
			if (amount > limit && limit > 0) {
				amount = limit;
			}

			log.debug("Applying upkeep for {}", unit.getName());

			ICreationData data = set.toCreation(definition, amount);
			applyUpkeep(data);
		}
	}

	private void applyUpkeep(ICreationData data) {

		// First count how many can be applied
		long amountToApply = creation.countCreation(data, data.getAmount());
		if (amountToApply < 1) {
			return;
		}

		// Second actually apply upkeep (not optional, we just counted!)
		creation.applyCreation(data, amountToApply, false);
	}

	@Override
	public IUnitCountList getOutput(IUpkeepData set, boolean allowNegativeAmounts) {
		IUnitCountList output = new UnitCountList();
		IUnitList unitList = set.getUpkeepUnitList();

		// Upkeep is applied by each unit type in order
		IUnitCache units = getCacheSet().getUnitCache();
		List<IUpkeepDefinition> definitions = getCacheSet().getUpkeepCache().getDefinitions();
		for (IUpkeepDefinition definition : definitions) {
			int unitId = definition.getUpkeep().getId();
			IUnit unit = units.getById(unitId);

			// Any units to apply upkeep to?
			long amount = unitList.getAmount(unit);
			if (amount < 1) {
				continue;
			}

			// Any limit on the upkeep?
			long limit = definition.getUpkeep().getLimit();
			if (amount > limit && limit > 0) {
				amount = limit;
			}

			ICreationData data = set.toCreation(definition, amount);
			getOutput(data, output);
		}

		// TODO: Remove this once fixed
		for (IUnitCount count : output) {
			if (count.getAmount() < 0 && !allowNegativeAmounts) {
				// IUnitCache cache = getDependency(IUnitCache.class);
				// IUnit unit = cache.getById(count.getId());
				count.setAmount(0);
			}
		}
		return output;
	}

	private void getOutput(ICreationData data, IUnitCountList output) {
		List<? extends ICreationCondition> conditions = data.getConditions();
		long amountToApply = creation.countCreation(data, data.getAmount());
		if (amountToApply < 1) {
			return;
		}

		for (ICreationCondition condition : conditions) {
			IConditionCalculator calculator = creation.getCalculator(condition.getConditionType());
			calculator.getOutput(condition, data, amountToApply, output);
		}
	}

	@Override
	public IUnitCountList getOutput(IUpkeepData set) {
		return getOutput(set, false);
	}

}
