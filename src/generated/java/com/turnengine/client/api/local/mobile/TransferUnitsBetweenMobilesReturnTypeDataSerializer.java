package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;
import java.io.IOException;
import java.util.List;

public class TransferUnitsBetweenMobilesReturnTypeDataSerializer extends ObjectSerializer<ITransferUnitsBetweenMobiles> {

	public TransferUnitsBetweenMobilesReturnTypeDataSerializer() {
		super(false);
	}

	public TransferUnitsBetweenMobilesReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITransferUnitsBetweenMobiles readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		List<IUnitCount> param5 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		boolean param6 = reader.readBoolean();
		boolean param7 = reader.readBoolean();
		return new TransferUnitsBetweenMobiles(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeValue(IDataWriter writer, ITransferUnitsBetweenMobiles object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getFromMobileId());
		writer.writeInt(object.getToMobileId());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		writer.writeBoolean(object.getAddToQueue());
		writer.writeBoolean(object.getRepeat());
	}
}
