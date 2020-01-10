package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.location.LocationInfoJsonSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountJsonSerializer;
import java.util.List;

public class MobileQueueItemJsonSerializer implements IJsonSerializer<IMobileQueueItem> {

	private String name;

	public MobileQueueItemJsonSerializer() {
		this("MobileQueueItem");
	}

	public MobileQueueItemJsonSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public IMobileQueueItem readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMobileQueueItem object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<MobileQueueType>(MobileQueueType.class));
		writer.writeInt(object.getIndex());
		writer.writeBoolean(object.getRepeat());
		writer.writeObject(object.getLocation(), new LocationInfoJsonSerializer());
		writer.writeObject(object.getMobile(), new MobileInfoJsonSerializer());
		writer.writeInt(object.getTurns());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.closeObject();
	}
}
