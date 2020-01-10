package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetServiceProcessListReturnTypeXmlSerializer implements IXmlSerializer<List<IProcessInfo>> {

	private String name;

	public GetServiceProcessListReturnTypeXmlSerializer() {
		this("GetServiceProcessListReturnType");
	}

	public GetServiceProcessListReturnTypeXmlSerializer(String name) {
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
	public List<IProcessInfo> readObject(IXmlReader reader) {
		return new ListSerializer<IProcessInfo>(getName(), new ProcessInfoXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IProcessInfo> object) {
		new ListSerializer<IProcessInfo>(getName(), new ProcessInfoXmlSerializer("element")).writeObject(writer, object);
	}
}
