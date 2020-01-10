package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IThrowException extends IExecutableBean<Boolean> {

	int SERIALIZATION_ID = 1212;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
