package com.turnengine.client.api.local.upkeep;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;
import java.io.IOException;

public class AddUpkeepConditionReturnTypeDataSerializer extends ObjectSerializer<IAddUpkeepCondition> {

	public AddUpkeepConditionReturnTypeDataSerializer() {
		super(false);
	}

	public AddUpkeepConditionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddUpkeepCondition readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		CreationConditionType param4 = reader.readObject(new EnumSerializer<CreationConditionType>(CreationConditionType.class, false));
		String param5 = reader.readObject(new StringSerializer(false));
		long param6 = reader.readLong();
		String param7 = reader.readObject(new StringSerializer(false));
		long param8 = reader.readLong();
		String param9 = reader.readObject(new StringSerializer(false));
		long param10 = reader.readLong();
		boolean param11 = reader.readBoolean();
		return new AddUpkeepCondition(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddUpkeepCondition object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
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
