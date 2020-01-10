package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class SetupRootJsonSerializer implements IJsonSerializer<ISetupRoot> {

	private String name;

	public SetupRootJsonSerializer() {
		this("SetupRoot");
	}

	public SetupRootJsonSerializer(String name) {
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
	public ISetupRoot readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupRoot object) {
		writer.openObject();
		writer.writeObject(object.getAddFactionList(), new ListSerializer<ISetupAddFaction>(new SetupAddFactionJsonSerializer()));
		writer.writeObject(object.getAddParentGroupList(), new ListSerializer<ISetupAddParentGroup>(new SetupAddParentGroupJsonSerializer()));
		writer.writeObject(object.getAddChildGroupList(), new ListSerializer<ISetupAddChildGroup>(new SetupAddChildGroupJsonSerializer()));
		writer.writeObject(object.getAddUnitList(), new ListSerializer<ISetupAddUnit>(new SetupAddUnitJsonSerializer()));
		writer.writeObject(object.getSetStorageGroupList(), new ListSerializer<ISetupSetStorageGroup>(new SetupSetStorageGroupJsonSerializer()));
		writer.writeObject(object.getSetStorageItemList(), new ListSerializer<ISetupSetStorageItem>(new SetupSetStorageItemJsonSerializer()));
		writer.writeObject(object.getSetUnitScoreList(), new ListSerializer<ISetupSetUnitScore>(new SetupSetUnitScoreJsonSerializer()));
		writer.writeObject(object.getAddUpkeepList(), new ListSerializer<ISetupAddUpkeep>(new SetupAddUpkeepJsonSerializer()));
		writer.writeObject(object.getAddUpkeepConditionList(), new ListSerializer<ISetupAddUpkeepCondition>(new SetupAddUpkeepConditionJsonSerializer()));
		writer.writeObject(object.getAddActionList(), new ListSerializer<ISetupAddAction>(new SetupAddActionJsonSerializer()));
		writer.writeObject(object.getAddActionTargetList(), new ListSerializer<ISetupAddActionTarget>(new SetupAddActionTargetJsonSerializer()));
		writer.writeObject(object.getAddActionConditionList(), new ListSerializer<ISetupAddActionCondition>(new SetupAddActionConditionJsonSerializer()));
		writer.closeObject();
	}
}
