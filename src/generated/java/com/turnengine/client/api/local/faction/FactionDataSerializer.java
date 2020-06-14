package com.turnengine.client.api.local.faction;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class FactionDataSerializer extends ObjectSerializer<IFaction> {

	public FactionDataSerializer() {
		super(false);
	}

	public FactionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IFaction readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		FactionUnited param4 = reader.readObject(new EnumSerializer<FactionUnited>(FactionUnited.class, false));
		int param5 = reader.readInt();
		return new Faction(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IFaction object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPassword(), new StringSerializer(false));
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class, false));
		writer.writeInt(object.getPlayerLimit());
	}
}
