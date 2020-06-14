package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;
import java.io.IOException;

public class SetupAddUpkeepConditionDataSerializer extends ObjectSerializer<ISetupAddUpkeepCondition> {

	public SetupAddUpkeepConditionDataSerializer() {
		super(false);
	}

	public SetupAddUpkeepConditionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddUpkeepCondition readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		CreationConditionType param2 = reader.readObject(new EnumSerializer<CreationConditionType>(CreationConditionType.class, false));
		String param3 = reader.readObject(new StringSerializer(false));
		long param4 = reader.readLong();
		String param5 = reader.readObject(new StringSerializer(false));
		long param6 = reader.readLong();
		String param7 = reader.readObject(new StringSerializer(false));
		long param8 = reader.readLong();
		boolean param9 = reader.readBoolean();
		return new SetupAddUpkeepCondition(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddUpkeepCondition object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getCondition(), new EnumSerializer<CreationConditionType>(CreationConditionType.class, false));
		writer.writeObject(object.getConditionName1(), new StringSerializer(false));
		writer.writeLong(object.getConditionAmount1());
		writer.writeObject(object.getConditionName2(), new StringSerializer(false));
		writer.writeLong(object.getConditionAmount2());
		writer.writeObject(object.getConditionName3(), new StringSerializer(false));
		writer.writeLong(object.getConditionAmount3());
		writer.writeBoolean(object.getOptional());
	}
}
