package com.turnengine.client.api.global.image;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.ByteArraySerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.common.image.ImageFormat;

public class ImageXmlSerializer implements IXmlSerializer<IImage> {

	private String name;

	public ImageXmlSerializer() {
		this("Image");
	}

	public ImageXmlSerializer(String name) {
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
	public IImage readObject(IXmlReader reader) {
		reader.startElement(getName());
		ImageFormat param1 = reader.readObject(new EnumSerializer<ImageFormat>(ImageFormat.class, "format"));
		byte[] param2 = reader.readObject(new ByteArraySerializer("data"));
		reader.endElement(getName());

		// Create the bean
		return new Image(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IImage object) {
		writer.startElement(getName());
		writer.writeObject(object.getFormat(), new EnumSerializer<ImageFormat>(ImageFormat.class, "format"));
		writer.writeObject(object.getData(), new ByteArraySerializer("data"));
		writer.endElement(getName());
	}
}
