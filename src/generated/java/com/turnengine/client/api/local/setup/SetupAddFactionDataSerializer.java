package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.faction.FactionUnited;
import java.io.IOException;

public class SetupAddFactionDataSerializer extends ObjectSerializer<ISetupAddFaction> {

	public SetupAddFactionDataSerializer() {
		super(false);
	}

	public SetupAddFactionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddFaction readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		FactionUnited param3 = reader.readObject(new EnumSerializer<FactionUnited>(FactionUnited.class, false));
		int param4 = reader.readInt();
		return new SetupAddFaction(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddFaction object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPassword(), new StringSerializer(false));
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class, false));
		writer.writeInt(object.getPlayerLimit());
	}
}
