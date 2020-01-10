package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;
import java.io.IOException;

public class ActionConditionDataSerializer extends ObjectSerializer<IActionCondition> {

	public ActionConditionDataSerializer() {
		super(false);
	}

	public ActionConditionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IActionCondition readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		ActionTargetType param2 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		ActionConditionExecute param3 = reader.readObject(new EnumSerializer<ActionConditionExecute>(ActionConditionExecute.class, false));
		CreationConditionType param4 = reader.readObject(new EnumSerializer<CreationConditionType>(CreationConditionType.class, false));
		int param5 = reader.readInt();
		long param6 = reader.readLong();
		int param7 = reader.readInt();
		long param8 = reader.readLong();
		int param9 = reader.readInt();
		long param10 = reader.readLong();
		boolean param11 = reader.readBoolean();
		return new ActionCondition(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
	}

	@Override
	public void writeValue(IDataWriter writer, IActionCondition object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		writer.writeObject(object.getExecute(), new EnumSerializer<ActionConditionExecute>(ActionConditionExecute.class, false));
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
