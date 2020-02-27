package com.turnengine.client.api.local.action.plugin.report;

import java.util.Set;

import org.simpleframework.xml.Root;

import com.turnengine.client.api.local.common.simple.SimpleMobile;
import com.turnengine.client.api.local.common.simple.link.SimpleLinkType;

@Root(name = "MobileInfoReport")
public class SimpleMobileInfoReport extends SimpleTurnReport {

	public Set<SimpleMobile> getMobiles() {
		return getSet(SimpleLinkType.MOBILE);
	}

	public void addMobile(SimpleMobile mobile) {
		add(mobile);
	}

}
