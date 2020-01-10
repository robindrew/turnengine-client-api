package com.turnengine.client.api.local.common.simple;

import org.simpleframework.xml.Attribute;

import com.turnengine.client.api.local.common.simple.link.ISimpleLinkSet;
import com.turnengine.client.api.local.common.simple.link.SimpleLinkType;

public class SimpleAlliance extends SimpleTyped implements Comparable<SimpleAlliance> {

	@Attribute
	private String tag = null;

	@Override
	public SimpleLinkType getType() {
		return SimpleLinkType.ALLIANCE;
	}

	@Override
	public void unlink(ISimpleLinkSet set) {
		// No links
	}

	@Override
	public void link(ISimpleLinkSet set) {
		// No links
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof SimpleAlliance) {
			return getId() == ((SimpleAlliance) object).getId();
		}
		return false;
	}

	@Override
	public int compareTo(SimpleAlliance alliance) {
		return compareTo(this, alliance);
	}

}
