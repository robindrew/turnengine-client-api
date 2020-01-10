package com.turnengine.client.api.local.common.simple.link;

import com.turnengine.client.api.object.IIdObject;

public interface ISimpleTyped extends IIdObject {

	SimpleLinkType getType();

	void unlink(ISimpleLinkSet set);

	void link(ISimpleLinkSet set);

}
