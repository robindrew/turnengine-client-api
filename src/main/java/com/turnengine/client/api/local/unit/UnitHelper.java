package com.turnengine.client.api.local.unit;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import com.robindrew.common.text.ILineBuilder;
import com.robindrew.common.text.LineBuilder;
import com.turnengine.client.api.local.unit.list.IChildUnit;
import com.turnengine.client.api.local.unit.list.IParentUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;

public class UnitHelper {

	public static String getUnitName(int unitId) {
		IUnitCache cache = getDependency(IUnitCache.class);
		return cache.getById(unitId).getName();
	}

	public static String getUnitName(IUnitIdContainer container) {
		return getUnitName(container.getUnitId());
	}

	public static String toString(IUnitCountList list) {
		ILineBuilder text = new LineBuilder();
		text.append("Units[");
		for (IUnitCount count : list) {
			text.separator(", ");
			text.append(count.getAmount()).append(' ').append(getUnitName(count.getId()));
		}
		text.append(']');
		return text.toString();
	}

	public static String toString(IUnitList list) {
		ILineBuilder text = new LineBuilder();
		text.append(getListName(list)).append('[');
		for (IParentUnit parent : list) {
			text.separator(", ");
			text.append(parent.getAmount()).append(' ').append(getUnitName(parent));
			for (IChildUnit child : parent) {
				text.separator(", ");
				text.append(child.getAmount()).append(' ').append(getUnitName(child));
			}
		}
		text.append(']');
		return text.toString();
	}

	private static String getListName(IUnitList list) {
		UnitType type = list.getUnitType();
		switch (type) {
			case LOCATION:
				return "LocationUnits";
			case MOBILE:
				return "MobileUnits";
			case PLAYER:
				return "PlayerUnits";
			default:
				throw new IllegalStateException("Type not supported: " + type);
		}
	}

}
