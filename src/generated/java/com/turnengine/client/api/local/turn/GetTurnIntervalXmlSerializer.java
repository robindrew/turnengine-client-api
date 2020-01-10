package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetTurnIntervalXmlSerializer implements IXmlSerializer<IGetTurnInterval> {

	private String name;

	public GetTurnIntervalXmlSerializer() {
		this("GetTurnInterval");
	}

	public GetTurnIntervalXmlSerializer(String name) {
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
	public IGetTurnInterval readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		reader.endElement(getName());

		// Create the bean
		return new GetTurnInterval(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetTurnInterval object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.endElement(getName());
	}
}
