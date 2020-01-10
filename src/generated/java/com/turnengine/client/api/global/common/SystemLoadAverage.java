package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SystemLoadAverage implements ISystemLoadAverage {

	/** The period field. */
	private LoadAveragePeriod period = null;
	/** The average field. */
	private double average = 0.0;

	/**
	 * The empty constructor.
	 */
	public SystemLoadAverage() {
	}

	/**
	 * The fields constructor.
	 */
	public SystemLoadAverage(LoadAveragePeriod period, double average) {
		setPeriod(period);
		setAverage(average);
	}

	/**
	 * The clone constructor.
	 */
	public SystemLoadAverage(ISystemLoadAverage clone) {
		setPeriod(clone.getPeriod());
		setAverage(clone.getAverage());
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
	 * Getter for the period field.
	 * @return the value of the period field.
	 */
	@Override
	public LoadAveragePeriod getPeriod() {
		return period;
	}

	/**
	 * Getter for the average field.
	 * @return the value of the average field.
	 */
	@Override
	public double getAverage() {
		return average;
	}

	/**
	 * Setter for the period field.
	 * @param period the period value to set.
	 */
	@Override
	public void setPeriod(LoadAveragePeriod period) {
		this.period = period;
	}

	/**
	 * Setter for the average field.
	 * @param average the average value to set.
	 */
	@Override
	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getPeriod());
		builder.append(getAverage());
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
		ISystemLoadAverage that = (ISystemLoadAverage) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getPeriod(), that.getPeriod());
		builder.append(this.getAverage(), that.getAverage());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getPeriod());
		builder.append(getAverage());
		return builder.toString();
	}

	@Override
	public int compareTo(ISystemLoadAverage that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getPeriod(), that.getPeriod());
		builder.append(this.getAverage(), that.getAverage());
		return builder.toComparison();
	}
}
