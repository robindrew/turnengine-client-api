package com.turnengine.client.api.global.user;

import com.turnengine.client.api.global.admin.IAdminHostAddress;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserAddressCode implements IUserAddressCode {

	/** The userId field. */
	private int userId = 0;
	/** The code field. */
	private String code = null;
	/** The timestamp field. */
	private long timestamp = 0l;
	/** The detail field. */
	private IAdminHostAddress detail = null;

	/**
	 * The empty constructor.
	 */
	public UserAddressCode() {
	}

	/**
	 * The fields constructor.
	 */
	public UserAddressCode(int userId, String code, long timestamp, IAdminHostAddress detail) {
		setUserId(userId);
		setCode(code);
		setTimestamp(timestamp);
		setDetail(detail);
	}

	/**
	 * The clone constructor.
	 */
	public UserAddressCode(IUserAddressCode clone) {
		setUserId(clone.getUserId());
		setCode(clone.getCode());
		setTimestamp(clone.getTimestamp());
		setDetail(clone.getDetail());
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
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	@Override
	public int getUserId() {
		return userId;
	}

	/**
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	@Override
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * Getter for the detail field.
	 * @return the value of the detail field.
	 */
	@Override
	public IAdminHostAddress getDetail() {
		return detail;
	}

	/**
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	@Override
	public void setUserId(int userId) {
		if (userId < -1) {
			throw new IllegalArgumentException("userId too small, minimum of -1, value: '" + userId + "'");
		}
		this.userId = userId;
	}

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	@Override
	public void setCode(String code) {
		if (code == null) {
			throw new NullPointerException("code");
		}
		this.code = code;
	}

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	@Override
	public void setTimestamp(long timestamp) {
		if (timestamp < 0) {
			throw new IllegalArgumentException("timestamp too small, minimum of 0, value: '" + timestamp + "'");
		}
		this.timestamp = timestamp;
	}

	/**
	 * Setter for the detail field.
	 * @param detail the detail value to set.
	 */
	@Override
	public void setDetail(IAdminHostAddress detail) {
		this.detail = detail;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getUserId());
		builder.append(getCode());
		builder.append(getTimestamp());
		builder.append(getDetail());
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
		IUserAddressCode that = (IUserAddressCode) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getCode(), that.getCode());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getDetail(), that.getDetail());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getUserId());
		builder.append(getCode());
		builder.append(getTimestamp());
		builder.append(getDetail());
		return builder.toString();
	}

	@Override
	public int compareTo(IUserAddressCode that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getCode(), that.getCode());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getDetail(), that.getDetail());
		return builder.toComparison();
	}
}
