package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.score.GroupScoreXmlSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;

public class GetPlayerScoreListReturnTypeXmlSerializer implements IXmlSerializer<List<IGroupScore>> {

	private String name;

	public GetPlayerScoreListReturnTypeXmlSerializer() {
		this("GetPlayerScoreListReturnType");
	}

	public GetPlayerScoreListReturnTypeXmlSerializer(String name) {
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
	public List<IGroupScore> readObject(IXmlReader reader) {
		return new ListSerializer<IGroupScore>(getName(), new GroupScoreXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IGroupScore> object) {
		new ListSerializer<IGroupScore>(getName(), new GroupScoreXmlSerializer("element")).writeObject(writer, object);
	}
}
