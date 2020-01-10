package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class NewTranslationXmlSerializer implements IXmlSerializer<INewTranslation> {

	private String name;

	public NewTranslationXmlSerializer() {
		this("NewTranslation");
	}

	public NewTranslationXmlSerializer(String name) {
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
	public INewTranslation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("english"));
		reader.endElement(getName());

		// Create the bean
		return new NewTranslation(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, INewTranslation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getEnglish(), new StringSerializer("english"));
		writer.endElement(getName());
	}
}
