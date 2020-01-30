package com.turnengine.client.api.local.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AddGameUnits implements IAddGameUnits {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The unitId field. */
	private int unitId = 0;
	/** The amount field. */
	private long amount = 0l;

	/**
	 * The empty constructor.
	 */
	public AddGameUnits() {
	}

	/**
	 * The fields constructor.
	 */
	public AddGameUnits(long loginId, int instanceId, int unitId, long amount) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setUnitId(unitId);
		setAmount(amount);
	}

	/**
	 * The clone constructor.
	 */
	public AddGameUnits(IAddGameUnits clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setUnitId(clone.getUnitId());
		setAmount(clone.getAmount());
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
	 * Getter for the unitId field.
	 * @return the value of the unitId field.
	 */
	@Override
	public int getUnitId() {
		return unitId;
	}

	/**
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	@Override
	public long getAmount() {
		return amount;
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
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	@Override
	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getUnitId());
		builder.append(getAmount());
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
		IAddGameUnits that = (IAddGameUnits) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getUnitId(), that.getUnitId());
		builder.append(this.getAmount(), that.getAmount());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getUnitId());
		builder.append(getAmount());
		return builder.toString();
	}

	@Override
	public int compareTo(IAddGameUnits that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getUnitId(), that.getUnitId());
		builder.append(this.getAmount(), that.getAmount());
		return builder.toComparison();
	}
}