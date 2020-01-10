package com.turnengine.client.api.local.common.simple;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import com.turnengine.client.api.local.common.simple.link.ISimpleLinkSet;
import com.turnengine.client.api.local.common.simple.link.SimpleLink;
import com.turnengine.client.api.local.common.simple.link.SimpleLinkType;

public class SimpleMobile extends SimpleOwned implements Comparable<SimpleMobile> {

	@Attribute(required = false)
	private int moveTurns = 0;
	@Element(name = "Destination", required = false)
	private SimpleLink<SimpleLocation> destination = null;
	@Element(name = "Origin", required = false)
	private SimpleLink<SimpleLocation> origin = null;
	@ElementList(entry = "Unit", inline = true, required = false)
	private ArrayList<SimpleUnitCount> unitList = new ArrayList<SimpleUnitCount>();

	public void setMoveTurns(int turns) {
		this.moveTurns = turns;
	}

	public int getMovingTurns() {
		return moveTurns;
	}

	public SimpleLocation getDestination() {
		return SimpleLink.get(destination);
	}

	public SimpleLocation getOrigin() {
		return SimpleLink.get(origin);
	}

	public List<SimpleUnitCount> getUnitList() {
		return unitList;
	}

	public void setOrigin(SimpleLocation origin) {
		this.origin = new SimpleLink<SimpleLocation>(origin);
	}

	public void setDestination(SimpleLocation destination) {
		this.destination = new SimpleLink<SimpleLocation>(destination);
	}

	public void setUnitList(List<SimpleUnitCount> unitList) {
		this.unitList = new ArrayList<SimpleUnitCount>(unitList);
	}

	@Override
	public SimpleLinkType getType() {
		return SimpleLinkType.MOBILE;
	}

	@Override
	public void unlink(ISimpleLinkSet set) {
		super.unlink(set);
		set.unlink(origin);
		set.unlink(destination);
	}

	@Override
	public void link(ISimpleLinkSet set) {
		super.link(set);
		set.link(origin, SimpleLinkType.LOCATION);
		set.link(destination, SimpleLinkType.LOCATION);
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof SimpleMobile) {
			return getId() == ((SimpleMobile) object).getId();
		}
		return false;
	}

	@Override
	public int compareTo(SimpleMobile mobile) {
		return compareTo(this, mobile);
	}

}
