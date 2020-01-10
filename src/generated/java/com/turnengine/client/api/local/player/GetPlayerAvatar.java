package com.turnengine.client.api.local.player;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetPlayerAvatar implements IGetPlayerAvatar {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The playerId field. */
	private int playerId = 0;
	/** The width field. */
	private int width = 0;
	/** The height field. */
	private int height = 0;
	/** The fill field. */
	private boolean fill = false;

	/**
	 * The empty constructor.
	 */
	public GetPlayerAvatar() {
	}

	/**
	 * The fields constructor.
	 */
	public GetPlayerAvatar(long loginId, int instanceId, int playerId, int width, int height, boolean fill) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setPlayerId(playerId);
		setWidth(width);
		setHeight(height);
		setFill(fill);
	}

	/**
	 * The clone constructor.
	 */
	public GetPlayerAvatar(IGetPlayerAvatar clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setPlayerId(clone.getPlayerId());
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
	 * Getter for the playerId field.
	 * @return the value of the playerId field.
	 */
	@Override
	public int getPlayerId() {
		return playerId;
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
	 * Setter for the playerId field.
	 * @param playerId the playerId value to set.
	 */
	@Override
	public void setPlayerId(int playerId) {
		if (playerId < -1) {
			throw new IllegalArgumentException("playerId too small, minimum of -1, value: '" + playerId + "'");
		}
		this.playerId = playerId;
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
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getPlayerId());
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
		IGetPlayerAvatar that = (IGetPlayerAvatar) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getPlayerId(), that.getPlayerId());
		builder.append(this.getWidth(), that.getWidth());
		builder.append(this.getHeight(), that.getHeight());
		builder.append(this.getFill(), that.getFill());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getPlayerId());
		builder.append(getWidth());
		builder.append(getHeight());
		builder.append(getFill());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetPlayerAvatar that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getPlayerId(), that.getPlayerId());
		builder.append(this.getWidth(), that.getWidth());
		builder.append(this.getHeight(), that.getHeight());
		builder.append(this.getFill(), that.getFill());
		return builder.toComparison();
	}
}
