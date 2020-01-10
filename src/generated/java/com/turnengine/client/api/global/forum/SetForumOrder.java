package com.turnengine.client.api.global.forum;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetForumOrder implements ISetForumOrder {

	/** The loginId field. */
	private long loginId = 0l;
	/** The forumId field. */
	private int forumId = 0;
	/** The order field. */
	private int order = 0;

	/**
	 * The empty constructor.
	 */
	public SetForumOrder() {
	}

	/**
	 * The fields constructor.
	 */
	public SetForumOrder(long loginId, int forumId, int order) {
		setLoginId(loginId);
		setForumId(forumId);
		setOrder(order);
	}

	/**
	 * The clone constructor.
	 */
	public SetForumOrder(ISetForumOrder clone) {
		setLoginId(clone.getLoginId());
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
		ISetForumOrder that = (ISetForumOrder) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getOrder(), that.getOrder());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getForumId());
		builder.append(getOrder());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetForumOrder that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getOrder(), that.getOrder());
		return builder.toComparison();
	}
}
