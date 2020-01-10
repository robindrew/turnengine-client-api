package com.turnengine.client.api.local.setup;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetupAddAction implements ISetupAddAction {

	/** The name field. */
	private String name = null;
	/** The turns field. */
	private int turns = 0;
	/** The limit field. */
	private int limit = 0;

	/**
	 * The empty constructor.
	 */
	public SetupAddAction() {
	}

	/**
	 * The fields constructor.
	 */
	public SetupAddAction(String name, int turns, int limit) {
		setName(name);
		setTurns(turns);
		setLimit(limit);
	}

	/**
	 * The clone constructor.
	 */
	public SetupAddAction(ISetupAddAction clone) {
		setName(clone.getName());
		setTurns(clone.getTurns());
		setLimit(clone.getLimit());
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
	 * Getter for the turns field.
	 * @return the value of the turns field.
	 */
	@Override
	public int getTurns() {
		return turns;
	}

	/**
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	@Override
	public int getLimit() {
		return limit;
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
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	@Override
	public void setTurns(int turns) {
		if (turns < -1) {
			throw new IllegalArgumentException("turns too small, minimum of -1, value: '" + turns + "'");
		}
		this.turns = turns;
	}

	/**
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	@Override
	public void setLimit(int limit) {
		if (limit < -1) {
			throw new IllegalArgumentException("limit too small, minimum of -1, value: '" + limit + "'");
		}
		this.limit = limit;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getName());
		builder.append(getTurns());
		builder.append(getLimit());
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
		ISetupAddAction that = (ISetupAddAction) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getTurns(), that.getTurns());
		builder.append(this.getLimit(), that.getLimit());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getTurns());
		builder.append(getLimit());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetupAddAction that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getTurns(), that.getTurns());
		builder.append(this.getLimit(), that.getLimit());
		return builder.toComparison();
	}
}
