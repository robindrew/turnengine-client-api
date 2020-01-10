package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AddFactionXmlSerializer implements IXmlSerializer<IAddFaction> {

	private String name;

	public AddFactionXmlSerializer() {
		this("AddFaction");
	}

	public AddFactionXmlSerializer(String name) {
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
	public IAddFaction readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		String param4 = reader.readObject(new StringSerializer("password"));
		FactionUnited param5 = reader.readObject(new EnumSerializer<FactionUnited>(FactionUnited.class, "united"));
		int param6 = reader.readInt("playerLimit");
		reader.endElement(getName());

		// Create the bean
		return new AddFaction(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddFaction object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPassword(), new StringSerializer("password"));
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class, "united"));
		writer.writeInt("playerLimit", object.getPlayerLimit());
		writer.endElement(getName());
	}
}
