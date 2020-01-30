package com.turnengine.client.api.local.game;

import com.turnengine.client.api.global.game.IGameDefinition;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GameUnits implements IGameUnits {

	/** The definition field. */
	private IGameDefinition definition = null;
	/** The unitList field. */
	private List<IUnitCount> unitList = null;

	/**
	 * The empty constructor.
	 */
	public GameUnits() {
	}

	/**
	 * The fields constructor.
	 */
	public GameUnits(IGameDefinition definition, List<IUnitCount> unitList) {
		setDefinition(definition);
		setUnitList(unitList);
	}

	/**
	 * The clone constructor.
	 */
	public GameUnits(IGameUnits clone) {
		setDefinition(clone.getDefinition());
		setUnitList(clone.getUnitList());
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
	 * Getter for the definition field.
	 * @return the value of the definition field.
	 */
	@Override
	public IGameDefinition getDefinition() {
		return definition;
	}

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	@Override
	public List<IUnitCount> getUnitList() {
		return unitList;
	}

	/**
	 * Setter for the definition field.
	 * @param definition the definition value to set.
	 */
	@Override
	public void setDefinition(IGameDefinition definition) {
		this.definition = definition;
	}

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	@Override
	public void setUnitList(List<IUnitCount> unitList) {
		this.unitList = unitList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getDefinition());
		builder.append(getUnitList());
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
		IGameUnits that = (IGameUnits) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getDefinition(), that.getDefinition());
		builder.append(this.getUnitList(), that.getUnitList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getDefinition());
		builder.append(getUnitList());
		return builder.toString();
	}

	@Override
	public int compareTo(IGameUnits that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getDefinition(), that.getDefinition());
		builder.append(this.getUnitList(), that.getUnitList());
		return builder.toComparison();
	}
}
