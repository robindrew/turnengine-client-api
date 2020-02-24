package com.turnengine.client.api.local.player;

import com.turnengine.client.api.local.alliance.AllianceMemberType;
import com.turnengine.client.api.local.score.IGroupScore;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Player implements IPlayer {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The userId field. */
	private int userId = 0;
	/** The factionId field. */
	private int factionId = 0;
	/** The factionName field. */
	private String factionName = null;
	/** The requestId field. */
	private int requestId = 0;
	/** The allianceId field. */
	private int allianceId = 0;
	/** The allianceName field. */
	private String allianceName = null;
	/** The allianceTag field. */
	private String allianceTag = null;
	/** The leaveTurns field. */
	private int leaveTurns = 0;
	/** The memberType field. */
	private AllianceMemberType memberType = null;
	/** The emailAlerts field. */
	private PlayerEmailAlerts emailAlerts = null;
	/** The unitList field. */
	private List<IUnitCount> unitList = null;
	/** The locations field. */
	private int locations = 0;
	/** The mobiles field. */
	private int mobiles = 0;
	/** The scoreList field. */
	private List<IGroupScore> scoreList = null;

	/**
	 * The empty constructor.
	 */
	public Player() {
	}

	/**
	 * The fields constructor.
	 */
	public Player(int id, String name, int userId, int factionId, String factionName, int requestId, int allianceId, String allianceName, String allianceTag, int leaveTurns, AllianceMemberType memberType, PlayerEmailAlerts emailAlerts, List<IUnitCount> unitList, int locations, int mobiles, List<IGroupScore> scoreList) {
		setId(id);
		setName(name);
		setUserId(userId);
		setFactionId(factionId);
		setFactionName(factionName);
		setRequestId(requestId);
		setAllianceId(allianceId);
		setAllianceName(allianceName);
		setAllianceTag(allianceTag);
		setLeaveTurns(leaveTurns);
		setMemberType(memberType);
		setEmailAlerts(emailAlerts);
		setUnitList(unitList);
		setLocations(locations);
		setMobiles(mobiles);
		setScoreList(scoreList);
	}

	/**
	 * The clone constructor.
	 */
	public Player(IPlayer clone) {
		setId(clone.getId());
		setName(clone.getName());
		setUserId(clone.getUserId());
		setFactionId(clone.getFactionId());
		setFactionName(clone.getFactionName());
		setRequestId(clone.getRequestId());
		setAllianceId(clone.getAllianceId());
		setAllianceName(clone.getAllianceName());
		setAllianceTag(clone.getAllianceTag());
		setLeaveTurns(clone.getLeaveTurns());
		setMemberType(clone.getMemberType());
		setEmailAlerts(clone.getEmailAlerts());
		setUnitList(clone.getUnitList());
		setLocations(clone.getLocations());
		setMobiles(clone.getMobiles());
		setScoreList(clone.getScoreList());
	}

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	@Override
	public int getSerializationId() {
		return SERIALIZATION_ID;
	}

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	@Override
	public int getUserId() {
		return userId;
	}

	/**
	 * Getter for the factionId field.
	 * @return the value of the factionId field.
	 */
	@Override
	public int getFactionId() {
		return factionId;
	}

	/**
	 * Getter for the factionName field.
	 * @return the value of the factionName field.
	 */
	@Override
	public String getFactionName() {
		return factionName;
	}

	/**
	 * Getter for the requestId field.
	 * @return the value of the requestId field.
	 */
	@Override
	public int getRequestId() {
		return requestId;
	}

	/**
	 * Getter for the allianceId field.
	 * @return the value of the allianceId field.
	 */
	@Override
	public int getAllianceId() {
		return allianceId;
	}

	/**
	 * Getter for the allianceName field.
	 * @return the value of the allianceName field.
	 */
	@Override
	public String getAllianceName() {
		return allianceName;
	}

	/**
	 * Getter for the allianceTag field.
	 * @return the value of the allianceTag field.
	 */
	@Override
	public String getAllianceTag() {
		return allianceTag;
	}

	/**
	 * Getter for the leaveTurns field.
	 * @return the value of the leaveTurns field.
	 */
	@Override
	public int getLeaveTurns() {
		return leaveTurns;
	}

	/**
	 * Getter for the memberType field.
	 * @return the value of the memberType field.
	 */
	@Override
	public AllianceMemberType getMemberType() {
		return memberType;
	}

	/**
	 * Getter for the emailAlerts field.
	 * @return the value of the emailAlerts field.
	 */
	@Override
	public PlayerEmailAlerts getEmailAlerts() {
		return emailAlerts;
	}

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	@Override
	public List<IUnitCount> getUnitList() {
		return unitList;
	}

	/**
	 * Getter for the locations field.
	 * @return the value of the locations field.
	 */
	@Override
	public int getLocations() {
		return locations;
	}

	/**
	 * Getter for the mobiles field.
	 * @return the value of the mobiles field.
	 */
	@Override
	public int getMobiles() {
		return mobiles;
	}

	/**
	 * Getter for the scoreList field.
	 * @return the value of the scoreList field.
	 */
	@Override
	public List<IGroupScore> getScoreList() {
		return scoreList;
	}

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < -1) {
			throw new IllegalArgumentException("id too small, minimum of -1, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		if (name.length() < 1) {
			throw new IllegalArgumentException("name too short, minimum of 1 characters, value: '" + name + "'");
		}
		if (name.length() > 30) {
			throw new IllegalArgumentException("name too long, maximum of 30 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	@Override
	public void setUserId(int userId) {
		if (userId < -1) {
			throw new IllegalArgumentException("userId too small, minimum of -1, value: '" + userId + "'");
		}
		this.userId = userId;
	}

	/**
	 * Setter for the factionId field.
	 * @param factionId the factionId value to set.
	 */
	@Override
	public void setFactionId(int factionId) {
		if (factionId < -1) {
			throw new IllegalArgumentException("factionId too small, minimum of -1, value: '" + factionId + "'");
		}
		this.factionId = factionId;
	}

	/**
	 * Setter for the factionName field.
	 * @param factionName the factionName value to set.
	 */
	@Override
	public void setFactionName(String factionName) {
		if (factionName == null) {
			throw new NullPointerException("factionName");
		}
		if (factionName.length() < 1) {
			throw new IllegalArgumentException("factionName too short, minimum of 1 characters, value: '" + factionName + "'");
		}
		if (factionName.length() > 200) {
			throw new IllegalArgumentException("factionName too long, maximum of 200 characters, value: '" + factionName + "'");
		}
		this.factionName = factionName;
	}

	/**
	 * Setter for the requestId field.
	 * @param requestId the requestId value to set.
	 */
	@Override
	public void setRequestId(int requestId) {
		if (requestId < -1) {
			throw new IllegalArgumentException("requestId too small, minimum of -1, value: '" + requestId + "'");
		}
		this.requestId = requestId;
	}

	/**
	 * Setter for the allianceId field.
	 * @param allianceId the allianceId value to set.
	 */
	@Override
	public void setAllianceId(int allianceId) {
		if (allianceId < -1) {
			throw new IllegalArgumentException("allianceId too small, minimum of -1, value: '" + allianceId + "'");
		}
		this.allianceId = allianceId;
	}

	/**
	 * Setter for the allianceName field.
	 * @param allianceName the allianceName value to set.
	 */
	@Override
	public void setAllianceName(String allianceName) {
		if (allianceName == null) {
			throw new NullPointerException("allianceName");
		}
		if (allianceName.length() < 0) {
			throw new IllegalArgumentException("allianceName too short, minimum of 0 characters, value: '" + allianceName + "'");
		}
		if (allianceName.length() > 40) {
			throw new IllegalArgumentException("allianceName too long, maximum of 40 characters, value: '" + allianceName + "'");
		}
		this.allianceName = allianceName;
	}

	/**
	 * Setter for the allianceTag field.
	 * @param allianceTag the allianceTag value to set.
	 */
	@Override
	public void setAllianceTag(String allianceTag) {
		if (allianceTag == null) {
			throw new NullPointerException("allianceTag");
		}
		if (allianceTag.length() < 0) {
			throw new IllegalArgumentException("allianceTag too short, minimum of 0 characters, value: '" + allianceTag + "'");
		}
		if (allianceTag.length() > 20) {
			throw new IllegalArgumentException("allianceTag too long, maximum of 20 characters, value: '" + allianceTag + "'");
		}
		this.allianceTag = allianceTag;
	}

	/**
	 * Setter for the leaveTurns field.
	 * @param leaveTurns the leaveTurns value to set.
	 */
	@Override
	public void setLeaveTurns(int leaveTurns) {
		if (leaveTurns < -1) {
			throw new IllegalArgumentException("leaveTurns too small, minimum of -1, value: '" + leaveTurns + "'");
		}
		this.leaveTurns = leaveTurns;
	}

	/**
	 * Setter for the memberType field.
	 * @param memberType the memberType value to set.
	 */
	@Override
	public void setMemberType(AllianceMemberType memberType) {
		this.memberType = memberType;
	}

	/**
	 * Setter for the emailAlerts field.
	 * @param emailAlerts the emailAlerts value to set.
	 */
	@Override
	public void setEmailAlerts(PlayerEmailAlerts emailAlerts) {
		this.emailAlerts = emailAlerts;
	}

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	@Override
	public void setUnitList(List<IUnitCount> unitList) {
		this.unitList = unitList;
	}

	/**
	 * Setter for the locations field.
	 * @param locations the locations value to set.
	 */
	@Override
	public void setLocations(int locations) {
		if (locations < 0) {
			throw new IllegalArgumentException("locations too small, minimum of 0, value: '" + locations + "'");
		}
		this.locations = locations;
	}

	/**
	 * Setter for the mobiles field.
	 * @param mobiles the mobiles value to set.
	 */
	@Override
	public void setMobiles(int mobiles) {
		if (mobiles < 0) {
			throw new IllegalArgumentException("mobiles too small, minimum of 0, value: '" + mobiles + "'");
		}
		this.mobiles = mobiles;
	}

	/**
	 * Setter for the scoreList field.
	 * @param scoreList the scoreList value to set.
	 */
	@Override
	public void setScoreList(List<IGroupScore> scoreList) {
		this.scoreList = scoreList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getUserId());
		builder.append(getFactionId());
		builder.append(getFactionName());
		builder.append(getRequestId());
		builder.append(getAllianceId());
		builder.append(getAllianceName());
		builder.append(getAllianceTag());
		builder.append(getLeaveTurns());
		builder.append(getMemberType());
		builder.append(getEmailAlerts());
		builder.append(getUnitList());
		builder.append(getLocations());
		builder.append(getMobiles());
		builder.append(getScoreList());
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object object) {
		// Identity check
		if (object == this) {
			return true;
		}

		// Null check
		if (object == null) {
			return false;
		}

		// Compare types
		if (!this.getClass().equals(object.getClass())) {
			return false;
		}

		// Compare fields
		IPlayer that = (IPlayer) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getFactionId(), that.getFactionId());
		builder.append(this.getFactionName(), that.getFactionName());
		builder.append(this.getRequestId(), that.getRequestId());
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getAllianceName(), that.getAllianceName());
		builder.append(this.getAllianceTag(), that.getAllianceTag());
		builder.append(this.getLeaveTurns(), that.getLeaveTurns());
		builder.append(this.getMemberType(), that.getMemberType());
		builder.append(this.getEmailAlerts(), that.getEmailAlerts());
		builder.append(this.getUnitList(), that.getUnitList());
		builder.append(this.getLocations(), that.getLocations());
		builder.append(this.getMobiles(), that.getMobiles());
		builder.append(this.getScoreList(), that.getScoreList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getUserId());
		builder.append(getFactionId());
		builder.append(getFactionName());
		builder.append(getRequestId());
		builder.append(getAllianceId());
		builder.append(getAllianceName());
		builder.append(getAllianceTag());
		builder.append(getLeaveTurns());
		builder.append(getMemberType());
		builder.append(getEmailAlerts());
		builder.append(getUnitList());
		builder.append(getLocations());
		builder.append(getMobiles());
		builder.append(getScoreList());
		return builder.toString();
	}

	@Override
	public int compareTo(IPlayer that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getFactionId(), that.getFactionId());
		builder.append(this.getFactionName(), that.getFactionName());
		builder.append(this.getRequestId(), that.getRequestId());
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getAllianceName(), that.getAllianceName());
		builder.append(this.getAllianceTag(), that.getAllianceTag());
		builder.append(this.getLeaveTurns(), that.getLeaveTurns());
		builder.append(this.getMemberType(), that.getMemberType());
		builder.append(this.getEmailAlerts(), that.getEmailAlerts());
		builder.append(this.getUnitList(), that.getUnitList());
		builder.append(this.getLocations(), that.getLocations());
		builder.append(this.getMobiles(), that.getMobiles());
		builder.append(this.getScoreList(), that.getScoreList());
		return builder.toComparison();
	}
}
