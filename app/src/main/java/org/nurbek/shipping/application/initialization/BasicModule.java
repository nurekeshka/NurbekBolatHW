package org.nurbek.shipping.application.initialization;

import org.nurbek.shipping.domain.repositories.ContainerRepository;
import org.nurbek.shipping.domain.repositories.ItemRepository;
import org.nurbek.shipping.domain.repositories.SizeRepository;
import org.nurbek.shipping.domain.repositories.impl.ContainerRepositoryInMemoryImpl;
import org.nurbek.shipping.domain.repositories.impl.ItemRepositoryInMemoryImpl;
import org.nurbek.shipping.domain.repositories.impl.SizeRepositoryInMemoryImpl;
import org.nurbek.shipping.infrastructure.managers.ShippingManager;
import org.nurbek.shipping.infrastructure.managers.impl.ShippingManagerImpl;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SizeRepository.class).to(SizeRepositoryInMemoryImpl.class);
        bind(ContainerRepository.class).to(ContainerRepositoryInMemoryImpl.class);
        bind(ItemRepository.class).to(ItemRepositoryInMemoryImpl.class);
        bind(ShippingManager.class).to(ShippingManagerImpl.class);
    }
}
