package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetUnitScoresReturnTypeXmlSerializer implements IXmlSerializer<List<IUnitScore>> {

	private String name;

	public GetUnitScoresReturnTypeXmlSerializer() {
		this("GetUnitScoresReturnType");
	}

	public GetUnitScoresReturnTypeXmlSerializer(String name) {
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
	public List<IUnitScore> readObject(IXmlReader reader) {
		return new ListSerializer<IUnitScore>(getName(), new UnitScoreXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUnitScore> object) {
		new ListSerializer<IUnitScore>(getName(), new UnitScoreXmlSerializer("element")).writeObject(writer, object);
	}
}
