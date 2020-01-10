package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetUserAvatar implements ISetUserAvatar {

	/** The loginId field. */
	private long loginId = 0l;
	/** The image field. */
	private byte[] image = null;

	/**
	 * The empty constructor.
	 */
	public SetUserAvatar() {
	}

	/**
	 * The fields constructor.
	 */
	public SetUserAvatar(long loginId, byte[] image) {
		setLoginId(loginId);
		setImage(image);
	}

	/**
	 * The clone constructor.
	 */
	public SetUserAvatar(ISetUserAvatar clone) {
		setLoginId(clone.getLoginId());
		setImage(clone.getImage());
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
	 * Getter for the image field.
	 * @return the value of the image field.
	 */
	@Override
	public byte[] getImage() {
		return image;
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
	 * Setter for the image field.
	 * @param image the image value to set.
	 */
	@Override
	public void setImage(byte[] image) {
		if (image == null) {
			throw new NullPointerException("image");
		}
		this.image = image;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getImage());
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
		ISetUserAvatar that = (ISetUserAvatar) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getImage(), that.getImage());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getImage());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetUserAvatar that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getImage(), that.getImage());
		return builder.toComparison();
	}
}
