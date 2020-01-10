package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetRankingListReturnTypeXmlSerializer implements IXmlSerializer<List<IRanking>> {

	private String name;

	public GetRankingListReturnTypeXmlSerializer() {
		this("GetRankingListReturnType");
	}

	public GetRankingListReturnTypeXmlSerializer(String name) {
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
	public List<IRanking> readObject(IXmlReader reader) {
		return new ListSerializer<IRanking>(getName(), new RankingXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IRanking> object) {
		new ListSerializer<IRanking>(getName(), new RankingXmlSerializer("element")).writeObject(writer, object);
	}
}
