package com.turnengine.client.api.local.identity;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.robindrew.common.collect.indexmap.ArrayIndexMap;
import com.robindrew.common.collect.indexmap.IIndexMap;

public class NamedIdentityCache<N extends INamedIdentity> implements INamedIdentityCache<N> {

	private final String cacheName;
	private final IIndexMap<N> idToIdentityMap = new ArrayIndexMap<N>();
	private final Map<String, N> nameToIdentityMap = new LinkedHashMap<>();

	public NamedIdentityCache(String cacheName) {
		if (cacheName.isEmpty()) {
			throw new IllegalArgumentException("cacheName is empty");
		}
		this.cacheName = cacheName;
	}

	public NamedIdentityCache(String cacheName, Collection<? extends N> identities) {
		this(cacheName);
		addAll(identities);
	}

	public String getCacheName() {
		return cacheName;
	}

	@Override
	public void clear() {
		idToIdentityMap.clear();
		nameToIdentityMap.clear();
	}

	@Override
	public int size() {
		return idToIdentityMap.size();
	}

	@Override
	public boolean add(N identity) {
		if (idToIdentityMap.putIfAbsent(identity.getId(), identity)) {
			nameToIdentityMap.put(identity.getName(), identity);
			return true;
		}
		return false;
	}

	@Override
	public void addAll(Collection<? extends N> identities) {
		for (N identity : identities) {
			add(identity);
		}
	}

	@Override
	public boolean containsById(int id) {
		return idToIdentityMap.containsKey(id);
	}

	@Override
	public boolean containsByName(String name) {
		return nameToIdentityMap.containsKey(name);
	}

	@Override
	public N getById(int id) {
		N identity = idToIdentityMap.get(id);
		if (identity == null) {
			throw new IllegalArgumentException(getCacheName() + " does not exist with id=" + id + " in cache: " + idToIdentityMap);
		}
		return identity;
	}

	@Override
	public N getByName(String name) {
		N identity = nameToIdentityMap.get(name);
		if (identity == null) {
			throw new IllegalArgumentException(getCacheName() + " does not exist with name: '" + name + "' in cache: " + idToIdentityMap);
		}
		return identity;
	}

	@Override
	public Iterator<N> iterator() {
		return getAll().iterator();
	}

	@Override
	public List<N> getAll() {
		return idToIdentityMap.values();
	}

	@Override
	public String toString() {
		return getAll().toString();
	}

	@Override
	public boolean isEmpty() {
		return idToIdentityMap.isEmpty();
	}

	@Override
	public Set<String> getNameSet() {
		return ImmutableSet.copyOf(nameToIdentityMap.keySet());
	}

}
