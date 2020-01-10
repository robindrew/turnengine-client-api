package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetGameHostByName implements IGetGameHostByName {

	/** The name field. */
	private String name = null;
	/** The port field. */
	private int port = 0;

	/**
	 * The empty constructor.
	 */
	public GetGameHostByName() {
	}

	/**
	 * The fields constructor.
	 */
	public GetGameHostByName(String name, int port) {
		setName(name);
		setPort(port);
	}

	/**
	 * The clone constructor.
	 */
	public GetGameHostByName(IGetGameHostByName clone) {
		setName(clone.getName());
		setPort(clone.getPort());
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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the port field.
	 * @return the value of the port field.
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		if (name.length() < 6) {
			throw new IllegalArgumentException("name too short, minimum of 6 characters, value: '" + name + "'");
		}
		if (name.length() > 100) {
			throw new IllegalArgumentException("name too long, maximum of 100 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the port field.
	 * @param port the port value to set.
	 */
	@Override
	public void setPort(int port) {
		if (port < -1) {
			throw new IllegalArgumentException("port too small, minimum of -1, value: '" + port + "'");
		}
		if (port > 999999) {
			throw new IllegalArgumentException("port too large, maximum of 999999, value: '" + port + "'");
		}
		this.port = port;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getName());
		builder.append(getPort());
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
		IGetGameHostByName that = (IGetGameHostByName) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getPort(), that.getPort());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getPort());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetGameHostByName that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getPort(), that.getPort());
		return builder.toComparison();
	}
}
