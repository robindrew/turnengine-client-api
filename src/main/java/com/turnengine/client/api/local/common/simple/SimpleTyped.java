package com.turnengine.client.api.local.common.simple;

import org.simpleframework.xml.Attribute;

import com.robindrew.common.xml.simple.SimpleObject;
import com.turnengine.client.api.local.common.simple.link.ISimpleTyped;

public abstract class SimpleTyped extends SimpleObject implements ISimpleTyped {

	@Attribute
	private int id = -1;
	@Attribute
	private String name = null;

	@Override
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("id=" + id);
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "[" + name + "]";
	}

	@Override
	public int hashCode() {
		return getId();
	}

	protected boolean equals(SimpleTyped typed1, Object object) {
		if (object == typed1) {
			return true;
		}
		if (object instanceof SimpleTyped) {
			SimpleTyped typed2 = (SimpleTyped) object;
			return typed1.getId() == typed2.getId();
		}
		return false;
	}

	protected int compareTo(SimpleTyped typed1, SimpleTyped typed2) {
		int thisId = typed1.getId();
		int thatId = typed2.getId();
		return (thisId < thatId ? -1 : (thisId == thatId ? 0 : 1));
	}

}
