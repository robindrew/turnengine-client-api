package com.turnengine.client.api.local.setup;

import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetupAddActionTarget implements ISetupAddActionTarget {

	/** The name field. */
	private String name = null;
	/** The target field. */
	private ActionTargetType target = null;
	/** The type field. */
	private UnitType type = null;
	/** The relation field. */
	private UnitRelation relation = null;

	/**
	 * The empty constructor.
	 */
	public SetupAddActionTarget() {
	}

	/**
	 * The fields constructor.
	 */
	public SetupAddActionTarget(String name, ActionTargetType target, UnitType type, UnitRelation relation) {
		setName(name);
		setTarget(target);
		setType(type);
		setRelation(relation);
	}

	/**
	 * The clone constructor.
	 */
	public SetupAddActionTarget(ISetupAddActionTarget clone) {
		setName(clone.getName());
		setTarget(clone.getTarget());
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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the target field.
	 * @return the value of the target field.
	 */
	@Override
	public ActionTargetType getTarget() {
		return target;
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
	 * Setter for the target field.
	 * @param target the target value to set.
	 */
	@Override
	public void setTarget(ActionTargetType target) {
		this.target = target;
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
		builder.append(getName());
		builder.append(getTarget());
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
		ISetupAddActionTarget that = (ISetupAddActionTarget) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getTarget(), that.getTarget());
		builder.append(this.getType(), that.getType());
		builder.append(this.getRelation(), that.getRelation());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getTarget());
		builder.append(getType());
		builder.append(getRelation());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetupAddActionTarget that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getTarget(), that.getTarget());
		builder.append(this.getType(), that.getType());
		builder.append(this.getRelation(), that.getRelation());
		return builder.toComparison();
	}
}
