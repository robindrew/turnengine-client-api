package com.turnengine.client.api.local.alliance;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AllianceProperty implements IAllianceProperty {

	/** The allianceId field. */
	private int allianceId = 0;
	/** The key field. */
	private String key = null;
	/** The value field. */
	private String value = null;

	/**
	 * The empty constructor.
	 */
	public AllianceProperty() {
	}

	/**
	 * The fields constructor.
	 */
	public AllianceProperty(int allianceId, String key, String value) {
		setAllianceId(allianceId);
		setKey(key);
		setValue(value);
	}

	/**
	 * The clone constructor.
	 */
	public AllianceProperty(IAllianceProperty clone) {
		setAllianceId(clone.getAllianceId());
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
	 * Getter for the allianceId field.
	 * @return the value of the allianceId field.
	 */
	@Override
	public int getAllianceId() {
		return allianceId;
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
	 * Setter for the allianceId field.
	 * @param allianceId the allianceId value to set.
	 */
	@Override
	public void setAllianceId(int allianceId) {
		if (allianceId < -1) {
			throw new IllegalArgumentException("allianceId too small, minimum of -1, value: '" + allianceId + "'");
		}
		this.allianceId = allianceId;
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
		builder.append(getAllianceId());
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
		IAllianceProperty that = (IAllianceProperty) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getKey(), that.getKey());
		builder.append(this.getValue(), that.getValue());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getAllianceId());
		builder.append(getKey());
		builder.append(getValue());
		return builder.toString();
	}

	@Override
	public int compareTo(IAllianceProperty that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getKey(), that.getKey());
		builder.append(this.getValue(), that.getValue());
		return builder.toComparison();
	}
}
