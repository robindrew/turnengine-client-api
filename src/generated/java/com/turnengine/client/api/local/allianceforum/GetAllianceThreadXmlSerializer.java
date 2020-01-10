package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAllianceThreadXmlSerializer implements IXmlSerializer<IGetAllianceThread> {

	private String name;

	public GetAllianceThreadXmlSerializer() {
		this("GetAllianceThread");
	}

	public GetAllianceThreadXmlSerializer(String name) {
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
	public IGetAllianceThread readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("threadId");
		reader.endElement(getName());

		// Create the bean
		return new GetAllianceThread(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAllianceThread object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("threadId", object.getThreadId());
		writer.endElement(getName());
	}
}
