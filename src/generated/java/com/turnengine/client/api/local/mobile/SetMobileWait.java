package com.turnengine.client.api.local.mobile;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetMobileWait implements ISetMobileWait {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The mobileId field. */
	private int mobileId = 0;
	/** The turns field. */
	private int turns = 0;

	/**
	 * The empty constructor.
	 */
	public SetMobileWait() {
	}

	/**
	 * The fields constructor.
	 */
	public SetMobileWait(long loginId, int instanceId, int mobileId, int turns) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setMobileId(mobileId);
		setTurns(turns);
	}

	/**
	 * The clone constructor.
	 */
	public SetMobileWait(ISetMobileWait clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setMobileId(clone.getMobileId());
		setTurns(clone.getTurns());
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
	 * Getter for the mobileId field.
	 * @return the value of the mobileId field.
	 */
	@Override
	public int getMobileId() {
		return mobileId;
	}

	/**
	 * Getter for the turns field.
	 * @return the value of the turns field.
	 */
	@Override
	public int getTurns() {
		return turns;
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
	 * Setter for the mobileId field.
	 * @param mobileId the mobileId value to set.
	 */
	@Override
	public void setMobileId(int mobileId) {
		if (mobileId < -1) {
			throw new IllegalArgumentException("mobileId too small, minimum of -1, value: '" + mobileId + "'");
		}
		this.mobileId = mobileId;
	}

	/**
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	@Override
	public void setTurns(int turns) {
		if (turns < -1) {
			throw new IllegalArgumentException("turns too small, minimum of -1, value: '" + turns + "'");
		}
		this.turns = turns;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getMobileId());
		builder.append(getTurns());
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
		ISetMobileWait that = (ISetMobileWait) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getTurns(), that.getTurns());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getMobileId());
		builder.append(getTurns());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetMobileWait that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getTurns(), that.getTurns());
		return builder.toComparison();
	}
}
