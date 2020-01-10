package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class NewGameHost implements INewGameHost {

	/** The loginId field. */
	private long loginId = 0l;
	/** The name field. */
	private String name = null;
	/** The port field. */
	private int port = 0;

	/**
	 * The empty constructor.
	 */
	public NewGameHost() {
	}

	/**
	 * The fields constructor.
	 */
	public NewGameHost(long loginId, String name, int port) {
		setLoginId(loginId);
		setName(name);
		setPort(port);
	}

	/**
	 * The clone constructor.
	 */
	public NewGameHost(INewGameHost clone) {
		setLoginId(clone.getLoginId());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
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
		builder.append(getLoginId());
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
		INewGameHost that = (INewGameHost) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPort(), that.getPort());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getName());
		builder.append(getPort());
		return builder.toString();
	}

	@Override
	public int compareTo(INewGameHost that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPort(), that.getPort());
		return builder.toComparison();
	}
}
