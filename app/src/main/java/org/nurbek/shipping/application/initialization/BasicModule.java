package org.nurbek.shipping.application.initialization;

import org.nurbek.shipping.domain.repositories.ContainerRepository;
import org.nurbek.shipping.domain.repositories.ItemRepository;
import org.nurbek.shipping.domain.repositories.SizeRepository;
import org.nurbek.shipping.domain.repositories.impl.ContainerRepositoryInMemoryImpl;
import org.nurbek.shipping.domain.repositories.impl.ItemRepositoryInMemoryImpl;
import org.nurbek.shipping.domain.repositories.impl.SizeRepositoryInMemoryImpl;
import org.nurbek.shipping.infrastructure.managers.ShippingManager;
import org.nurbek.shipping.infrastructure.managers.impl.ShippingManagerImpl;

import org.nurbek.inject.AbstractModule;

public class BasicModule extends AbstractModule {
    @Override
    public void configure() {
        bind(SizeRepository.class, SizeRepositoryInMemoryImpl.class);
        bind(ContainerRepository.class, ContainerRepositoryInMemoryImpl.class);
        bind(ItemRepository.class, ItemRepositoryInMemoryImpl.class);
        bind(ShippingManager.class, ShippingManagerImpl.class);
    }
}
