package com.turnengine.client.api.local.common.simple.link;

import org.simpleframework.xml.Attribute;

import com.turnengine.client.api.local.common.simple.SimpleTyped;
import com.turnengine.client.api.object.IIdObject;

public class SimpleLink<T extends SimpleTyped> implements IIdObject {

	public static <T extends SimpleTyped> T get(SimpleLink<T> link) {
		if (link == null || !link.isLinked()) {
			return null;
		}
		return link.get();
	}

	@Attribute
	private int id;
	private SimpleLinkType type = null;
	private T linked = null;

	public SimpleLink() {
	}

	public SimpleLink(T typed) {
		this.id = typed.getId();
		this.type = typed.getType();
		this.linked = typed;
	}

	@Override
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isLinked() {
		return linked != null;
	}

	public T get() {
		if (linked == null) {
			throw new IllegalStateException("link no linked, id=" + id);
		}
		return linked;
	}

	public SimpleLinkType getType() {
		return type;
	}

	public void link(ISimpleLinkSet set, SimpleLinkType type) {
		this.linked = set.get(id, type);

		// Recursive
		this.linked.link(set);
	}

	public void unlink(ISimpleLinkSet set) {
		if (linked != null) {
			set.add(linked);
			T unlinked = linked;
			linked = null;
			type = null;

			// Recursive
			unlinked.unlink(set);
		}
	}

}
