package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;
import com.turnengine.client.api.local.error.ILocalTrace;
import java.util.List;

public interface IGlobalErrorExecutorSet extends IBeanExecutorSet, IGlobalBeanExecutorSet {

	ILocalTrace getCommandStackTrace(long loginId, long id);

	List<ILocalTrace> getCommandStackTraceList(long loginId, long from, long to);
}
