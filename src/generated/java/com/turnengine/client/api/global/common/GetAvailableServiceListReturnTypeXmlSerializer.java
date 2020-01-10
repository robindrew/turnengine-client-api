package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAvailableServiceListReturnTypeXmlSerializer implements IXmlSerializer<List<IServiceInfo>> {

	private String name;

	public GetAvailableServiceListReturnTypeXmlSerializer() {
		this("GetAvailableServiceListReturnType");
	}

	public GetAvailableServiceListReturnTypeXmlSerializer(String name) {
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
	public List<IServiceInfo> readObject(IXmlReader reader) {
		return new ListSerializer<IServiceInfo>(getName(), new ServiceInfoXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IServiceInfo> object) {
		new ListSerializer<IServiceInfo>(getName(), new ServiceInfoXmlSerializer("element")).writeObject(writer, object);
	}
}
