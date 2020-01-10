package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import java.util.List;

public interface IGetGameInstances extends IExecutableBean<List<IGameInstance>> {

	int SERIALIZATION_ID = 1512;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
