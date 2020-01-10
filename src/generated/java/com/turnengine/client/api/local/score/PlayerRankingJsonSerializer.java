package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoJsonSerializer;

public class PlayerRankingJsonSerializer implements IJsonSerializer<IPlayerRanking> {

	private String name;

	public PlayerRankingJsonSerializer() {
		this("PlayerRanking");
	}

	public PlayerRankingJsonSerializer(String name) {
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
	public IPlayerRanking readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IPlayerRanking object) {
		writer.openObject();
		writer.writeObject(object.getPlayer(), new PlayerInfoJsonSerializer());
		writer.writeInt(object.getRank());
		writer.writeLong(object.getScore());
		writer.closeObject();
	}
}
