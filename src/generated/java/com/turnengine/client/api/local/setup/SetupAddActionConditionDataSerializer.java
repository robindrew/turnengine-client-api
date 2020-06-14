package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionConditionExecute;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.creation.CreationConditionType;
import java.io.IOException;

public class SetupAddActionConditionDataSerializer extends ObjectSerializer<ISetupAddActionCondition> {

	public SetupAddActionConditionDataSerializer() {
		super(false);
	}

	public SetupAddActionConditionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddActionCondition readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		ActionTargetType param2 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		ActionConditionExecute param3 = reader.readObject(new EnumSerializer<ActionConditionExecute>(ActionConditionExecute.class, false));
		CreationConditionType param4 = reader.readObject(new EnumSerializer<CreationConditionType>(CreationConditionType.class, false));
		String param5 = reader.readObject(new StringSerializer(false));
		long param6 = reader.readLong();
		String param7 = reader.readObject(new StringSerializer(false));
		long param8 = reader.readLong();
		String param9 = reader.readObject(new StringSerializer(false));
		long param10 = reader.readLong();
		boolean param11 = reader.readBoolean();
		return new SetupAddActionCondition(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddActionCondition object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		writer.writeObject(object.getExecute(), new EnumSerializer<ActionConditionExecute>(ActionConditionExecute.class, false));
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
