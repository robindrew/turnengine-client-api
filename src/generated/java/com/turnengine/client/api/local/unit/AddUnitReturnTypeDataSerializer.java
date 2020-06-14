package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AddUnitReturnTypeDataSerializer extends ObjectSerializer<IAddUnit> {

	public AddUnitReturnTypeDataSerializer() {
		super(false);
	}

	public AddUnitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddUnit readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		UnitNode param4 = reader.readObject(new EnumSerializer<UnitNode>(UnitNode.class, false));
		UnitType param5 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, false));
		UnitMove param6 = reader.readObject(new EnumSerializer<UnitMove>(UnitMove.class, false));
		String param7 = reader.readObject(new StringSerializer(false));
		String param8 = reader.readObject(new StringSerializer(false));
		return new AddUnit(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddUnit object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getNode(), new EnumSerializer<UnitNode>(UnitNode.class, false));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, false));
		writer.writeObject(object.getMove(), new EnumSerializer<UnitMove>(UnitMove.class, false));
		writer.writeObject(object.getGroupName(), new StringSerializer(false));
		writer.writeObject(object.getFactionName(), new StringSerializer(false));
	}
}
