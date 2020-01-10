package com.turnengine.client.api.object;

import java.util.Map.Entry;

class MapEntry<V extends IIdObject> implements Entry<Integer, V> {

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
