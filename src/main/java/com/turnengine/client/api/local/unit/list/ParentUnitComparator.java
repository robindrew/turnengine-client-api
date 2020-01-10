package com.turnengine.client.api.local.unit.list;

import java.util.Comparator;

public class ParentUnitComparator implements Comparator<IParentUnit> {

	@Override
	public int compare(IParentUnit parent1, IParentUnit parent2) {
		if (parent1 == parent2) {
			return 0;
		}

		// Check unit id first
		int unitId1 = parent1.getUnitId();
		int unitId2 = parent2.getUnitId();
		if (unitId1 != unitId2) {
			return (unitId1 < unitId2 ? -1 : (unitId1 == unitId2 ? 0 : 1));
		}

		// Any children?
		if (parent1.hasChildren()) {
			return 1;
		} else {
			return -1;
		}
	}

}
