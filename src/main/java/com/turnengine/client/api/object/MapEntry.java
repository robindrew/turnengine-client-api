package com.turnengine.client.api.object;

import java.util.Map.Entry;

import com.robindrew.codegenerator.api.identity.IIdentity;

class MapEntry<V extends IIdentity> implements Entry<Integer, V> {

	private V value;

	public MapEntry(V value) {
		if (value == null) {
			throw new NullPointerException("value");
		}
		this.value = value;
	}

	@Override
	public Integer getKey() {
		return value.getId();
	}

	@Override
	public V getValue() {
		return value;
	}

	@Override
	public V setValue(V value) {
		V oldValue = this.value;
		this.value = value;
		return oldValue;
	}

}
