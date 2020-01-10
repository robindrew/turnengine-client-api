package com.turnengine.client.api.global.common;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OpenIdForm implements IOpenIdForm {

	/** The uri field. */
	private String uri = null;
	/** The parameterList field. */
	private List<IOpenIdParameter> parameterList = null;

	/**
	 * The empty constructor.
	 */
	public OpenIdForm() {
	}

	/**
	 * The fields constructor.
	 */
	public OpenIdForm(String uri, List<IOpenIdParameter> parameterList) {
		setUri(uri);
		setParameterList(parameterList);
	}

	/**
	 * The clone constructor.
	 */
	public OpenIdForm(IOpenIdForm clone) {
		setUri(clone.getUri());
		setParameterList(clone.getParameterList());
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
	 * Getter for the uri field.
	 * @return the value of the uri field.
	 */
	@Override
	public String getUri() {
		return uri;
	}

	/**
	 * Getter for the parameterList field.
	 * @return the value of the parameterList field.
	 */
	@Override
	public List<IOpenIdParameter> getParameterList() {
		return parameterList;
	}

	/**
	 * Setter for the uri field.
	 * @param uri the uri value to set.
	 */
	@Override
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Setter for the parameterList field.
	 * @param parameterList the parameterList value to set.
	 */
	@Override
	public void setParameterList(List<IOpenIdParameter> parameterList) {
		this.parameterList = parameterList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getUri());
		builder.append(getParameterList());
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
		IOpenIdForm that = (IOpenIdForm) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getUri(), that.getUri());
		builder.append(this.getParameterList(), that.getParameterList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getUri());
		builder.append(getParameterList());
		return builder.toString();
	}

	@Override
	public int compareTo(IOpenIdForm that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getUri(), that.getUri());
		builder.append(this.getParameterList(), that.getParameterList());
		return builder.toComparison();
	}
}
