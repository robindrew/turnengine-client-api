package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.global.user.UserPermissionType;
import java.util.List;

public interface IAllianceForumUser extends IBean, Comparable<IAllianceForumUser> {

	int SERIALIZATION_ID = 5213;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	int getId();

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the reputation field.
	 * @return the value of the reputation field.
	 */
	int getReputation();

	/**
	 * Getter for the permissionList field.
	 * @return the value of the permissionList field.
	 */
	List<UserPermissionType> getPermissionList();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the reputation field.
	 * @param reputation the reputation value to set.
	 */
	void setReputation(int reputation);

	/**
	 * Setter for the permissionList field.
	 * @param permissionList the permissionList value to set.
	 */
	void setPermissionList(List<UserPermissionType> permissionList);
}
