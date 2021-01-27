package com.turnengine.client.api.service;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;
import static com.robindrew.common.dependency.DependencyFactory.setDependency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robindrew.codegenerator.api.executable.executor.BeanExecutors;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorService;
import com.robindrew.common.net.IHostPort;
import com.robindrew.common.properties.map.type.StringProperty;
import com.robindrew.common.service.component.AbstractIdleComponent;
import com.robindrew.common.text.parser.HostPortParser;
import com.turnengine.client.api.common.ClientDependencies;
import com.turnengine.client.api.executable.executor.client.ClientBinaryBeanExecutorService;
import com.turnengine.client.api.executable.executor.client.HttpClientBinaryExecutorSupplier;
import com.turnengine.client.api.executable.executor.client.IHttpClientBinaryExecutorSupplier;
import com.turnengine.client.api.executable.executor.type.IContentTypeSerializer;
import com.turnengine.client.api.executable.executor.type.XmlContentTypeSerializer;
import com.turnengine.client.api.global.GlobalBeanExecutorSetLookup;
import com.turnengine.client.api.global.IGlobalBeanExecutorSetLookup;
import com.turnengine.client.api.global.game.IGameDefinition;
import com.turnengine.client.api.global.game.IGlobalGameExecutorSet;
import com.turnengine.client.api.local.ILocalBeanExecutorSetLookup;
import com.turnengine.client.api.local.LocalBeanExecutorSetLookup;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.staticcache.StaticCacheSetBuilder;

public class ClientExecutorComponent extends AbstractIdleComponent {

	private static final Logger log = LoggerFactory.getLogger(ClientExecutorComponent.class);

	private static final StringProperty gameServeHost = new StringProperty("game.server.host");

	@Override
	protected void startupComponent() throws Exception {

		// Setup communication with the game server
		IHostPort serverHost = new HostPortParser().parse(gameServeHost.get());
		IHttpClientBinaryExecutorSupplier connections = new HttpClientBinaryExecutorSupplier(serverHost);
		IContentTypeSerializer serializer = new XmlContentTypeSerializer();
		IBeanExecutorService executorService = new ClientBinaryBeanExecutorService(connections, serializer);
		IBeanExecutorLocator locator = BeanExecutors.toBeanLocator(executorService);

		setDependency(IBeanExecutorService.class, executorService);
		setDependency(IHttpClientBinaryExecutorSupplier.class, connections);
		setDependency(IBeanExecutorLocator.class, locator);

		// Register bean executors
		ClientDependencies dependencies = new ClientDependencies();
		ILocalBeanExecutorSetLookup localLookup = new LocalBeanExecutorSetLookup(locator);
		IGlobalBeanExecutorSetLookup globalLookup = new GlobalBeanExecutorSetLookup(locator);
		dependencies.setLocalLookupDependencies(localLookup);
		dependencies.setGlobalLookupDependencies(globalLookup);

		// Lookup the game definition
		IGameDefinition definition = getDependency(IGlobalGameExecutorSet.class).getGameDefinitionByHostPort(serverHost.getHost(), serverHost.getPort());
		setDependency(IGameDefinition.class, definition);

		// Lookup the static cache set
		StaticCacheSetBuilder builder = new StaticCacheSetBuilder(0, definition.getInstance().getId(), localLookup);
		IStaticCacheSet cacheSet = builder.get();
		setDependency(IStaticCacheSet.class, cacheSet);

		log.info("Game: {}", definition.getGame().getName());
		log.info("Version: {}", definition.getVersion().getName());
		log.info("Instance: {}", definition.getInstance().getName());
	}

	@Override
	protected void shutdownComponent() throws Exception {
	}

}
