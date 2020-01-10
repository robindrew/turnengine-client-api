package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.IntegerSerializer;

public class GetAllianceMemberCountReturnTypeXmlSerializer implements IXmlSerializer<Integer> {

	private String name;

	public GetAllianceMemberCountReturnTypeXmlSerializer() {
		this("GetAllianceMemberCountReturnType");
	}

	public GetAllianceMemberCountReturnTypeXmlSerializer(String name) {
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
	public Integer readObject(IXmlReader reader) {
		return new IntegerSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, Integer object) {
		new IntegerSerializer(getName()).writeObject(writer, object);
	}
}
