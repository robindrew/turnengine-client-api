package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetGameInstanceByName implements IGetGameInstanceByName {

	/** The instanceName field. */
	private String instanceName = null;
	/** The versionId field. */
	private int versionId = 0;

	/**
	 * The empty constructor.
	 */
	public GetGameInstanceByName() {
	}

	/**
	 * The fields constructor.
	 */
	public GetGameInstanceByName(String instanceName, int versionId) {
		setInstanceName(instanceName);
		setVersionId(versionId);
	}

	/**
	 * The clone constructor.
	 */
	public GetGameInstanceByName(IGetGameInstanceByName clone) {
		setInstanceName(clone.getInstanceName());
		setVersionId(clone.getVersionId());
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
	 * Getter for the instanceName field.
	 * @return the value of the instanceName field.
	 */
	@Override
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * Getter for the versionId field.
	 * @return the value of the versionId field.
	 */
	@Override
	public int getVersionId() {
		return versionId;
	}

	/**
	 * Setter for the instanceName field.
	 * @param instanceName the instanceName value to set.
	 */
	@Override
	public void setInstanceName(String instanceName) {
		if (instanceName == null) {
			throw new NullPointerException("instanceName");
		}
		if (instanceName.length() < 4) {
			throw new IllegalArgumentException("instanceName too short, minimum of 4 characters, value: '" + instanceName + "'");
		}
		if (instanceName.length() > 40) {
			throw new IllegalArgumentException("instanceName too long, maximum of 40 characters, value: '" + instanceName + "'");
		}
		this.instanceName = instanceName;
	}

	/**
	 * Setter for the versionId field.
	 * @param versionId the versionId value to set.
	 */
	@Override
	public void setVersionId(int versionId) {
		if (versionId < -1) {
			throw new IllegalArgumentException("versionId too small, minimum of -1, value: '" + versionId + "'");
		}
		this.versionId = versionId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getInstanceName());
		builder.append(getVersionId());
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
		IGetGameInstanceByName that = (IGetGameInstanceByName) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getInstanceName(), that.getInstanceName());
		builder.append(this.getVersionId(), that.getVersionId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getInstanceName());
		builder.append(getVersionId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetGameInstanceByName that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getInstanceName(), that.getInstanceName());
		builder.append(this.getVersionId(), that.getVersionId());
		return builder.toComparison();
	}
}
