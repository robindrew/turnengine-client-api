package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.turnengine.client.api.global.image.IImage;
import com.turnengine.client.api.global.image.ImageJsonSerializer;

public class GetUserAvatarReturnTypeJsonSerializer implements IJsonSerializer<IImage> {

	private String name;

	public GetUserAvatarReturnTypeJsonSerializer() {
		this("GetUserAvatarReturnType");
	}

	public GetUserAvatarReturnTypeJsonSerializer(String name) {
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
		return new ImageJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IImage object) {
		new ImageJsonSerializer().writeObject(writer, object);
	}
}
