package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoJsonSerializer;
import java.util.List;

public class GetInvitedToJoinAllianceListReturnTypeJsonSerializer implements IJsonSerializer<List<IPlayerInfo>> {

	private String name;

	public GetInvitedToJoinAllianceListReturnTypeJsonSerializer() {
		this("GetInvitedToJoinAllianceListReturnType");
	}

	public GetInvitedToJoinAllianceListReturnTypeJsonSerializer(String name) {
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
	public List<IPlayerInfo> readObject(IJsonReader reader) {
		return new ListSerializer<IPlayerInfo>(new PlayerInfoJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IPlayerInfo> object) {
		new ListSerializer<IPlayerInfo>(new PlayerInfoJsonSerializer()).writeObject(writer, object);
	}
}
