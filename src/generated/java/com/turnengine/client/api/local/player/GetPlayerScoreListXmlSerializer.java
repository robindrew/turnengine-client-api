package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetPlayerScoreListXmlSerializer implements IXmlSerializer<IGetPlayerScoreList> {

	private String name;

	public GetPlayerScoreListXmlSerializer() {
		this("GetPlayerScoreList");
	}

	public GetPlayerScoreListXmlSerializer(String name) {
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
	public IGetPlayerScoreList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		reader.endElement(getName());

		// Create the bean
		return new GetPlayerScoreList(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetPlayerScoreList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.endElement(getName());
	}
}
