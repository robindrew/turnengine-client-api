package com.turnengine.client.api.local.action;

import com.turnengine.client.api.local.unit.UnitType;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ActionQueued implements IActionQueued {

	/** The sourceId field. */
	private int sourceId = 0;
	/** The sourceType field. */
	private UnitType sourceType = null;
	/** The targetId field. */
	private int targetId = 0;
	/** The targetType field. */
	private UnitType targetType = null;
	/** The actionId field. */
	private int actionId = 0;
	/** The groupId field. */
	private int groupId = 0;
	/** The amount field. */
	private long amount = 0l;
	/** The index field. */
	private int index = 0;

	/**
	 * The empty constructor.
	 */
	public ActionQueued() {
	}

	/**
	 * The fields constructor.
	 */
	public ActionQueued(int sourceId, UnitType sourceType, int targetId, UnitType targetType, int actionId, int groupId, long amount, int index) {
		setSourceId(sourceId);
		setSourceType(sourceType);
		setTargetId(targetId);
		setTargetType(targetType);
		setActionId(actionId);
		setGroupId(groupId);
		setAmount(amount);
		setIndex(index);
	}

	/**
	 * The clone constructor.
	 */
	public ActionQueued(IActionQueued clone) {
		setSourceId(clone.getSourceId());
		setSourceType(clone.getSourceType());
		setTargetId(clone.getTargetId());
		setTargetType(clone.getTargetType());
		setActionId(clone.getActionId());
		setGroupId(clone.getGroupId());
		setAmount(clone.getAmount());
		setIndex(clone.getIndex());
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
	 * Getter for the sourceId field.
	 * @return the value of the sourceId field.
	 */
	@Override
	public int getSourceId() {
		return sourceId;
	}

	/**
	 * Getter for the sourceType field.
	 * @return the value of the sourceType field.
	 */
	@Override
	public UnitType getSourceType() {
		return sourceType;
	}

	/**
	 * Getter for the targetId field.
	 * @return the value of the targetId field.
	 */
	@Override
	public int getTargetId() {
		return targetId;
	}

	/**
	 * Getter for the targetType field.
	 * @return the value of the targetType field.
	 */
	@Override
	public UnitType getTargetType() {
		return targetType;
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
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	@Override
	public int getGroupId() {
		return groupId;
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
	 * Getter for the index field.
	 * @return the value of the index field.
	 */
	@Override
	public int getIndex() {
		return index;
	}

	/**
	 * Setter for the sourceId field.
	 * @param sourceId the sourceId value to set.
	 */
	@Override
	public void setSourceId(int sourceId) {
		if (sourceId < -1) {
			throw new IllegalArgumentException("sourceId too small, minimum of -1, value: '" + sourceId + "'");
		}
		this.sourceId = sourceId;
	}

	/**
	 * Setter for the sourceType field.
	 * @param sourceType the sourceType value to set.
	 */
	@Override
	public void setSourceType(UnitType sourceType) {
		this.sourceType = sourceType;
	}

	/**
	 * Setter for the targetId field.
	 * @param targetId the targetId value to set.
	 */
	@Override
	public void setTargetId(int targetId) {
		if (targetId < -1) {
			throw new IllegalArgumentException("targetId too small, minimum of -1, value: '" + targetId + "'");
		}
		this.targetId = targetId;
	}

	/**
	 * Setter for the targetType field.
	 * @param targetType the targetType value to set.
	 */
	@Override
	public void setTargetType(UnitType targetType) {
		this.targetType = targetType;
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
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	@Override
	public void setGroupId(int groupId) {
		if (groupId < -1) {
			throw new IllegalArgumentException("groupId too small, minimum of -1, value: '" + groupId + "'");
		}
		this.groupId = groupId;
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
	 * Setter for the index field.
	 * @param index the index value to set.
	 */
	@Override
	public void setIndex(int index) {
		if (index < 0) {
			throw new IllegalArgumentException("index too small, minimum of 0, value: '" + index + "'");
		}
		this.index = index;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getSourceId());
		builder.append(getSourceType());
		builder.append(getTargetId());
		builder.append(getTargetType());
		builder.append(getActionId());
		builder.append(getGroupId());
		builder.append(getAmount());
		builder.append(getIndex());
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
		IActionQueued that = (IActionQueued) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getSourceId(), that.getSourceId());
		builder.append(this.getSourceType(), that.getSourceType());
		builder.append(this.getTargetId(), that.getTargetId());
		builder.append(this.getTargetType(), that.getTargetType());
		builder.append(this.getActionId(), that.getActionId());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getAmount(), that.getAmount());
		builder.append(this.getIndex(), that.getIndex());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getSourceId());
		builder.append(getSourceType());
		builder.append(getTargetId());
		builder.append(getTargetType());
		builder.append(getActionId());
		builder.append(getGroupId());
		builder.append(getAmount());
		builder.append(getIndex());
		return builder.toString();
	}

	@Override
	public int compareTo(IActionQueued that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getSourceId(), that.getSourceId());
		builder.append(this.getSourceType(), that.getSourceType());
		builder.append(this.getTargetId(), that.getTargetId());
		builder.append(this.getTargetType(), that.getTargetType());
		builder.append(this.getActionId(), that.getActionId());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getAmount(), that.getAmount());
		builder.append(this.getIndex(), that.getIndex());
		return builder.toComparison();
	}
}
