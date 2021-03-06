package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoDataSerializer;
import com.turnengine.client.api.local.score.GroupScoreDataSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import java.io.IOException;
import java.util.List;

public class AllianceDataSerializer extends ObjectSerializer<IAlliance> {

	public AllianceDataSerializer() {
		super(false);
	}

	public AllianceDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAlliance readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		String param4 = reader.readObject(new StringSerializer(false));
		int param5 = reader.readInt();
		boolean param6 = reader.readBoolean();
		int param7 = reader.readInt();
		List<IPlayerInfo> param8 = reader.readObject(new ListSerializer<IPlayerInfo>(new PlayerInfoDataSerializer(false), false));
		List<IGroupScore> param9 = reader.readObject(new ListSerializer<IGroupScore>(new GroupScoreDataSerializer(false), false));
		String param10 = reader.readObject(new StringSerializer(false));
		return new Alliance(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
	}

	@Override
	public void writeValue(IDataWriter writer, IAlliance object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getLeaderId());
		writer.writeObject(object.getLeaderName(), new StringSerializer(false));
		writer.writeInt(object.getFactionId());
		writer.writeBoolean(object.getInvited());
		writer.writeInt(object.getMembers());
		writer.writeObject(object.getMemberList(), new ListSerializer<IPlayerInfo>(new PlayerInfoDataSerializer(false), false));
		writer.writeObject(object.getScoreList(), new ListSerializer<IGroupScore>(new GroupScoreDataSerializer(false), false));
		writer.writeObject(object.getTag(), new StringSerializer(false));
	}
}
