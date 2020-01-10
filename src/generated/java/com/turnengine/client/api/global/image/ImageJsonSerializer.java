package com.turnengine.client.api.global.image;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.array.ByteArraySerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.common.image.ImageFormat;

public class ImageJsonSerializer implements IJsonSerializer<IImage> {

	private String name;

	public ImageJsonSerializer() {
		this("Image");
	}

	public ImageJsonSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public IImage readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IImage object) {
		writer.openObject();
		writer.writeObject(object.getFormat(), new EnumSerializer<ImageFormat>(ImageFormat.class));
		writer.writeObject(object.getData(), new ByteArraySerializer());
		writer.closeObject();
	}
}
