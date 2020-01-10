package com.turnengine.client.api.local.message;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ListMessages implements IListMessages {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The type field. */
	private MessageType type = null;
	/** The includeContent field. */
	private boolean includeContent = false;
	/** The pageNumber field. */
	private int pageNumber = 0;
	/** The pageSize field. */
	private int pageSize = 0;
	/** The mobileId field. */
	private int mobileId = 0;
	/** The locationId field. */
	private int locationId = 0;
	/** The format field. */
	private String format = null;

	/**
	 * The empty constructor.
	 */
	public ListMessages() {
	}

	/**
	 * The fields constructor.
	 */
	public ListMessages(long loginId, int instanceId, MessageType type, boolean includeContent, int pageNumber, int pageSize, int mobileId, int locationId, String format) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setType(type);
		setIncludeContent(includeContent);
		setPageNumber(pageNumber);
		setPageSize(pageSize);
		setMobileId(mobileId);
		setLocationId(locationId);
		setFormat(format);
	}

	/**
	 * The clone constructor.
	 */
	public ListMessages(IListMessages clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setType(clone.getType());
		setIncludeContent(clone.getIncludeContent());
		setPageNumber(clone.getPageNumber());
		setPageSize(clone.getPageSize());
		setMobileId(clone.getMobileId());
		setLocationId(clone.getLocationId());
		setFormat(clone.getFormat());
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
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public MessageType getType() {
		return type;
	}

	/**
	 * Getter for the includeContent field.
	 * @return the value of the includeContent field.
	 */
	@Override
	public boolean getIncludeContent() {
		return includeContent;
	}

	/**
	 * Getter for the pageNumber field.
	 * @return the value of the pageNumber field.
	 */
	@Override
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * Getter for the pageSize field.
	 * @return the value of the pageSize field.
	 */
	@Override
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * Getter for the mobileId field.
	 * @return the value of the mobileId field.
	 */
	@Override
	public int getMobileId() {
		return mobileId;
	}

	/**
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	@Override
	public int getLocationId() {
		return locationId;
	}

	/**
	 * Getter for the format field.
	 * @return the value of the format field.
	 */
	@Override
	public String getFormat() {
		return format;
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
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(MessageType type) {
		this.type = type;
	}

	/**
	 * Setter for the includeContent field.
	 * @param includeContent the includeContent value to set.
	 */
	@Override
	public void setIncludeContent(boolean includeContent) {
		this.includeContent = includeContent;
	}

	/**
	 * Setter for the pageNumber field.
	 * @param pageNumber the pageNumber value to set.
	 */
	@Override
	public void setPageNumber(int pageNumber) {
		if (pageNumber < 1) {
			throw new IllegalArgumentException("pageNumber too small, minimum of 1, value: '" + pageNumber + "'");
		}
		this.pageNumber = pageNumber;
	}

	/**
	 * Setter for the pageSize field.
	 * @param pageSize the pageSize value to set.
	 */
	@Override
	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			throw new IllegalArgumentException("pageSize too small, minimum of 1, value: '" + pageSize + "'");
		}
		this.pageSize = pageSize;
	}

	/**
	 * Setter for the mobileId field.
	 * @param mobileId the mobileId value to set.
	 */
	@Override
	public void setMobileId(int mobileId) {
		if (mobileId < -1) {
			throw new IllegalArgumentException("mobileId too small, minimum of -1, value: '" + mobileId + "'");
		}
		this.mobileId = mobileId;
	}

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	@Override
	public void setLocationId(int locationId) {
		if (locationId < -1) {
			throw new IllegalArgumentException("locationId too small, minimum of -1, value: '" + locationId + "'");
		}
		this.locationId = locationId;
	}

	/**
	 * Setter for the format field.
	 * @param format the format value to set.
	 */
	@Override
	public void setFormat(String format) {
		if (format == null) {
			throw new NullPointerException("format");
		}
		if (format.length() < 0) {
			throw new IllegalArgumentException("format too short, minimum of 0 characters, value: '" + format + "'");
		}
		if (format.length() > 80) {
			throw new IllegalArgumentException("format too long, maximum of 80 characters, value: '" + format + "'");
		}
		this.format = format;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getType());
		builder.append(getIncludeContent());
		builder.append(getPageNumber());
		builder.append(getPageSize());
		builder.append(getMobileId());
		builder.append(getLocationId());
		builder.append(getFormat());
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
		IListMessages that = (IListMessages) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getType(), that.getType());
		builder.append(this.getIncludeContent(), that.getIncludeContent());
		builder.append(this.getPageNumber(), that.getPageNumber());
		builder.append(this.getPageSize(), that.getPageSize());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getFormat(), that.getFormat());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getType());
		builder.append(getIncludeContent());
		builder.append(getPageNumber());
		builder.append(getPageSize());
		builder.append(getMobileId());
		builder.append(getLocationId());
		builder.append(getFormat());
		return builder.toString();
	}

	@Override
	public int compareTo(IListMessages that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getType(), that.getType());
		builder.append(this.getIncludeContent(), that.getIncludeContent());
		builder.append(this.getPageNumber(), that.getPageNumber());
		builder.append(this.getPageSize(), that.getPageSize());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getFormat(), that.getFormat());
		return builder.toComparison();
	}
}
