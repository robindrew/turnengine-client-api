package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;
import java.io.IOException;
import java.util.List;

public class TransferUnitsFromMobileReturnTypeDataSerializer extends ObjectSerializer<ITransferUnitsFromMobile> {

	public TransferUnitsFromMobileReturnTypeDataSerializer() {
		super(false);
	}

	public TransferUnitsFromMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITransferUnitsFromMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		List<IUnitCount> param4 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		boolean param5 = reader.readBoolean();
		boolean param6 = reader.readBoolean();
		return new TransferUnitsFromMobile(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, ITransferUnitsFromMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		writer.writeBoolean(object.getAddToQueue());
		writer.writeBoolean(object.getRepeat());
	}
}
