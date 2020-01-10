package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetGamesReturnTypeXmlSerializer implements IXmlSerializer<List<IGame>> {

	private String name;

	public GetGamesReturnTypeXmlSerializer() {
		this("GetGamesReturnType");
	}

	public GetGamesReturnTypeXmlSerializer(String name) {
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
	public List<IGame> readObject(IXmlReader reader) {
		return new ListSerializer<IGame>(getName(), new GameXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IGame> object) {
		new ListSerializer<IGame>(getName(), new GameXmlSerializer("element")).writeObject(writer, object);
	}
}
