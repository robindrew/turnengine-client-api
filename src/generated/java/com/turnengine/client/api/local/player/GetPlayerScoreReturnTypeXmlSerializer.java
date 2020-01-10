package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.turnengine.client.api.local.score.GroupScoreXmlSerializer;
import com.turnengine.client.api.local.score.IGroupScore;

public class GetPlayerScoreReturnTypeXmlSerializer implements IXmlSerializer<IGroupScore> {

	private String name;

	public GetPlayerScoreReturnTypeXmlSerializer() {
		this("GetPlayerScoreReturnType");
	}

	public GetPlayerScoreReturnTypeXmlSerializer(String name) {
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
	public IGroupScore readObject(IXmlReader reader) {
		return new GroupScoreXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGroupScore object) {
		new GroupScoreXmlSerializer(getName()).writeObject(writer, object);
	}
}
