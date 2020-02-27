package com.turnengine.client.api.object;

import java.util.Collection;
import java.util.Map;

import com.robindrew.codegenerator.api.identity.IIdentity;

public interface IIdObjectMap<V extends IIdentity> extends Map<Integer, V> {

	V get(int id);

	V put(int id, V value);

	V remove(int id);

	boolean containsKey(int id);

	void putAll(Collection<? extends V> values);

	V remove(V value);

	V put(V value);

}
