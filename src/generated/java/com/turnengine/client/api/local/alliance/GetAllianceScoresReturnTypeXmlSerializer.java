package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.score.ITurnScore;
import com.turnengine.client.api.local.score.TurnScoreXmlSerializer;
import java.util.List;

public class GetAllianceScoresReturnTypeXmlSerializer implements IXmlSerializer<List<ITurnScore>> {

	private String name;

	public GetAllianceScoresReturnTypeXmlSerializer() {
		this("GetAllianceScoresReturnType");
	}

	public GetAllianceScoresReturnTypeXmlSerializer(String name) {
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
	public List<ITurnScore> readObject(IXmlReader reader) {
		return new ListSerializer<ITurnScore>(getName(), new TurnScoreXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<ITurnScore> object) {
		new ListSerializer<ITurnScore>(getName(), new TurnScoreXmlSerializer("element")).writeObject(writer, object);
	}
}
