package com.turnengine.client.api.common.plugin;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PluginDetails implements IPluginDetails {

	/** The name field. */
	private String name = null;
	/** The xml field. */
	private String xml = null;

	/**
	 * The empty constructor.
	 */
	public PluginDetails() {
	}

	/**
	 * The fields constructor.
	 */
	public PluginDetails(String name, String xml) {
		setName(name);
		setXml(xml);
	}

	/**
	 * The clone constructor.
	 */
	public PluginDetails(IPluginDetails clone) {
		setName(clone.getName());
		setXml(clone.getXml());
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
	 * Getter for the xml field.
	 * @return the value of the xml field.
	 */
	@Override
	public String getXml() {
		return xml;
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
		this.name = name;
	}

	/**
	 * Setter for the xml field.
	 * @param xml the xml value to set.
	 */
	@Override
	public void setXml(String xml) {
		if (xml == null) {
			throw new NullPointerException("xml");
		}
		this.xml = xml;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getName());
		builder.append(getXml());
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
		IPluginDetails that = (IPluginDetails) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getXml(), that.getXml());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getXml());
		return builder.toString();
	}

	@Override
	public int compareTo(IPluginDetails that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getXml(), that.getXml());
		return builder.toComparison();
	}
}
