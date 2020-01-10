package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.turnengine.client.api.local.alliance.AllianceInfoDataSerializer;
import com.turnengine.client.api.local.alliance.IAllianceInfo;
import java.io.IOException;

public class AllianceRankingDataSerializer extends ObjectSerializer<IAllianceRanking> {

	public AllianceRankingDataSerializer() {
		super(false);
	}

	public AllianceRankingDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAllianceRanking readValue(IDataReader reader) throws IOException {
		IAllianceInfo param1 = reader.readObject(new AllianceInfoDataSerializer(false));
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		return new AllianceRanking(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IAllianceRanking object) throws IOException {
		writer.writeObject(object.getAlliance(), new AllianceInfoDataSerializer(false));
		writer.writeInt(object.getRank());
		writer.writeLong(object.getScore());
	}
}
