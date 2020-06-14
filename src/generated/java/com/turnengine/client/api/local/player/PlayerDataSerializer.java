package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.alliance.AllianceMemberType;
import com.turnengine.client.api.local.score.GroupScoreDataSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;
import java.io.IOException;
import java.util.List;

public class PlayerDataSerializer extends ObjectSerializer<IPlayer> {

	public PlayerDataSerializer() {
		super(false);
	}

	public PlayerDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPlayer readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		String param5 = reader.readObject(new StringSerializer(false));
		int param6 = reader.readInt();
		int param7 = reader.readInt();
		String param8 = reader.readObject(new StringSerializer(false));
		String param9 = reader.readObject(new StringSerializer(false));
		int param10 = reader.readInt();
		AllianceMemberType param11 = reader.readObject(new EnumSerializer<AllianceMemberType>(AllianceMemberType.class, false));
		PlayerEmailAlerts param12 = reader.readObject(new EnumSerializer<PlayerEmailAlerts>(PlayerEmailAlerts.class, false));
		List<IUnitCount> param13 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		int param14 = reader.readInt();
		int param15 = reader.readInt();
		List<IGroupScore> param16 = reader.readObject(new ListSerializer<IGroupScore>(new GroupScoreDataSerializer(false), false));
		return new Player(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
	}

	@Override
	public void writeValue(IDataWriter writer, IPlayer object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getUserId());
		writer.writeInt(object.getFactionId());
		writer.writeObject(object.getFactionName(), new StringSerializer(false));
		writer.writeInt(object.getRequestId());
		writer.writeInt(object.getAllianceId());
		writer.writeObject(object.getAllianceName(), new StringSerializer(false));
		writer.writeObject(object.getAllianceTag(), new StringSerializer(false));
		writer.writeInt(object.getLeaveTurns());
		writer.writeObject(object.getMemberType(), new EnumSerializer<AllianceMemberType>(AllianceMemberType.class, false));
		writer.writeObject(object.getEmailAlerts(), new EnumSerializer<PlayerEmailAlerts>(PlayerEmailAlerts.class, false));
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		writer.writeInt(object.getLocations());
		writer.writeInt(object.getMobiles());
		writer.writeObject(object.getScoreList(), new ListSerializer<IGroupScore>(new GroupScoreDataSerializer(false), false));
	}
}
