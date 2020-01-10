package com.turnengine.client.api.local.setup;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetupRoot implements ISetupRoot {

	/** The addFactionList field. */
	private List<ISetupAddFaction> addFactionList = null;
	/** The addParentGroupList field. */
	private List<ISetupAddParentGroup> addParentGroupList = null;
	/** The addChildGroupList field. */
	private List<ISetupAddChildGroup> addChildGroupList = null;
	/** The addUnitList field. */
	private List<ISetupAddUnit> addUnitList = null;
	/** The setStorageGroupList field. */
	private List<ISetupSetStorageGroup> setStorageGroupList = null;
	/** The setStorageItemList field. */
	private List<ISetupSetStorageItem> setStorageItemList = null;
	/** The setUnitScoreList field. */
	private List<ISetupSetUnitScore> setUnitScoreList = null;
	/** The addUpkeepList field. */
	private List<ISetupAddUpkeep> addUpkeepList = null;
	/** The addUpkeepConditionList field. */
	private List<ISetupAddUpkeepCondition> addUpkeepConditionList = null;
	/** The addActionList field. */
	private List<ISetupAddAction> addActionList = null;
	/** The addActionTargetList field. */
	private List<ISetupAddActionTarget> addActionTargetList = null;
	/** The addActionConditionList field. */
	private List<ISetupAddActionCondition> addActionConditionList = null;

	/**
	 * The empty constructor.
	 */
	public SetupRoot() {
	}

	/**
	 * The fields constructor.
	 */
	public SetupRoot(List<ISetupAddFaction> addFactionList, List<ISetupAddParentGroup> addParentGroupList, List<ISetupAddChildGroup> addChildGroupList, List<ISetupAddUnit> addUnitList, List<ISetupSetStorageGroup> setStorageGroupList, List<ISetupSetStorageItem> setStorageItemList, List<ISetupSetUnitScore> setUnitScoreList, List<ISetupAddUpkeep> addUpkeepList, List<ISetupAddUpkeepCondition> addUpkeepConditionList, List<ISetupAddAction> addActionList, List<ISetupAddActionTarget> addActionTargetList, List<ISetupAddActionCondition> addActionConditionList) {
		setAddFactionList(addFactionList);
		setAddParentGroupList(addParentGroupList);
		setAddChildGroupList(addChildGroupList);
		setAddUnitList(addUnitList);
		setSetStorageGroupList(setStorageGroupList);
		setSetStorageItemList(setStorageItemList);
		setSetUnitScoreList(setUnitScoreList);
		setAddUpkeepList(addUpkeepList);
		setAddUpkeepConditionList(addUpkeepConditionList);
		setAddActionList(addActionList);
		setAddActionTargetList(addActionTargetList);
		setAddActionConditionList(addActionConditionList);
	}

	/**
	 * The clone constructor.
	 */
	public SetupRoot(ISetupRoot clone) {
		setAddFactionList(clone.getAddFactionList());
		setAddParentGroupList(clone.getAddParentGroupList());
		setAddChildGroupList(clone.getAddChildGroupList());
		setAddUnitList(clone.getAddUnitList());
		setSetStorageGroupList(clone.getSetStorageGroupList());
		setSetStorageItemList(clone.getSetStorageItemList());
		setSetUnitScoreList(clone.getSetUnitScoreList());
		setAddUpkeepList(clone.getAddUpkeepList());
		setAddUpkeepConditionList(clone.getAddUpkeepConditionList());
		setAddActionList(clone.getAddActionList());
		setAddActionTargetList(clone.getAddActionTargetList());
		setAddActionConditionList(clone.getAddActionConditionList());
	}

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	@Override
	public int getSerializationId() {
		return SERIALIZATION_ID;
	}

	/**
	 * Getter for the addFactionList field.
	 * @return the value of the addFactionList field.
	 */
	@Override
	public List<ISetupAddFaction> getAddFactionList() {
		return addFactionList;
	}

	/**
	 * Getter for the addParentGroupList field.
	 * @return the value of the addParentGroupList field.
	 */
	@Override
	public List<ISetupAddParentGroup> getAddParentGroupList() {
		return addParentGroupList;
	}

	/**
	 * Getter for the addChildGroupList field.
	 * @return the value of the addChildGroupList field.
	 */
	@Override
	public List<ISetupAddChildGroup> getAddChildGroupList() {
		return addChildGroupList;
	}

	/**
	 * Getter for the addUnitList field.
	 * @return the value of the addUnitList field.
	 */
	@Override
	public List<ISetupAddUnit> getAddUnitList() {
		return addUnitList;
	}

	/**
	 * Getter for the setStorageGroupList field.
	 * @return the value of the setStorageGroupList field.
	 */
	@Override
	public List<ISetupSetStorageGroup> getSetStorageGroupList() {
		return setStorageGroupList;
	}

	/**
	 * Getter for the setStorageItemList field.
	 * @return the value of the setStorageItemList field.
	 */
	@Override
	public List<ISetupSetStorageItem> getSetStorageItemList() {
		return setStorageItemList;
	}

	/**
	 * Getter for the setUnitScoreList field.
	 * @return the value of the setUnitScoreList field.
	 */
	@Override
	public List<ISetupSetUnitScore> getSetUnitScoreList() {
		return setUnitScoreList;
	}

	/**
	 * Getter for the addUpkeepList field.
	 * @return the value of the addUpkeepList field.
	 */
	@Override
	public List<ISetupAddUpkeep> getAddUpkeepList() {
		return addUpkeepList;
	}

	/**
	 * Getter for the addUpkeepConditionList field.
	 * @return the value of the addUpkeepConditionList field.
	 */
	@Override
	public List<ISetupAddUpkeepCondition> getAddUpkeepConditionList() {
		return addUpkeepConditionList;
	}

	/**
	 * Getter for the addActionList field.
	 * @return the value of the addActionList field.
	 */
	@Override
	public List<ISetupAddAction> getAddActionList() {
		return addActionList;
	}

	/**
	 * Getter for the addActionTargetList field.
	 * @return the value of the addActionTargetList field.
	 */
	@Override
	public List<ISetupAddActionTarget> getAddActionTargetList() {
		return addActionTargetList;
	}

	/**
	 * Getter for the addActionConditionList field.
	 * @return the value of the addActionConditionList field.
	 */
	@Override
	public List<ISetupAddActionCondition> getAddActionConditionList() {
		return addActionConditionList;
	}

	/**
	 * Setter for the addFactionList field.
	 * @param addFactionList the addFactionList value to set.
	 */
	@Override
	public void setAddFactionList(List<ISetupAddFaction> addFactionList) {
		this.addFactionList = addFactionList;
	}

	/**
	 * Setter for the addParentGroupList field.
	 * @param addParentGroupList the addParentGroupList value to set.
	 */
	@Override
	public void setAddParentGroupList(List<ISetupAddParentGroup> addParentGroupList) {
		this.addParentGroupList = addParentGroupList;
	}

	/**
	 * Setter for the addChildGroupList field.
	 * @param addChildGroupList the addChildGroupList value to set.
	 */
	@Override
	public void setAddChildGroupList(List<ISetupAddChildGroup> addChildGroupList) {
		this.addChildGroupList = addChildGroupList;
	}

	/**
	 * Setter for the addUnitList field.
	 * @param addUnitList the addUnitList value to set.
	 */
	@Override
	public void setAddUnitList(List<ISetupAddUnit> addUnitList) {
		this.addUnitList = addUnitList;
	}

	/**
	 * Setter for the setStorageGroupList field.
	 * @param setStorageGroupList the setStorageGroupList value to set.
	 */
	@Override
	public void setSetStorageGroupList(List<ISetupSetStorageGroup> setStorageGroupList) {
		this.setStorageGroupList = setStorageGroupList;
	}

	/**
	 * Setter for the setStorageItemList field.
	 * @param setStorageItemList the setStorageItemList value to set.
	 */
	@Override
	public void setSetStorageItemList(List<ISetupSetStorageItem> setStorageItemList) {
		this.setStorageItemList = setStorageItemList;
	}

	/**
	 * Setter for the setUnitScoreList field.
	 * @param setUnitScoreList the setUnitScoreList value to set.
	 */
	@Override
	public void setSetUnitScoreList(List<ISetupSetUnitScore> setUnitScoreList) {
		this.setUnitScoreList = setUnitScoreList;
	}

	/**
	 * Setter for the addUpkeepList field.
	 * @param addUpkeepList the addUpkeepList value to set.
	 */
	@Override
	public void setAddUpkeepList(List<ISetupAddUpkeep> addUpkeepList) {
		this.addUpkeepList = addUpkeepList;
	}

	/**
	 * Setter for the addUpkeepConditionList field.
	 * @param addUpkeepConditionList the addUpkeepConditionList value to set.
	 */
	@Override
	public void setAddUpkeepConditionList(List<ISetupAddUpkeepCondition> addUpkeepConditionList) {
		this.addUpkeepConditionList = addUpkeepConditionList;
	}

	/**
	 * Setter for the addActionList field.
	 * @param addActionList the addActionList value to set.
	 */
	@Override
	public void setAddActionList(List<ISetupAddAction> addActionList) {
		this.addActionList = addActionList;
	}

	/**
	 * Setter for the addActionTargetList field.
	 * @param addActionTargetList the addActionTargetList value to set.
	 */
	@Override
	public void setAddActionTargetList(List<ISetupAddActionTarget> addActionTargetList) {
		this.addActionTargetList = addActionTargetList;
	}

	/**
	 * Setter for the addActionConditionList field.
	 * @param addActionConditionList the addActionConditionList value to set.
	 */
	@Override
	public void setAddActionConditionList(List<ISetupAddActionCondition> addActionConditionList) {
		this.addActionConditionList = addActionConditionList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getAddFactionList());
		builder.append(getAddParentGroupList());
		builder.append(getAddChildGroupList());
		builder.append(getAddUnitList());
		builder.append(getSetStorageGroupList());
		builder.append(getSetStorageItemList());
		builder.append(getSetUnitScoreList());
		builder.append(getAddUpkeepList());
		builder.append(getAddUpkeepConditionList());
		builder.append(getAddActionList());
		builder.append(getAddActionTargetList());
		builder.append(getAddActionConditionList());
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object object) {
		// Identity check
		if (object == this) {
			return true;
		}

		// Null check
		if (object == null) {
			return false;
		}

		// Compare types
		if (!this.getClass().equals(object.getClass())) {
			return false;
		}

		// Compare fields
		ISetupRoot that = (ISetupRoot) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getAddFactionList(), that.getAddFactionList());
		builder.append(this.getAddParentGroupList(), that.getAddParentGroupList());
		builder.append(this.getAddChildGroupList(), that.getAddChildGroupList());
		builder.append(this.getAddUnitList(), that.getAddUnitList());
		builder.append(this.getSetStorageGroupList(), that.getSetStorageGroupList());
		builder.append(this.getSetStorageItemList(), that.getSetStorageItemList());
		builder.append(this.getSetUnitScoreList(), that.getSetUnitScoreList());
		builder.append(this.getAddUpkeepList(), that.getAddUpkeepList());
		builder.append(this.getAddUpkeepConditionList(), that.getAddUpkeepConditionList());
		builder.append(this.getAddActionList(), that.getAddActionList());
		builder.append(this.getAddActionTargetList(), that.getAddActionTargetList());
		builder.append(this.getAddActionConditionList(), that.getAddActionConditionList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getAddFactionList());
		builder.append(getAddParentGroupList());
		builder.append(getAddChildGroupList());
		builder.append(getAddUnitList());
		builder.append(getSetStorageGroupList());
		builder.append(getSetStorageItemList());
		builder.append(getSetUnitScoreList());
		builder.append(getAddUpkeepList());
		builder.append(getAddUpkeepConditionList());
		builder.append(getAddActionList());
		builder.append(getAddActionTargetList());
		builder.append(getAddActionConditionList());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetupRoot that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getAddFactionList(), that.getAddFactionList());
		builder.append(this.getAddParentGroupList(), that.getAddParentGroupList());
		builder.append(this.getAddChildGroupList(), that.getAddChildGroupList());
		builder.append(this.getAddUnitList(), that.getAddUnitList());
		builder.append(this.getSetStorageGroupList(), that.getSetStorageGroupList());
		builder.append(this.getSetStorageItemList(), that.getSetStorageItemList());
		builder.append(this.getSetUnitScoreList(), that.getSetUnitScoreList());
		builder.append(this.getAddUpkeepList(), that.getAddUpkeepList());
		builder.append(this.getAddUpkeepConditionList(), that.getAddUpkeepConditionList());
		builder.append(this.getAddActionList(), that.getAddActionList());
		builder.append(this.getAddActionTargetList(), that.getAddActionTargetList());
		builder.append(this.getAddActionConditionList(), that.getAddActionConditionList());
		return builder.toComparison();
	}
}
