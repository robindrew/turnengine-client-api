package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.ByteArraySerializer;

public class SetPlayerAvatarXmlSerializer implements IXmlSerializer<ISetPlayerAvatar> {

	private String name;

	public SetPlayerAvatarXmlSerializer() {
		this("SetPlayerAvatar");
	}

	public SetPlayerAvatarXmlSerializer(String name) {
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
	public ISetPlayerAvatar readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		byte[] param3 = reader.readObject(new ByteArraySerializer("image"));
		reader.endElement(getName());

		// Create the bean
		return new SetPlayerAvatar(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetPlayerAvatar object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getImage(), new ByteArraySerializer("image"));
		writer.endElement(getName());
	}
}
