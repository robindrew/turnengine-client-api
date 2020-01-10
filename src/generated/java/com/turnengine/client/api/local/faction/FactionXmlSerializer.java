package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class FactionXmlSerializer implements IXmlSerializer<IFaction> {

	private String name;

	public FactionXmlSerializer() {
		this("Faction");
	}

	public FactionXmlSerializer(String name) {
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
	public IFaction readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		String param3 = reader.readObject(new StringSerializer("password"));
		FactionUnited param4 = reader.readObject(new EnumSerializer<FactionUnited>(FactionUnited.class, "united"));
		int param5 = reader.readInt("playerLimit");
		reader.endElement(getName());

		// Create the bean
		return new Faction(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IFaction object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPassword(), new StringSerializer("password"));
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class, "united"));
		writer.writeInt("playerLimit", object.getPlayerLimit());
		writer.endElement(getName());
	}
}
