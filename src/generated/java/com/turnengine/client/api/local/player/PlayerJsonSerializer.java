package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.alliance.AllianceMemberType;
import com.turnengine.client.api.local.score.GroupScoreJsonSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountJsonSerializer;
import java.util.List;

public class PlayerJsonSerializer implements IJsonSerializer<IPlayer> {

	private String name;

	public PlayerJsonSerializer() {
		this("Player");
	}

	public PlayerJsonSerializer(String name) {
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
	public IPlayer readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IPlayer object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getUserId());
		writer.writeInt(object.getFactionId());
		writer.writeObject(object.getFactionName(), new StringSerializer());
		writer.writeInt(object.getRequestId());
		writer.writeInt(object.getAllianceId());
		writer.writeObject(object.getAllianceName(), new StringSerializer());
		writer.writeObject(object.getAllianceTag(), new StringSerializer());
		writer.writeInt(object.getLeaveTurns());
		writer.writeObject(object.getMemberType(), new EnumSerializer<AllianceMemberType>(AllianceMemberType.class));
		writer.writeObject(object.getEmailAlerts(), new EnumSerializer<PlayerEmailAlerts>(PlayerEmailAlerts.class));
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.writeInt(object.getLocations());
		writer.writeInt(object.getMobiles());
		writer.writeObject(object.getScoreList(), new ListSerializer<IGroupScore>(new GroupScoreJsonSerializer()));
		writer.closeObject();
	}
}
