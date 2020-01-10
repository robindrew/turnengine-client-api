package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.ByteArraySerializer;

public class SetUserAvatarXmlSerializer implements IXmlSerializer<ISetUserAvatar> {

	private String name;

	public SetUserAvatarXmlSerializer() {
		this("SetUserAvatar");
	}

	public SetUserAvatarXmlSerializer(String name) {
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
	public ISetUserAvatar readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		byte[] param2 = reader.readObject(new ByteArraySerializer("image"));
		reader.endElement(getName());

		// Create the bean
		return new SetUserAvatar(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetUserAvatar object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getImage(), new ByteArraySerializer("image"));
		writer.endElement(getName());
	}
}
