package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetPlayerAvatarXmlSerializer implements IXmlSerializer<IGetPlayerAvatar> {

	private String name;

	public GetPlayerAvatarXmlSerializer() {
		this("GetPlayerAvatar");
	}

	public GetPlayerAvatarXmlSerializer(String name) {
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
	public IGetPlayerAvatar readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("playerId");
		int param4 = reader.readInt("width");
		int param5 = reader.readInt("height");
		boolean param6 = reader.readBoolean("fill");
		reader.endElement(getName());

		// Create the bean
		return new GetPlayerAvatar(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetPlayerAvatar object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("playerId", object.getPlayerId());
		writer.writeInt("width", object.getWidth());
		writer.writeInt("height", object.getHeight());
		writer.writeBoolean("fill", object.getFill());
		writer.endElement(getName());
	}
}
