package com.turnengine.client.api.local.action;

import com.turnengine.client.api.local.creation.CreationConditionType;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ActionCondition implements IActionCondition {

	/** The id field. */
	private int id = 0;
	/** The target field. */
	private ActionTargetType target = null;
	/** The execute field. */
	private ActionConditionExecute execute = null;
	/** The conditionType field. */
	private CreationConditionType conditionType = null;
	/** The conditionId1 field. */
	private int conditionId1 = 0;
	/** The conditionAmount1 field. */
	private long conditionAmount1 = 0l;
	/** The conditionId2 field. */
	private int conditionId2 = 0;
	/** The conditionAmount2 field. */
	private long conditionAmount2 = 0l;
	/** The conditionId3 field. */
	private int conditionId3 = 0;
	/** The conditionAmount3 field. */
	private long conditionAmount3 = 0l;
	/** The optional field. */
	private boolean optional = false;

	/**
	 * The empty constructor.
	 */
	public ActionCondition() {
	}

	/**
	 * The fields constructor.
	 */
	public ActionCondition(int id, ActionTargetType target, ActionConditionExecute execute, CreationConditionType conditionType, int conditionId1, long conditionAmount1, int conditionId2, long conditionAmount2, int conditionId3, long conditionAmount3, boolean optional) {
		setId(id);
		setTarget(target);
		setExecute(execute);
		setConditionType(conditionType);
		setConditionId1(conditionId1);
		setConditionAmount1(conditionAmount1);
		setConditionId2(conditionId2);
		setConditionAmount2(conditionAmount2);
		setConditionId3(conditionId3);
		setConditionAmount3(conditionAmount3);
		setOptional(optional);
	}

	/**
	 * The clone constructor.
	 */
	public ActionCondition(IActionCondition clone) {
		setId(clone.getId());
		setTarget(clone.getTarget());
		setExecute(clone.getExecute());
		setConditionType(clone.getConditionType());
		setConditionId1(clone.getConditionId1());
		setConditionAmount1(clone.getConditionAmount1());
		setConditionId2(clone.getConditionId2());
		setConditionAmount2(clone.getConditionAmount2());
		setConditionId3(clone.getConditionId3());
		setConditionAmount3(clone.getConditionAmount3());
		setOptional(clone.getOptional());
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
	 * Getter for the target field.
	 * @return the value of the target field.
	 */
	@Override
	public ActionTargetType getTarget() {
		return target;
	}

	/**
	 * Getter for the execute field.
	 * @return the value of the execute field.
	 */
	@Override
	public ActionConditionExecute getExecute() {
		return execute;
	}

	/**
	 * Getter for the conditionType field.
	 * @return the value of the conditionType field.
	 */
	@Override
	public CreationConditionType getConditionType() {
		return conditionType;
	}

	/**
	 * Getter for the conditionId1 field.
	 * @return the value of the conditionId1 field.
	 */
	@Override
	public int getConditionId1() {
		return conditionId1;
	}

	/**
	 * Getter for the conditionAmount1 field.
	 * @return the value of the conditionAmount1 field.
	 */
	@Override
	public long getConditionAmount1() {
		return conditionAmount1;
	}

	/**
	 * Getter for the conditionId2 field.
	 * @return the value of the conditionId2 field.
	 */
	@Override
	public int getConditionId2() {
		return conditionId2;
	}

	/**
	 * Getter for the conditionAmount2 field.
	 * @return the value of the conditionAmount2 field.
	 */
	@Override
	public long getConditionAmount2() {
		return conditionAmount2;
	}

	/**
	 * Getter for the conditionId3 field.
	 * @return the value of the conditionId3 field.
	 */
	@Override
	public int getConditionId3() {
		return conditionId3;
	}

	/**
	 * Getter for the conditionAmount3 field.
	 * @return the value of the conditionAmount3 field.
	 */
	@Override
	public long getConditionAmount3() {
		return conditionAmount3;
	}

	/**
	 * Getter for the optional field.
	 * @return the value of the optional field.
	 */
	@Override
	public boolean getOptional() {
		return optional;
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
	 * Setter for the target field.
	 * @param target the target value to set.
	 */
	@Override
	public void setTarget(ActionTargetType target) {
		this.target = target;
	}

	/**
	 * Setter for the execute field.
	 * @param execute the execute value to set.
	 */
	@Override
	public void setExecute(ActionConditionExecute execute) {
		this.execute = execute;
	}

	/**
	 * Setter for the conditionType field.
	 * @param conditionType the conditionType value to set.
	 */
	@Override
	public void setConditionType(CreationConditionType conditionType) {
		this.conditionType = conditionType;
	}

	/**
	 * Setter for the conditionId1 field.
	 * @param conditionId1 the conditionId1 value to set.
	 */
	@Override
	public void setConditionId1(int conditionId1) {
		if (conditionId1 < -1) {
			throw new IllegalArgumentException("conditionId1 too small, minimum of -1, value: '" + conditionId1 + "'");
		}
		this.conditionId1 = conditionId1;
	}

	/**
	 * Setter for the conditionAmount1 field.
	 * @param conditionAmount1 the conditionAmount1 value to set.
	 */
	@Override
	public void setConditionAmount1(long conditionAmount1) {
		this.conditionAmount1 = conditionAmount1;
	}

	/**
	 * Setter for the conditionId2 field.
	 * @param conditionId2 the conditionId2 value to set.
	 */
	@Override
	public void setConditionId2(int conditionId2) {
		if (conditionId2 < -1) {
			throw new IllegalArgumentException("conditionId2 too small, minimum of -1, value: '" + conditionId2 + "'");
		}
		this.conditionId2 = conditionId2;
	}

	/**
	 * Setter for the conditionAmount2 field.
	 * @param conditionAmount2 the conditionAmount2 value to set.
	 */
	@Override
	public void setConditionAmount2(long conditionAmount2) {
		this.conditionAmount2 = conditionAmount2;
	}

	/**
	 * Setter for the conditionId3 field.
	 * @param conditionId3 the conditionId3 value to set.
	 */
	@Override
	public void setConditionId3(int conditionId3) {
		if (conditionId3 < -1) {
			throw new IllegalArgumentException("conditionId3 too small, minimum of -1, value: '" + conditionId3 + "'");
		}
		this.conditionId3 = conditionId3;
	}

	/**
	 * Setter for the conditionAmount3 field.
	 * @param conditionAmount3 the conditionAmount3 value to set.
	 */
	@Override
	public void setConditionAmount3(long conditionAmount3) {
		this.conditionAmount3 = conditionAmount3;
	}

	/**
	 * Setter for the optional field.
	 * @param optional the optional value to set.
	 */
	@Override
	public void setOptional(boolean optional) {
		this.optional = optional;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getTarget());
		builder.append(getExecute());
		builder.append(getConditionType());
		builder.append(getConditionId1());
		builder.append(getConditionAmount1());
		builder.append(getConditionId2());
		builder.append(getConditionAmount2());
		builder.append(getConditionId3());
		builder.append(getConditionAmount3());
		builder.append(getOptional());
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
		IActionCondition that = (IActionCondition) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getTarget(), that.getTarget());
		builder.append(this.getExecute(), that.getExecute());
		builder.append(this.getConditionType(), that.getConditionType());
		builder.append(this.getConditionId1(), that.getConditionId1());
		builder.append(this.getConditionAmount1(), that.getConditionAmount1());
		builder.append(this.getConditionId2(), that.getConditionId2());
		builder.append(this.getConditionAmount2(), that.getConditionAmount2());
		builder.append(this.getConditionId3(), that.getConditionId3());
		builder.append(this.getConditionAmount3(), that.getConditionAmount3());
		builder.append(this.getOptional(), that.getOptional());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getTarget());
		builder.append(getExecute());
		builder.append(getConditionType());
		builder.append(getConditionId1());
		builder.append(getConditionAmount1());
		builder.append(getConditionId2());
		builder.append(getConditionAmount2());
		builder.append(getConditionId3());
		builder.append(getConditionAmount3());
		builder.append(getOptional());
		return builder.toString();
	}

	@Override
	public int compareTo(IActionCondition that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getTarget(), that.getTarget());
		builder.append(this.getExecute(), that.getExecute());
		builder.append(this.getConditionType(), that.getConditionType());
		builder.append(this.getConditionId1(), that.getConditionId1());
		builder.append(this.getConditionAmount1(), that.getConditionAmount1());
		builder.append(this.getConditionId2(), that.getConditionId2());
		builder.append(this.getConditionAmount2(), that.getConditionAmount2());
		builder.append(this.getConditionId3(), that.getConditionId3());
		builder.append(this.getConditionAmount3(), that.getConditionAmount3());
		builder.append(this.getOptional(), that.getOptional());
		return builder.toComparison();
	}
}
