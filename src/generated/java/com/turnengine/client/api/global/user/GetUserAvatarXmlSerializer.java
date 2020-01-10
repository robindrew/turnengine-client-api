package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUserAvatarXmlSerializer implements IXmlSerializer<IGetUserAvatar> {

	private String name;

	public GetUserAvatarXmlSerializer() {
		this("GetUserAvatar");
	}

	public GetUserAvatarXmlSerializer(String name) {
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
	public IGetUserAvatar readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("userId");
		int param2 = reader.readInt("width");
		int param3 = reader.readInt("height");
		boolean param4 = reader.readBoolean("fill");
		reader.endElement(getName());

		// Create the bean
		return new GetUserAvatar(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserAvatar object) {
		writer.startElement(getName());
		writer.writeInt("userId", object.getUserId());
		writer.writeInt("width", object.getWidth());
		writer.writeInt("height", object.getHeight());
		writer.writeBoolean("fill", object.getFill());
		writer.endElement(getName());
	}
}
