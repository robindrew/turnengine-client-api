package com.turnengine.client.api.local.action;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AddActionPlugin implements IAddActionPlugin {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The name field. */
	private String name = null;
	/** The pluginName field. */
	private String pluginName = null;
	/** The plugin field. */
	private String plugin = null;

	/**
	 * The empty constructor.
	 */
	public AddActionPlugin() {
	}

	/**
	 * The fields constructor.
	 */
	public AddActionPlugin(long loginId, int instanceId, String name, String pluginName, String plugin) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setName(name);
		setPluginName(pluginName);
		setPlugin(plugin);
	}

	/**
	 * The clone constructor.
	 */
	public AddActionPlugin(IAddActionPlugin clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setName(clone.getName());
		setPluginName(clone.getPluginName());
		setPlugin(clone.getPlugin());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
	}

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the pluginName field.
	 * @return the value of the pluginName field.
	 */
	@Override
	public String getPluginName() {
		return pluginName;
	}

	/**
	 * Getter for the plugin field.
	 * @return the value of the plugin field.
	 */
	@Override
	public String getPlugin() {
		return plugin;
	}

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	@Override
	public void setInstanceId(int instanceId) {
		if (instanceId < -1) {
			throw new IllegalArgumentException("instanceId too small, minimum of -1, value: '" + instanceId + "'");
		}
		this.instanceId = instanceId;
	}

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		if (name.length() < 1) {
			throw new IllegalArgumentException("name too short, minimum of 1 characters, value: '" + name + "'");
		}
		if (name.length() > 200) {
			throw new IllegalArgumentException("name too long, maximum of 200 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the pluginName field.
	 * @param pluginName the pluginName value to set.
	 */
	@Override
	public void setPluginName(String pluginName) {
		if (pluginName == null) {
			throw new NullPointerException("pluginName");
		}
		this.pluginName = pluginName;
	}

	/**
	 * Setter for the plugin field.
	 * @param plugin the plugin value to set.
	 */
	@Override
	public void setPlugin(String plugin) {
		if (plugin == null) {
			throw new NullPointerException("plugin");
		}
		this.plugin = plugin;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getName());
		builder.append(getPluginName());
		builder.append(getPlugin());
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
		IAddActionPlugin that = (IAddActionPlugin) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPluginName(), that.getPluginName());
		builder.append(this.getPlugin(), that.getPlugin());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getName());
		builder.append(getPluginName());
		builder.append(getPlugin());
		return builder.toString();
	}

	@Override
	public int compareTo(IAddActionPlugin that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPluginName(), that.getPluginName());
		builder.append(this.getPlugin(), that.getPlugin());
		return builder.toComparison();
	}
}
