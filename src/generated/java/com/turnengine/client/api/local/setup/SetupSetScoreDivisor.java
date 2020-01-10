package com.turnengine.client.api.local.setup;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetupSetScoreDivisor implements ISetupSetScoreDivisor {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The group field. */
	private String group = null;
	/** The divisor field. */
	private long divisor = 0l;

	/**
	 * The empty constructor.
	 */
	public SetupSetScoreDivisor() {
	}

	/**
	 * The fields constructor.
	 */
	public SetupSetScoreDivisor(long loginId, int instanceId, String group, long divisor) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setGroup(group);
		setDivisor(divisor);
	}

	/**
	 * The clone constructor.
	 */
	public SetupSetScoreDivisor(ISetupSetScoreDivisor clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setGroup(clone.getGroup());
		setDivisor(clone.getDivisor());
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
	 * Getter for the divisor field.
	 * @return the value of the divisor field.
	 */
	@Override
	public long getDivisor() {
		return divisor;
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
	 * Setter for the divisor field.
	 * @param divisor the divisor value to set.
	 */
	@Override
	public void setDivisor(long divisor) {
		if (divisor < 1) {
			throw new IllegalArgumentException("divisor too small, minimum of 1, value: '" + divisor + "'");
		}
		this.divisor = divisor;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getGroup());
		builder.append(getDivisor());
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
		ISetupSetScoreDivisor that = (ISetupSetScoreDivisor) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getGroup(), that.getGroup());
		builder.append(this.getDivisor(), that.getDivisor());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getGroup());
		builder.append(getDivisor());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetupSetScoreDivisor that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getGroup(), that.getGroup());
		builder.append(this.getDivisor(), that.getDivisor());
		return builder.toComparison();
	}
}
