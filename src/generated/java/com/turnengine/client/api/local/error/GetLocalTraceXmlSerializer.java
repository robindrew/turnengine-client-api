package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetLocalTraceXmlSerializer implements IXmlSerializer<IGetLocalTrace> {

	private String name;

	public GetLocalTraceXmlSerializer() {
		this("GetLocalTrace");
	}

	public GetLocalTraceXmlSerializer(String name) {
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
	public IGetLocalTrace readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("id"));
		reader.endElement(getName());

		// Create the bean
		return new GetLocalTrace(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetLocalTrace object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getId(), new StringSerializer("id"));
		writer.endElement(getName());
	}
}
