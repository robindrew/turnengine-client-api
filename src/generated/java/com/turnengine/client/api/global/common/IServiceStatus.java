package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IServiceStatus extends IBean, Comparable<IServiceStatus> {

	int SERIALIZATION_ID = 1213;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the service field.
	 * @return the value of the service field.
	 */
	String getService();

	/**
	 * Getter for the release field.
	 * @return the value of the release field.
	 */
	String getRelease();

	/**
	 * Getter for the memory field.
	 * @return the value of the memory field.
	 */
	long getMemory();

	/**
	 * Getter for the heap field.
	 * @return the value of the heap field.
	 */
	double getHeap();

	/**
	 * Getter for the perm field.
	 * @return the value of the perm field.
	 */
	double getPerm();

	/**
	 * Getter for the cpu field.
	 * @return the value of the cpu field.
	 */
	double getCpu();

	/**
	 * Getter for the cpuCount field.
	 * @return the value of the cpuCount field.
	 */
	int getCpuCount();

	/**
	 * Getter for the threads field.
	 * @return the value of the threads field.
	 */
	int getThreads();

	/**
	 * Getter for the classes field.
	 * @return the value of the classes field.
	 */
	int getClasses();

	/**
	 * Getter for the exceptions field.
	 * @return the value of the exceptions field.
	 */
	long getExceptions();

	/**
	 * Getter for the started field.
	 * @return the value of the started field.
	 */
	long getStarted();

	/**
	 * Getter for the uptime field.
	 * @return the value of the uptime field.
	 */
	long getUptime();

	/**
	 * Getter for the user field.
	 * @return the value of the user field.
	 */
	String getUser();

	/**
	 * Getter for the host field.
	 * @return the value of the host field.
	 */
	String getHost();

	/**
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	String getAddress();

	/**
	 * Getter for the process field.
	 * @return the value of the process field.
	 */
	long getProcess();

	/**
	 * Setter for the service field.
	 * @param service the service value to set.
	 */
	void setService(String service);

	/**
	 * Setter for the release field.
	 * @param release the release value to set.
	 */
	void setRelease(String release);

	/**
	 * Setter for the memory field.
	 * @param memory the memory value to set.
	 */
	void setMemory(long memory);

	/**
	 * Setter for the heap field.
	 * @param heap the heap value to set.
	 */
	void setHeap(double heap);

	/**
	 * Setter for the perm field.
	 * @param perm the perm value to set.
	 */
	void setPerm(double perm);

	/**
	 * Setter for the cpu field.
	 * @param cpu the cpu value to set.
	 */
	void setCpu(double cpu);

	/**
	 * Setter for the cpuCount field.
	 * @param cpuCount the cpuCount value to set.
	 */
	void setCpuCount(int cpuCount);

	/**
	 * Setter for the threads field.
	 * @param threads the threads value to set.
	 */
	void setThreads(int threads);

	/**
	 * Setter for the classes field.
	 * @param classes the classes value to set.
	 */
	void setClasses(int classes);

	/**
	 * Setter for the exceptions field.
	 * @param exceptions the exceptions value to set.
	 */
	void setExceptions(long exceptions);

	/**
	 * Setter for the started field.
	 * @param started the started value to set.
	 */
	void setStarted(long started);

	/**
	 * Setter for the uptime field.
	 * @param uptime the uptime value to set.
	 */
	void setUptime(long uptime);

	/**
	 * Setter for the user field.
	 * @param user the user value to set.
	 */
	void setUser(String user);

	/**
	 * Setter for the host field.
	 * @param host the host value to set.
	 */
	void setHost(String host);

	/**
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	void setAddress(String address);

	/**
	 * Setter for the process field.
	 * @param process the process value to set.
	 */
	void setProcess(long process);
}
