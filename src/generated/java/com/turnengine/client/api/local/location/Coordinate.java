package com.turnengine.client.api.local.location;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Coordinate implements ICoordinate {

	/** The locationId field. */
	private int locationId = 0;
	/** The coordinates field. */
	private int[] coordinates = null;

	/**
	 * The empty constructor.
	 */
	public Coordinate() {
	}

	/**
	 * The fields constructor.
	 */
	public Coordinate(int locationId, int[] coordinates) {
		setLocationId(locationId);
		setCoordinates(coordinates);
	}

	/**
	 * The clone constructor.
	 */
	public Coordinate(ICoordinate clone) {
		setLocationId(clone.getLocationId());
		setCoordinates(clone.getCoordinates());
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
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	@Override
	public int getLocationId() {
		return locationId;
	}

	/**
	 * Getter for the coordinates field.
	 * @return the value of the coordinates field.
	 */
	@Override
	public int[] getCoordinates() {
		return coordinates;
	}

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	@Override
	public void setLocationId(int locationId) {
		if (locationId < -1) {
			throw new IllegalArgumentException("locationId too small, minimum of -1, value: '" + locationId + "'");
		}
		this.locationId = locationId;
	}

	/**
	 * Setter for the coordinates field.
	 * @param coordinates the coordinates value to set.
	 */
	@Override
	public void setCoordinates(int[] coordinates) {
		if (coordinates == null) {
			throw new NullPointerException("coordinates");
		}
		this.coordinates = coordinates;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLocationId());
		builder.append(getCoordinates());
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
		ICoordinate that = (ICoordinate) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getCoordinates(), that.getCoordinates());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLocationId());
		builder.append(getCoordinates());
		return builder.toString();
	}

	@Override
	public int compareTo(ICoordinate that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getCoordinates(), that.getCoordinates());
		return builder.toComparison();
	}
}
