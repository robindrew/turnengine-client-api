package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.IntegerSerializer;
import java.util.List;

public class GetRankingGroupListReturnTypeXmlSerializer implements IXmlSerializer<List<Integer>> {

	private String name;

	public GetRankingGroupListReturnTypeXmlSerializer() {
		this("GetRankingGroupListReturnType");
	}

	public GetRankingGroupListReturnTypeXmlSerializer(String name) {
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
	public List<Integer> readObject(IXmlReader reader) {
		return new ListSerializer<Integer>(getName(), new IntegerSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<Integer> object) {
		new ListSerializer<Integer>(getName(), new IntegerSerializer("element")).writeObject(writer, object);
	}
}
