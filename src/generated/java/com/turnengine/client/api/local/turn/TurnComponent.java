package com.turnengine.client.api.local.turn;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TurnComponent implements ITurnComponent {

	/** The name field. */
	private String name = null;
	/** The duration field. */
	private long duration = 0l;

	/**
	 * The empty constructor.
	 */
	public TurnComponent() {
	}

	/**
	 * The fields constructor.
	 */
	public TurnComponent(String name, long duration) {
		setName(name);
		setDuration(duration);
	}

	/**
	 * The clone constructor.
	 */
	public TurnComponent(ITurnComponent clone) {
		setName(clone.getName());
		setDuration(clone.getDuration());
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
	 * Getter for the duration field.
	 * @return the value of the duration field.
	 */
	@Override
	public long getDuration() {
		return duration;
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
		this.name = name;
	}

	/**
	 * Setter for the duration field.
	 * @param duration the duration value to set.
	 */
	@Override
	public void setDuration(long duration) {
		if (duration < -1) {
			throw new IllegalArgumentException("duration too small, minimum of -1, value: '" + duration + "'");
		}
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getName());
		builder.append(getDuration());
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
		ITurnComponent that = (ITurnComponent) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getDuration(), that.getDuration());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getDuration());
		return builder.toString();
	}

	@Override
	public int compareTo(ITurnComponent that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getDuration(), that.getDuration());
		return builder.toComparison();
	}
}
