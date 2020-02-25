package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.score.ITurnScore;
import java.util.List;

public interface IGetPlayerScores extends IExecutableBean<List<ITurnScore>>, ILocalLoggedInBean<List<ITurnScore>>, Comparable<IGetPlayerScores> {

	int SERIALIZATION_ID = 3126;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	long getLoginId();

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	int getInstanceId();

	/**
	 * Getter for the playerId field.
	 * @return the value of the playerId field.
	 */
	int getPlayerId();

	/**
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	int getGroupId();

	/**
	 * Getter for the maxSize field.
	 * @return the value of the maxSize field.
	 */
	int getMaxSize();

	/**
	 * Getter for the minTurn field.
	 * @return the value of the minTurn field.
	 */
	int getMinTurn();

	/**
	 * Getter for the maxTurn field.
	 * @return the value of the maxTurn field.
	 */
	int getMaxTurn();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

	/**
	 * Setter for the playerId field.
	 * @param playerId the playerId value to set.
	 */
	void setPlayerId(int playerId);

	/**
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	void setGroupId(int groupId);

	/**
	 * Setter for the maxSize field.
	 * @param maxSize the maxSize value to set.
	 */
	void setMaxSize(int maxSize);

	/**
	 * Setter for the minTurn field.
	 * @param minTurn the minTurn value to set.
	 */
	void setMinTurn(int minTurn);

	/**
	 * Setter for the maxTurn field.
	 * @param maxTurn the maxTurn value to set.
	 */
	void setMaxTurn(int maxTurn);
}
