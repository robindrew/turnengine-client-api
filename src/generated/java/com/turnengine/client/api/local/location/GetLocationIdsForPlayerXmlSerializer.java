package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetLocationIdsForPlayerXmlSerializer implements IXmlSerializer<IGetLocationIdsForPlayer> {

	private String name;

	public GetLocationIdsForPlayerXmlSerializer() {
		this("GetLocationIdsForPlayer");
	}

	public GetLocationIdsForPlayerXmlSerializer(String name) {
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
	public IGetLocationIdsForPlayer readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("playerId");
		reader.endElement(getName());

		// Create the bean
		return new GetLocationIdsForPlayer(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetLocationIdsForPlayer object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("playerId", object.getPlayerId());
		writer.endElement(getName());
	}
}
