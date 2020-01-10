package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface IOpenIdForm extends IBean, Comparable<IOpenIdForm> {

	int SERIALIZATION_ID = 1223;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the uri field.
	 * @return the value of the uri field.
	 */
	String getUri();

	/**
	 * Getter for the parameterList field.
	 * @return the value of the parameterList field.
	 */
	List<IOpenIdParameter> getParameterList();

	/**
	 * Setter for the uri field.
	 * @param uri the uri value to set.
	 */
	void setUri(String uri);

	/**
	 * Setter for the parameterList field.
	 * @param parameterList the parameterList value to set.
	 */
	void setParameterList(List<IOpenIdParameter> parameterList);
}
