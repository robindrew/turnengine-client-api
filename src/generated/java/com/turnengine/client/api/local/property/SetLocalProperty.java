package com.turnengine.client.api.local.property;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetLocalProperty implements ISetLocalProperty {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The key field. */
	private String key = null;
	/** The value field. */
	private String value = null;

	/**
	 * The empty constructor.
	 */
	public SetLocalProperty() {
	}

	/**
	 * The fields constructor.
	 */
	public SetLocalProperty(long loginId, int instanceId, String key, String value) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setKey(key);
		setValue(value);
	}

	/**
	 * The clone constructor.
	 */
	public SetLocalProperty(ISetLocalProperty clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
	}

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	@Override
	public void setInstanceId(int instanceId) {
		if (instanceId < -1) {
			throw new IllegalArgumentException("instanceId too small, minimum of -1, value: '" + instanceId + "'");
		}
		this.instanceId = instanceId;
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
		if (key.length() < 0) {
			throw new IllegalArgumentException("key too short, minimum of 0 characters, value: '" + key + "'");
		}
		if (key.length() > 1000000) {
			throw new IllegalArgumentException("key too long, maximum of 1000000 characters, value: '" + key + "'");
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
		if (value.length() < 0) {
			throw new IllegalArgumentException("value too short, minimum of 0 characters, value: '" + value + "'");
		}
		if (value.length() > 1000000) {
			throw new IllegalArgumentException("value too long, maximum of 1000000 characters, value: '" + value + "'");
		}
		this.value = value;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
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
		ISetLocalProperty that = (ISetLocalProperty) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getKey(), that.getKey());
		builder.append(this.getValue(), that.getValue());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getKey());
		builder.append(getValue());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetLocalProperty that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getKey(), that.getKey());
		builder.append(this.getValue(), that.getValue());
		return builder.toComparison();
	}
}
