package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class TranslationXmlSerializer implements IXmlSerializer<ITranslation> {

	private String name;

	public TranslationXmlSerializer() {
		this("Translation");
	}

	public TranslationXmlSerializer(String name) {
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
	public ITranslation readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("text"));
		LanguageCountry param3 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		reader.endElement(getName());

		// Create the bean
		return new Translation(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITranslation object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getText(), new StringSerializer("text"));
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		writer.endElement(getName());
	}
}
