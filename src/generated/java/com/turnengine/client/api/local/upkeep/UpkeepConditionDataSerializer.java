package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;
import java.io.IOException;

public class UpkeepConditionDataSerializer extends ObjectSerializer<IUpkeepCondition> {

	public UpkeepConditionDataSerializer() {
		super(false);
	}

	public UpkeepConditionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUpkeepCondition readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		CreationConditionType param2 = reader.readObject(new EnumSerializer<CreationConditionType>(CreationConditionType.class, false));
		int param3 = reader.readInt();
		long param4 = reader.readLong();
		int param5 = reader.readInt();
		long param6 = reader.readLong();
		int param7 = reader.readInt();
		long param8 = reader.readLong();
		boolean param9 = reader.readBoolean();
		return new UpkeepCondition(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeValue(IDataWriter writer, IUpkeepCondition object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getConditionType(), new EnumSerializer<CreationConditionType>(CreationConditionType.class, false));
		writer.writeInt(object.getConditionId1());
		writer.writeLong(object.getConditionAmount1());
		writer.writeInt(object.getConditionId2());
		writer.writeLong(object.getConditionAmount2());
		writer.writeInt(object.getConditionId3());
		writer.writeLong(object.getConditionAmount3());
		writer.writeBoolean(object.getOptional());
	}
}
