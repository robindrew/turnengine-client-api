package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetLocalTraceListXmlSerializer implements IXmlSerializer<IGetLocalTraceList> {

	private String name;

	public GetLocalTraceListXmlSerializer() {
		this("GetLocalTraceList");
	}

	public GetLocalTraceListXmlSerializer(String name) {
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
	public IGetLocalTraceList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		long param3 = reader.readLong("from");
		long param4 = reader.readLong("to");
		reader.endElement(getName());

		// Create the bean
		return new GetLocalTraceList(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetLocalTraceList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeLong("from", object.getFrom());
		writer.writeLong("to", object.getTo());
		writer.endElement(getName());
	}
}
