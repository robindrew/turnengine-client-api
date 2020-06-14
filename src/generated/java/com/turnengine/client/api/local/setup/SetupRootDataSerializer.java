package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import java.io.IOException;
import java.util.List;

public class SetupRootDataSerializer extends ObjectSerializer<ISetupRoot> {

	public SetupRootDataSerializer() {
		super(false);
	}

	public SetupRootDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupRoot readValue(IDataReader reader) throws IOException {
		List<ISetupAddFaction> param1 = reader.readObject(new ListSerializer<ISetupAddFaction>(new SetupAddFactionDataSerializer(false), false));
		List<ISetupAddParentGroup> param2 = reader.readObject(new ListSerializer<ISetupAddParentGroup>(new SetupAddParentGroupDataSerializer(false), false));
		List<ISetupAddChildGroup> param3 = reader.readObject(new ListSerializer<ISetupAddChildGroup>(new SetupAddChildGroupDataSerializer(false), false));
		List<ISetupAddUnit> param4 = reader.readObject(new ListSerializer<ISetupAddUnit>(new SetupAddUnitDataSerializer(false), false));
		List<ISetupSetStorageGroup> param5 = reader.readObject(new ListSerializer<ISetupSetStorageGroup>(new SetupSetStorageGroupDataSerializer(false), false));
		List<ISetupSetStorageItem> param6 = reader.readObject(new ListSerializer<ISetupSetStorageItem>(new SetupSetStorageItemDataSerializer(false), false));
		List<ISetupSetUnitScore> param7 = reader.readObject(new ListSerializer<ISetupSetUnitScore>(new SetupSetUnitScoreDataSerializer(false), false));
		List<ISetupAddUpkeep> param8 = reader.readObject(new ListSerializer<ISetupAddUpkeep>(new SetupAddUpkeepDataSerializer(false), false));
		List<ISetupAddUpkeepCondition> param9 = reader.readObject(new ListSerializer<ISetupAddUpkeepCondition>(new SetupAddUpkeepConditionDataSerializer(false), false));
		List<ISetupAddAction> param10 = reader.readObject(new ListSerializer<ISetupAddAction>(new SetupAddActionDataSerializer(false), false));
		List<ISetupAddActionTarget> param11 = reader.readObject(new ListSerializer<ISetupAddActionTarget>(new SetupAddActionTargetDataSerializer(false), false));
		List<ISetupAddActionCondition> param12 = reader.readObject(new ListSerializer<ISetupAddActionCondition>(new SetupAddActionConditionDataSerializer(false), false));
		return new SetupRoot(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupRoot object) throws IOException {
		writer.writeObject(object.getAddFactionList(), new ListSerializer<ISetupAddFaction>(new SetupAddFactionDataSerializer(false), false));
		writer.writeObject(object.getAddParentGroupList(), new ListSerializer<ISetupAddParentGroup>(new SetupAddParentGroupDataSerializer(false), false));
		writer.writeObject(object.getAddChildGroupList(), new ListSerializer<ISetupAddChildGroup>(new SetupAddChildGroupDataSerializer(false), false));
		writer.writeObject(object.getAddUnitList(), new ListSerializer<ISetupAddUnit>(new SetupAddUnitDataSerializer(false), false));
		writer.writeObject(object.getSetStorageGroupList(), new ListSerializer<ISetupSetStorageGroup>(new SetupSetStorageGroupDataSerializer(false), false));
		writer.writeObject(object.getSetStorageItemList(), new ListSerializer<ISetupSetStorageItem>(new SetupSetStorageItemDataSerializer(false), false));
		writer.writeObject(object.getSetUnitScoreList(), new ListSerializer<ISetupSetUnitScore>(new SetupSetUnitScoreDataSerializer(false), false));
		writer.writeObject(object.getAddUpkeepList(), new ListSerializer<ISetupAddUpkeep>(new SetupAddUpkeepDataSerializer(false), false));
		writer.writeObject(object.getAddUpkeepConditionList(), new ListSerializer<ISetupAddUpkeepCondition>(new SetupAddUpkeepConditionDataSerializer(false), false));
		writer.writeObject(object.getAddActionList(), new ListSerializer<ISetupAddAction>(new SetupAddActionDataSerializer(false), false));
		writer.writeObject(object.getAddActionTargetList(), new ListSerializer<ISetupAddActionTarget>(new SetupAddActionTargetDataSerializer(false), false));
		writer.writeObject(object.getAddActionConditionList(), new ListSerializer<ISetupAddActionCondition>(new SetupAddActionConditionDataSerializer(false), false));
	}
}
