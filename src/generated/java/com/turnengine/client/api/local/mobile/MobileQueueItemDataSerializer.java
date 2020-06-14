package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.location.LocationInfoDataSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;
import java.io.IOException;
import java.util.List;

public class MobileQueueItemDataSerializer extends ObjectSerializer<IMobileQueueItem> {

	public MobileQueueItemDataSerializer() {
		super(false);
	}

	public MobileQueueItemDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMobileQueueItem readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		MobileQueueType param2 = reader.readObject(new EnumSerializer<MobileQueueType>(MobileQueueType.class, false));
		int param3 = reader.readInt();
		boolean param4 = reader.readBoolean();
		ILocationInfo param5 = reader.readObject(new LocationInfoDataSerializer(false));
		IMobileInfo param6 = reader.readObject(new MobileInfoDataSerializer(false));
		int param7 = reader.readInt();
		List<IUnitCount> param8 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		return new MobileQueueItem(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeValue(IDataWriter writer, IMobileQueueItem object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<MobileQueueType>(MobileQueueType.class, false));
		writer.writeInt(object.getIndex());
		writer.writeBoolean(object.getRepeat());
		writer.writeObject(object.getLocation(), new LocationInfoDataSerializer(false));
		writer.writeObject(object.getMobile(), new MobileInfoDataSerializer(false));
		writer.writeInt(object.getTurns());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
	}
}
