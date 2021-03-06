package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameVersionsReturnTypeXmlSerializer implements IXmlSerializer<List<IGameVersion>> {

	private String name;

	public GetGameVersionsReturnTypeXmlSerializer() {
		this("GetGameVersionsReturnType");
	}

	public GetGameVersionsReturnTypeXmlSerializer(String name) {
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
	public List<IGameVersion> readObject(IXmlReader reader) {
		return new ListSerializer<IGameVersion>(getName(), new GameVersionXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IGameVersion> object) {
		new ListSerializer<IGameVersion>(getName(), new GameVersionXmlSerializer("element")).writeObject(writer, object);
	}
}
