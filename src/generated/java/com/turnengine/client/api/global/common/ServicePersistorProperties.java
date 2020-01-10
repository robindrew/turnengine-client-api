package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ServicePersistorProperties implements IServicePersistorProperties {

	/** The database field. */
	private String database = null;

	/**
	 * The empty constructor.
	 */
	public ServicePersistorProperties() {
	}

	/**
	 * The fields constructor.
	 */
	public ServicePersistorProperties(String database) {
		setDatabase(database);
	}

	/**
	 * The clone constructor.
	 */
	public ServicePersistorProperties(IServicePersistorProperties clone) {
		setDatabase(clone.getDatabase());
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
	 * Getter for the database field.
	 * @return the value of the database field.
	 */
	@Override
	public String getDatabase() {
		return database;
	}

	/**
	 * Setter for the database field.
	 * @param database the database value to set.
	 */
	@Override
	public void setDatabase(String database) {
		this.database = database;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getDatabase());
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
		IServicePersistorProperties that = (IServicePersistorProperties) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getDatabase(), that.getDatabase());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getDatabase());
		return builder.toString();
	}

	@Override
	public int compareTo(IServicePersistorProperties that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getDatabase(), that.getDatabase());
		return builder.toComparison();
	}
}
