package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceLogoReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceLogo> {

	public GetAllianceLogoReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceLogoReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceLogo readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		boolean param6 = reader.readBoolean();
		return new GetAllianceLogo(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceLogo object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getAllianceId());
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeBoolean(object.getFill());
	}
}
