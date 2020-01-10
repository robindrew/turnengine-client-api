package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AlliancePropertyXmlSerializer implements IXmlSerializer<IAllianceProperty> {

	private String name;

	public AlliancePropertyXmlSerializer() {
		this("AllianceProperty");
	}

	public AlliancePropertyXmlSerializer(String name) {
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
	public IAllianceProperty readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("allianceId");
		String param2 = reader.readObject(new StringSerializer("key"));
		String param3 = reader.readObject(new StringSerializer("value"));
		reader.endElement(getName());

		// Create the bean
		return new AllianceProperty(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceProperty object) {
		writer.startElement(getName());
		writer.writeInt("allianceId", object.getAllianceId());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.writeObject(object.getValue(), new StringSerializer("value"));
		writer.endElement(getName());
	}
}
