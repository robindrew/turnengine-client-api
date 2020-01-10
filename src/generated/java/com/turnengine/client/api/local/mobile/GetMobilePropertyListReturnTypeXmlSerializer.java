package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetMobilePropertyListReturnTypeXmlSerializer implements IXmlSerializer<List<IMobileProperty>> {

	private String name;

	public GetMobilePropertyListReturnTypeXmlSerializer() {
		this("GetMobilePropertyListReturnType");
	}

	public GetMobilePropertyListReturnTypeXmlSerializer(String name) {
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
	public List<IMobileProperty> readObject(IXmlReader reader) {
		return new ListSerializer<IMobileProperty>(getName(), new MobilePropertyXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IMobileProperty> object) {
		new ListSerializer<IMobileProperty>(getName(), new MobilePropertyXmlSerializer("element")).writeObject(writer, object);
	}
}
