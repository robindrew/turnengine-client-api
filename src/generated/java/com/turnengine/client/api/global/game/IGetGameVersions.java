package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import java.util.List;

public interface IGetGameVersions extends IExecutableBean<List<IGameVersion>> {

	int SERIALIZATION_ID = 1511;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
