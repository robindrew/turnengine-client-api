package com.turnengine.client.api.local.action.plugin.report;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.turnengine.client.api.local.common.simple.SimpleLocation;
import com.turnengine.client.api.local.common.simple.SimpleMobile;
import com.turnengine.client.api.local.common.simple.link.SimpleLink;
import com.turnengine.client.api.local.common.simple.link.SimpleLinkType;

@Root(name = "InvadeLocationReport")
public class SimpleInvadeLocationReport extends SimpleTurnReport {

	@Attribute
	private boolean success;
	@Element(name = "Attacker")
	private SimpleLink<SimpleMobile> attacker;
	@Element(name = "Defender")
	private SimpleLink<SimpleLocation> defender;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public SimpleMobile getAttacker() {
		return attacker.get();
	}

	public void setAttacker(SimpleMobile attacker) {
		add(attacker);
		this.attacker = new SimpleLink<SimpleMobile>(attacker);
	}

	public SimpleLocation getDefender() {
		return defender.get();
	}

	public void setDefender(SimpleLocation defender) {
		add(defender);
		this.defender = new SimpleLink<SimpleLocation>(defender);
	}

	@Override
	public void link() {
		super.link();
		attacker.link(this, SimpleLinkType.MOBILE);
		defender.link(this, SimpleLinkType.LOCATION);
	}

	@Override
	public void unlink() {
		super.unlink();
		attacker.unlink(this);
		defender.unlink(this);
	}

}
