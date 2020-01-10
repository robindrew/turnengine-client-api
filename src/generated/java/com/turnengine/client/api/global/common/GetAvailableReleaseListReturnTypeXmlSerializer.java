package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAvailableReleaseListReturnTypeXmlSerializer implements IXmlSerializer<List<IReleaseInfo>> {

	private String name;

	public GetAvailableReleaseListReturnTypeXmlSerializer() {
		this("GetAvailableReleaseListReturnType");
	}

	public GetAvailableReleaseListReturnTypeXmlSerializer(String name) {
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
	public List<IReleaseInfo> readObject(IXmlReader reader) {
		return new ListSerializer<IReleaseInfo>(getName(), new ReleaseInfoXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IReleaseInfo> object) {
		new ListSerializer<IReleaseInfo>(getName(), new ReleaseInfoXmlSerializer("element")).writeObject(writer, object);
	}
}
