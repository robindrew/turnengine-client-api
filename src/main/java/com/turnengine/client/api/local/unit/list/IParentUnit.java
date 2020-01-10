package com.turnengine.client.api.local.unit.list;

import java.util.Collection;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitIdContainer;

/**
 * The I Parent Unit.
 */
public interface IParentUnit extends IUnitIdContainer, Iterable<IChildUnit> {

	int children();

	boolean hasChildren();

	boolean canHaveChildren();

	IChildUnit getChild(int unitId);

	IChildUnit getChild(IUnit unit);

	long getChildAmount(int unitId);

	long getChildAmount(IUnit unit);

	boolean containsChild(int unitId);

	boolean containsChild(IUnit unit);

	Collection<IChildUnit> getChildren();

	void setChildAmount(int unitId, long amount);

	void setChildAmount(IUnit unit, long amount);

	void addChild(IChildUnit child);

	long getAmount();

	void addAmount(long amount);

	void removeAmount(long amount);

	void setAmount(long amount);
}
