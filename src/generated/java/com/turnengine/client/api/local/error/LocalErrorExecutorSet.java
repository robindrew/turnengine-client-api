package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class LocalErrorExecutorSet implements ILocalErrorExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalErrorExecutorSet(IBeanExecutorLocator locator) {
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
	public ILocalTrace getLocalTrace(long loginId, int instanceId, String id) {
		GetLocalTrace bean = new GetLocalTrace(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ILocalTrace> getLocalTraceList(long loginId, int instanceId, long from, long to) {
		GetLocalTraceList bean = new GetLocalTraceList(loginId, instanceId, from, to);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
