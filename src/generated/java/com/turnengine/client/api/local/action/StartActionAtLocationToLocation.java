package com.turnengine.client.api.local.action;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StartActionAtLocationToLocation implements IStartActionAtLocationToLocation {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The fromLocationId field. */
	private int fromLocationId = 0;
	/** The toLocationId field. */
	private int toLocationId = 0;
	/** The actionId field. */
	private int actionId = 0;
	/** The amount field. */
	private long amount = 0l;
	/** The addToQueue field. */
	private boolean addToQueue = false;

	/**
	 * The empty constructor.
	 */
	public StartActionAtLocationToLocation() {
	}

	/**
	 * The fields constructor.
	 */
	public StartActionAtLocationToLocation(long loginId, int instanceId, int fromLocationId, int toLocationId, int actionId, long amount, boolean addToQueue) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setFromLocationId(fromLocationId);
		setToLocationId(toLocationId);
		setActionId(actionId);
		setAmount(amount);
		setAddToQueue(addToQueue);
	}

	/**
	 * The clone constructor.
	 */
	public StartActionAtLocationToLocation(IStartActionAtLocationToLocation clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setFromLocationId(clone.getFromLocationId());
		setToLocationId(clone.getToLocationId());
		setActionId(clone.getActionId());
		setAmount(clone.getAmount());
		setAddToQueue(clone.getAddToQueue());
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
	 * Getter for the fromLocationId field.
	 * @return the value of the fromLocationId field.
	 */
	@Override
	public int getFromLocationId() {
		return fromLocationId;
	}

	/**
	 * Getter for the toLocationId field.
	 * @return the value of the toLocationId field.
	 */
	@Override
	public int getToLocationId() {
		return toLocationId;
	}

	/**
	 * Getter for the actionId field.
	 * @return the value of the actionId field.
	 */
	@Override
	public int getActionId() {
		return actionId;
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
	 * Getter for the addToQueue field.
	 * @return the value of the addToQueue field.
	 */
	@Override
	public boolean getAddToQueue() {
		return addToQueue;
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
	 * Setter for the fromLocationId field.
	 * @param fromLocationId the fromLocationId value to set.
	 */
	@Override
	public void setFromLocationId(int fromLocationId) {
		if (fromLocationId < -1) {
			throw new IllegalArgumentException("fromLocationId too small, minimum of -1, value: '" + fromLocationId + "'");
		}
		this.fromLocationId = fromLocationId;
	}

	/**
	 * Setter for the toLocationId field.
	 * @param toLocationId the toLocationId value to set.
	 */
	@Override
	public void setToLocationId(int toLocationId) {
		if (toLocationId < -1) {
			throw new IllegalArgumentException("toLocationId too small, minimum of -1, value: '" + toLocationId + "'");
		}
		this.toLocationId = toLocationId;
	}

	/**
	 * Setter for the actionId field.
	 * @param actionId the actionId value to set.
	 */
	@Override
	public void setActionId(int actionId) {
		if (actionId < -1) {
			throw new IllegalArgumentException("actionId too small, minimum of -1, value: '" + actionId + "'");
		}
		this.actionId = actionId;
	}

	/**
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	@Override
	public void setAmount(long amount) {
		this.amount = amount;
	}

	/**
	 * Setter for the addToQueue field.
	 * @param addToQueue the addToQueue value to set.
	 */
	@Override
	public void setAddToQueue(boolean addToQueue) {
		this.addToQueue = addToQueue;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getFromLocationId());
		builder.append(getToLocationId());
		builder.append(getActionId());
		builder.append(getAmount());
		builder.append(getAddToQueue());
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
		IStartActionAtLocationToLocation that = (IStartActionAtLocationToLocation) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getFromLocationId(), that.getFromLocationId());
		builder.append(this.getToLocationId(), that.getToLocationId());
		builder.append(this.getActionId(), that.getActionId());
		builder.append(this.getAmount(), that.getAmount());
		builder.append(this.getAddToQueue(), that.getAddToQueue());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getFromLocationId());
		builder.append(getToLocationId());
		builder.append(getActionId());
		builder.append(getAmount());
		builder.append(getAddToQueue());
		return builder.toString();
	}

	@Override
	public int compareTo(IStartActionAtLocationToLocation that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getFromLocationId(), that.getFromLocationId());
		builder.append(this.getToLocationId(), that.getToLocationId());
		builder.append(this.getActionId(), that.getActionId());
		builder.append(this.getAmount(), that.getAmount());
		builder.append(this.getAddToQueue(), that.getAddToQueue());
		return builder.toComparison();
	}
}
