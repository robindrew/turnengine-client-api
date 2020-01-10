package com.turnengine.client.api.local.message;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetMessageCountByFormat implements IGetMessageCountByFormat {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The format field. */
	private String format = null;

	/**
	 * The empty constructor.
	 */
	public GetMessageCountByFormat() {
	}

	/**
	 * The fields constructor.
	 */
	public GetMessageCountByFormat(long loginId, int instanceId, String format) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setFormat(format);
	}

	/**
	 * The clone constructor.
	 */
	public GetMessageCountByFormat(IGetMessageCountByFormat clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setFormat(clone.getFormat());
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
	 * Getter for the format field.
	 * @return the value of the format field.
	 */
	@Override
	public String getFormat() {
		return format;
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
	 * Setter for the format field.
	 * @param format the format value to set.
	 */
	@Override
	public void setFormat(String format) {
		if (format == null) {
			throw new NullPointerException("format");
		}
		if (format.length() < 0) {
			throw new IllegalArgumentException("format too short, minimum of 0 characters, value: '" + format + "'");
		}
		if (format.length() > 80) {
			throw new IllegalArgumentException("format too long, maximum of 80 characters, value: '" + format + "'");
		}
		this.format = format;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getFormat());
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
		IGetMessageCountByFormat that = (IGetMessageCountByFormat) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getFormat(), that.getFormat());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getFormat());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetMessageCountByFormat that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getFormat(), that.getFormat());
		return builder.toComparison();
	}
}
