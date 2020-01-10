package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetPlayerListReturnTypeXmlSerializer implements IXmlSerializer<List<IPlayer>> {

	private String name;

	public GetPlayerListReturnTypeXmlSerializer() {
		this("GetPlayerListReturnType");
	}

	public GetPlayerListReturnTypeXmlSerializer(String name) {
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
	public List<IPlayer> readObject(IXmlReader reader) {
		return new ListSerializer<IPlayer>(getName(), new PlayerXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IPlayer> object) {
		new ListSerializer<IPlayer>(getName(), new PlayerXmlSerializer("element")).writeObject(writer, object);
	}
}
