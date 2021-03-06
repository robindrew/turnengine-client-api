package com.turnengine.client.api.local.alliance;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class RequestToJoinAllianceByName implements IRequestToJoinAllianceByName {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The allianceName field. */
	private String allianceName = null;

	/**
	 * The empty constructor.
	 */
	public RequestToJoinAllianceByName() {
	}

	/**
	 * The fields constructor.
	 */
	public RequestToJoinAllianceByName(long loginId, int instanceId, String allianceName) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setAllianceName(allianceName);
	}

	/**
	 * The clone constructor.
	 */
	public RequestToJoinAllianceByName(IRequestToJoinAllianceByName clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setAllianceName(clone.getAllianceName());
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
	 * Getter for the allianceName field.
	 * @return the value of the allianceName field.
	 */
	@Override
	public String getAllianceName() {
		return allianceName;
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
	 * Setter for the allianceName field.
	 * @param allianceName the allianceName value to set.
	 */
	@Override
	public void setAllianceName(String allianceName) {
		if (allianceName == null) {
			throw new NullPointerException("allianceName");
		}
		if (allianceName.length() < 4) {
			throw new IllegalArgumentException("allianceName too short, minimum of 4 characters, value: '" + allianceName + "'");
		}
		if (allianceName.length() > 40) {
			throw new IllegalArgumentException("allianceName too long, maximum of 40 characters, value: '" + allianceName + "'");
		}
		this.allianceName = allianceName;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getAllianceName());
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
		IRequestToJoinAllianceByName that = (IRequestToJoinAllianceByName) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getAllianceName(), that.getAllianceName());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getAllianceName());
		return builder.toString();
	}

	@Override
	public int compareTo(IRequestToJoinAllianceByName that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getAllianceName(), that.getAllianceName());
		return builder.toComparison();
	}
}
