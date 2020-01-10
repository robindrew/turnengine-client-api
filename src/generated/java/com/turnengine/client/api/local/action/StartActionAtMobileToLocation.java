package com.turnengine.client.api.local.action;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StartActionAtMobileToLocation implements IStartActionAtMobileToLocation {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The mobileId field. */
	private int mobileId = 0;
	/** The locationId field. */
	private int locationId = 0;
	/** The actionId field. */
	private int actionId = 0;
	/** The amount field. */
	private long amount = 0l;
	/** The addToQueue field. */
	private boolean addToQueue = false;

	/**
	 * The empty constructor.
	 */
	public StartActionAtMobileToLocation() {
	}

	/**
	 * The fields constructor.
	 */
	public StartActionAtMobileToLocation(long loginId, int instanceId, int mobileId, int locationId, int actionId, long amount, boolean addToQueue) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setMobileId(mobileId);
		setLocationId(locationId);
		setActionId(actionId);
		setAmount(amount);
		setAddToQueue(addToQueue);
	}

	/**
	 * The clone constructor.
	 */
	public StartActionAtMobileToLocation(IStartActionAtMobileToLocation clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setMobileId(clone.getMobileId());
		setLocationId(clone.getLocationId());
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
	 * Getter for the mobileId field.
	 * @return the value of the mobileId field.
	 */
	@Override
	public int getMobileId() {
		return mobileId;
	}

	/**
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	@Override
	public int getLocationId() {
		return locationId;
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
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	@Override
	public void setLocationId(int locationId) {
		if (locationId < -1) {
			throw new IllegalArgumentException("locationId too small, minimum of -1, value: '" + locationId + "'");
		}
		this.locationId = locationId;
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
		builder.append(getMobileId());
		builder.append(getLocationId());
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
		IStartActionAtMobileToLocation that = (IStartActionAtMobileToLocation) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getLocationId(), that.getLocationId());
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
		builder.append(getMobileId());
		builder.append(getLocationId());
		builder.append(getActionId());
		builder.append(getAmount());
		builder.append(getAddToQueue());
		return builder.toString();
	}

	@Override
	public int compareTo(IStartActionAtMobileToLocation that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getActionId(), that.getActionId());
		builder.append(this.getAmount(), that.getAmount());
		builder.append(this.getAddToQueue(), that.getAddToQueue());
		return builder.toComparison();
	}
}
