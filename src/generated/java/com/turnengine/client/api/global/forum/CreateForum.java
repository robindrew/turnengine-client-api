package com.turnengine.client.api.global.forum;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CreateForum implements ICreateForum {

	/** The loginId field. */
	private long loginId = 0l;
	/** The name field. */
	private String name = null;
	/** The parent field. */
	private int parent = 0;

	/**
	 * The empty constructor.
	 */
	public CreateForum() {
	}

	/**
	 * The fields constructor.
	 */
	public CreateForum(long loginId, String name, int parent) {
		setLoginId(loginId);
		setName(name);
		setParent(parent);
	}

	/**
	 * The clone constructor.
	 */
	public CreateForum(ICreateForum clone) {
		setLoginId(clone.getLoginId());
		setName(clone.getName());
		setParent(clone.getParent());
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
	 * Getter for the parent field.
	 * @return the value of the parent field.
	 */
	@Override
	public int getParent() {
		return parent;
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
		if (name.length() < 1) {
			throw new IllegalArgumentException("name too short, minimum of 1 characters, value: '" + name + "'");
		}
		if (name.length() > 500) {
			throw new IllegalArgumentException("name too long, maximum of 500 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the parent field.
	 * @param parent the parent value to set.
	 */
	@Override
	public void setParent(int parent) {
		if (parent < -1) {
			throw new IllegalArgumentException("parent too small, minimum of -1, value: '" + parent + "'");
		}
		this.parent = parent;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getName());
		builder.append(getParent());
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
		ICreateForum that = (ICreateForum) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getParent(), that.getParent());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getName());
		builder.append(getParent());
		return builder.toString();
	}

	@Override
	public int compareTo(ICreateForum that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getParent(), that.getParent());
		return builder.toComparison();
	}
}
