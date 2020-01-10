package com.turnengine.client.api.local.action;

import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ActionTarget implements IActionTarget {

	/** The id field. */
	private int id = 0;
	/** The targetType field. */
	private ActionTargetType targetType = null;
	/** The type field. */
	private UnitType type = null;
	/** The relation field. */
	private UnitRelation relation = null;

	/**
	 * The empty constructor.
	 */
	public ActionTarget() {
	}

	/**
	 * The fields constructor.
	 */
	public ActionTarget(int id, ActionTargetType targetType, UnitType type, UnitRelation relation) {
		setId(id);
		setTargetType(targetType);
		setType(type);
		setRelation(relation);
	}

	/**
	 * The clone constructor.
	 */
	public ActionTarget(IActionTarget clone) {
		setId(clone.getId());
		setTargetType(clone.getTargetType());
		setType(clone.getType());
		setRelation(clone.getRelation());
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
	 * Getter for the targetType field.
	 * @return the value of the targetType field.
	 */
	@Override
	public ActionTargetType getTargetType() {
		return targetType;
	}

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public UnitType getType() {
		return type;
	}

	/**
	 * Getter for the relation field.
	 * @return the value of the relation field.
	 */
	@Override
	public UnitRelation getRelation() {
		return relation;
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
	 * Setter for the targetType field.
	 * @param targetType the targetType value to set.
	 */
	@Override
	public void setTargetType(ActionTargetType targetType) {
		this.targetType = targetType;
	}

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(UnitType type) {
		this.type = type;
	}

	/**
	 * Setter for the relation field.
	 * @param relation the relation value to set.
	 */
	@Override
	public void setRelation(UnitRelation relation) {
		this.relation = relation;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getTargetType());
		builder.append(getType());
		builder.append(getRelation());
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
		IActionTarget that = (IActionTarget) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getTargetType(), that.getTargetType());
		builder.append(this.getType(), that.getType());
		builder.append(this.getRelation(), that.getRelation());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getTargetType());
		builder.append(getType());
		builder.append(getRelation());
		return builder.toString();
	}

	@Override
	public int compareTo(IActionTarget that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getTargetType(), that.getTargetType());
		builder.append(this.getType(), that.getType());
		builder.append(this.getRelation(), that.getRelation());
		return builder.toComparison();
	}
}
