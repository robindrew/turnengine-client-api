package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ServiceStatus implements IServiceStatus {

	/** The service field. */
	private String service = null;
	/** The release field. */
	private String release = null;
	/** The memory field. */
	private long memory = 0l;
	/** The heap field. */
	private double heap = 0.0;
	/** The perm field. */
	private double perm = 0.0;
	/** The cpu field. */
	private double cpu = 0.0;
	/** The cpuCount field. */
	private int cpuCount = 0;
	/** The threads field. */
	private int threads = 0;
	/** The classes field. */
	private int classes = 0;
	/** The exceptions field. */
	private long exceptions = 0l;
	/** The started field. */
	private long started = 0l;
	/** The uptime field. */
	private long uptime = 0l;
	/** The user field. */
	private String user = null;
	/** The host field. */
	private String host = null;
	/** The address field. */
	private String address = null;
	/** The process field. */
	private long process = 0l;

	/**
	 * The empty constructor.
	 */
	public ServiceStatus() {
	}

	/**
	 * The fields constructor.
	 */
	public ServiceStatus(String service, String release, long memory, double heap, double perm, double cpu, int cpuCount, int threads, int classes, long exceptions, long started, long uptime, String user, String host, String address, long process) {
		setService(service);
		setRelease(release);
		setMemory(memory);
		setHeap(heap);
		setPerm(perm);
		setCpu(cpu);
		setCpuCount(cpuCount);
		setThreads(threads);
		setClasses(classes);
		setExceptions(exceptions);
		setStarted(started);
		setUptime(uptime);
		setUser(user);
		setHost(host);
		setAddress(address);
		setProcess(process);
	}

	/**
	 * The clone constructor.
	 */
	public ServiceStatus(IServiceStatus clone) {
		setService(clone.getService());
		setRelease(clone.getRelease());
		setMemory(clone.getMemory());
		setHeap(clone.getHeap());
		setPerm(clone.getPerm());
		setCpu(clone.getCpu());
		setCpuCount(clone.getCpuCount());
		setThreads(clone.getThreads());
		setClasses(clone.getClasses());
		setExceptions(clone.getExceptions());
		setStarted(clone.getStarted());
		setUptime(clone.getUptime());
		setUser(clone.getUser());
		setHost(clone.getHost());
		setAddress(clone.getAddress());
		setProcess(clone.getProcess());
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
	 * Getter for the service field.
	 * @return the value of the service field.
	 */
	@Override
	public String getService() {
		return service;
	}

	/**
	 * Getter for the release field.
	 * @return the value of the release field.
	 */
	@Override
	public String getRelease() {
		return release;
	}

	/**
	 * Getter for the memory field.
	 * @return the value of the memory field.
	 */
	@Override
	public long getMemory() {
		return memory;
	}

	/**
	 * Getter for the heap field.
	 * @return the value of the heap field.
	 */
	@Override
	public double getHeap() {
		return heap;
	}

	/**
	 * Getter for the perm field.
	 * @return the value of the perm field.
	 */
	@Override
	public double getPerm() {
		return perm;
	}

	/**
	 * Getter for the cpu field.
	 * @return the value of the cpu field.
	 */
	@Override
	public double getCpu() {
		return cpu;
	}

	/**
	 * Getter for the cpuCount field.
	 * @return the value of the cpuCount field.
	 */
	@Override
	public int getCpuCount() {
		return cpuCount;
	}

	/**
	 * Getter for the threads field.
	 * @return the value of the threads field.
	 */
	@Override
	public int getThreads() {
		return threads;
	}

	/**
	 * Getter for the classes field.
	 * @return the value of the classes field.
	 */
	@Override
	public int getClasses() {
		return classes;
	}

	/**
	 * Getter for the exceptions field.
	 * @return the value of the exceptions field.
	 */
	@Override
	public long getExceptions() {
		return exceptions;
	}

	/**
	 * Getter for the started field.
	 * @return the value of the started field.
	 */
	@Override
	public long getStarted() {
		return started;
	}

	/**
	 * Getter for the uptime field.
	 * @return the value of the uptime field.
	 */
	@Override
	public long getUptime() {
		return uptime;
	}

	/**
	 * Getter for the user field.
	 * @return the value of the user field.
	 */
	@Override
	public String getUser() {
		return user;
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
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * Getter for the process field.
	 * @return the value of the process field.
	 */
	@Override
	public long getProcess() {
		return process;
	}

	/**
	 * Setter for the service field.
	 * @param service the service value to set.
	 */
	@Override
	public void setService(String service) {
		this.service = service;
	}

	/**
	 * Setter for the release field.
	 * @param release the release value to set.
	 */
	@Override
	public void setRelease(String release) {
		this.release = release;
	}

	/**
	 * Setter for the memory field.
	 * @param memory the memory value to set.
	 */
	@Override
	public void setMemory(long memory) {
		this.memory = memory;
	}

	/**
	 * Setter for the heap field.
	 * @param heap the heap value to set.
	 */
	@Override
	public void setHeap(double heap) {
		this.heap = heap;
	}

	/**
	 * Setter for the perm field.
	 * @param perm the perm value to set.
	 */
	@Override
	public void setPerm(double perm) {
		this.perm = perm;
	}

	/**
	 * Setter for the cpu field.
	 * @param cpu the cpu value to set.
	 */
	@Override
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	/**
	 * Setter for the cpuCount field.
	 * @param cpuCount the cpuCount value to set.
	 */
	@Override
	public void setCpuCount(int cpuCount) {
		this.cpuCount = cpuCount;
	}

	/**
	 * Setter for the threads field.
	 * @param threads the threads value to set.
	 */
	@Override
	public void setThreads(int threads) {
		this.threads = threads;
	}

	/**
	 * Setter for the classes field.
	 * @param classes the classes value to set.
	 */
	@Override
	public void setClasses(int classes) {
		this.classes = classes;
	}

	/**
	 * Setter for the exceptions field.
	 * @param exceptions the exceptions value to set.
	 */
	@Override
	public void setExceptions(long exceptions) {
		this.exceptions = exceptions;
	}

	/**
	 * Setter for the started field.
	 * @param started the started value to set.
	 */
	@Override
	public void setStarted(long started) {
		this.started = started;
	}

	/**
	 * Setter for the uptime field.
	 * @param uptime the uptime value to set.
	 */
	@Override
	public void setUptime(long uptime) {
		this.uptime = uptime;
	}

	/**
	 * Setter for the user field.
	 * @param user the user value to set.
	 */
	@Override
	public void setUser(String user) {
		this.user = user;
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
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Setter for the process field.
	 * @param process the process value to set.
	 */
	@Override
	public void setProcess(long process) {
		this.process = process;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getService());
		builder.append(getRelease());
		builder.append(getMemory());
		builder.append(getHeap());
		builder.append(getPerm());
		builder.append(getCpu());
		builder.append(getCpuCount());
		builder.append(getThreads());
		builder.append(getClasses());
		builder.append(getExceptions());
		builder.append(getStarted());
		builder.append(getUptime());
		builder.append(getUser());
		builder.append(getHost());
		builder.append(getAddress());
		builder.append(getProcess());
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
		IServiceStatus that = (IServiceStatus) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getService(), that.getService());
		builder.append(this.getRelease(), that.getRelease());
		builder.append(this.getMemory(), that.getMemory());
		builder.append(this.getHeap(), that.getHeap());
		builder.append(this.getPerm(), that.getPerm());
		builder.append(this.getCpu(), that.getCpu());
		builder.append(this.getCpuCount(), that.getCpuCount());
		builder.append(this.getThreads(), that.getThreads());
		builder.append(this.getClasses(), that.getClasses());
		builder.append(this.getExceptions(), that.getExceptions());
		builder.append(this.getStarted(), that.getStarted());
		builder.append(this.getUptime(), that.getUptime());
		builder.append(this.getUser(), that.getUser());
		builder.append(this.getHost(), that.getHost());
		builder.append(this.getAddress(), that.getAddress());
		builder.append(this.getProcess(), that.getProcess());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getService());
		builder.append(getRelease());
		builder.append(getMemory());
		builder.append(getHeap());
		builder.append(getPerm());
		builder.append(getCpu());
		builder.append(getCpuCount());
		builder.append(getThreads());
		builder.append(getClasses());
		builder.append(getExceptions());
		builder.append(getStarted());
		builder.append(getUptime());
		builder.append(getUser());
		builder.append(getHost());
		builder.append(getAddress());
		builder.append(getProcess());
		return builder.toString();
	}

	@Override
	public int compareTo(IServiceStatus that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getService(), that.getService());
		builder.append(this.getRelease(), that.getRelease());
		builder.append(this.getMemory(), that.getMemory());
		builder.append(this.getHeap(), that.getHeap());
		builder.append(this.getPerm(), that.getPerm());
		builder.append(this.getCpu(), that.getCpu());
		builder.append(this.getCpuCount(), that.getCpuCount());
		builder.append(this.getThreads(), that.getThreads());
		builder.append(this.getClasses(), that.getClasses());
		builder.append(this.getExceptions(), that.getExceptions());
		builder.append(this.getStarted(), that.getStarted());
		builder.append(this.getUptime(), that.getUptime());
		builder.append(this.getUser(), that.getUser());
		builder.append(this.getHost(), that.getHost());
		builder.append(this.getAddress(), that.getAddress());
		builder.append(this.getProcess(), that.getProcess());
		return builder.toComparison();
	}
}
