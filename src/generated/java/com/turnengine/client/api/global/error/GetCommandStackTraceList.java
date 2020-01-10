package com.turnengine.client.api.global.error;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetCommandStackTraceList implements IGetCommandStackTraceList {

	/** The loginId field. */
	private long loginId = 0l;
	/** The from field. */
	private long from = 0l;
	/** The to field. */
	private long to = 0l;

	/**
	 * The empty constructor.
	 */
	public GetCommandStackTraceList() {
	}

	/**
	 * The fields constructor.
	 */
	public GetCommandStackTraceList(long loginId, long from, long to) {
		setLoginId(loginId);
		setFrom(from);
		setTo(to);
	}

	/**
	 * The clone constructor.
	 */
	public GetCommandStackTraceList(IGetCommandStackTraceList clone) {
		setLoginId(clone.getLoginId());
		setFrom(clone.getFrom());
		setTo(clone.getTo());
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
	 * Getter for the from field.
	 * @return the value of the from field.
	 */
	@Override
	public long getFrom() {
		return from;
	}

	/**
	 * Getter for the to field.
	 * @return the value of the to field.
	 */
	@Override
	public long getTo() {
		return to;
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
	 * Setter for the from field.
	 * @param from the from value to set.
	 */
	@Override
	public void setFrom(long from) {
		this.from = from;
	}

	/**
	 * Setter for the to field.
	 * @param to the to value to set.
	 */
	@Override
	public void setTo(long to) {
		this.to = to;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getFrom());
		builder.append(getTo());
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
		IGetCommandStackTraceList that = (IGetCommandStackTraceList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getFrom(), that.getFrom());
		builder.append(this.getTo(), that.getTo());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getFrom());
		builder.append(getTo());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetCommandStackTraceList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getFrom(), that.getFrom());
		builder.append(this.getTo(), that.getTo());
		return builder.toComparison();
	}
}
