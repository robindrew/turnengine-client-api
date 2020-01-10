package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import java.util.List;

public class GetUserNamesReturnTypeXmlSerializer implements IXmlSerializer<List<String>> {

	private String name;

	public GetUserNamesReturnTypeXmlSerializer() {
		this("GetUserNamesReturnType");
	}

	public GetUserNamesReturnTypeXmlSerializer(String name) {
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
	public List<String> readObject(IXmlReader reader) {
		return new ListSerializer<String>(getName(), new StringSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<String> object) {
		new ListSerializer<String>(getName(), new StringSerializer("element")).writeObject(writer, object);
	}
}
