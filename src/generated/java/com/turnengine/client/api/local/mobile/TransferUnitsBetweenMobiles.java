package com.turnengine.client.api.local.mobile;

import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TransferUnitsBetweenMobiles implements ITransferUnitsBetweenMobiles {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The fromMobileId field. */
	private int fromMobileId = 0;
	/** The toMobileId field. */
	private int toMobileId = 0;
	/** The unitList field. */
	private List<IUnitCount> unitList = null;
	/** The addToQueue field. */
	private boolean addToQueue = false;
	/** The repeat field. */
	private boolean repeat = false;

	/**
	 * The empty constructor.
	 */
	public TransferUnitsBetweenMobiles() {
	}

	/**
	 * The fields constructor.
	 */
	public TransferUnitsBetweenMobiles(long loginId, int instanceId, int fromMobileId, int toMobileId, List<IUnitCount> unitList, boolean addToQueue, boolean repeat) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setFromMobileId(fromMobileId);
		setToMobileId(toMobileId);
		setUnitList(unitList);
		setAddToQueue(addToQueue);
		setRepeat(repeat);
	}

	/**
	 * The clone constructor.
	 */
	public TransferUnitsBetweenMobiles(ITransferUnitsBetweenMobiles clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setFromMobileId(clone.getFromMobileId());
		setToMobileId(clone.getToMobileId());
		setUnitList(clone.getUnitList());
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
	 * Getter for the fromMobileId field.
	 * @return the value of the fromMobileId field.
	 */
	@Override
	public int getFromMobileId() {
		return fromMobileId;
	}

	/**
	 * Getter for the toMobileId field.
	 * @return the value of the toMobileId field.
	 */
	@Override
	public int getToMobileId() {
		return toMobileId;
	}

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	@Override
	public List<IUnitCount> getUnitList() {
		return unitList;
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
	 * Setter for the fromMobileId field.
	 * @param fromMobileId the fromMobileId value to set.
	 */
	@Override
	public void setFromMobileId(int fromMobileId) {
		if (fromMobileId < -1) {
			throw new IllegalArgumentException("fromMobileId too small, minimum of -1, value: '" + fromMobileId + "'");
		}
		this.fromMobileId = fromMobileId;
	}

	/**
	 * Setter for the toMobileId field.
	 * @param toMobileId the toMobileId value to set.
	 */
	@Override
	public void setToMobileId(int toMobileId) {
		if (toMobileId < -1) {
			throw new IllegalArgumentException("toMobileId too small, minimum of -1, value: '" + toMobileId + "'");
		}
		this.toMobileId = toMobileId;
	}

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	@Override
	public void setUnitList(List<IUnitCount> unitList) {
		this.unitList = unitList;
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
		builder.append(getFromMobileId());
		builder.append(getToMobileId());
		builder.append(getUnitList());
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
		ITransferUnitsBetweenMobiles that = (ITransferUnitsBetweenMobiles) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getFromMobileId(), that.getFromMobileId());
		builder.append(this.getToMobileId(), that.getToMobileId());
		builder.append(this.getUnitList(), that.getUnitList());
		builder.append(this.getAddToQueue(), that.getAddToQueue());
		builder.append(this.getRepeat(), that.getRepeat());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getFromMobileId());
		builder.append(getToMobileId());
		builder.append(getUnitList());
		builder.append(getAddToQueue());
		builder.append(getRepeat());
		return builder.toString();
	}

	@Override
	public int compareTo(ITransferUnitsBetweenMobiles that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getFromMobileId(), that.getFromMobileId());
		builder.append(this.getToMobileId(), that.getToMobileId());
		builder.append(this.getUnitList(), that.getUnitList());
		builder.append(this.getAddToQueue(), that.getAddToQueue());
		builder.append(this.getRepeat(), that.getRepeat());
		return builder.toComparison();
	}
}
