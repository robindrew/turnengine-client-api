package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;
import java.util.List;

public interface IGlobalCommonExecutorSet extends IBeanExecutorSet, IGlobalBeanExecutorSet {

	Boolean ping();

	IServiceStatus getServiceStatus();

	ISystemStatus getSystemStatus();

	Boolean getCommandAvailable(String name);

	Boolean startService(String project, int release, String service);

	Boolean stopService(String project, int release, String service);

	List<IProcessInfo> getServiceProcessList(String project);

	List<IReleaseInfo> getAvailableReleaseList(String project);

	List<IServiceInfo> getAvailableServiceList(String project);

	IOpenIdForm getGoogleOpenIdForm();

	List<ILoggedException> getLoggedExceptions();

	Boolean throwException();
}
