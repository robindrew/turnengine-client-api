package com.turnengine.client.api.local.faction;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AddFactionReturnTypeDataSerializer extends ObjectSerializer<IAddFaction> {

	public AddFactionReturnTypeDataSerializer() {
		super(false);
	}

	public AddFactionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddFaction readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		FactionUnited param5 = reader.readObject(new EnumSerializer<FactionUnited>(FactionUnited.class, false));
		int param6 = reader.readInt();
		return new AddFaction(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddFaction object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPassword(), new StringSerializer(false));
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class, false));
		writer.writeInt(object.getPlayerLimit());
	}
}
