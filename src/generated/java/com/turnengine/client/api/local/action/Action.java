package com.turnengine.client.api.local.action;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Action implements IAction {

	/** The id field. */
	private int id = 0;
	/** The turns field. */
	private int turns = 0;
	/** The limit field. */
	private int limit = 0;

	/**
	 * The empty constructor.
	 */
	public Action() {
	}

	/**
	 * The fields constructor.
	 */
	public Action(int id, int turns, int limit) {
		setId(id);
		setTurns(turns);
		setLimit(limit);
	}

	/**
	 * The clone constructor.
	 */
	public Action(IAction clone) {
		setId(clone.getId());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
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
		builder.append(getId());
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
		IAction that = (IAction) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getTurns(), that.getTurns());
		builder.append(this.getLimit(), that.getLimit());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getTurns());
		builder.append(getLimit());
		return builder.toString();
	}

	@Override
	public int compareTo(IAction that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getTurns(), that.getTurns());
		builder.append(this.getLimit(), that.getLimit());
		return builder.toComparison();
	}
}
