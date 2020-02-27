package com.turnengine.client.api.local.action.plugin.report;

import org.simpleframework.xml.Attribute;

import com.turnengine.client.api.local.common.simple.link.SimpleLinkSet;

public class SimpleTurnReport extends SimpleLinkSet {

	@Attribute
	private int turn;

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getTurn() {
		return turn;
	}

}
