package com.turnengine.client.api.local.common.simple;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import com.turnengine.client.api.local.common.simple.link.ISimpleLinkSet;
import com.turnengine.client.api.local.common.simple.link.SimpleLinkType;

public class SimpleLocation extends SimpleOwned implements Comparable<SimpleLocation> {

	@Attribute(required = false)
	private int[] coordinates = null;
	@ElementList(entry = "Unit", inline = true, required = false)
	private ArrayList<SimpleUnitCount> unitList = new ArrayList<SimpleUnitCount>();

	public int[] getCoordinates() {
		if (coordinates == null) {
			return new int[0];
		}
		return coordinates;
	}

	public void setCoordinates(int[] coordinates) {
		if (coordinates != null && coordinates.length == 0) {
			coordinates = null;
		}
		this.coordinates = coordinates;
	}

	public List<SimpleUnitCount> getUnitList() {
		return unitList;
	}

	public void setUnitList(List<SimpleUnitCount> unitList) {
		this.unitList = new ArrayList<SimpleUnitCount>(unitList);
	}

	@Override
	public SimpleLinkType getType() {
		return SimpleLinkType.LOCATION;
	}

	@Override
	public void unlink(ISimpleLinkSet set) {
		super.unlink(set);
	}

	@Override
	public void link(ISimpleLinkSet set) {
		super.link(set);
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof SimpleLocation) {
			return getId() == ((SimpleLocation) object).getId();
		}
		return false;
	}

	@Override
	public int compareTo(SimpleLocation location) {
		return compareTo(this, location);
	}

}
