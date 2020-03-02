package com.turnengine.client.api.local.identity;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.robindrew.common.collect.indexmap.ArrayIndexMap;
import com.robindrew.common.collect.indexmap.IIndexMap;

public class NamedIdentityCache<N extends INamedIdentity> implements INamedIdentityCache<N> {

	private IIndexMap<N> idToIdentityMap = new ArrayIndexMap<N>();

	public NamedIdentityCache() {
	}

	public NamedIdentityCache(Collection<? extends N> identities) {
		addAll(identities);
	}

	@Override
	public void clear() {
		idToIdentityMap.clear();
	}

	@Override
	public int size() {
		return idToIdentityMap.size();
	}

	@Override
	public boolean add(N identity) {
		return idToIdentityMap.putIfAbsent(identity.getId(), identity);
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
		for (N identity : idToIdentityMap.values()) {
			if (identity.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public N getById(int id) {
		N identity = idToIdentityMap.get(id);
		if (identity == null) {
			throw new IllegalArgumentException("element does not exist with id=" + id + " in " + idToIdentityMap);
		}
		return identity;
	}

	@Override
	public N getByName(String name) {
		for (N identity : idToIdentityMap.values()) {
			if (identity.getName().equals(name)) {
				return identity;
			}
		}
		throw new IllegalArgumentException("element does not exist with name: " + name + " in " + idToIdentityMap);
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
		Set<String> names = new LinkedHashSet<>();
		for (N named : getAll()) {
			names.add(named.getName());
		}
		return names;
	}

}
