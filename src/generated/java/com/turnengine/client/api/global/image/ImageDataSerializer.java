package com.turnengine.client.api.global.image;

import com.robindrew.common.image.ImageFormat;
import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.array.ByteArraySerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class ImageDataSerializer extends ObjectSerializer<IImage> {

	public ImageDataSerializer() {
		super(false);
	}

	public ImageDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IImage readValue(IDataReader reader) throws IOException {
		ImageFormat param1 = reader.readObject(new EnumSerializer<ImageFormat>(ImageFormat.class, false));
		byte[] param2 = reader.readObject(new ByteArraySerializer(false));
		return new Image(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IImage object) throws IOException {
		writer.writeObject(object.getFormat(), new EnumSerializer<ImageFormat>(ImageFormat.class, false));
		writer.writeObject(object.getData(), new ByteArraySerializer(false));
	}
}
