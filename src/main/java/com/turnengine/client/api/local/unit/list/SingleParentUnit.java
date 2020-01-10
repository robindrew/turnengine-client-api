package com.turnengine.client.api.local.unit.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.UnitNode;

public class SingleParentUnit implements IParentUnit, Comparable<IParentUnit> {

	private final int unitId;
	private final Map<Integer, IChildUnit> unitIdToChildMap = new TreeMap<Integer, IChildUnit>();

	public SingleParentUnit(int unitId) {
		if (unitId < 0) {
			throw new IllegalArgumentException("unitId=" + unitId);
		}
		this.unitId = unitId;
	}

	public SingleParentUnit(IUnit unit) {
		this(unit.getId());
		if (!unit.getNode().equals(UnitNode.PARENT)) {
			throw new IllegalArgumentException("unit is not a parent: " + unit);
		}
	}

	protected SingleParentUnit(IParentUnit parent) {
		this.unitId = parent.getUnitId();

		// Deep Copy ...
		for (IChildUnit child : parent.getChildren()) {
			int id = child.getUnitId();
			unitIdToChildMap.put(id, new ChildUnit(child));
		}
	}

	@Override
	public long getAmount() {
		return 1;
	}

	@Override
	public int getUnitId() {
		return unitId;
	}

	@Override
	public int children() {
		return unitIdToChildMap.size();
	}

	@Override
	public boolean hasChildren() {
		return children() > 0;
	}

	@Override
	public IChildUnit getChild(int unitId) {
		return unitIdToChildMap.get(unitId);
	}

	@Override
	public long getChildAmount(int unitId) {
		IChildUnit unit = unitIdToChildMap.get(unitId);
		return unit == null ? 0 : unit.getAmount();
	}

	@Override
	public boolean containsChild(int unitId) {
		return getChildAmount(unitId) > 0;
	}

	@Override
	public Collection<IChildUnit> getChildren() {
		return unitIdToChildMap.values();
	}

	@Override
	public void setChildAmount(int unitId, long amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (amount == 0) {
			unitIdToChildMap.remove(unitId);
		} else {
			IChildUnit unit = new ChildUnit(unitId, amount);
			unitIdToChildMap.put(unitId, unit);
		}
	}

	@Override
	public void addChild(IChildUnit child) {
		int unitId = child.getUnitId();
		IChildUnit unit = unitIdToChildMap.get(unitId);
		if (unit == null) {
			unitIdToChildMap.put(unitId, child);
		} else {
			unit.addAmount(child.getAmount());
		}
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(unitId);
		builder.append(unitIdToChildMap);
		return builder.toString();
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof SingleParentUnit) {
			SingleParentUnit unit = (SingleParentUnit) object;
			EqualsBuilder equals = new EqualsBuilder();
			equals.append(this.unitId, unit.unitId);
			equals.append(this.unitIdToChildMap, unit.unitIdToChildMap);
			return equals.isEquals();
		}
		return false;
	}

	@Override
	public int compareTo(IParentUnit unit) {
		if (this.getUnitId() != unit.getUnitId()) {
			return this.getUnitId() < unit.getUnitId() ? -1 : 1;
		}
		return hasChildren() ? 1 : -1;
	}

	@Override
	public IChildUnit getChild(IUnit unit) {
		if (unit.getNode().equals(UnitNode.PARENT)) {
			throw new IllegalArgumentException("unit is not a child: " + unit);
		}
		return getChild(unit.getId());
	}

	@Override
	public long getChildAmount(IUnit unit) {
		if (unit.getNode().equals(UnitNode.PARENT)) {
			throw new IllegalArgumentException("unit is not a child: " + unit);
		}
		return getChildAmount(unit.getId());
	}

	@Override
	public boolean containsChild(IUnit unit) {
		if (unit.getNode().equals(UnitNode.PARENT)) {
			throw new IllegalArgumentException("unit is not a child: " + unit);
		}
		return containsChild(unit.getId());
	}

	@Override
	public void setChildAmount(IUnit unit, long amount) {
		if (unit.getNode().equals(UnitNode.PARENT)) {
			throw new IllegalArgumentException("unit is not a child: " + unit);
		}
		setChildAmount(unit.getId(), amount);
	}

	@Override
	public Iterator<IChildUnit> iterator() {
		return getChildren().iterator();
	}

	@Override
	public void addAmount(long amount) {
		throw new UnsupportedOperationException("parent is single");
	}

	@Override
	public void removeAmount(long amount) {
		throw new UnsupportedOperationException("parent is single");
	}

	@Override
	public void setAmount(long amount) {
		throw new UnsupportedOperationException("parent is single");
	}

	@Override
	public boolean canHaveChildren() {
		return true;
	}

}
