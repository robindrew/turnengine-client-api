package com.turnengine.client.api.object;

import java.util.Collection;
import java.util.Map;

public interface IIdObjectMap<V extends IIdObject> extends Map<Integer, V> {

	V get(int id);

	V put(int id, V value);

	V remove(int id);

	boolean containsKey(int id);

	void putAll(Collection<? extends V> values);

	V remove(V value);

	V put(V value);

}
