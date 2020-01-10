package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AlliancePropertyDataSerializer extends ObjectSerializer<IAllianceProperty> {

	public AlliancePropertyDataSerializer() {
		super(false);
	}

	public AlliancePropertyDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAllianceProperty readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new AllianceProperty(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IAllianceProperty object) throws IOException {
		writer.writeInt(object.getAllianceId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
