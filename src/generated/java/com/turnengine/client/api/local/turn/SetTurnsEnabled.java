package com.turnengine.client.api.local.turn;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetTurnsEnabled implements ISetTurnsEnabled {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The updating field. */
	private TurnsEnabled updating = null;

	/**
	 * The empty constructor.
	 */
	public SetTurnsEnabled() {
	}

	/**
	 * The fields constructor.
	 */
	public SetTurnsEnabled(long loginId, int instanceId, TurnsEnabled updating) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setUpdating(updating);
	}

	/**
	 * The clone constructor.
	 */
	public SetTurnsEnabled(ISetTurnsEnabled clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setUpdating(clone.getUpdating());
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
	 * Getter for the updating field.
	 * @return the value of the updating field.
	 */
	@Override
	public TurnsEnabled getUpdating() {
		return updating;
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
	 * Setter for the updating field.
	 * @param updating the updating value to set.
	 */
	@Override
	public void setUpdating(TurnsEnabled updating) {
		this.updating = updating;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getUpdating());
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
		ISetTurnsEnabled that = (ISetTurnsEnabled) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getUpdating(), that.getUpdating());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getUpdating());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetTurnsEnabled that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getUpdating(), that.getUpdating());
		return builder.toComparison();
	}
}
