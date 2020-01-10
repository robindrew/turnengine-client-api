package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class GetTranslationByIdXmlSerializer implements IXmlSerializer<IGetTranslationById> {

	private String name;

	public GetTranslationByIdXmlSerializer() {
		this("GetTranslationById");
	}

	public GetTranslationByIdXmlSerializer(String name) {
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
	public IGetTranslationById readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		LanguageCountry param2 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		reader.endElement(getName());

		// Create the bean
		return new GetTranslationById(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetTranslationById object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		writer.endElement(getName());
	}
}
