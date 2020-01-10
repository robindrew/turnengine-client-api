package com.turnengine.client.api.local.player;

import com.turnengine.client.api.local.alliance.IAllied;

public interface IOwned extends IAllied {

	int getPlayerId();

	int getFactionId();

	boolean isOwned();

	boolean isOwnedBy(IOwned owned);

}
