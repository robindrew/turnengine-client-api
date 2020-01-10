package com.turnengine.client.api.local.upkeep;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.turnengine.client.api.local.unit.IUnitIdContainer;

public class UpkeepDefinition implements IUpkeepDefinition, IUnitIdContainer {

	private final IUpkeep upkeep;
	private final List<IUpkeepCondition> conditionList = new CopyOnWriteArrayList<IUpkeepCondition>();

	public UpkeepDefinition(IUpkeep upkeep) {
		this.upkeep = upkeep;
	}

	@Override
	public int getUnitId() {
		return getUpkeep().getId();
	}

	@Override
	public IUpkeep getUpkeep() {
		return upkeep;
	}

	@Override
	public List<IUpkeepCondition> getConditions() {
		return conditionList;
	}

	@Override
	public void addCondition(IUpkeepCondition condition) {
		if (condition.getId() != getUpkeep().getId()) {
			throw new IllegalArgumentException("condition=" + condition + ", upkeep=" + getUpkeep());
		}
		conditionList.add(condition);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
