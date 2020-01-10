package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;

public interface IAlliance extends IBean, INamedIdentity, Comparable<IAlliance> {

	int SERIALIZATION_ID = 5130;

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
	 * Getter for the leaderId field.
	 * @return the value of the leaderId field.
	 */
	int getLeaderId();

	/**
	 * Getter for the leaderName field.
	 * @return the value of the leaderName field.
	 */
	String getLeaderName();

	/**
	 * Getter for the factionId field.
	 * @return the value of the factionId field.
	 */
	int getFactionId();

	/**
	 * Getter for the invited field.
	 * @return the value of the invited field.
	 */
	boolean getInvited();

	/**
	 * Getter for the members field.
	 * @return the value of the members field.
	 */
	int getMembers();

	/**
	 * Getter for the memberList field.
	 * @return the value of the memberList field.
	 */
	List<IPlayerInfo> getMemberList();

	/**
	 * Getter for the scoreList field.
	 * @return the value of the scoreList field.
	 */
	List<IGroupScore> getScoreList();

	/**
	 * Getter for the tag field.
	 * @return the value of the tag field.
	 */
	String getTag();

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
	 * Setter for the leaderId field.
	 * @param leaderId the leaderId value to set.
	 */
	void setLeaderId(int leaderId);

	/**
	 * Setter for the leaderName field.
	 * @param leaderName the leaderName value to set.
	 */
	void setLeaderName(String leaderName);

	/**
	 * Setter for the factionId field.
	 * @param factionId the factionId value to set.
	 */
	void setFactionId(int factionId);

	/**
	 * Setter for the invited field.
	 * @param invited the invited value to set.
	 */
	void setInvited(boolean invited);

	/**
	 * Setter for the members field.
	 * @param members the members value to set.
	 */
	void setMembers(int members);

	/**
	 * Setter for the memberList field.
	 * @param memberList the memberList value to set.
	 */
	void setMemberList(List<IPlayerInfo> memberList);

	/**
	 * Setter for the scoreList field.
	 * @param scoreList the scoreList value to set.
	 */
	void setScoreList(List<IGroupScore> scoreList);

	/**
	 * Setter for the tag field.
	 * @param tag the tag value to set.
	 */
	void setTag(String tag);
}
