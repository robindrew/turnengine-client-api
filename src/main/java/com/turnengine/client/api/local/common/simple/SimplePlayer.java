package com.turnengine.client.api.local.common.simple;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import com.turnengine.client.api.local.common.simple.link.ISimpleLinkSet;
import com.turnengine.client.api.local.common.simple.link.SimpleLink;
import com.turnengine.client.api.local.common.simple.link.SimpleLinkType;

public class SimplePlayer extends SimpleTyped implements Comparable<SimplePlayer> {

	@Element(name = "Alliance", required = false)
	private SimpleLink<SimpleAlliance> alliance = null;
	@ElementList(entry = "Unit", inline = true, required = false)
	private ArrayList<SimpleUnitCount> unitList = new ArrayList<SimpleUnitCount>();

	public SimpleAlliance getAlliance() {
		return SimpleLink.get(alliance);
	}

	public void setAlliance(SimpleAlliance alliance) {
		if (alliance == null) {
			throw new NullPointerException("alliance");
		}
		this.alliance = new SimpleLink<SimpleAlliance>(alliance);
	}

	public List<SimpleUnitCount> getUnitList() {
		return unitList;
	}

	public void setUnitList(List<SimpleUnitCount> unitList) {
		this.unitList = new ArrayList<SimpleUnitCount>(unitList);
	}

	@Override
	public SimpleLinkType getType() {
		return SimpleLinkType.PLAYER;
	}

	@Override
	public void unlink(ISimpleLinkSet set) {
		set.unlink(alliance);
	}

	@Override
	public void link(ISimpleLinkSet set) {
		set.link(alliance, SimpleLinkType.ALLIANCE);
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof SimplePlayer) {
			return getId() == ((SimplePlayer) object).getId();
		}
		return false;
	}

	@Override
	public int compareTo(SimplePlayer player) {
		return compareTo(this, player);
	}

}
