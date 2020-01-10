package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class GetTranslationByTextXmlSerializer implements IXmlSerializer<IGetTranslationByText> {

	private String name;

	public GetTranslationByTextXmlSerializer() {
		this("GetTranslationByText");
	}

	public GetTranslationByTextXmlSerializer(String name) {
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
	public IGetTranslationByText readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("english"));
		LanguageCountry param2 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		reader.endElement(getName());

		// Create the bean
		return new GetTranslationByText(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetTranslationByText object) {
		writer.startElement(getName());
		writer.writeObject(object.getEnglish(), new StringSerializer("english"));
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		writer.endElement(getName());
	}
}
