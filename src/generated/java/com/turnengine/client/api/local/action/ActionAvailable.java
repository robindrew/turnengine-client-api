package com.turnengine.client.api.local.action;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ActionAvailable implements IActionAvailable {

	/** The actionId field. */
	private int actionId = 0;
	/** The amount field. */
	private long amount = 0l;

	/**
	 * The empty constructor.
	 */
	public ActionAvailable() {
	}

	/**
	 * The fields constructor.
	 */
	public ActionAvailable(int actionId, long amount) {
		setActionId(actionId);
		setAmount(amount);
	}

	/**
	 * The clone constructor.
	 */
	public ActionAvailable(IActionAvailable clone) {
		setActionId(clone.getActionId());
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getActionId());
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
		IActionAvailable that = (IActionAvailable) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getActionId(), that.getActionId());
		builder.append(this.getAmount(), that.getAmount());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getActionId());
		builder.append(getAmount());
		return builder.toString();
	}

	@Override
	public int compareTo(IActionAvailable that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getActionId(), that.getActionId());
		builder.append(this.getAmount(), that.getAmount());
		return builder.toComparison();
	}
}
