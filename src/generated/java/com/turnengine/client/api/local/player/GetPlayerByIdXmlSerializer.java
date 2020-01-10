package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetPlayerByIdXmlSerializer implements IXmlSerializer<IGetPlayerById> {

	private String name;

	public GetPlayerByIdXmlSerializer() {
		this("GetPlayerById");
	}

	public GetPlayerByIdXmlSerializer(String name) {
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
	public IGetPlayerById readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("id");
		reader.endElement(getName());

		// Create the bean
		return new GetPlayerById(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetPlayerById object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("id", object.getId());
		writer.endElement(getName());
	}
}
