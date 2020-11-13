package com.turnengine.client.api.local.unit.list.count;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.List;

import com.turnengine.client.api.local.storage.calculator.IStorageCalculator;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;

public class UnitCountListRepairer implements IUnitCountListRepairer {

	public static UnitCountListRepairer getInstance() {
		IUnitCache cache = getDependency(IUnitCache.class);
		IStorageCalculator calculator = getDependency(IStorageCalculator.class);
		return new UnitCountListRepairer(cache, calculator);
	}

	private final IUnitCountListSplitter splitter;
	private final IUnitListAdaptor adaptor;
	private final IUnitListRepairer repairer;

	public UnitCountListRepairer(IUnitCache cache, IStorageCalculator calculator) {
		this.adaptor = new UnitListAdapter(cache);
		this.splitter = new UnitCountListSplitter(cache);
		this.repairer = new UnitListRepairer(cache, calculator);
	}

	public IUnitCountListSplitter getSplitter() {
		return splitter;
	}

	@Override
	public List<IUnitCount> repair(List<IUnitCount> countList, UnitType type) {

		// Split
		countList = new UnitCountListSplitter().splitList(countList, type);

		// Repair
		IUnitList unitList = repairer.repairList(countList, type);

		// Adapt
		return adaptor.adapt(unitList);
	}

	@Override
	public void verify(List<IUnitCount> list) {
		repair(list, UnitType.PLAYER);
		repair(list, UnitType.LOCATION);
		repair(list, UnitType.MOBILE);
	}

}
