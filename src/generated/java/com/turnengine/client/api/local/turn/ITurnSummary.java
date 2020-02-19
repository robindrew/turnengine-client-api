package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ITurnSummary extends IBean, Comparable<ITurnSummary> {

	int SERIALIZATION_ID = 6717;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the number field.
	 * @return the value of the number field.
	 */
	int getNumber();

	/**
	 * Getter for the enabled field.
	 * @return the value of the enabled field.
	 */
	boolean getEnabled();

	/**
	 * Getter for the updating field.
	 * @return the value of the updating field.
	 */
	TurnUpdating getUpdating();

	/**
	 * Getter for the interval field.
	 * @return the value of the interval field.
	 */
	long getInterval();

	/**
	 * Getter for the timeToNextTurn field.
	 * @return the value of the timeToNextTurn field.
	 */
	long getTimeToNextTurn();

	/**
	 * Getter for the timeOfNextTurn field.
	 * @return the value of the timeOfNextTurn field.
	 */
	long getTimeOfNextTurn();

	/**
	 * Getter for the currentTime field.
	 * @return the value of the currentTime field.
	 */
	long getCurrentTime();

	/**
	 * Getter for the timeOfFirstTurn field.
	 * @return the value of the timeOfFirstTurn field.
	 */
	long getTimeOfFirstTurn();

	/**
	 * Getter for the timeToFirstTurn field.
	 * @return the value of the timeToFirstTurn field.
	 */
	long getTimeToFirstTurn();

	/**
	 * Setter for the number field.
	 * @param number the number value to set.
	 */
	void setNumber(int number);

	/**
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	void setEnabled(boolean enabled);

	/**
	 * Setter for the updating field.
	 * @param updating the updating value to set.
	 */
	void setUpdating(TurnUpdating updating);

	/**
	 * Setter for the interval field.
	 * @param interval the interval value to set.
	 */
	void setInterval(long interval);

	/**
	 * Setter for the timeToNextTurn field.
	 * @param timeToNextTurn the timeToNextTurn value to set.
	 */
	void setTimeToNextTurn(long timeToNextTurn);

	/**
	 * Setter for the timeOfNextTurn field.
	 * @param timeOfNextTurn the timeOfNextTurn value to set.
	 */
	void setTimeOfNextTurn(long timeOfNextTurn);

	/**
	 * Setter for the currentTime field.
	 * @param currentTime the currentTime value to set.
	 */
	void setCurrentTime(long currentTime);

	/**
	 * Setter for the timeOfFirstTurn field.
	 * @param timeOfFirstTurn the timeOfFirstTurn value to set.
	 */
	void setTimeOfFirstTurn(long timeOfFirstTurn);

	/**
	 * Setter for the timeToFirstTurn field.
	 * @param timeToFirstTurn the timeToFirstTurn value to set.
	 */
	void setTimeToFirstTurn(long timeToFirstTurn);
}
