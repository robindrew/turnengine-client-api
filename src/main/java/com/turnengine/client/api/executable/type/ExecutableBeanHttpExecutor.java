package com.turnengine.client.api.executable.type;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutor;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.robindrew.codegenerator.api.factory.IObjectFactory;
import com.robindrew.common.http.servlet.request.IHttpRequest;
import com.robindrew.common.util.Check;

public class ExecutableBeanHttpExecutor {

	private static final Logger log = LoggerFactory.getLogger(ExecutableBeanHttpExecutor.class);

	private final IObjectFactory<IExecutableBean<?>> factory;
	private final IBeanExecutorLocator locator;

	public ExecutableBeanHttpExecutor(IObjectFactory<IExecutableBean<?>> factory, IBeanExecutorLocator locator) {
		this.factory = Check.notNull("factory", factory);
		this.locator = Check.notNull("locator", locator);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ExecutableBeanClass<?> getBeanClass(String name) {
		for (Class type : factory.getTypes()) {
			ExecutableBeanClass<?> beanType = new ExecutableBeanClass(type);
			if (name.equals(beanType.getName())) {
				return beanType;
			}
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object executeBean(ExecutableBeanClass<?> type, IHttpRequest request) {
		log.info("[Execute Bean] {}", type.getName());

		List<ExecutableBeanField> fields = type.getFieldList();
		Object[] parameterValues = new Object[fields.size()];
		for (int i = 0; i < fields.size(); i++) {
			ExecutableBeanField field = fields.get(i);
			String requestValue = request.getString(field.getName());
			Object fieldValue = field.parseValue(requestValue);
			log.info("[Field] '{}' ({}) = '{}'", field.getName(), field.getType(), fieldValue);
			parameterValues[i] = fieldValue;
		}

		// Find the constructor
		IExecutableBean<?> bean = type.newInstance(parameterValues);

		// Execute the bean
		log.info("[Execute] {}", bean);
		IBeanExecutor executor = locator.locateExecutor(bean);
		return executor.executeBean(bean);
	}

}
