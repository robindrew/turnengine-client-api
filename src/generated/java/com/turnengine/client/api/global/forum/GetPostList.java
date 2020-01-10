package com.turnengine.client.api.global.forum;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetPostList implements IGetPostList {

	/** The loginId field. */
	private long loginId = 0l;
	/** The threadId field. */
	private int threadId = 0;
	/** The pageNumber field. */
	private int pageNumber = 0;
	/** The pageSize field. */
	private int pageSize = 0;

	/**
	 * The empty constructor.
	 */
	public GetPostList() {
	}

	/**
	 * The fields constructor.
	 */
	public GetPostList(long loginId, int threadId, int pageNumber, int pageSize) {
		setLoginId(loginId);
		setThreadId(threadId);
		setPageNumber(pageNumber);
		setPageSize(pageSize);
	}

	/**
	 * The clone constructor.
	 */
	public GetPostList(IGetPostList clone) {
		setLoginId(clone.getLoginId());
		setThreadId(clone.getThreadId());
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
	 * Getter for the threadId field.
	 * @return the value of the threadId field.
	 */
	@Override
	public int getThreadId() {
		return threadId;
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
	 * Setter for the threadId field.
	 * @param threadId the threadId value to set.
	 */
	@Override
	public void setThreadId(int threadId) {
		if (threadId < -1) {
			throw new IllegalArgumentException("threadId too small, minimum of -1, value: '" + threadId + "'");
		}
		this.threadId = threadId;
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
		builder.append(getThreadId());
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
		IGetPostList that = (IGetPostList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getThreadId(), that.getThreadId());
		builder.append(this.getPageNumber(), that.getPageNumber());
		builder.append(this.getPageSize(), that.getPageSize());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getThreadId());
		builder.append(getPageNumber());
		builder.append(getPageSize());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetPostList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getThreadId(), that.getThreadId());
		builder.append(this.getPageNumber(), that.getPageNumber());
		builder.append(this.getPageSize(), that.getPageSize());
		return builder.toComparison();
	}
}
