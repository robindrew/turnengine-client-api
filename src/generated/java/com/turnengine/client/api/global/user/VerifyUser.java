package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class VerifyUser implements IVerifyUser {

	/** The id field. */
	private int id = 0;
	/** The code field. */
	private long code = 0l;
	/** The address field. */
	private String address = null;

	/**
	 * The empty constructor.
	 */
	public VerifyUser() {
	}

	/**
	 * The fields constructor.
	 */
	public VerifyUser(int id, long code, String address) {
		setId(id);
		setCode(code);
		setAddress(address);
	}

	/**
	 * The clone constructor.
	 */
	public VerifyUser(IVerifyUser clone) {
		setId(clone.getId());
		setCode(clone.getCode());
		setAddress(clone.getAddress());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	@Override
	public long getCode() {
		return code;
	}

	/**
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < -1) {
			throw new IllegalArgumentException("id too small, minimum of -1, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	@Override
	public void setCode(long code) {
		this.code = code;
	}

	/**
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	@Override
	public void setAddress(String address) {
		if (address == null) {
			throw new NullPointerException("address");
		}
		this.address = address;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getCode());
		builder.append(getAddress());
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
		IVerifyUser that = (IVerifyUser) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getCode(), that.getCode());
		builder.append(this.getAddress(), that.getAddress());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getCode());
		builder.append(getAddress());
		return builder.toString();
	}

	@Override
	public int compareTo(IVerifyUser that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getCode(), that.getCode());
		builder.append(this.getAddress(), that.getAddress());
		return builder.toComparison();
	}
}
