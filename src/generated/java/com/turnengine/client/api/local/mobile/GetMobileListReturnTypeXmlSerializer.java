package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetMobileListReturnTypeXmlSerializer implements IXmlSerializer<List<IMobile>> {

	private String name;

	public GetMobileListReturnTypeXmlSerializer() {
		this("GetMobileListReturnType");
	}

	public GetMobileListReturnTypeXmlSerializer(String name) {
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
	public List<IMobile> readObject(IXmlReader reader) {
		return new ListSerializer<IMobile>(getName(), new MobileXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IMobile> object) {
		new ListSerializer<IMobile>(getName(), new MobileXmlSerializer("element")).writeObject(writer, object);
	}
}
