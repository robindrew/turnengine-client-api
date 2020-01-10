package com.turnengine.client.api.local.score;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UnitScore implements IUnitScore {

	/** The groupId field. */
	private int groupId = 0;
	/** The unitId field. */
	private int unitId = 0;
	/** The score field. */
	private long score = 0l;

	/**
	 * The empty constructor.
	 */
	public UnitScore() {
	}

	/**
	 * The fields constructor.
	 */
	public UnitScore(int groupId, int unitId, long score) {
		setGroupId(groupId);
		setUnitId(unitId);
		setScore(score);
	}

	/**
	 * The clone constructor.
	 */
	public UnitScore(IUnitScore clone) {
		setGroupId(clone.getGroupId());
		setUnitId(clone.getUnitId());
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
	 * Getter for the unitId field.
	 * @return the value of the unitId field.
	 */
	@Override
	public int getUnitId() {
		return unitId;
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
	 * Setter for the unitId field.
	 * @param unitId the unitId value to set.
	 */
	@Override
	public void setUnitId(int unitId) {
		if (unitId < -1) {
			throw new IllegalArgumentException("unitId too small, minimum of -1, value: '" + unitId + "'");
		}
		this.unitId = unitId;
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
		builder.append(getUnitId());
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
		IUnitScore that = (IUnitScore) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getUnitId(), that.getUnitId());
		builder.append(this.getScore(), that.getScore());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getGroupId());
		builder.append(getUnitId());
		builder.append(getScore());
		return builder.toString();
	}

	@Override
	public int compareTo(IUnitScore that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getUnitId(), that.getUnitId());
		builder.append(this.getScore(), that.getScore());
		return builder.toComparison();
	}
}
