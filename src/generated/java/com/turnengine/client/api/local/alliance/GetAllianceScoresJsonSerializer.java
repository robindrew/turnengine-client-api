package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceScoresJsonSerializer implements IJsonSerializer<IGetAllianceScores> {

	private String name;

	public GetAllianceScoresJsonSerializer() {
		this("GetAllianceScores");
	}

	public GetAllianceScoresJsonSerializer(String name) {
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
	public IGetAllianceScores readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAllianceScores object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getAllianceId());
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getMaxSize());
		writer.writeInt(object.getMinTurn());
		writer.writeInt(object.getMaxTurn());
		writer.closeObject();
	}
}
