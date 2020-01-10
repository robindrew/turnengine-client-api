package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.alliance.AllianceMemberType;
import com.turnengine.client.api.local.score.GroupScoreDataSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import java.io.IOException;
import java.util.List;

public class PlayerInfoDataSerializer extends ObjectSerializer<IPlayerInfo> {

	public PlayerInfoDataSerializer() {
		super(false);
	}

	public PlayerInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPlayerInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		int param6 = reader.readInt();
		String param7 = reader.readObject(new StringSerializer(false));
		int param8 = reader.readInt();
		AllianceMemberType param9 = reader.readObject(new EnumSerializer<AllianceMemberType>(AllianceMemberType.class, false));
		List<IGroupScore> param10 = reader.readObject(new ListSerializer<IGroupScore>(new GroupScoreDataSerializer(false), false));
		return new PlayerInfo(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
	}

	@Override
	public void writeValue(IDataWriter writer, IPlayerInfo object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getAllianceId());
		writer.writeObject(object.getAllianceName(), new StringSerializer(false));
		writer.writeObject(object.getAllianceTag(), new StringSerializer(false));
		writer.writeInt(object.getFactionId());
		writer.writeObject(object.getFactionName(), new StringSerializer(false));
		writer.writeInt(object.getLeaveTurns());
		writer.writeObject(object.getMemberType(), new EnumSerializer<AllianceMemberType>(AllianceMemberType.class, false));
		writer.writeObject(object.getScoreList(), new ListSerializer<IGroupScore>(new GroupScoreDataSerializer(false), false));
	}
}
