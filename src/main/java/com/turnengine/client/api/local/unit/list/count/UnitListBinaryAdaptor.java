package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;

public class UnitListBinaryAdaptor implements IUnitListSerializer {

	private final IUnitCountListSerializer serializer;
	private final IUnitListAdaptor adaptor;

	public UnitListBinaryAdaptor(IUnitCache unitCache) {
		this(new UnitListAdaptor(unitCache));
	}

	public UnitListBinaryAdaptor(IUnitListAdaptor adaptor) {
		this.serializer = new UnitCountListSerializer();
		this.adaptor = adaptor;
	}

	public UnitListBinaryAdaptor(IUnitCountListSerializer serializer, IUnitListAdaptor adaptor) {
		this.serializer = serializer;
		this.adaptor = adaptor;
	}

	@Override
	public IUnitList deserialize(byte[] data, UnitType type) {
		List<IUnitCount> countList = serializer.deserialize(data);
		return adaptor.adapt(countList, type);
	}

	@Override
	public byte[] serialize(IUnitList list) {
		List<IUnitCount> countList = adaptor.adapt(list);
		return serializer.serialize(countList);
	}

}
