package com.turnengine.client.api.global.forum;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetThread implements IGetThread {

	/** The loginId field. */
	private long loginId = 0l;
	/** The threadId field. */
	private int threadId = 0;

	/**
	 * The empty constructor.
	 */
	public GetThread() {
	}

	/**
	 * The fields constructor.
	 */
	public GetThread(long loginId, int threadId) {
		setLoginId(loginId);
		setThreadId(threadId);
	}

	/**
	 * The clone constructor.
	 */
	public GetThread(IGetThread clone) {
		setLoginId(clone.getLoginId());
		setThreadId(clone.getThreadId());
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getThreadId());
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
		IGetThread that = (IGetThread) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getThreadId(), that.getThreadId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getThreadId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetThread that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getThreadId(), that.getThreadId());
		return builder.toComparison();
	}
}
