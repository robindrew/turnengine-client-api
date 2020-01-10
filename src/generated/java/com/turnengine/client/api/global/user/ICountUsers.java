package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalExecutableBean;

public interface ICountUsers extends IExecutableBean<Integer>, IGlobalExecutableBean<Integer> {

	int SERIALIZATION_ID = 1712;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
