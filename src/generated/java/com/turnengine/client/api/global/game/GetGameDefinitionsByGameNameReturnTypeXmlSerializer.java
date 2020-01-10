package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameDefinitionsByGameNameReturnTypeXmlSerializer implements IXmlSerializer<List<IGameDefinition>> {

	private String name;

	public GetGameDefinitionsByGameNameReturnTypeXmlSerializer() {
		this("GetGameDefinitionsByGameNameReturnType");
	}

	public GetGameDefinitionsByGameNameReturnTypeXmlSerializer(String name) {
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
	public List<IGameDefinition> readObject(IXmlReader reader) {
		return new ListSerializer<IGameDefinition>(getName(), new GameDefinitionXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IGameDefinition> object) {
		new ListSerializer<IGameDefinition>(getName(), new GameDefinitionXmlSerializer("element")).writeObject(writer, object);
	}
}
