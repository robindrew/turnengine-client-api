package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class MobilePropertyXmlSerializer implements IXmlSerializer<IMobileProperty> {

	private String name;

	public MobilePropertyXmlSerializer() {
		this("MobileProperty");
	}

	public MobilePropertyXmlSerializer(String name) {
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
	public IMobileProperty readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("mobileId");
		String param2 = reader.readObject(new StringSerializer("key"));
		String param3 = reader.readObject(new StringSerializer("value"));
		reader.endElement(getName());

		// Create the bean
		return new MobileProperty(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMobileProperty object) {
		writer.startElement(getName());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeObject(object.getKey(), new StringSerializer("key"));
		writer.writeObject(object.getValue(), new StringSerializer("value"));
		writer.endElement(getName());
	}
}
