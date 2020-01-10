package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.IntArraySerializer;

public class GetMobileIdsForPlayerReturnTypeXmlSerializer implements IXmlSerializer<int[]> {

	private String name;

	public GetMobileIdsForPlayerReturnTypeXmlSerializer() {
		this("GetMobileIdsForPlayerReturnType");
	}

	public GetMobileIdsForPlayerReturnTypeXmlSerializer(String name) {
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
	public int[] readObject(IXmlReader reader) {
		return new IntArraySerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, int[] object) {
		new IntArraySerializer(getName()).writeObject(writer, object);
	}
}
