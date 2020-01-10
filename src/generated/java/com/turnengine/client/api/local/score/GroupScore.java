package com.turnengine.client.api.local.score;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GroupScore implements IGroupScore {

	/** The groupId field. */
	private int groupId = 0;
	/** The score field. */
	private long score = 0l;

	/**
	 * The empty constructor.
	 */
	public GroupScore() {
	}

	/**
	 * The fields constructor.
	 */
	public GroupScore(int groupId, long score) {
		setGroupId(groupId);
		setScore(score);
	}

	/**
	 * The clone constructor.
	 */
	public GroupScore(IGroupScore clone) {
		setGroupId(clone.getGroupId());
		setScore(clone.getScore());
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
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	@Override
	public int getGroupId() {
		return groupId;
	}

	/**
	 * Getter for the score field.
	 * @return the value of the score field.
	 */
	@Override
	public long getScore() {
		return score;
	}

	/**
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	@Override
	public void setGroupId(int groupId) {
		if (groupId < -1) {
			throw new IllegalArgumentException("groupId too small, minimum of -1, value: '" + groupId + "'");
		}
		this.groupId = groupId;
	}

	/**
	 * Setter for the score field.
	 * @param score the score value to set.
	 */
	@Override
	public void setScore(long score) {
		if (score < -1) {
			throw new IllegalArgumentException("score too small, minimum of -1, value: '" + score + "'");
		}
		this.score = score;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getGroupId());
		builder.append(getScore());
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
		IGroupScore that = (IGroupScore) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getScore(), that.getScore());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getGroupId());
		builder.append(getScore());
		return builder.toString();
	}

	@Override
	public int compareTo(IGroupScore that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getScore(), that.getScore());
		return builder.toComparison();
	}
}
