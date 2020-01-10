package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetGroupListByFactionNameXmlSerializer implements IXmlSerializer<IGetGroupListByFactionName> {

	private String name;

	public GetGroupListByFactionNameXmlSerializer() {
		this("GetGroupListByFactionName");
	}

	public GetGroupListByFactionNameXmlSerializer(String name) {
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
	public IGetGroupListByFactionName readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		reader.endElement(getName());

		// Create the bean
		return new GetGroupListByFactionName(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGroupListByFactionName object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.endElement(getName());
	}
}
