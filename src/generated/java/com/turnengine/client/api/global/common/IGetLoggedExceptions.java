package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import java.util.List;

public interface IGetLoggedExceptions extends IExecutableBean<List<ILoggedException>> {

	int SERIALIZATION_ID = 1211;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
