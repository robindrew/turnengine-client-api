package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;

public class LocalSetupExecutorSet implements ILocalSetupExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalSetupExecutorSet(IBeanExecutorLocator locator) {
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
	public Boolean setSetupBeanList(long loginId, int instanceId, String xml) {
		SetSetupBeanList bean = new SetSetupBeanList(loginId, instanceId, xml);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setSetupBeanListFile(long loginId, int instanceId, String filename) {
		SetSetupBeanListFile bean = new SetSetupBeanListFile(loginId, instanceId, filename);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public String getSetupBeanList(long loginId, int instanceId) {
		GetSetupBeanList bean = new GetSetupBeanList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean clearSetup(long loginId, int instanceId) {
		ClearSetup bean = new ClearSetup(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
