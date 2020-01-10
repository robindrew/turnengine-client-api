package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import java.util.List;

public interface IGetGameHosts extends IExecutableBean<List<IGameHost>> {

	int SERIALIZATION_ID = 1522;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
