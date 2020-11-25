package com.turnengine.client.api.local.action;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AddMoveRegion implements IAddMoveRegion {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The name field. */
	private String name = null;
	/** The from field. */
	private int from = 0;
	/** The to field. */
	private int to = 0;

	/**
	 * The empty constructor.
	 */
	public AddMoveRegion() {
	}

	/**
	 * The fields constructor.
	 */
	public AddMoveRegion(long loginId, int instanceId, String name, int from, int to) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setName(name);
		setFrom(from);
		setTo(to);
	}

	/**
	 * The clone constructor.
	 */
	public AddMoveRegion(IAddMoveRegion clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setName(clone.getName());
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
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
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
	 * Getter for the from field.
	 * @return the value of the from field.
	 */
	@Override
	public int getFrom() {
		return from;
	}

	/**
	 * Getter for the to field.
	 * @return the value of the to field.
	 */
	@Override
	public int getTo() {
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
		if (name.length() > 200) {
			throw new IllegalArgumentException("name too long, maximum of 200 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the from field.
	 * @param from the from value to set.
	 */
	@Override
	public void setFrom(int from) {
		if (from < -1) {
			throw new IllegalArgumentException("from too small, minimum of -1, value: '" + from + "'");
		}
		this.from = from;
	}

	/**
	 * Setter for the to field.
	 * @param to the to value to set.
	 */
	@Override
	public void setTo(int to) {
		if (to < -1) {
			throw new IllegalArgumentException("to too small, minimum of -1, value: '" + to + "'");
		}
		this.to = to;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getName());
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
		IAddMoveRegion that = (IAddMoveRegion) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getFrom(), that.getFrom());
		builder.append(this.getTo(), that.getTo());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getName());
		builder.append(getFrom());
		builder.append(getTo());
		return builder.toString();
	}

	@Override
	public int compareTo(IAddMoveRegion that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getFrom(), that.getFrom());
		builder.append(this.getTo(), that.getTo());
		return builder.toComparison();
	}
}
