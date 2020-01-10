package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoDataSerializer;
import java.io.IOException;

public class PlayerRankingDataSerializer extends ObjectSerializer<IPlayerRanking> {

	public PlayerRankingDataSerializer() {
		super(false);
	}

	public PlayerRankingDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPlayerRanking readValue(IDataReader reader) throws IOException {
		IPlayerInfo param1 = reader.readObject(new PlayerInfoDataSerializer(false));
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		return new PlayerRanking(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IPlayerRanking object) throws IOException {
		writer.writeObject(object.getPlayer(), new PlayerInfoDataSerializer(false));
		writer.writeInt(object.getRank());
		writer.writeLong(object.getScore());
	}
}
