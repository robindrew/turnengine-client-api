package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetUserAvatar implements IGetUserAvatar {

	/** The userId field. */
	private int userId = 0;
	/** The width field. */
	private int width = 0;
	/** The height field. */
	private int height = 0;
	/** The fill field. */
	private boolean fill = false;

	/**
	 * The empty constructor.
	 */
	public GetUserAvatar() {
	}

	/**
	 * The fields constructor.
	 */
	public GetUserAvatar(int userId, int width, int height, boolean fill) {
		setUserId(userId);
		setWidth(width);
		setHeight(height);
		setFill(fill);
	}

	/**
	 * The clone constructor.
	 */
	public GetUserAvatar(IGetUserAvatar clone) {
		setUserId(clone.getUserId());
		setWidth(clone.getWidth());
		setHeight(clone.getHeight());
		setFill(clone.getFill());
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
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	@Override
	public int getUserId() {
		return userId;
	}

	/**
	 * Getter for the width field.
	 * @return the value of the width field.
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * Getter for the height field.
	 * @return the value of the height field.
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * Getter for the fill field.
	 * @return the value of the fill field.
	 */
	@Override
	public boolean getFill() {
		return fill;
	}

	/**
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	@Override
	public void setUserId(int userId) {
		if (userId < -1) {
			throw new IllegalArgumentException("userId too small, minimum of -1, value: '" + userId + "'");
		}
		this.userId = userId;
	}

	/**
	 * Setter for the width field.
	 * @param width the width value to set.
	 */
	@Override
	public void setWidth(int width) {
		if (width < 0) {
			throw new IllegalArgumentException("width too small, minimum of 0, value: '" + width + "'");
		}
		if (width > 3000) {
			throw new IllegalArgumentException("width too large, maximum of 3000, value: '" + width + "'");
		}
		this.width = width;
	}

	/**
	 * Setter for the height field.
	 * @param height the height value to set.
	 */
	@Override
	public void setHeight(int height) {
		if (height < 0) {
			throw new IllegalArgumentException("height too small, minimum of 0, value: '" + height + "'");
		}
		if (height > 3000) {
			throw new IllegalArgumentException("height too large, maximum of 3000, value: '" + height + "'");
		}
		this.height = height;
	}

	/**
	 * Setter for the fill field.
	 * @param fill the fill value to set.
	 */
	@Override
	public void setFill(boolean fill) {
		this.fill = fill;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getUserId());
		builder.append(getWidth());
		builder.append(getHeight());
		builder.append(getFill());
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
		IGetUserAvatar that = (IGetUserAvatar) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getWidth(), that.getWidth());
		builder.append(this.getHeight(), that.getHeight());
		builder.append(this.getFill(), that.getFill());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getUserId());
		builder.append(getWidth());
		builder.append(getHeight());
		builder.append(getFill());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetUserAvatar that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getUserId(), that.getUserId());
		builder.append(this.getWidth(), that.getWidth());
		builder.append(this.getHeight(), that.getHeight());
		builder.append(this.getFill(), that.getFill());
		return builder.toComparison();
	}
}
