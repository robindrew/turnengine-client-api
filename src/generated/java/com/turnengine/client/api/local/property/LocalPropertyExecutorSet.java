package com.turnengine.client.api.local.property;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;

public class LocalPropertyExecutorSet implements ILocalPropertyExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalPropertyExecutorSet(IBeanExecutorLocator locator) {
		if (locator == null) {
			throw new NullPointerException("locator");
		}
		this.locator = locator;
	}

	/**
	 * Getter for the locator field.
	 * @return the value of the locator field.
	 */
	public IBeanExecutorLocator getLocator() {
		return locator;
	}

	@Override
	public String setLocalProperty(long loginId, int instanceId, String key, String value) {
		SetLocalProperty bean = new SetLocalProperty(loginId, instanceId, key, value);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public String getLocalProperty(long loginId, int instanceId, String key) {
		GetLocalProperty bean = new GetLocalProperty(loginId, instanceId, key);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
