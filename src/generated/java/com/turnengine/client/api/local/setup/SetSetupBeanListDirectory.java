package com.turnengine.client.api.local.setup;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetSetupBeanListDirectory implements ISetSetupBeanListDirectory {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The directory field. */
	private String directory = null;
	/** The filenames field. */
	private String filenames = null;

	/**
	 * The empty constructor.
	 */
	public SetSetupBeanListDirectory() {
	}

	/**
	 * The fields constructor.
	 */
	public SetSetupBeanListDirectory(long loginId, int instanceId, String directory, String filenames) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setDirectory(directory);
		setFilenames(filenames);
	}

	/**
	 * The clone constructor.
	 */
	public SetSetupBeanListDirectory(ISetSetupBeanListDirectory clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setDirectory(clone.getDirectory());
		setFilenames(clone.getFilenames());
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
	 * Getter for the directory field.
	 * @return the value of the directory field.
	 */
	@Override
	public String getDirectory() {
		return directory;
	}

	/**
	 * Getter for the filenames field.
	 * @return the value of the filenames field.
	 */
	@Override
	public String getFilenames() {
		return filenames;
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
	 * Setter for the directory field.
	 * @param directory the directory value to set.
	 */
	@Override
	public void setDirectory(String directory) {
		if (directory == null) {
			throw new NullPointerException("directory");
		}
		if (directory.length() < 5) {
			throw new IllegalArgumentException("directory too short, minimum of 5 characters, value: '" + directory + "'");
		}
		if (directory.length() > 2000) {
			throw new IllegalArgumentException("directory too long, maximum of 2000 characters, value: '" + directory + "'");
		}
		this.directory = directory;
	}

	/**
	 * Setter for the filenames field.
	 * @param filenames the filenames value to set.
	 */
	@Override
	public void setFilenames(String filenames) {
		if (filenames == null) {
			throw new NullPointerException("filenames");
		}
		if (filenames.length() < 5) {
			throw new IllegalArgumentException("filenames too short, minimum of 5 characters, value: '" + filenames + "'");
		}
		if (filenames.length() > 2000) {
			throw new IllegalArgumentException("filenames too long, maximum of 2000 characters, value: '" + filenames + "'");
		}
		this.filenames = filenames;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getDirectory());
		builder.append(getFilenames());
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
		ISetSetupBeanListDirectory that = (ISetSetupBeanListDirectory) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getDirectory(), that.getDirectory());
		builder.append(this.getFilenames(), that.getFilenames());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getDirectory());
		builder.append(getFilenames());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetSetupBeanListDirectory that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getDirectory(), that.getDirectory());
		builder.append(this.getFilenames(), that.getFilenames());
		return builder.toComparison();
	}
}
