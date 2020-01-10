package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.turnengine.client.api.local.alliance.AllianceInfoJsonSerializer;
import com.turnengine.client.api.local.alliance.IAllianceInfo;

public class AllianceRankingJsonSerializer implements IJsonSerializer<IAllianceRanking> {

	private String name;

	public AllianceRankingJsonSerializer() {
		this("AllianceRanking");
	}

	public AllianceRankingJsonSerializer(String name) {
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
	public IAllianceRanking readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceRanking object) {
		writer.openObject();
		writer.writeObject(object.getAlliance(), new AllianceInfoJsonSerializer());
		writer.writeInt(object.getRank());
		writer.writeLong(object.getScore());
		writer.closeObject();
	}
}
