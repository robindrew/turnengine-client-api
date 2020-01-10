package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoJsonSerializer;
import com.turnengine.client.api.local.score.GroupScoreJsonSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;

public class AllianceJsonSerializer implements IJsonSerializer<IAlliance> {

	private String name;

	public AllianceJsonSerializer() {
		this("Alliance");
	}

	public AllianceJsonSerializer(String name) {
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
	public IAlliance readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAlliance object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getLeaderId());
		writer.writeObject(object.getLeaderName(), new StringSerializer());
		writer.writeInt(object.getFactionId());
		writer.writeBoolean(object.getInvited());
		writer.writeInt(object.getMembers());
		writer.writeObject(object.getMemberList(), new ListSerializer<IPlayerInfo>(new PlayerInfoJsonSerializer()));
		writer.writeObject(object.getScoreList(), new ListSerializer<IGroupScore>(new GroupScoreJsonSerializer()));
		writer.writeObject(object.getTag(), new StringSerializer());
		writer.closeObject();
	}
}
