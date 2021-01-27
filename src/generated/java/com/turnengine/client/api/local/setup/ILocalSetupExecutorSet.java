package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;

public interface ILocalSetupExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	Boolean setSetupBeanList(long loginId, int instanceId, String xml);

	Boolean setSetupBeanListFile(long loginId, int instanceId, String filename);

	String getSetupBeanList(long loginId, int instanceId);

	Boolean clearSetup(long loginId, int instanceId);

	Boolean setSetupBeanListDirectory(long loginId, int instanceId, String directory, String filenames);
}
