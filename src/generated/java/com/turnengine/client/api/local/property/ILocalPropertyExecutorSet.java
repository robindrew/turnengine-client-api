package com.turnengine.client.api.local.property;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;

public interface ILocalPropertyExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	String setLocalProperty(long loginId, int instanceId, String key, String value);

	String getLocalProperty(long loginId, int instanceId, String key);
}
