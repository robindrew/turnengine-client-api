package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.faction.FactionUnited;

public class SetupAddFactionXmlSerializer implements IXmlSerializer<ISetupAddFaction> {

	private String name;

	public SetupAddFactionXmlSerializer() {
		this("SetupAddFaction");
	}

	public SetupAddFactionXmlSerializer(String name) {
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
	public ISetupAddFaction readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		String param2 = reader.readObject(new StringSerializer("password"));
		FactionUnited param3 = reader.readObject(new EnumSerializer<FactionUnited>(FactionUnited.class, "united"));
		int param4 = reader.readInt("playerLimit");
		reader.endElement(getName());

		// Create the bean
		return new SetupAddFaction(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupAddFaction object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPassword(), new StringSerializer("password"));
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class, "united"));
		writer.writeInt("playerLimit", object.getPlayerLimit());
		writer.endElement(getName());
	}
}
