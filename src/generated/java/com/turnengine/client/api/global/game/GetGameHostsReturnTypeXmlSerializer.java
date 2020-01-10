package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameHostsReturnTypeXmlSerializer implements IXmlSerializer<List<IGameHost>> {

	private String name;

	public GetGameHostsReturnTypeXmlSerializer() {
		this("GetGameHostsReturnType");
	}

	public GetGameHostsReturnTypeXmlSerializer(String name) {
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
	public List<IGameHost> readObject(IXmlReader reader) {
		return new ListSerializer<IGameHost>(getName(), new GameHostXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IGameHost> object) {
		new ListSerializer<IGameHost>(getName(), new GameHostXmlSerializer("element")).writeObject(writer, object);
	}
}
