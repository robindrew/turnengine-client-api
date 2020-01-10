package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameInstancesByGameNameReturnTypeXmlSerializer implements IXmlSerializer<List<IGameInstance>> {

	private String name;

	public GetGameInstancesByGameNameReturnTypeXmlSerializer() {
		this("GetGameInstancesByGameNameReturnType");
	}

	public GetGameInstancesByGameNameReturnTypeXmlSerializer(String name) {
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
	public List<IGameInstance> readObject(IXmlReader reader) {
		return new ListSerializer<IGameInstance>(getName(), new GameInstanceXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IGameInstance> object) {
		new ListSerializer<IGameInstance>(getName(), new GameInstanceXmlSerializer("element")).writeObject(writer, object);
	}
}
