package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;
import java.io.IOException;

public class AddActionConditionReturnTypeDataSerializer extends ObjectSerializer<IAddActionCondition> {

	public AddActionConditionReturnTypeDataSerializer() {
		super(false);
	}

	public AddActionConditionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddActionCondition readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		ActionTargetType param4 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		ActionConditionExecute param5 = reader.readObject(new EnumSerializer<ActionConditionExecute>(ActionConditionExecute.class, false));
		CreationConditionType param6 = reader.readObject(new EnumSerializer<CreationConditionType>(CreationConditionType.class, false));
		String param7 = reader.readObject(new StringSerializer(false));
		long param8 = reader.readLong();
		String param9 = reader.readObject(new StringSerializer(false));
		long param10 = reader.readLong();
		String param11 = reader.readObject(new StringSerializer(false));
		long param12 = reader.readLong();
		boolean param13 = reader.readBoolean();
		return new AddActionCondition(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddActionCondition object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
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
