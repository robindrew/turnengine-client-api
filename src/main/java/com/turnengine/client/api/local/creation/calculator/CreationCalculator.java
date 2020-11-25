package com.turnengine.client.api.local.creation.calculator;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.turnengine.client.api.local.calculator.Calculator;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.calculator.condition.AddCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.AddFractionCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.AddPercentCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.AddRandomCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.ExistsCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.FinishMovementCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.IConditionCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.MaximumUpkeepCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.MinimumUpkeepCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.MinimumUpkeepRemoveCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.MoveRegionCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.NotExistsCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.OwnLocationCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.RemoveCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.RemoveFractionCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.SameLocationCalculator;
import com.turnengine.client.api.local.creation.calculator.condition.StartMovementCalculator;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;

public class CreationCalculator extends Calculator implements ICreationCalculator {

	private static final Logger log = LoggerFactory.getLogger(CreationCalculator.class);

	private final IConditionCalculator add;
	private final IConditionCalculator addRandom;
	private final IConditionCalculator addFraction;
	private final IConditionCalculator addPercent;
	private final IConditionCalculator remove;
	private final IConditionCalculator removeFraction;
	private final IConditionCalculator exists;
	private final IConditionCalculator notExists;
	private final IConditionCalculator minimumUpkeep;
	private final IConditionCalculator maximumUpkeep;
	private final IConditionCalculator ownLocation;
	private final IConditionCalculator sameLocation;
	private final IConditionCalculator minimumUpkeepRemove;
	private final IConditionCalculator moveRegion;
	private final IConditionCalculator startMovement;
	private final IConditionCalculator finishMovement;

	public CreationCalculator(IStaticCacheSet set) {
		super(set);
		this.add = new AddCalculator(set);
		this.addRandom = new AddRandomCalculator(set);
		this.addFraction = new AddFractionCalculator(set);
		this.addPercent = new AddPercentCalculator(set);
		this.remove = new RemoveCalculator(set);
		this.removeFraction = new RemoveFractionCalculator(set);
		this.exists = new ExistsCalculator(set);
		this.notExists = new NotExistsCalculator(set);
		this.minimumUpkeep = new MinimumUpkeepCalculator(set);
		this.maximumUpkeep = new MaximumUpkeepCalculator(set);
		this.ownLocation = new OwnLocationCalculator(set);
		this.sameLocation = new SameLocationCalculator(set);
		this.minimumUpkeepRemove = new MinimumUpkeepRemoveCalculator(set);
		this.moveRegion = new MoveRegionCalculator(set);
		this.startMovement = new StartMovementCalculator(set);
		this.finishMovement = new FinishMovementCalculator(set);
	}

	@Override
	public IConditionCalculator getCalculator(CreationConditionType type) {
		switch (type) {
			case REMOVE:
				return remove;
			case REMOVE_FRACTION:
				return removeFraction;
			case ADD:
				return add;
			case ADD_RANDOM:
				return addRandom;
			case ADD_FRACTION:
				return addFraction;
			case ADD_PERCENT:
				return addPercent;
			case EXISTS:
				return exists;
			case NOT_EXISTS:
				return notExists;
			case MINIMUM_UPKEEP:
				return minimumUpkeep;
			case MAXIMUM_UPKEEP:
				return maximumUpkeep;
			case SAME_LOCATION:
				return sameLocation;
			case OWN_LOCATION:
				return ownLocation;
			case MINIMUM_UPKEEP_REMOVE:
				return minimumUpkeepRemove;
			case MOVE_REGION:
				return moveRegion;
			case START_MOVEMENT:
				return startMovement;
			case FINISH_MOVEMENT:
				return finishMovement;
			default:
				throw new IllegalArgumentException("type not supported: " + type);
		}
	}

	@Override
	public long countCreation(ICreationData data, long limit) {
		List<? extends ICreationCondition> conditions = data.getConditions();
		if (conditions.isEmpty()) {
			if (limit < 1) {
				return Integer.MAX_VALUE;
			}
			return limit;
		}

		// Limit of zero is unlimited
		if (limit < 0) {
			throw new IllegalArgumentException("limit=" + limit);
		}

		// Count how many times the conditions can be satisfied
		long totalCount = -1;
		for (ICreationCondition condition : conditions) {
			IConditionCalculator calculator = getCalculator(condition.getConditionType());
			boolean optional = condition.getOptional();
			long count = calculator.count(condition, data, optional);
			if (count == 0) {
				return 0;
			}
			if (totalCount == -1 || totalCount > count) {
				totalCount = count;
			}
		}
		if (totalCount < 1) {
			return 0;
		}

		// Any limit? (0 = unlimited)
		if (totalCount > limit && limit > 0) {
			totalCount = limit;
		}
		if (totalCount == Long.MAX_VALUE) {
			log.warn("Reached Long.MAX_VALUE against conditions with no limit: " + conditions);
		}
		return totalCount;
	}

	@Override
	public void applyCreation(ICreationData data, long amount, boolean optional) {
		List<? extends ICreationCondition> conditions = data.getConditions();
		if (conditions.isEmpty()) {
			return;
		}
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}

		// When applying conditions, we expect no failures, that they already counted!
		// ICreationUnitListSet target = data.getUnitListSet();
		for (ICreationCondition condition : conditions) {
			IConditionCalculator calculator = getCalculator(condition.getConditionType());

			boolean applyOptional = optional || condition.getOptional();
			calculator.apply(condition, data, applyOptional, amount);
		}
	}

	@Override
	public void undoCreation(ICreationData data, long amount, boolean optional) {
		List<? extends ICreationCondition> conditions = data.getConditions();
		if (conditions.isEmpty()) {
			return;
		}
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}

		// Undo the conditions in reverse order ...
		conditions = Lists.reverse(conditions);

		// When applying conditions, we expect no failures, that they already counted!
		// ICreationUnitListSet target = data.getUnitListSet();
		for (ICreationCondition condition : conditions) {
			IConditionCalculator calculator = getCalculator(condition.getConditionType());

			boolean undoOptional = optional || condition.getOptional();
			calculator.undo(condition, data, undoOptional, amount);
		}
	}

}
