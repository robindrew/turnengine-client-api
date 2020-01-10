package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetPlayerPropertyListReturnTypeXmlSerializer implements IXmlSerializer<List<IPlayerProperty>> {

	private String name;

	public GetPlayerPropertyListReturnTypeXmlSerializer() {
		this("GetPlayerPropertyListReturnType");
	}

	public GetPlayerPropertyListReturnTypeXmlSerializer(String name) {
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
	public List<IPlayerProperty> readObject(IXmlReader reader) {
		return new ListSerializer<IPlayerProperty>(getName(), new PlayerPropertyXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IPlayerProperty> object) {
		new ListSerializer<IPlayerProperty>(getName(), new PlayerPropertyXmlSerializer("element")).writeObject(writer, object);
	}
}
