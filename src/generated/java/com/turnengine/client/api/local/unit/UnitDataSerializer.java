package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class UnitDataSerializer extends ObjectSerializer<IUnit> {

	public UnitDataSerializer() {
		super(false);
	}

	public UnitDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUnit readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		UnitNode param3 = reader.readObject(new EnumSerializer<UnitNode>(UnitNode.class, false));
		UnitType param4 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		UnitMove param5 = reader.readObject(new EnumSerializer<UnitMove>(UnitMove.class, false));
		int param6 = reader.readInt();
		int param7 = reader.readInt();
		return new Unit(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeValue(IDataWriter writer, IUnit object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getNode(), new EnumSerializer<UnitNode>(UnitNode.class, false));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeObject(object.getMove(), new EnumSerializer<UnitMove>(UnitMove.class, false));
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getFactionId());
	}
}
