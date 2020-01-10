package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class CreateAllianceForumXmlSerializer implements IXmlSerializer<ICreateAllianceForum> {

	private String name;

	public CreateAllianceForumXmlSerializer() {
		this("CreateAllianceForum");
	}

	public CreateAllianceForumXmlSerializer(String name) {
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
	public ICreateAllianceForum readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		int param4 = reader.readInt("parent");
		reader.endElement(getName());

		// Create the bean
		return new CreateAllianceForum(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ICreateAllianceForum object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("parent", object.getParent());
		writer.endElement(getName());
	}
}
