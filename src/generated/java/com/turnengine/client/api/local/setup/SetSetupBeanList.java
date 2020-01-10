package com.turnengine.client.api.local.setup;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetSetupBeanList implements ISetSetupBeanList {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The xml field. */
	private String xml = null;

	/**
	 * The empty constructor.
	 */
	public SetSetupBeanList() {
	}

	/**
	 * The fields constructor.
	 */
	public SetSetupBeanList(long loginId, int instanceId, String xml) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setXml(xml);
	}

	/**
	 * The clone constructor.
	 */
	public SetSetupBeanList(ISetSetupBeanList clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
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
	 * Getter for the xml field.
	 * @return the value of the xml field.
	 */
	@Override
	public String getXml() {
		return xml;
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
	 * Setter for the xml field.
	 * @param xml the xml value to set.
	 */
	@Override
	public void setXml(String xml) {
		if (xml == null) {
			throw new NullPointerException("xml");
		}
		if (xml.length() < 5) {
			throw new IllegalArgumentException("xml too short, minimum of 5 characters, value: '" + xml + "'");
		}
		if (xml.length() > 2000) {
			throw new IllegalArgumentException("xml too long, maximum of 2000 characters, value: '" + xml + "'");
		}
		this.xml = xml;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
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
		ISetSetupBeanList that = (ISetSetupBeanList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getXml(), that.getXml());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getXml());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetSetupBeanList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getXml(), that.getXml());
		return builder.toComparison();
	}
}
