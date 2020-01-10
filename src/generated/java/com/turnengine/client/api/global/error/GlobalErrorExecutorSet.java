package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.local.error.ILocalTrace;
import java.util.List;

public class GlobalErrorExecutorSet implements IGlobalErrorExecutorSet {

	private final IBeanExecutorLocator locator;

	public GlobalErrorExecutorSet(IBeanExecutorLocator locator) {
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
	public ILocalTrace getCommandStackTrace(long loginId, long id) {
		GetCommandStackTrace bean = new GetCommandStackTrace(loginId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ILocalTrace> getCommandStackTraceList(long loginId, long from, long to) {
		GetCommandStackTraceList bean = new GetCommandStackTraceList(loginId, from, to);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
