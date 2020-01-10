package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameInstancePropertyListReturnTypeXmlSerializer implements IXmlSerializer<List<IGameInstanceProperty>> {

	private String name;

	public GetGameInstancePropertyListReturnTypeXmlSerializer() {
		this("GetGameInstancePropertyListReturnType");
	}

	public GetGameInstancePropertyListReturnTypeXmlSerializer(String name) {
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
	public List<IGameInstanceProperty> readObject(IXmlReader reader) {
		return new ListSerializer<IGameInstanceProperty>(getName(), new GameInstancePropertyXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IGameInstanceProperty> object) {
		new ListSerializer<IGameInstanceProperty>(getName(), new GameInstancePropertyXmlSerializer("element")).writeObject(writer, object);
	}
}
