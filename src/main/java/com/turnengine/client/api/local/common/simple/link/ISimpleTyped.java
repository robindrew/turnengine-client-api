package com.turnengine.client.api.local.common.simple.link;

import com.robindrew.codegenerator.api.identity.IIdentity;

public interface ISimpleTyped extends IIdentity {

	SimpleLinkType getType();

	void unlink(ISimpleLinkSet set);

	void link(ISimpleLinkSet set);

}
