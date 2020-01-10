package com.turnengine.client.api.local.location;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LocationProperty implements ILocationProperty {

	/** The locationId field. */
	private int locationId = 0;
	/** The playerId field. */
	private int playerId = 0;
	/** The key field. */
	private String key = null;
	/** The value field. */
	private String value = null;

	/**
	 * The empty constructor.
	 */
	public LocationProperty() {
	}

	/**
	 * The fields constructor.
	 */
	public LocationProperty(int locationId, int playerId, String key, String value) {
		setLocationId(locationId);
		setPlayerId(playerId);
		setKey(key);
		setValue(value);
	}

	/**
	 * The clone constructor.
	 */
	public LocationProperty(ILocationProperty clone) {
		setLocationId(clone.getLocationId());
		setPlayerId(clone.getPlayerId());
		setKey(clone.getKey());
		setValue(clone.getValue());
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
	 * Getter for the playerId field.
	 * @return the value of the playerId field.
	 */
	@Override
	public int getPlayerId() {
		return playerId;
	}

	/**
	 * Getter for the key field.
	 * @return the value of the key field.
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * Getter for the value field.
	 * @return the value of the value field.
	 */
	@Override
	public String getValue() {
		return value;
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
	 * Setter for the playerId field.
	 * @param playerId the playerId value to set.
	 */
	@Override
	public void setPlayerId(int playerId) {
		if (playerId < -1) {
			throw new IllegalArgumentException("playerId too small, minimum of -1, value: '" + playerId + "'");
		}
		this.playerId = playerId;
	}

	/**
	 * Setter for the key field.
	 * @param key the key value to set.
	 */
	@Override
	public void setKey(String key) {
		if (key == null) {
			throw new NullPointerException("key");
		}
		if (key.length() < 1) {
			throw new IllegalArgumentException("key too short, minimum of 1 characters, value: '" + key + "'");
		}
		if (key.length() > 80) {
			throw new IllegalArgumentException("key too long, maximum of 80 characters, value: '" + key + "'");
		}
		this.key = key;
	}

	/**
	 * Setter for the value field.
	 * @param value the value value to set.
	 */
	@Override
	public void setValue(String value) {
		if (value == null) {
			throw new NullPointerException("value");
		}
		this.value = value;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLocationId());
		builder.append(getPlayerId());
		builder.append(getKey());
		builder.append(getValue());
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
		ILocationProperty that = (ILocationProperty) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getPlayerId(), that.getPlayerId());
		builder.append(this.getKey(), that.getKey());
		builder.append(this.getValue(), that.getValue());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLocationId());
		builder.append(getPlayerId());
		builder.append(getKey());
		builder.append(getValue());
		return builder.toString();
	}

	@Override
	public int compareTo(ILocationProperty that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getPlayerId(), that.getPlayerId());
		builder.append(this.getKey(), that.getKey());
		builder.append(this.getValue(), that.getValue());
		return builder.toComparison();
	}
}
