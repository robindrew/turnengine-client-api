package com.turnengine.client.api.local.action.plugin.report;

import java.util.Set;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.turnengine.client.api.local.common.simple.SimpleLocation;
import com.turnengine.client.api.local.common.simple.SimpleMobile;
import com.turnengine.client.api.local.common.simple.link.SimpleLink;
import com.turnengine.client.api.local.common.simple.link.SimpleLinkType;

@Root(name = "LocationInfoReport")
public class SimpleLocationInfoReport extends SimpleTurnReport {

	@Element(name = "Target", required = false)
	private SimpleLink<SimpleLocation> target;

	public SimpleLocation getTarget() {
		return SimpleLink.get(target);
	}

	public void setTarget(SimpleLocation location) {
		add(location);
		this.target = new SimpleLink<SimpleLocation>(location);
	}

	public Set<SimpleMobile> getMobiles() {
		return getSet(SimpleLinkType.MOBILE);
	}

	public void addMobile(SimpleMobile mobile) {
		add(mobile);
	}

	@Override
	public void link() {
		super.link();
		target.link(this, SimpleLinkType.LOCATION);
	}

	@Override
	public void unlink() {
		super.unlink();
		target.unlink(this);
	}

}
