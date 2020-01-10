package com.turnengine.client.api.local.setup;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetSetupBeanListFile implements ISetSetupBeanListFile {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The filename field. */
	private String filename = null;

	/**
	 * The empty constructor.
	 */
	public SetSetupBeanListFile() {
	}

	/**
	 * The fields constructor.
	 */
	public SetSetupBeanListFile(long loginId, int instanceId, String filename) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setFilename(filename);
	}

	/**
	 * The clone constructor.
	 */
	public SetSetupBeanListFile(ISetSetupBeanListFile clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setFilename(clone.getFilename());
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
	 * Getter for the filename field.
	 * @return the value of the filename field.
	 */
	@Override
	public String getFilename() {
		return filename;
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
	 * Setter for the filename field.
	 * @param filename the filename value to set.
	 */
	@Override
	public void setFilename(String filename) {
		if (filename == null) {
			throw new NullPointerException("filename");
		}
		if (filename.length() < 5) {
			throw new IllegalArgumentException("filename too short, minimum of 5 characters, value: '" + filename + "'");
		}
		if (filename.length() > 2000) {
			throw new IllegalArgumentException("filename too long, maximum of 2000 characters, value: '" + filename + "'");
		}
		this.filename = filename;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getFilename());
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
		ISetSetupBeanListFile that = (ISetSetupBeanListFile) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getFilename(), that.getFilename());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getFilename());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetSetupBeanListFile that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getFilename(), that.getFilename());
		return builder.toComparison();
	}
}
