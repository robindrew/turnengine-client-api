package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import java.util.List;

public interface IGetServiceProcessList extends IExecutableBean<List<IProcessInfo>>, Comparable<IGetServiceProcessList> {

	int SERIALIZATION_ID = 1207;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the project field.
	 * @return the value of the project field.
	 */
	String getProject();

	/**
	 * Setter for the project field.
	 * @param project the project value to set.
	 */
	void setProject(String project);
}
