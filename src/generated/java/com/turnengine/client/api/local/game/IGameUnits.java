package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.global.game.IGameDefinition;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface IGameUnits extends IBean, Comparable<IGameUnits> {

	int SERIALIZATION_ID = 7008;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the definition field.
	 * @return the value of the definition field.
	 */
	IGameDefinition getDefinition();

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	List<IUnitCount> getUnitList();

	/**
	 * Setter for the definition field.
	 * @param definition the definition value to set.
	 */
	void setDefinition(IGameDefinition definition);

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	void setUnitList(List<IUnitCount> unitList);
}
