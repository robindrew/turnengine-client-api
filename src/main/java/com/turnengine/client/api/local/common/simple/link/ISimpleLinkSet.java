package com.turnengine.client.api.local.common.simple.link;

import com.turnengine.client.api.local.common.simple.SimpleTyped;

public interface ISimpleLinkSet {

	<T extends SimpleTyped> boolean add(T typed);

	<T extends SimpleTyped> T get(int id, SimpleLinkType type);

	<T extends SimpleTyped> void unlink(SimpleLink<T> link);

	<T extends SimpleTyped> void link(SimpleLink<T> link, SimpleLinkType type);

}
