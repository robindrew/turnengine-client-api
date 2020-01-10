package com.turnengine.client.api.local.unit.list;

import com.turnengine.client.api.local.unit.IUnitIdContainer;

/**
 * The I Child Unit.
 */
public interface IChildUnit extends IUnitIdContainer {

	long getAmount();

	void addAmount(long amount);

	void removeAmount(long amount);

	void setAmount(long amount);
}
