package com.turnengine.client.api.local.unit.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.UnitType;

public class UnitList implements IUnitList {

	private final UnitType type;
	private final List<IParentUnit> parentList;

	public UnitList(UnitType type) {
		if (type == null) {
			throw new NullPointerException("type");
		}
		this.type = type;

		// Default list is linked to optimally support iterative removal
		this.parentList = new LinkedList<IParentUnit>();
	}

	public UnitList(IUnitList list) {
		this.type = list.getUnitType();
		this.parentList = new LinkedList<IParentUnit>();

		// Deep Copy ...
		for (IParentUnit parent : list) {
			this.parentList.add(copy(parent));
		}
	}

	private IParentUnit copy(IParentUnit parent) {
		if (parent instanceof SingleParentUnit) {
			return new SingleParentUnit(parent);
		} else {
			return new ChildlessParentUnit(parent);
		}
	}

	@Override
	public UnitType getUnitType() {
		return type;
	}

	@Override
	public boolean isEmpty() {
		return parentList.isEmpty();
	}

	@Override
	public void clear() {
		parentList.clear();
	}

	@Override
	public int parents() {
		return parentList.size();
	}

	@Override
	public void addParent(IParentUnit parent) {
		if (parent == null) {
			throw new NullPointerException("parent");
		}
		parentList.add(parent);
	}

	@Override
	public IParentUnit getParentAtIndex(int index) {
		return parentList.get(index);
	}

	@Override
	public boolean containsParent(int unitId) {
		for (IParentUnit parent : parentList) {
			if (parent.getUnitId() == unitId) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsChild(int unitId) {
		for (IParentUnit parent : parentList) {
			if (parent.containsChild(unitId)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void addParentAmount(int unitId, long amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (amount == 0) {
			return;
		}
		for (IParentUnit parent : parentList) {
			if (parent.getUnitId() == unitId && !parent.canHaveChildren()) {
				parent.addAmount(amount);
				return;
			}
		}
		IParentUnit parent = new ChildlessParentUnit(unitId, amount);
		parentList.add(parent);
	}

	@Override
	public int getParentAmount(int unitId) {
		int amount = 0;
		for (IParentUnit parent : parentList) {
			if (parent.getUnitId() == unitId) {
				amount += parent.getAmount();
			}
		}
		return amount;
	}

	@Override
	public long getChildAmount(int unitId) {
		long amount = 0;
		for (IParentUnit parent : parentList) {
			amount += parent.getChildAmount(unitId);
		}
		return amount;
	}

	@Override
	public List<IParentUnit> getParents() {
		return parentList;
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(type);
		builder.append(parentList);
		return builder.toString();
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof UnitList) {
			UnitList list = (UnitList) object;
			EqualsBuilder equals = new EqualsBuilder();
			equals.append(this.type, list.type);
			equals.append(this.parentList, list.parentList);
			return equals.isEquals();
		}
		return false;
	}

	@Override
	public Iterator<IParentUnit> iterator() {
		// Iterator is raw so we can remove by iteration ...
		return parentList.iterator();
	}

	@Override
	public void removeParentAtIndex(int index) {
		parentList.remove(index);
	}

	@Override
	public void addParentAmount(IUnit unit, long amount) {
		addParentAmount(unit.getId(), amount);
	}

	@Override
	public int getParentAmount(IUnit unit) {
		return getParentAmount(unit.getId());
	}

	@Override
	public long getChildAmount(IUnit unit) {
		return getChildAmount(unit.getId());
	}

	@Override
	public boolean containsParent(IUnit unit) {
		return containsParent(unit.getId());
	}

	@Override
	public boolean containsChild(IUnit unit) {
		return containsChild(unit.getId());
	}

	@Override
	public boolean contains(IUnit unit) {
		if (unit.getNode().equals(UnitNode.PARENT)) {
			return containsParent(unit);
		} else {
			return containsChild(unit);
		}
	}

	@Override
	public long getAmount(IUnit unit) {
		if (unit.getNode().equals(UnitNode.PARENT)) {
			return getParentAmount(unit);
		} else {
			return getChildAmount(unit);
		}
	}

	@Override
	public void addAll(IUnitList list) {
		for (IParentUnit parent : list) {
			addParent(parent);
		}
	}

	@Override
	public void addAll(List<IParentUnit> list) {
		for (IParentUnit parent : list) {
			addParent(parent);
		}
	}

}
