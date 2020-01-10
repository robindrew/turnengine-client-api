package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.forum.ForumFlag;

public class SetAlliancePostFlagJsonSerializer implements IJsonSerializer<ISetAlliancePostFlag> {

	private String name;

	public SetAlliancePostFlagJsonSerializer() {
		this("SetAlliancePostFlag");
	}

	public SetAlliancePostFlagJsonSerializer(String name) {
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
	public ISetAlliancePostFlag readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetAlliancePostFlag object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPostId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class));
		writer.writeBoolean(object.getSet());
		writer.closeObject();
	}
}
