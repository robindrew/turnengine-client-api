package com.turnengine.client.api.local.allianceforum;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetAllianceForumOrder implements ISetAllianceForumOrder {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The forumId field. */
	private int forumId = 0;
	/** The order field. */
	private int order = 0;

	/**
	 * The empty constructor.
	 */
	public SetAllianceForumOrder() {
	}

	/**
	 * The fields constructor.
	 */
	public SetAllianceForumOrder(long loginId, int instanceId, int forumId, int order) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setForumId(forumId);
		setOrder(order);
	}

	/**
	 * The clone constructor.
	 */
	public SetAllianceForumOrder(ISetAllianceForumOrder clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setForumId(clone.getForumId());
		setOrder(clone.getOrder());
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
	 * Getter for the forumId field.
	 * @return the value of the forumId field.
	 */
	@Override
	public int getForumId() {
		return forumId;
	}

	/**
	 * Getter for the order field.
	 * @return the value of the order field.
	 */
	@Override
	public int getOrder() {
		return order;
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
	 * Setter for the forumId field.
	 * @param forumId the forumId value to set.
	 */
	@Override
	public void setForumId(int forumId) {
		if (forumId < -1) {
			throw new IllegalArgumentException("forumId too small, minimum of -1, value: '" + forumId + "'");
		}
		this.forumId = forumId;
	}

	/**
	 * Setter for the order field.
	 * @param order the order value to set.
	 */
	@Override
	public void setOrder(int order) {
		if (order < 0) {
			throw new IllegalArgumentException("order too small, minimum of 0, value: '" + order + "'");
		}
		this.order = order;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getForumId());
		builder.append(getOrder());
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
		ISetAllianceForumOrder that = (ISetAllianceForumOrder) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getOrder(), that.getOrder());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getForumId());
		builder.append(getOrder());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetAllianceForumOrder that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getOrder(), that.getOrder());
		return builder.toComparison();
	}
}
