package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class TransferUnitsToMobileXmlSerializer implements IXmlSerializer<ITransferUnitsToMobile> {

	private String name;

	public TransferUnitsToMobileXmlSerializer() {
		this("TransferUnitsToMobile");
	}

	public TransferUnitsToMobileXmlSerializer(String name) {
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
	public ITransferUnitsToMobile readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		List<IUnitCount> param4 = reader.readObject(new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		boolean param5 = reader.readBoolean("addToQueue");
		boolean param6 = reader.readBoolean("repeat");
		reader.endElement(getName());

		// Create the bean
		return new TransferUnitsToMobile(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITransferUnitsToMobile object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		writer.writeBoolean("addToQueue", object.getAddToQueue());
		writer.writeBoolean("repeat", object.getRepeat());
		writer.endElement(getName());
	}
}
