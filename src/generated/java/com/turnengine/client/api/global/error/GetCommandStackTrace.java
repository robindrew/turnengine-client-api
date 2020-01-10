package com.turnengine.client.api.global.error;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetCommandStackTrace implements IGetCommandStackTrace {

	/** The loginId field. */
	private long loginId = 0l;
	/** The id field. */
	private long id = 0l;

	/**
	 * The empty constructor.
	 */
	public GetCommandStackTrace() {
	}

	/**
	 * The fields constructor.
	 */
	public GetCommandStackTrace(long loginId, long id) {
		setLoginId(loginId);
		setId(id);
	}

	/**
	 * The clone constructor.
	 */
	public GetCommandStackTrace(IGetCommandStackTrace clone) {
		setLoginId(clone.getLoginId());
		setId(clone.getId());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public long getId() {
		return id;
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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(long id) {
		if (id < 0) {
			throw new IllegalArgumentException("id too small, minimum of 0, value: '" + id + "'");
		}
		this.id = id;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getId());
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
		IGetCommandStackTrace that = (IGetCommandStackTrace) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getId(), that.getId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetCommandStackTrace that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getId(), that.getId());
		return builder.toComparison();
	}
}
