package com.turnengine.client.api.local.player;

import com.turnengine.client.api.local.alliance.AllianceMemberType;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PlayerInfo implements IPlayerInfo {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The allianceId field. */
	private int allianceId = 0;
	/** The allianceName field. */
	private String allianceName = null;
	/** The allianceTag field. */
	private String allianceTag = null;
	/** The factionId field. */
	private int factionId = 0;
	/** The factionName field. */
	private String factionName = null;
	/** The leaveTurns field. */
	private int leaveTurns = 0;
	/** The memberType field. */
	private AllianceMemberType memberType = null;
	/** The scoreList field. */
	private List<IGroupScore> scoreList = null;

	/**
	 * The empty constructor.
	 */
	public PlayerInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public PlayerInfo(int id, String name, int allianceId, String allianceName, String allianceTag, int factionId, String factionName, int leaveTurns, AllianceMemberType memberType, List<IGroupScore> scoreList) {
		setId(id);
		setName(name);
		setAllianceId(allianceId);
		setAllianceName(allianceName);
		setAllianceTag(allianceTag);
		setFactionId(factionId);
		setFactionName(factionName);
		setLeaveTurns(leaveTurns);
		setMemberType(memberType);
		setScoreList(scoreList);
	}

	/**
	 * The clone constructor.
	 */
	public PlayerInfo(IPlayerInfo clone) {
		setId(clone.getId());
		setName(clone.getName());
		setAllianceId(clone.getAllianceId());
		setAllianceName(clone.getAllianceName());
		setAllianceTag(clone.getAllianceTag());
		setFactionId(clone.getFactionId());
		setFactionName(clone.getFactionName());
		setLeaveTurns(clone.getLeaveTurns());
		setMemberType(clone.getMemberType());
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
		if (allianceName.length() < 4) {
			throw new IllegalArgumentException("allianceName too short, minimum of 4 characters, value: '" + allianceName + "'");
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
		if (allianceTag.length() < 1) {
			throw new IllegalArgumentException("allianceTag too short, minimum of 1 characters, value: '" + allianceTag + "'");
		}
		if (allianceTag.length() > 20) {
			throw new IllegalArgumentException("allianceTag too long, maximum of 20 characters, value: '" + allianceTag + "'");
		}
		this.allianceTag = allianceTag;
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
		builder.append(getAllianceId());
		builder.append(getAllianceName());
		builder.append(getAllianceTag());
		builder.append(getFactionId());
		builder.append(getFactionName());
		builder.append(getLeaveTurns());
		builder.append(getMemberType());
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
		IPlayerInfo that = (IPlayerInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getAllianceName(), that.getAllianceName());
		builder.append(this.getAllianceTag(), that.getAllianceTag());
		builder.append(this.getFactionId(), that.getFactionId());
		builder.append(this.getFactionName(), that.getFactionName());
		builder.append(this.getLeaveTurns(), that.getLeaveTurns());
		builder.append(this.getMemberType(), that.getMemberType());
		builder.append(this.getScoreList(), that.getScoreList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getAllianceId());
		builder.append(getAllianceName());
		builder.append(getAllianceTag());
		builder.append(getFactionId());
		builder.append(getFactionName());
		builder.append(getLeaveTurns());
		builder.append(getMemberType());
		builder.append(getScoreList());
		return builder.toString();
	}

	@Override
	public int compareTo(IPlayerInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getAllianceName(), that.getAllianceName());
		builder.append(this.getAllianceTag(), that.getAllianceTag());
		builder.append(this.getFactionId(), that.getFactionId());
		builder.append(this.getFactionName(), that.getFactionName());
		builder.append(this.getLeaveTurns(), that.getLeaveTurns());
		builder.append(this.getMemberType(), that.getMemberType());
		builder.append(this.getScoreList(), that.getScoreList());
		return builder.toComparison();
	}
}
