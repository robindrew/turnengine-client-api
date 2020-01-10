package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllianceRankingListReturnTypeXmlSerializer implements IXmlSerializer<List<IAllianceRanking>> {

	private String name;

	public GetAllianceRankingListReturnTypeXmlSerializer() {
		this("GetAllianceRankingListReturnType");
	}

	public GetAllianceRankingListReturnTypeXmlSerializer(String name) {
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
	public List<IAllianceRanking> readObject(IXmlReader reader) {
		return new ListSerializer<IAllianceRanking>(getName(), new AllianceRankingXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IAllianceRanking> object) {
		new ListSerializer<IAllianceRanking>(getName(), new AllianceRankingXmlSerializer("element")).writeObject(writer, object);
	}
}
