package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountJsonSerializer;
import java.util.List;

public class TransferUnitsFromMobileJsonSerializer implements IJsonSerializer<ITransferUnitsFromMobile> {

	private String name;

	public TransferUnitsFromMobileJsonSerializer() {
		this("TransferUnitsFromMobile");
	}

	public TransferUnitsFromMobileJsonSerializer(String name) {
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
	public ITransferUnitsFromMobile readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ITransferUnitsFromMobile object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.writeBoolean(object.getAddToQueue());
		writer.writeBoolean(object.getRepeat());
		writer.closeObject();
	}
}
