package com.turnengine.client.api.local.alliance;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetAllianceLogo implements IGetAllianceLogo {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The allianceId field. */
	private int allianceId = 0;
	/** The width field. */
	private int width = 0;
	/** The height field. */
	private int height = 0;
	/** The fill field. */
	private boolean fill = false;

	/**
	 * The empty constructor.
	 */
	public GetAllianceLogo() {
	}

	/**
	 * The fields constructor.
	 */
	public GetAllianceLogo(long loginId, int instanceId, int allianceId, int width, int height, boolean fill) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setAllianceId(allianceId);
		setWidth(width);
		setHeight(height);
		setFill(fill);
	}

	/**
	 * The clone constructor.
	 */
	public GetAllianceLogo(IGetAllianceLogo clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setAllianceId(clone.getAllianceId());
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
	 * Getter for the allianceId field.
	 * @return the value of the allianceId field.
	 */
	@Override
	public int getAllianceId() {
		return allianceId;
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
	 * Setter for the allianceId field.
	 * @param allianceId the allianceId value to set.
	 */
	@Override
	public void setAllianceId(int allianceId) {
		if (allianceId < -1) {
			throw new IllegalArgumentException("allianceId too small, minimum of -1, value: '" + allianceId + "'");
		}
		this.allianceId = allianceId;
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
		builder.append(getAllianceId());
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
		IGetAllianceLogo that = (IGetAllianceLogo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getAllianceId(), that.getAllianceId());
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
		builder.append(getAllianceId());
		builder.append(getWidth());
		builder.append(getHeight());
		builder.append(getFill());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetAllianceLogo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getWidth(), that.getWidth());
		builder.append(this.getHeight(), that.getHeight());
		builder.append(this.getFill(), that.getFill());
		return builder.toComparison();
	}
}
