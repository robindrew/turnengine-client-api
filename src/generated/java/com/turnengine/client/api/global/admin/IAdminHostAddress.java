package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.common.locale.Country;

public interface IAdminHostAddress extends IBean, Comparable<IAdminHostAddress> {

	int SERIALIZATION_ID = 1001;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	String getCode();

	/**
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	String getAddress();

	/**
	 * Getter for the host field.
	 * @return the value of the host field.
	 */
	String getHost();

	/**
	 * Getter for the country field.
	 * @return the value of the country field.
	 */
	Country getCountry();

	/**
	 * Getter for the region field.
	 * @return the value of the region field.
	 */
	String getRegion();

	/**
	 * Getter for the city field.
	 * @return the value of the city field.
	 */
	String getCity();

	/**
	 * Getter for the latitude field.
	 * @return the value of the latitude field.
	 */
	double getLatitude();

	/**
	 * Getter for the longitude field.
	 * @return the value of the longitude field.
	 */
	double getLongitude();

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	void setCode(String code);

	/**
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	void setAddress(String address);

	/**
	 * Setter for the host field.
	 * @param host the host value to set.
	 */
	void setHost(String host);

	/**
	 * Setter for the country field.
	 * @param country the country value to set.
	 */
	void setCountry(Country country);

	/**
	 * Setter for the region field.
	 * @param region the region value to set.
	 */
	void setRegion(String region);

	/**
	 * Setter for the city field.
	 * @param city the city value to set.
	 */
	void setCity(String city);

	/**
	 * Setter for the latitude field.
	 * @param latitude the latitude value to set.
	 */
	void setLatitude(double latitude);

	/**
	 * Setter for the longitude field.
	 * @param longitude the longitude value to set.
	 */
	void setLongitude(double longitude);
}
