package com.turnengine.client.api.local.group;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AddChildGroup implements IAddChildGroup {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The name field. */
	private String name = null;
	/** The parentName field. */
	private String parentName = null;
	/** The factionName field. */
	private String factionName = null;

	/**
	 * The empty constructor.
	 */
	public AddChildGroup() {
	}

	/**
	 * The fields constructor.
	 */
	public AddChildGroup(long loginId, int instanceId, String name, String parentName, String factionName) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setName(name);
		setParentName(parentName);
		setFactionName(factionName);
	}

	/**
	 * The clone constructor.
	 */
	public AddChildGroup(IAddChildGroup clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setName(clone.getName());
		setParentName(clone.getParentName());
		setFactionName(clone.getFactionName());
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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the parentName field.
	 * @return the value of the parentName field.
	 */
	@Override
	public String getParentName() {
		return parentName;
	}

	/**
	 * Getter for the factionName field.
	 * @return the value of the factionName field.
	 */
	@Override
	public String getFactionName() {
		return factionName;
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
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		if (name.length() < 1) {
			throw new IllegalArgumentException("name too short, minimum of 1 characters, value: '" + name + "'");
		}
		if (name.length() > 200) {
			throw new IllegalArgumentException("name too long, maximum of 200 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the parentName field.
	 * @param parentName the parentName value to set.
	 */
	@Override
	public void setParentName(String parentName) {
		if (parentName == null) {
			throw new NullPointerException("parentName");
		}
		if (parentName.length() < 1) {
			throw new IllegalArgumentException("parentName too short, minimum of 1 characters, value: '" + parentName + "'");
		}
		if (parentName.length() > 200) {
			throw new IllegalArgumentException("parentName too long, maximum of 200 characters, value: '" + parentName + "'");
		}
		this.parentName = parentName;
	}

	/**
	 * Setter for the factionName field.
	 * @param factionName the factionName value to set.
	 */
	@Override
	public void setFactionName(String factionName) {
		if (factionName == null) {
			throw new NullPointerException("factionName");
		}
		if (factionName.length() < 1) {
			throw new IllegalArgumentException("factionName too short, minimum of 1 characters, value: '" + factionName + "'");
		}
		if (factionName.length() > 200) {
			throw new IllegalArgumentException("factionName too long, maximum of 200 characters, value: '" + factionName + "'");
		}
		this.factionName = factionName;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getName());
		builder.append(getParentName());
		builder.append(getFactionName());
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
		IAddChildGroup that = (IAddChildGroup) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getParentName(), that.getParentName());
		builder.append(this.getFactionName(), that.getFactionName());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getName());
		builder.append(getParentName());
		builder.append(getFactionName());
		return builder.toString();
	}

	@Override
	public int compareTo(IAddChildGroup that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getParentName(), that.getParentName());
		builder.append(this.getFactionName(), that.getFactionName());
		return builder.toComparison();
	}
}
