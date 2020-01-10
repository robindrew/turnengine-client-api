package com.turnengine.client.api.local.staticcache;

import java.util.List;

public interface IStaticCache<E> extends Iterable<E> {

	int size();

	boolean isEmpty();

	void clear();

	List<E> getAll();
}
