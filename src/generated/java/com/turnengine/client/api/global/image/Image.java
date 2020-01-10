package com.turnengine.client.api.global.image;

import com.robindrew.common.image.ImageFormat;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Image implements IImage {

	/** The format field. */
	private ImageFormat format = null;
	/** The data field. */
	private byte[] data = null;

	/**
	 * The empty constructor.
	 */
	public Image() {
	}

	/**
	 * The fields constructor.
	 */
	public Image(ImageFormat format, byte[] data) {
		setFormat(format);
		setData(data);
	}

	/**
	 * The clone constructor.
	 */
	public Image(IImage clone) {
		setFormat(clone.getFormat());
		setData(clone.getData());
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
	 * Getter for the format field.
	 * @return the value of the format field.
	 */
	@Override
	public ImageFormat getFormat() {
		return format;
	}

	/**
	 * Getter for the data field.
	 * @return the value of the data field.
	 */
	@Override
	public byte[] getData() {
		return data;
	}

	/**
	 * Setter for the format field.
	 * @param format the format value to set.
	 */
	@Override
	public void setFormat(ImageFormat format) {
		this.format = format;
	}

	/**
	 * Setter for the data field.
	 * @param data the data value to set.
	 */
	@Override
	public void setData(byte[] data) {
		if (data == null) {
			throw new NullPointerException("data");
		}
		this.data = data;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getFormat());
		builder.append(getData());
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
		IImage that = (IImage) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getFormat(), that.getFormat());
		builder.append(this.getData(), that.getData());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getFormat());
		builder.append(getData());
		return builder.toString();
	}

	@Override
	public int compareTo(IImage that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getFormat(), that.getFormat());
		builder.append(this.getData(), that.getData());
		return builder.toComparison();
	}
}
