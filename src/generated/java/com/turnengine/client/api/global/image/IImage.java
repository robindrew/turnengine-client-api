package com.turnengine.client.api.global.image;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.common.image.ImageFormat;

public interface IImage extends IBean, Comparable<IImage> {

	int SERIALIZATION_ID = 201;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the format field.
	 * @return the value of the format field.
	 */
	ImageFormat getFormat();

	/**
	 * Getter for the data field.
	 * @return the value of the data field.
	 */
	byte[] getData();

	/**
	 * Setter for the format field.
	 * @param format the format value to set.
	 */
	void setFormat(ImageFormat format);

	/**
	 * Setter for the data field.
	 * @param data the data value to set.
	 */
	void setData(byte[] data);
}
