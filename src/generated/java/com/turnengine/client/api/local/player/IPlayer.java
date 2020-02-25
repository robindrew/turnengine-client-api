package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.turnengine.client.api.local.alliance.AllianceMemberType;
import com.turnengine.client.api.local.score.IGroupScore;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface IPlayer extends IBean, INamedIdentity, IPlayerData, Comparable<IPlayer> {

	int SERIALIZATION_ID = 3130;

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
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	int getUserId();

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
	 * Getter for the requestId field.
	 * @return the value of the requestId field.
	 */
	int getRequestId();

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
	 * Getter for the emailAlerts field.
	 * @return the value of the emailAlerts field.
	 */
	PlayerEmailAlerts getEmailAlerts();

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	List<IUnitCount> getUnitList();

	/**
	 * Getter for the locations field.
	 * @return the value of the locations field.
	 */
	int getLocations();

	/**
	 * Getter for the mobiles field.
	 * @return the value of the mobiles field.
	 */
	int getMobiles();

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
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	void setUserId(int userId);

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
	 * Setter for the requestId field.
	 * @param requestId the requestId value to set.
	 */
	void setRequestId(int requestId);

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
	 * Setter for the emailAlerts field.
	 * @param emailAlerts the emailAlerts value to set.
	 */
	void setEmailAlerts(PlayerEmailAlerts emailAlerts);

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	void setUnitList(List<IUnitCount> unitList);

	/**
	 * Setter for the locations field.
	 * @param locations the locations value to set.
	 */
	void setLocations(int locations);

	/**
	 * Setter for the mobiles field.
	 * @param mobiles the mobiles value to set.
	 */
	void setMobiles(int mobiles);

	/**
	 * Setter for the scoreList field.
	 * @param scoreList the scoreList value to set.
	 */
	void setScoreList(List<IGroupScore> scoreList);
}
