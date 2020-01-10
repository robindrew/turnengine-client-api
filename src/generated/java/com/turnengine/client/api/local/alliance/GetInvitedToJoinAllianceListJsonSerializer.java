package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetInvitedToJoinAllianceListJsonSerializer implements IJsonSerializer<IGetInvitedToJoinAllianceList> {

	private String name;

	public GetInvitedToJoinAllianceListJsonSerializer() {
		this("GetInvitedToJoinAllianceList");
	}

	public GetInvitedToJoinAllianceListJsonSerializer(String name) {
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
	public IGetInvitedToJoinAllianceList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetInvitedToJoinAllianceList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
