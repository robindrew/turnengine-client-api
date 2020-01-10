package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class RankingJsonSerializer implements IJsonSerializer<IRanking> {

	private String name;

	public RankingJsonSerializer() {
		this("Ranking");
	}

	public RankingJsonSerializer(String name) {
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
	public IRanking readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IRanking object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeInt(object.getRank());
		writer.writeLong(object.getScore());
		writer.closeObject();
	}
}
