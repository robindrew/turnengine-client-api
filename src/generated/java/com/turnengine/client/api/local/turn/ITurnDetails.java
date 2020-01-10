package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface ITurnDetails extends IBean, Comparable<ITurnDetails> {

	int SERIALIZATION_ID = 6717;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the turn field.
	 * @return the value of the turn field.
	 */
	ITurn getTurn();

	/**
	 * Getter for the components field.
	 * @return the value of the components field.
	 */
	List<ITurnComponent> getComponents();

	/**
	 * Setter for the turn field.
	 * @param turn the turn value to set.
	 */
	void setTurn(ITurn turn);

	/**
	 * Setter for the components field.
	 * @param components the components value to set.
	 */
	void setComponents(List<ITurnComponent> components);
}
