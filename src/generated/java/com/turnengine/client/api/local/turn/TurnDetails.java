package com.turnengine.client.api.local.turn;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TurnDetails implements ITurnDetails {

	/** The turn field. */
	private ITurn turn = null;
	/** The components field. */
	private List<ITurnComponent> components = null;

	/**
	 * The empty constructor.
	 */
	public TurnDetails() {
	}

	/**
	 * The fields constructor.
	 */
	public TurnDetails(ITurn turn, List<ITurnComponent> components) {
		setTurn(turn);
		setComponents(components);
	}

	/**
	 * The clone constructor.
	 */
	public TurnDetails(ITurnDetails clone) {
		setTurn(clone.getTurn());
		setComponents(clone.getComponents());
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
	 * Getter for the turn field.
	 * @return the value of the turn field.
	 */
	@Override
	public ITurn getTurn() {
		return turn;
	}

	/**
	 * Getter for the components field.
	 * @return the value of the components field.
	 */
	@Override
	public List<ITurnComponent> getComponents() {
		return components;
	}

	/**
	 * Setter for the turn field.
	 * @param turn the turn value to set.
	 */
	@Override
	public void setTurn(ITurn turn) {
		this.turn = turn;
	}

	/**
	 * Setter for the components field.
	 * @param components the components value to set.
	 */
	@Override
	public void setComponents(List<ITurnComponent> components) {
		this.components = components;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getTurn());
		builder.append(getComponents());
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
		ITurnDetails that = (ITurnDetails) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getTurn(), that.getTurn());
		builder.append(this.getComponents(), that.getComponents());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getTurn());
		builder.append(getComponents());
		return builder.toString();
	}

	@Override
	public int compareTo(ITurnDetails that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getTurn(), that.getTurn());
		builder.append(this.getComponents(), that.getComponents());
		return builder.toComparison();
	}
}
