package com.turnengine.client.api.object;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.robindrew.codegenerator.api.identity.IIdentity;

import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

public class IdObjectMap<V extends IIdentity> implements IIdObjectMap<V> {

	private final TIntObjectMap<V> map = new TIntObjectHashMap<V>();

	public IdObjectMap() {
	}

	public IdObjectMap(Collection<? extends V> values) {
		putAll(values);
	}

	private boolean isInteger(Object key) {
		return key instanceof Integer;
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		if (!isInteger(key)) {
			return false;
		}
		return map.containsKey((Integer) key);
	}

	@Override
	public boolean containsValue(Object value) {
		if (!(value instanceof IIdentity)) {
			return false;
		}

		// Much faster way to check contains
		IIdentity object = (IIdentity) value;
		int id = object.getId();
		V existing = get(id);
		return existing != null && existing.equals(value);
	}

	@Override
	public V get(Object key) {
		if (!isInteger(key)) {
			return null;
		}
		return map.get((Integer) key);
	}

	@Override
	public V put(Integer key, V value) {
		return map.put(key, value);
	}

	@Override
	public V remove(Object key) {
		if (!isInteger(key)) {
			return null;
		}
		return map.remove((Integer) key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends V> map) {
		// Ignore the keys in the map
		for (V value : map.values()) {
			put(value);
		}
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public Set<Integer> keySet() {
		int[] keys = map.keys();
		Set<Integer> set = new HashSet<Integer>();
		for (int key : keys) {
			set.add(key);
		}
		return set;
	}

	@Override
	public Collection<V> values() {
		return map.valueCollection();
	}

	@Override
	public Set<Entry<Integer, V>> entrySet() {
		Set<Entry<Integer, V>> set = new HashSet<Entry<Integer, V>>();
		for (V value : values()) {
			set.add(new MapEntry<V>(value));
		}
		return set;
	}

	@Override
	public V get(int id) {
		return map.get(id);
	}

	@Override
	public V put(int id, V value) {
		return map.put(id, value);
	}

	@Override
	public V remove(int id) {
		return map.remove(id);
	}

	@Override
	public boolean containsKey(int id) {
		return map.containsKey(id);
	}

	@Override
	public void putAll(Collection<? extends V> values) {
		for (V value : values) {
			put(value);
		}
	}

	@Override
	public V remove(V value) {
		return remove(value.getId());
	}

	@Override
	public V put(V value) {
		return put(value.getId(), value);
	}

}
