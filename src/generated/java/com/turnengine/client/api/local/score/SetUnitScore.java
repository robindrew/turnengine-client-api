package com.turnengine.client.api.local.score;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetUnitScore implements ISetUnitScore {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The group field. */
	private String group = null;
	/** The unit field. */
	private String unit = null;
	/** The score field. */
	private long score = 0l;

	/**
	 * The empty constructor.
	 */
	public SetUnitScore() {
	}

	/**
	 * The fields constructor.
	 */
	public SetUnitScore(long loginId, int instanceId, String group, String unit, long score) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setGroup(group);
		setUnit(unit);
		setScore(score);
	}

	/**
	 * The clone constructor.
	 */
	public SetUnitScore(ISetUnitScore clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setGroup(clone.getGroup());
		setUnit(clone.getUnit());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
	}

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
	}

	/**
	 * Getter for the group field.
	 * @return the value of the group field.
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * Getter for the unit field.
	 * @return the value of the unit field.
	 */
	@Override
	public String getUnit() {
		return unit;
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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	@Override
	public void setInstanceId(int instanceId) {
		if (instanceId < -1) {
			throw new IllegalArgumentException("instanceId too small, minimum of -1, value: '" + instanceId + "'");
		}
		this.instanceId = instanceId;
	}

	/**
	 * Setter for the group field.
	 * @param group the group value to set.
	 */
	@Override
	public void setGroup(String group) {
		if (group == null) {
			throw new NullPointerException("group");
		}
		if (group.length() < 1) {
			throw new IllegalArgumentException("group too short, minimum of 1 characters, value: '" + group + "'");
		}
		if (group.length() > 200) {
			throw new IllegalArgumentException("group too long, maximum of 200 characters, value: '" + group + "'");
		}
		this.group = group;
	}

	/**
	 * Setter for the unit field.
	 * @param unit the unit value to set.
	 */
	@Override
	public void setUnit(String unit) {
		if (unit == null) {
			throw new NullPointerException("unit");
		}
		if (unit.length() < 1) {
			throw new IllegalArgumentException("unit too short, minimum of 1 characters, value: '" + unit + "'");
		}
		if (unit.length() > 200) {
			throw new IllegalArgumentException("unit too long, maximum of 200 characters, value: '" + unit + "'");
		}
		this.unit = unit;
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
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getGroup());
		builder.append(getUnit());
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
		ISetUnitScore that = (ISetUnitScore) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getGroup(), that.getGroup());
		builder.append(this.getUnit(), that.getUnit());
		builder.append(this.getScore(), that.getScore());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getGroup());
		builder.append(getUnit());
		builder.append(getScore());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetUnitScore that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getGroup(), that.getGroup());
		builder.append(this.getUnit(), that.getUnit());
		builder.append(this.getScore(), that.getScore());
		return builder.toComparison();
	}
}
