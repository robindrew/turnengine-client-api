package com.turnengine.client.api.local.setup;

import com.turnengine.client.api.local.action.ActionConditionExecute;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.creation.CreationConditionType;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetupAddActionCondition implements ISetupAddActionCondition {

	/** The name field. */
	private String name = null;
	/** The target field. */
	private ActionTargetType target = null;
	/** The execute field. */
	private ActionConditionExecute execute = null;
	/** The condition field. */
	private CreationConditionType condition = null;
	/** The conditionName1 field. */
	private String conditionName1 = null;
	/** The conditionAmount1 field. */
	private long conditionAmount1 = 0l;
	/** The conditionName2 field. */
	private String conditionName2 = null;
	/** The conditionAmount2 field. */
	private long conditionAmount2 = 0l;
	/** The conditionName3 field. */
	private String conditionName3 = null;
	/** The conditionAmount3 field. */
	private long conditionAmount3 = 0l;
	/** The optional field. */
	private boolean optional = false;

	/**
	 * The empty constructor.
	 */
	public SetupAddActionCondition() {
	}

	/**
	 * The fields constructor.
	 */
	public SetupAddActionCondition(String name, ActionTargetType target, ActionConditionExecute execute, CreationConditionType condition, String conditionName1, long conditionAmount1, String conditionName2, long conditionAmount2, String conditionName3, long conditionAmount3, boolean optional) {
		setName(name);
		setTarget(target);
		setExecute(execute);
		setCondition(condition);
		setConditionName1(conditionName1);
		setConditionAmount1(conditionAmount1);
		setConditionName2(conditionName2);
		setConditionAmount2(conditionAmount2);
		setConditionName3(conditionName3);
		setConditionAmount3(conditionAmount3);
		setOptional(optional);
	}

	/**
	 * The clone constructor.
	 */
	public SetupAddActionCondition(ISetupAddActionCondition clone) {
		setName(clone.getName());
		setTarget(clone.getTarget());
		setExecute(clone.getExecute());
		setCondition(clone.getCondition());
		setConditionName1(clone.getConditionName1());
		setConditionAmount1(clone.getConditionAmount1());
		setConditionName2(clone.getConditionName2());
		setConditionAmount2(clone.getConditionAmount2());
		setConditionName3(clone.getConditionName3());
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
	 * Getter for the execute field.
	 * @return the value of the execute field.
	 */
	@Override
	public ActionConditionExecute getExecute() {
		return execute;
	}

	/**
	 * Getter for the condition field.
	 * @return the value of the condition field.
	 */
	@Override
	public CreationConditionType getCondition() {
		return condition;
	}

	/**
	 * Getter for the conditionName1 field.
	 * @return the value of the conditionName1 field.
	 */
	@Override
	public String getConditionName1() {
		return conditionName1;
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
	 * Getter for the conditionName2 field.
	 * @return the value of the conditionName2 field.
	 */
	@Override
	public String getConditionName2() {
		return conditionName2;
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
	 * Getter for the conditionName3 field.
	 * @return the value of the conditionName3 field.
	 */
	@Override
	public String getConditionName3() {
		return conditionName3;
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
	 * Setter for the execute field.
	 * @param execute the execute value to set.
	 */
	@Override
	public void setExecute(ActionConditionExecute execute) {
		this.execute = execute;
	}

	/**
	 * Setter for the condition field.
	 * @param condition the condition value to set.
	 */
	@Override
	public void setCondition(CreationConditionType condition) {
		this.condition = condition;
	}

	/**
	 * Setter for the conditionName1 field.
	 * @param conditionName1 the conditionName1 value to set.
	 */
	@Override
	public void setConditionName1(String conditionName1) {
		if (conditionName1 == null) {
			throw new NullPointerException("conditionName1");
		}
		if (conditionName1.length() < 1) {
			throw new IllegalArgumentException("conditionName1 too short, minimum of 1 characters, value: '" + conditionName1 + "'");
		}
		if (conditionName1.length() > 200) {
			throw new IllegalArgumentException("conditionName1 too long, maximum of 200 characters, value: '" + conditionName1 + "'");
		}
		this.conditionName1 = conditionName1;
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
	 * Setter for the conditionName2 field.
	 * @param conditionName2 the conditionName2 value to set.
	 */
	@Override
	public void setConditionName2(String conditionName2) {
		if (conditionName2 == null) {
			throw new NullPointerException("conditionName2");
		}
		if (conditionName2.length() < 1) {
			throw new IllegalArgumentException("conditionName2 too short, minimum of 1 characters, value: '" + conditionName2 + "'");
		}
		if (conditionName2.length() > 200) {
			throw new IllegalArgumentException("conditionName2 too long, maximum of 200 characters, value: '" + conditionName2 + "'");
		}
		this.conditionName2 = conditionName2;
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
	 * Setter for the conditionName3 field.
	 * @param conditionName3 the conditionName3 value to set.
	 */
	@Override
	public void setConditionName3(String conditionName3) {
		if (conditionName3 == null) {
			throw new NullPointerException("conditionName3");
		}
		if (conditionName3.length() < 1) {
			throw new IllegalArgumentException("conditionName3 too short, minimum of 1 characters, value: '" + conditionName3 + "'");
		}
		if (conditionName3.length() > 200) {
			throw new IllegalArgumentException("conditionName3 too long, maximum of 200 characters, value: '" + conditionName3 + "'");
		}
		this.conditionName3 = conditionName3;
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
		builder.append(getName());
		builder.append(getTarget());
		builder.append(getExecute());
		builder.append(getCondition());
		builder.append(getConditionName1());
		builder.append(getConditionAmount1());
		builder.append(getConditionName2());
		builder.append(getConditionAmount2());
		builder.append(getConditionName3());
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
		ISetupAddActionCondition that = (ISetupAddActionCondition) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getTarget(), that.getTarget());
		builder.append(this.getExecute(), that.getExecute());
		builder.append(this.getCondition(), that.getCondition());
		builder.append(this.getConditionName1(), that.getConditionName1());
		builder.append(this.getConditionAmount1(), that.getConditionAmount1());
		builder.append(this.getConditionName2(), that.getConditionName2());
		builder.append(this.getConditionAmount2(), that.getConditionAmount2());
		builder.append(this.getConditionName3(), that.getConditionName3());
		builder.append(this.getConditionAmount3(), that.getConditionAmount3());
		builder.append(this.getOptional(), that.getOptional());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getTarget());
		builder.append(getExecute());
		builder.append(getCondition());
		builder.append(getConditionName1());
		builder.append(getConditionAmount1());
		builder.append(getConditionName2());
		builder.append(getConditionAmount2());
		builder.append(getConditionName3());
		builder.append(getConditionAmount3());
		builder.append(getOptional());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetupAddActionCondition that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getTarget(), that.getTarget());
		builder.append(this.getExecute(), that.getExecute());
		builder.append(this.getCondition(), that.getCondition());
		builder.append(this.getConditionName1(), that.getConditionName1());
		builder.append(this.getConditionAmount1(), that.getConditionAmount1());
		builder.append(this.getConditionName2(), that.getConditionName2());
		builder.append(this.getConditionAmount2(), that.getConditionAmount2());
		builder.append(this.getConditionName3(), that.getConditionName3());
		builder.append(this.getConditionAmount3(), that.getConditionAmount3());
		builder.append(this.getOptional(), that.getOptional());
		return builder.toComparison();
	}
}
