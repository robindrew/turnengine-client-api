package com.turnengine.client.api.local.storage2.unit;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitIdContainer;

public interface IStorageUnit extends IUnitIdContainer, Iterable<IStorageUnit>, Comparable<IStorageUnit> {

	boolean hasChildren();

	List<IStorageUnit> getChildList();

	void addChild(IStorageUnit child);

	void removeChild(IStorageUnit child);

	long getAmount();

	void setAmount(long amount);

	void addAmount(long amount);

	void removeAmount(int amount);

	IStorageUnit copy();

}
