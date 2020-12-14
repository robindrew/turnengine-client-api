package com.turnengine.client.api.local.identity;

import java.util.Collection;
import java.util.Set;

import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.turnengine.client.api.local.staticcache.IStaticCache;

public interface INamedIdentityCache<N extends INamedIdentity> extends IStaticCache<N> {

	String getCacheName();

	boolean add(N identity);

	void addAll(Collection<? extends N> identities);

	N getById(int id);

	N getByName(String name);

	boolean containsById(int id);

	boolean containsByName(String name);

	Set<String> getNameSet();

}
