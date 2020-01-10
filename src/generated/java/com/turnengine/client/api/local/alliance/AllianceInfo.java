package com.turnengine.client.api.local.alliance;

import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AllianceInfo implements IAllianceInfo {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The leaderId field. */
	private int leaderId = 0;
	/** The leaderName field. */
	private String leaderName = null;
	/** The factionId field. */
	private int factionId = 0;
	/** The factionName field. */
	private String factionName = null;
	/** The members field. */
	private int members = 0;
	/** The memberList field. */
	private List<IPlayerInfo> memberList = null;
	/** The scoreList field. */
	private List<IGroupScore> scoreList = null;
	/** The tag field. */
	private String tag = null;

	/**
	 * The empty constructor.
	 */
	public AllianceInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public AllianceInfo(int id, String name, int leaderId, String leaderName, int factionId, String factionName, int members, List<IPlayerInfo> memberList, List<IGroupScore> scoreList, String tag) {
		setId(id);
		setName(name);
		setLeaderId(leaderId);
		setLeaderName(leaderName);
		setFactionId(factionId);
		setFactionName(factionName);
		setMembers(members);
		setMemberList(memberList);
		setScoreList(scoreList);
		setTag(tag);
	}

	/**
	 * The clone constructor.
	 */
	public AllianceInfo(IAllianceInfo clone) {
		setId(clone.getId());
		setName(clone.getName());
		setLeaderId(clone.getLeaderId());
		setLeaderName(clone.getLeaderName());
		setFactionId(clone.getFactionId());
		setFactionName(clone.getFactionName());
		setMembers(clone.getMembers());
		setMemberList(clone.getMemberList());
		setScoreList(clone.getScoreList());
		setTag(clone.getTag());
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
	 * Getter for the leaderId field.
	 * @return the value of the leaderId field.
	 */
	@Override
	public int getLeaderId() {
		return leaderId;
	}

	/**
	 * Getter for the leaderName field.
	 * @return the value of the leaderName field.
	 */
	@Override
	public String getLeaderName() {
		return leaderName;
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
	 * Getter for the members field.
	 * @return the value of the members field.
	 */
	@Override
	public int getMembers() {
		return members;
	}

	/**
	 * Getter for the memberList field.
	 * @return the value of the memberList field.
	 */
	@Override
	public List<IPlayerInfo> getMemberList() {
		return memberList;
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
	 * Getter for the tag field.
	 * @return the value of the tag field.
	 */
	@Override
	public String getTag() {
		return tag;
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
		if (name.length() < 4) {
			throw new IllegalArgumentException("name too short, minimum of 4 characters, value: '" + name + "'");
		}
		if (name.length() > 40) {
			throw new IllegalArgumentException("name too long, maximum of 40 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the leaderId field.
	 * @param leaderId the leaderId value to set.
	 */
	@Override
	public void setLeaderId(int leaderId) {
		if (leaderId < -1) {
			throw new IllegalArgumentException("leaderId too small, minimum of -1, value: '" + leaderId + "'");
		}
		this.leaderId = leaderId;
	}

	/**
	 * Setter for the leaderName field.
	 * @param leaderName the leaderName value to set.
	 */
	@Override
	public void setLeaderName(String leaderName) {
		if (leaderName == null) {
			throw new NullPointerException("leaderName");
		}
		if (leaderName.length() < 1) {
			throw new IllegalArgumentException("leaderName too short, minimum of 1 characters, value: '" + leaderName + "'");
		}
		if (leaderName.length() > 30) {
			throw new IllegalArgumentException("leaderName too long, maximum of 30 characters, value: '" + leaderName + "'");
		}
		this.leaderName = leaderName;
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
	 * Setter for the members field.
	 * @param members the members value to set.
	 */
	@Override
	public void setMembers(int members) {
		if (members < 0) {
			throw new IllegalArgumentException("members too small, minimum of 0, value: '" + members + "'");
		}
		this.members = members;
	}

	/**
	 * Setter for the memberList field.
	 * @param memberList the memberList value to set.
	 */
	@Override
	public void setMemberList(List<IPlayerInfo> memberList) {
		this.memberList = memberList;
	}

	/**
	 * Setter for the scoreList field.
	 * @param scoreList the scoreList value to set.
	 */
	@Override
	public void setScoreList(List<IGroupScore> scoreList) {
		this.scoreList = scoreList;
	}

	/**
	 * Setter for the tag field.
	 * @param tag the tag value to set.
	 */
	@Override
	public void setTag(String tag) {
		if (tag == null) {
			throw new NullPointerException("tag");
		}
		if (tag.length() < 1) {
			throw new IllegalArgumentException("tag too short, minimum of 1 characters, value: '" + tag + "'");
		}
		if (tag.length() > 20) {
			throw new IllegalArgumentException("tag too long, maximum of 20 characters, value: '" + tag + "'");
		}
		this.tag = tag;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getLeaderId());
		builder.append(getLeaderName());
		builder.append(getFactionId());
		builder.append(getFactionName());
		builder.append(getMembers());
		builder.append(getMemberList());
		builder.append(getScoreList());
		builder.append(getTag());
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
		IAllianceInfo that = (IAllianceInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getLeaderId(), that.getLeaderId());
		builder.append(this.getLeaderName(), that.getLeaderName());
		builder.append(this.getFactionId(), that.getFactionId());
		builder.append(this.getFactionName(), that.getFactionName());
		builder.append(this.getMembers(), that.getMembers());
		builder.append(this.getMemberList(), that.getMemberList());
		builder.append(this.getScoreList(), that.getScoreList());
		builder.append(this.getTag(), that.getTag());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getLeaderId());
		builder.append(getLeaderName());
		builder.append(getFactionId());
		builder.append(getFactionName());
		builder.append(getMembers());
		builder.append(getMemberList());
		builder.append(getScoreList());
		builder.append(getTag());
		return builder.toString();
	}

	@Override
	public int compareTo(IAllianceInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getLeaderId(), that.getLeaderId());
		builder.append(this.getLeaderName(), that.getLeaderName());
		builder.append(this.getFactionId(), that.getFactionId());
		builder.append(this.getFactionName(), that.getFactionName());
		builder.append(this.getMembers(), that.getMembers());
		builder.append(this.getMemberList(), that.getMemberList());
		builder.append(this.getScoreList(), that.getScoreList());
		builder.append(this.getTag(), that.getTag());
		return builder.toComparison();
	}
}
