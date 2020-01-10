package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface ISetupRoot extends IBean, Comparable<ISetupRoot> {

	int SERIALIZATION_ID = 6303;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the addFactionList field.
	 * @return the value of the addFactionList field.
	 */
	List<ISetupAddFaction> getAddFactionList();

	/**
	 * Getter for the addParentGroupList field.
	 * @return the value of the addParentGroupList field.
	 */
	List<ISetupAddParentGroup> getAddParentGroupList();

	/**
	 * Getter for the addChildGroupList field.
	 * @return the value of the addChildGroupList field.
	 */
	List<ISetupAddChildGroup> getAddChildGroupList();

	/**
	 * Getter for the addUnitList field.
	 * @return the value of the addUnitList field.
	 */
	List<ISetupAddUnit> getAddUnitList();

	/**
	 * Getter for the setStorageGroupList field.
	 * @return the value of the setStorageGroupList field.
	 */
	List<ISetupSetStorageGroup> getSetStorageGroupList();

	/**
	 * Getter for the setStorageItemList field.
	 * @return the value of the setStorageItemList field.
	 */
	List<ISetupSetStorageItem> getSetStorageItemList();

	/**
	 * Getter for the setUnitScoreList field.
	 * @return the value of the setUnitScoreList field.
	 */
	List<ISetupSetUnitScore> getSetUnitScoreList();

	/**
	 * Getter for the addUpkeepList field.
	 * @return the value of the addUpkeepList field.
	 */
	List<ISetupAddUpkeep> getAddUpkeepList();

	/**
	 * Getter for the addUpkeepConditionList field.
	 * @return the value of the addUpkeepConditionList field.
	 */
	List<ISetupAddUpkeepCondition> getAddUpkeepConditionList();

	/**
	 * Getter for the addActionList field.
	 * @return the value of the addActionList field.
	 */
	List<ISetupAddAction> getAddActionList();

	/**
	 * Getter for the addActionTargetList field.
	 * @return the value of the addActionTargetList field.
	 */
	List<ISetupAddActionTarget> getAddActionTargetList();

	/**
	 * Getter for the addActionConditionList field.
	 * @return the value of the addActionConditionList field.
	 */
	List<ISetupAddActionCondition> getAddActionConditionList();

	/**
	 * Setter for the addFactionList field.
	 * @param addFactionList the addFactionList value to set.
	 */
	void setAddFactionList(List<ISetupAddFaction> addFactionList);

	/**
	 * Setter for the addParentGroupList field.
	 * @param addParentGroupList the addParentGroupList value to set.
	 */
	void setAddParentGroupList(List<ISetupAddParentGroup> addParentGroupList);

	/**
	 * Setter for the addChildGroupList field.
	 * @param addChildGroupList the addChildGroupList value to set.
	 */
	void setAddChildGroupList(List<ISetupAddChildGroup> addChildGroupList);

	/**
	 * Setter for the addUnitList field.
	 * @param addUnitList the addUnitList value to set.
	 */
	void setAddUnitList(List<ISetupAddUnit> addUnitList);

	/**
	 * Setter for the setStorageGroupList field.
	 * @param setStorageGroupList the setStorageGroupList value to set.
	 */
	void setSetStorageGroupList(List<ISetupSetStorageGroup> setStorageGroupList);

	/**
	 * Setter for the setStorageItemList field.
	 * @param setStorageItemList the setStorageItemList value to set.
	 */
	void setSetStorageItemList(List<ISetupSetStorageItem> setStorageItemList);

	/**
	 * Setter for the setUnitScoreList field.
	 * @param setUnitScoreList the setUnitScoreList value to set.
	 */
	void setSetUnitScoreList(List<ISetupSetUnitScore> setUnitScoreList);

	/**
	 * Setter for the addUpkeepList field.
	 * @param addUpkeepList the addUpkeepList value to set.
	 */
	void setAddUpkeepList(List<ISetupAddUpkeep> addUpkeepList);

	/**
	 * Setter for the addUpkeepConditionList field.
	 * @param addUpkeepConditionList the addUpkeepConditionList value to set.
	 */
	void setAddUpkeepConditionList(List<ISetupAddUpkeepCondition> addUpkeepConditionList);

	/**
	 * Setter for the addActionList field.
	 * @param addActionList the addActionList value to set.
	 */
	void setAddActionList(List<ISetupAddAction> addActionList);

	/**
	 * Setter for the addActionTargetList field.
	 * @param addActionTargetList the addActionTargetList value to set.
	 */
	void setAddActionTargetList(List<ISetupAddActionTarget> addActionTargetList);

	/**
	 * Setter for the addActionConditionList field.
	 * @param addActionConditionList the addActionConditionList value to set.
	 */
	void setAddActionConditionList(List<ISetupAddActionCondition> addActionConditionList);
}
