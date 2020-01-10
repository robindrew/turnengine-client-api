package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetTranslationByIdReturnTypeXmlSerializer implements IXmlSerializer<ITranslation> {

	private String name;

	public GetTranslationByIdReturnTypeXmlSerializer() {
		this("GetTranslationByIdReturnType");
	}

	public GetTranslationByIdReturnTypeXmlSerializer(String name) {
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
		return new TranslationXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITranslation object) {
		new TranslationXmlSerializer(getName()).writeObject(writer, object);
	}
}
