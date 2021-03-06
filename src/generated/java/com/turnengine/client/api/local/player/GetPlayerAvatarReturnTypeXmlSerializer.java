package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.turnengine.client.api.global.image.IImage;
import com.turnengine.client.api.global.image.ImageXmlSerializer;

public class GetPlayerAvatarReturnTypeXmlSerializer implements IXmlSerializer<IImage> {

	private String name;

	public GetPlayerAvatarReturnTypeXmlSerializer() {
		this("GetPlayerAvatarReturnType");
	}

	public GetPlayerAvatarReturnTypeXmlSerializer(String name) {
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
		return new ImageXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IImage object) {
		new ImageXmlSerializer(getName()).writeObject(writer, object);
	}
}
