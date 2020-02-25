package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface IMessageList extends IBean, Comparable<IMessageList> {

	int SERIALIZATION_ID = 2910;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the messageList field.
	 * @return the value of the messageList field.
	 */
	List<IMessage> getMessageList();

	/**
	 * Getter for the total field.
	 * @return the value of the total field.
	 */
	int getTotal();

	/**
	 * Setter for the messageList field.
	 * @param messageList the messageList value to set.
	 */
	void setMessageList(List<IMessage> messageList);

	/**
	 * Setter for the total field.
	 * @param total the total value to set.
	 */
	void setTotal(int total);
}
