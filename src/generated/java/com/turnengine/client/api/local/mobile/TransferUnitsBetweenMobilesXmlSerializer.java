package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class TransferUnitsBetweenMobilesXmlSerializer implements IXmlSerializer<ITransferUnitsBetweenMobiles> {

	private String name;

	public TransferUnitsBetweenMobilesXmlSerializer() {
		this("TransferUnitsBetweenMobiles");
	}

	public TransferUnitsBetweenMobilesXmlSerializer(String name) {
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
	public ITransferUnitsBetweenMobiles readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("fromMobileId");
		int param4 = reader.readInt("toMobileId");
		List<IUnitCount> param5 = reader.readObject(new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		boolean param6 = reader.readBoolean("addToQueue");
		boolean param7 = reader.readBoolean("repeat");
		reader.endElement(getName());

		// Create the bean
		return new TransferUnitsBetweenMobiles(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITransferUnitsBetweenMobiles object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("fromMobileId", object.getFromMobileId());
		writer.writeInt("toMobileId", object.getToMobileId());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		writer.writeBoolean("addToQueue", object.getAddToQueue());
		writer.writeBoolean("repeat", object.getRepeat());
		writer.endElement(getName());
	}
}
