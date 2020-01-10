package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import java.util.List;

public interface ILocalErrorExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	ILocalTrace getLocalTrace(long loginId, int instanceId, String id);

	List<ILocalTrace> getLocalTraceList(long loginId, int instanceId, long from, long to);
}
