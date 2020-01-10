package com.turnengine.client.api.executable.executor.executorset;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.concept.IConcept;

public interface IBeanExecutorSetFactory {

	IBeanExecutorSet getExecutorSet(IConcept concept);
}
