package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetLocationPropertyListXmlSerializer implements IXmlSerializer<IGetLocationPropertyList> {

	private String name;

	public GetLocationPropertyListXmlSerializer() {
		this("GetLocationPropertyList");
	}

	public GetLocationPropertyListXmlSerializer(String name) {
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
	public IGetLocationPropertyList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("playerId");
		int param4 = reader.readInt("locationId");
		reader.endElement(getName());

		// Create the bean
		return new GetLocationPropertyList(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetLocationPropertyList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("playerId", object.getPlayerId());
		writer.writeInt("locationId", object.getLocationId());
		writer.endElement(getName());
	}
}
