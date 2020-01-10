package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.turnengine.client.api.local.alliance.AllianceMemberType;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;

public interface IPlayerInfo extends IBean, INamedIdentity, Comparable<IPlayerInfo> {

	int SERIALIZATION_ID = 6031;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	int getId();

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the allianceId field.
	 * @return the value of the allianceId field.
	 */
	int getAllianceId();

	/**
	 * Getter for the allianceName field.
	 * @return the value of the allianceName field.
	 */
	String getAllianceName();

	/**
	 * Getter for the allianceTag field.
	 * @return the value of the allianceTag field.
	 */
	String getAllianceTag();

	/**
	 * Getter for the factionId field.
	 * @return the value of the factionId field.
	 */
	int getFactionId();

	/**
	 * Getter for the factionName field.
	 * @return the value of the factionName field.
	 */
	String getFactionName();

	/**
	 * Getter for the leaveTurns field.
	 * @return the value of the leaveTurns field.
	 */
	int getLeaveTurns();

	/**
	 * Getter for the memberType field.
	 * @return the value of the memberType field.
	 */
	AllianceMemberType getMemberType();

	/**
	 * Getter for the scoreList field.
	 * @return the value of the scoreList field.
	 */
	List<IGroupScore> getScoreList();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the allianceId field.
	 * @param allianceId the allianceId value to set.
	 */
	void setAllianceId(int allianceId);

	/**
	 * Setter for the allianceName field.
	 * @param allianceName the allianceName value to set.
	 */
	void setAllianceName(String allianceName);

	/**
	 * Setter for the allianceTag field.
	 * @param allianceTag the allianceTag value to set.
	 */
	void setAllianceTag(String allianceTag);

	/**
	 * Setter for the factionId field.
	 * @param factionId the factionId value to set.
	 */
	void setFactionId(int factionId);

	/**
	 * Setter for the factionName field.
	 * @param factionName the factionName value to set.
	 */
	void setFactionName(String factionName);

	/**
	 * Setter for the leaveTurns field.
	 * @param leaveTurns the leaveTurns value to set.
	 */
	void setLeaveTurns(int leaveTurns);

	/**
	 * Setter for the memberType field.
	 * @param memberType the memberType value to set.
	 */
	void setMemberType(AllianceMemberType memberType);

	/**
	 * Setter for the scoreList field.
	 * @param scoreList the scoreList value to set.
	 */
	void setScoreList(List<IGroupScore> scoreList);
}
