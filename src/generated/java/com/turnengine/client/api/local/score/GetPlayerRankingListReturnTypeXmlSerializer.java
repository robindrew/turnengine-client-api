package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetPlayerRankingListReturnTypeXmlSerializer implements IXmlSerializer<List<IPlayerRanking>> {

	private String name;

	public GetPlayerRankingListReturnTypeXmlSerializer() {
		this("GetPlayerRankingListReturnType");
	}

	public GetPlayerRankingListReturnTypeXmlSerializer(String name) {
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
	public List<IPlayerRanking> readObject(IXmlReader reader) {
		return new ListSerializer<IPlayerRanking>(getName(), new PlayerRankingXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IPlayerRanking> object) {
		new ListSerializer<IPlayerRanking>(getName(), new PlayerRankingXmlSerializer("element")).writeObject(writer, object);
	}
}
