package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class SetupRootXmlSerializer implements IXmlSerializer<ISetupRoot> {

	private String name;

	public SetupRootXmlSerializer() {
		this("SetupRoot");
	}

	public SetupRootXmlSerializer(String name) {
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
	public ISetupRoot readObject(IXmlReader reader) {
		reader.startElement(getName());
		List<ISetupAddFaction> param1 = reader.readObject(new ListSerializer<ISetupAddFaction>("addFactionList", new SetupAddFactionXmlSerializer("element")));
		List<ISetupAddParentGroup> param2 = reader.readObject(new ListSerializer<ISetupAddParentGroup>("addParentGroupList", new SetupAddParentGroupXmlSerializer("element")));
		List<ISetupAddChildGroup> param3 = reader.readObject(new ListSerializer<ISetupAddChildGroup>("addChildGroupList", new SetupAddChildGroupXmlSerializer("element")));
		List<ISetupAddUnit> param4 = reader.readObject(new ListSerializer<ISetupAddUnit>("addUnitList", new SetupAddUnitXmlSerializer("element")));
		List<ISetupSetStorageGroup> param5 = reader.readObject(new ListSerializer<ISetupSetStorageGroup>("setStorageGroupList", new SetupSetStorageGroupXmlSerializer("element")));
		List<ISetupSetStorageItem> param6 = reader.readObject(new ListSerializer<ISetupSetStorageItem>("setStorageItemList", new SetupSetStorageItemXmlSerializer("element")));
		List<ISetupSetUnitScore> param7 = reader.readObject(new ListSerializer<ISetupSetUnitScore>("setUnitScoreList", new SetupSetUnitScoreXmlSerializer("element")));
		List<ISetupAddUpkeep> param8 = reader.readObject(new ListSerializer<ISetupAddUpkeep>("addUpkeepList", new SetupAddUpkeepXmlSerializer("element")));
		List<ISetupAddUpkeepCondition> param9 = reader.readObject(new ListSerializer<ISetupAddUpkeepCondition>("addUpkeepConditionList", new SetupAddUpkeepConditionXmlSerializer("element")));
		List<ISetupAddAction> param10 = reader.readObject(new ListSerializer<ISetupAddAction>("addActionList", new SetupAddActionXmlSerializer("element")));
		List<ISetupAddActionTarget> param11 = reader.readObject(new ListSerializer<ISetupAddActionTarget>("addActionTargetList", new SetupAddActionTargetXmlSerializer("element")));
		List<ISetupAddActionCondition> param12 = reader.readObject(new ListSerializer<ISetupAddActionCondition>("addActionConditionList", new SetupAddActionConditionXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new SetupRoot(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupRoot object) {
		writer.startElement(getName());
		writer.writeObject(object.getAddFactionList(), new ListSerializer<ISetupAddFaction>("addFactionList", new SetupAddFactionXmlSerializer("element")));
		writer.writeObject(object.getAddParentGroupList(), new ListSerializer<ISetupAddParentGroup>("addParentGroupList", new SetupAddParentGroupXmlSerializer("element")));
		writer.writeObject(object.getAddChildGroupList(), new ListSerializer<ISetupAddChildGroup>("addChildGroupList", new SetupAddChildGroupXmlSerializer("element")));
		writer.writeObject(object.getAddUnitList(), new ListSerializer<ISetupAddUnit>("addUnitList", new SetupAddUnitXmlSerializer("element")));
		writer.writeObject(object.getSetStorageGroupList(), new ListSerializer<ISetupSetStorageGroup>("setStorageGroupList", new SetupSetStorageGroupXmlSerializer("element")));
		writer.writeObject(object.getSetStorageItemList(), new ListSerializer<ISetupSetStorageItem>("setStorageItemList", new SetupSetStorageItemXmlSerializer("element")));
		writer.writeObject(object.getSetUnitScoreList(), new ListSerializer<ISetupSetUnitScore>("setUnitScoreList", new SetupSetUnitScoreXmlSerializer("element")));
		writer.writeObject(object.getAddUpkeepList(), new ListSerializer<ISetupAddUpkeep>("addUpkeepList", new SetupAddUpkeepXmlSerializer("element")));
		writer.writeObject(object.getAddUpkeepConditionList(), new ListSerializer<ISetupAddUpkeepCondition>("addUpkeepConditionList", new SetupAddUpkeepConditionXmlSerializer("element")));
		writer.writeObject(object.getAddActionList(), new ListSerializer<ISetupAddAction>("addActionList", new SetupAddActionXmlSerializer("element")));
		writer.writeObject(object.getAddActionTargetList(), new ListSerializer<ISetupAddActionTarget>("addActionTargetList", new SetupAddActionTargetXmlSerializer("element")));
		writer.writeObject(object.getAddActionConditionList(), new ListSerializer<ISetupAddActionCondition>("addActionConditionList", new SetupAddActionConditionXmlSerializer("element")));
		writer.endElement(getName());
	}
}
