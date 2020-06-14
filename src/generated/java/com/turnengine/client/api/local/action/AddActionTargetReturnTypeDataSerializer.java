package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;
import java.io.IOException;

public class AddActionTargetReturnTypeDataSerializer extends ObjectSerializer<IAddActionTarget> {

	public AddActionTargetReturnTypeDataSerializer() {
		super(false);
	}

	public AddActionTargetReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddActionTarget readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		ActionTargetType param4 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		UnitType param5 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		UnitRelation param6 = reader.readObject(new EnumSerializer<UnitRelation>(UnitRelation.class, false));
		return new AddActionTarget(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddActionTarget object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, false));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeObject(object.getRelation(), new EnumSerializer<UnitRelation>(UnitRelation.class, false));
	}
}
