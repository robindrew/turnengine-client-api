package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetUserSimilarityList implements IGetUserSimilarityList {

	/** The loginId field. */
	private long loginId = 0l;
	/** The order field. */
	private UserSimilarityOrder order = null;
	/** The threshold field. */
	private int threshold = 0;
	/** The pageNumber field. */
	private int pageNumber = 0;
	/** The pageSize field. */
	private int pageSize = 0;

	/**
	 * The empty constructor.
	 */
	public GetUserSimilarityList() {
	}

	/**
	 * The fields constructor.
	 */
	public GetUserSimilarityList(long loginId, UserSimilarityOrder order, int threshold, int pageNumber, int pageSize) {
		setLoginId(loginId);
		setOrder(order);
		setThreshold(threshold);
		setPageNumber(pageNumber);
		setPageSize(pageSize);
	}

	/**
	 * The clone constructor.
	 */
	public GetUserSimilarityList(IGetUserSimilarityList clone) {
		setLoginId(clone.getLoginId());
		setOrder(clone.getOrder());
		setThreshold(clone.getThreshold());
		setPageNumber(clone.getPageNumber());
		setPageSize(clone.getPageSize());
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
	 * Getter for the order field.
	 * @return the value of the order field.
	 */
	@Override
	public UserSimilarityOrder getOrder() {
		return order;
	}

	/**
	 * Getter for the threshold field.
	 * @return the value of the threshold field.
	 */
	@Override
	public int getThreshold() {
		return threshold;
	}

	/**
	 * Getter for the pageNumber field.
	 * @return the value of the pageNumber field.
	 */
	@Override
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * Getter for the pageSize field.
	 * @return the value of the pageSize field.
	 */
	@Override
	public int getPageSize() {
		return pageSize;
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
	 * Setter for the order field.
	 * @param order the order value to set.
	 */
	@Override
	public void setOrder(UserSimilarityOrder order) {
		this.order = order;
	}

	/**
	 * Setter for the threshold field.
	 * @param threshold the threshold value to set.
	 */
	@Override
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	/**
	 * Setter for the pageNumber field.
	 * @param pageNumber the pageNumber value to set.
	 */
	@Override
	public void setPageNumber(int pageNumber) {
		if (pageNumber < 1) {
			throw new IllegalArgumentException("pageNumber too small, minimum of 1, value: '" + pageNumber + "'");
		}
		this.pageNumber = pageNumber;
	}

	/**
	 * Setter for the pageSize field.
	 * @param pageSize the pageSize value to set.
	 */
	@Override
	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			throw new IllegalArgumentException("pageSize too small, minimum of 1, value: '" + pageSize + "'");
		}
		this.pageSize = pageSize;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getOrder());
		builder.append(getThreshold());
		builder.append(getPageNumber());
		builder.append(getPageSize());
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
		IGetUserSimilarityList that = (IGetUserSimilarityList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getOrder(), that.getOrder());
		builder.append(this.getThreshold(), that.getThreshold());
		builder.append(this.getPageNumber(), that.getPageNumber());
		builder.append(this.getPageSize(), that.getPageSize());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getOrder());
		builder.append(getThreshold());
		builder.append(getPageNumber());
		builder.append(getPageSize());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetUserSimilarityList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getOrder(), that.getOrder());
		builder.append(this.getThreshold(), that.getThreshold());
		builder.append(this.getPageNumber(), that.getPageNumber());
		builder.append(this.getPageSize(), that.getPageSize());
		return builder.toComparison();
	}
}
