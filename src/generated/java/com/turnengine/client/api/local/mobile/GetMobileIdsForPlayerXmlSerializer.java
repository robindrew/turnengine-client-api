package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetMobileIdsForPlayerXmlSerializer implements IXmlSerializer<IGetMobileIdsForPlayer> {

	private String name;

	public GetMobileIdsForPlayerXmlSerializer() {
		this("GetMobileIdsForPlayer");
	}

	public GetMobileIdsForPlayerXmlSerializer(String name) {
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
	public IGetMobileIdsForPlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("playerId");
		reader.endElement(getName());

		// Create the bean
		return new GetMobileIdsForPlayer(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetMobileIdsForPlayer object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("playerId", object.getPlayerId());
		writer.endElement(getName());
	}
}
