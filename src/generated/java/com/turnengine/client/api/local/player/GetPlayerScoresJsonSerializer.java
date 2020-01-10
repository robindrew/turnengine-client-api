package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetPlayerScoresJsonSerializer implements IJsonSerializer<IGetPlayerScores> {

	private String name;

	public GetPlayerScoresJsonSerializer() {
		this("GetPlayerScores");
	}

	public GetPlayerScoresJsonSerializer(String name) {
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
	public IGetPlayerScores readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetPlayerScores object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getMaxSize());
		writer.writeInt(object.getMinTurn());
		writer.writeInt(object.getMaxTurn());
		writer.closeObject();
	}
}
