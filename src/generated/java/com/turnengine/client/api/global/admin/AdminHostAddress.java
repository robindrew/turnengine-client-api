package com.turnengine.client.api.global.admin;

import com.robindrew.common.locale.Country;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AdminHostAddress implements IAdminHostAddress {

	/** The code field. */
	private String code = null;
	/** The address field. */
	private String address = null;
	/** The host field. */
	private String host = null;
	/** The country field. */
	private Country country = null;
	/** The region field. */
	private String region = null;
	/** The city field. */
	private String city = null;
	/** The latitude field. */
	private double latitude = 0.0;
	/** The longitude field. */
	private double longitude = 0.0;

	/**
	 * The empty constructor.
	 */
	public AdminHostAddress() {
	}

	/**
	 * The fields constructor.
	 */
	public AdminHostAddress(String code, String address, String host, Country country, String region, String city, double latitude, double longitude) {
		setCode(code);
		setAddress(address);
		setHost(host);
		setCountry(country);
		setRegion(region);
		setCity(city);
		setLatitude(latitude);
		setLongitude(longitude);
	}

	/**
	 * The clone constructor.
	 */
	public AdminHostAddress(IAdminHostAddress clone) {
		setCode(clone.getCode());
		setAddress(clone.getAddress());
		setHost(clone.getHost());
		setCountry(clone.getCountry());
		setRegion(clone.getRegion());
		setCity(clone.getCity());
		setLatitude(clone.getLatitude());
		setLongitude(clone.getLongitude());
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
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * Getter for the host field.
	 * @return the value of the host field.
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * Getter for the country field.
	 * @return the value of the country field.
	 */
	@Override
	public Country getCountry() {
		return country;
	}

	/**
	 * Getter for the region field.
	 * @return the value of the region field.
	 */
	@Override
	public String getRegion() {
		return region;
	}

	/**
	 * Getter for the city field.
	 * @return the value of the city field.
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * Getter for the latitude field.
	 * @return the value of the latitude field.
	 */
	@Override
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Getter for the longitude field.
	 * @return the value of the longitude field.
	 */
	@Override
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	@Override
	public void setCode(String code) {
		if (code == null) {
			throw new NullPointerException("code");
		}
		this.code = code;
	}

	/**
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Setter for the host field.
	 * @param host the host value to set.
	 */
	@Override
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * Setter for the country field.
	 * @param country the country value to set.
	 */
	@Override
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * Setter for the region field.
	 * @param region the region value to set.
	 */
	@Override
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * Setter for the city field.
	 * @param city the city value to set.
	 */
	@Override
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Setter for the latitude field.
	 * @param latitude the latitude value to set.
	 */
	@Override
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Setter for the longitude field.
	 * @param longitude the longitude value to set.
	 */
	@Override
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getCode());
		builder.append(getAddress());
		builder.append(getHost());
		builder.append(getCountry());
		builder.append(getRegion());
		builder.append(getCity());
		builder.append(getLatitude());
		builder.append(getLongitude());
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
		IAdminHostAddress that = (IAdminHostAddress) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getCode(), that.getCode());
		builder.append(this.getAddress(), that.getAddress());
		builder.append(this.getHost(), that.getHost());
		builder.append(this.getCountry(), that.getCountry());
		builder.append(this.getRegion(), that.getRegion());
		builder.append(this.getCity(), that.getCity());
		builder.append(this.getLatitude(), that.getLatitude());
		builder.append(this.getLongitude(), that.getLongitude());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getCode());
		builder.append(getAddress());
		builder.append(getHost());
		builder.append(getCountry());
		builder.append(getRegion());
		builder.append(getCity());
		builder.append(getLatitude());
		builder.append(getLongitude());
		return builder.toString();
	}

	@Override
	public int compareTo(IAdminHostAddress that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getCode(), that.getCode());
		builder.append(this.getAddress(), that.getAddress());
		builder.append(this.getHost(), that.getHost());
		builder.append(this.getCountry(), that.getCountry());
		builder.append(this.getRegion(), that.getRegion());
		builder.append(this.getCity(), that.getCity());
		builder.append(this.getLatitude(), that.getLatitude());
		builder.append(this.getLongitude(), that.getLongitude());
		return builder.toComparison();
	}
}
