package com.turnengine.client.api.local.mobile;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class WaitMobile implements IWaitMobile {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The mobileId field. */
	private int mobileId = 0;
	/** The waitTurns field. */
	private int waitTurns = 0;
	/** The addToQueue field. */
	private boolean addToQueue = false;
	/** The repeat field. */
	private boolean repeat = false;

	/**
	 * The empty constructor.
	 */
	public WaitMobile() {
	}

	/**
	 * The fields constructor.
	 */
	public WaitMobile(long loginId, int instanceId, int mobileId, int waitTurns, boolean addToQueue, boolean repeat) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setMobileId(mobileId);
		setWaitTurns(waitTurns);
		setAddToQueue(addToQueue);
		setRepeat(repeat);
	}

	/**
	 * The clone constructor.
	 */
	public WaitMobile(IWaitMobile clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setMobileId(clone.getMobileId());
		setWaitTurns(clone.getWaitTurns());
		setAddToQueue(clone.getAddToQueue());
		setRepeat(clone.getRepeat());
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
	 * Getter for the waitTurns field.
	 * @return the value of the waitTurns field.
	 */
	@Override
	public int getWaitTurns() {
		return waitTurns;
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
	 * Getter for the repeat field.
	 * @return the value of the repeat field.
	 */
	@Override
	public boolean getRepeat() {
		return repeat;
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
	 * Setter for the waitTurns field.
	 * @param waitTurns the waitTurns value to set.
	 */
	@Override
	public void setWaitTurns(int waitTurns) {
		if (waitTurns < -1) {
			throw new IllegalArgumentException("waitTurns too small, minimum of -1, value: '" + waitTurns + "'");
		}
		this.waitTurns = waitTurns;
	}

	/**
	 * Setter for the addToQueue field.
	 * @param addToQueue the addToQueue value to set.
	 */
	@Override
	public void setAddToQueue(boolean addToQueue) {
		this.addToQueue = addToQueue;
	}

	/**
	 * Setter for the repeat field.
	 * @param repeat the repeat value to set.
	 */
	@Override
	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getMobileId());
		builder.append(getWaitTurns());
		builder.append(getAddToQueue());
		builder.append(getRepeat());
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
		IWaitMobile that = (IWaitMobile) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getWaitTurns(), that.getWaitTurns());
		builder.append(this.getAddToQueue(), that.getAddToQueue());
		builder.append(this.getRepeat(), that.getRepeat());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getMobileId());
		builder.append(getWaitTurns());
		builder.append(getAddToQueue());
		builder.append(getRepeat());
		return builder.toString();
	}

	@Override
	public int compareTo(IWaitMobile that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getWaitTurns(), that.getWaitTurns());
		builder.append(this.getAddToQueue(), that.getAddToQueue());
		builder.append(this.getRepeat(), that.getRepeat());
		return builder.toComparison();
	}
}
