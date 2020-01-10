package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class GlobalCommonExecutorSet implements IGlobalCommonExecutorSet {

	private final IBeanExecutorLocator locator;

	public GlobalCommonExecutorSet(IBeanExecutorLocator locator) {
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
	public Boolean ping() {
		Ping bean = new Ping();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IServiceStatus getServiceStatus() {
		GetServiceStatus bean = new GetServiceStatus();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public ISystemStatus getSystemStatus() {
		GetSystemStatus bean = new GetSystemStatus();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean getCommandAvailable(String name) {
		GetCommandAvailable bean = new GetCommandAvailable(name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean startService(String project, int release, String service) {
		StartService bean = new StartService(project, release, service);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean stopService(String project, int release, String service) {
		StopService bean = new StopService(project, release, service);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IProcessInfo> getServiceProcessList(String project) {
		GetServiceProcessList bean = new GetServiceProcessList(project);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IReleaseInfo> getAvailableReleaseList(String project) {
		GetAvailableReleaseList bean = new GetAvailableReleaseList(project);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IServiceInfo> getAvailableServiceList(String project) {
		GetAvailableServiceList bean = new GetAvailableServiceList(project);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IOpenIdForm getGoogleOpenIdForm() {
		GetGoogleOpenIdForm bean = new GetGoogleOpenIdForm();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<ILoggedException> getLoggedExceptions() {
		GetLoggedExceptions bean = new GetLoggedExceptions();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean throwException() {
		ThrowException bean = new ThrowException();
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
