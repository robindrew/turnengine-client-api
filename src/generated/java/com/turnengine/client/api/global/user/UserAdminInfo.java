package com.turnengine.client.api.global.user;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserAdminInfo implements IUserAdminInfo {

	/** The user field. */
	private IUser user = null;
	/** The addresses field. */
	private List<IUserAddressCode> addresses = null;

	/**
	 * The empty constructor.
	 */
	public UserAdminInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public UserAdminInfo(IUser user, List<IUserAddressCode> addresses) {
		setUser(user);
		setAddresses(addresses);
	}

	/**
	 * The clone constructor.
	 */
	public UserAdminInfo(IUserAdminInfo clone) {
		setUser(clone.getUser());
		setAddresses(clone.getAddresses());
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
	 * Getter for the user field.
	 * @return the value of the user field.
	 */
	@Override
	public IUser getUser() {
		return user;
	}

	/**
	 * Getter for the addresses field.
	 * @return the value of the addresses field.
	 */
	@Override
	public List<IUserAddressCode> getAddresses() {
		return addresses;
	}

	/**
	 * Setter for the user field.
	 * @param user the user value to set.
	 */
	@Override
	public void setUser(IUser user) {
		this.user = user;
	}

	/**
	 * Setter for the addresses field.
	 * @param addresses the addresses value to set.
	 */
	@Override
	public void setAddresses(List<IUserAddressCode> addresses) {
		this.addresses = addresses;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getUser());
		builder.append(getAddresses());
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
		IUserAdminInfo that = (IUserAdminInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getUser(), that.getUser());
		builder.append(this.getAddresses(), that.getAddresses());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getUser());
		builder.append(getAddresses());
		return builder.toString();
	}

	@Override
	public int compareTo(IUserAdminInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getUser(), that.getUser());
		builder.append(this.getAddresses(), that.getAddresses());
		return builder.toComparison();
	}
}
