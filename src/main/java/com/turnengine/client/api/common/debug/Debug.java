package com.turnengine.client.api.common.debug;

import java.util.concurrent.atomic.AtomicBoolean;

public class Debug implements IDebug {

	private volatile boolean enabled = false;
	private final AtomicBoolean globalEnabled;

	public Debug(AtomicBoolean globalEnabled) {
		this.globalEnabled = globalEnabled;
	}

	@Override
	public boolean isEnabled() {
		return enabled || globalEnabled.get();
	}

	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
