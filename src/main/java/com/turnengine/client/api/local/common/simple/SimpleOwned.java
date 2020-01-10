package com.turnengine.client.api.local.common.simple;

import org.simpleframework.xml.Element;

import com.turnengine.client.api.local.common.simple.link.ISimpleLinkSet;
import com.turnengine.client.api.local.common.simple.link.SimpleLink;
import com.turnengine.client.api.local.common.simple.link.SimpleLinkType;

public abstract class SimpleOwned extends SimpleTyped {

	@Element(name = "Player", required = false)
	private SimpleLink<SimplePlayer> player = null;

	public SimplePlayer getPlayer() {
		return SimpleLink.get(player);
	}

	public void setPlayer(SimplePlayer player) {
		if (player == null) {
			throw new NullPointerException("player");
		}
		this.player = new SimpleLink<SimplePlayer>(player);
	}

	@Override
	public void unlink(ISimpleLinkSet set) {
		set.unlink(player);
	}

	@Override
	public void link(ISimpleLinkSet set) {
		set.link(player, SimpleLinkType.PLAYER);
	}

}
