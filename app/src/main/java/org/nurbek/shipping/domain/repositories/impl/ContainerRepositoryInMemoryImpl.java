package org.nurbek.shipping.domain.repositories.impl;

import java.util.EnumMap;

import org.nurbek.shipping.domain.enums.ContainerType;
import org.nurbek.shipping.domain.enums.SizeEnum;
import org.nurbek.shipping.domain.models.Container;
import org.nurbek.shipping.domain.repositories.ContainerRepository;
import org.nurbek.shipping.domain.repositories.SizeRepository;

import com.google.inject.Inject;

public class ContainerRepositoryInMemoryImpl implements ContainerRepository {
    private final SizeRepository sizeRepository;
    private final EnumMap<ContainerType, Container> containers;

    @Inject
    public ContainerRepositoryInMemoryImpl(SizeRepository sizeRepository) {
        this.sizeRepository = sizeRepository;

        this.containers = new EnumMap<>(ContainerType.class);

        this.containers.put(ContainerType.SMALL,
                new Container(this.sizeRepository.getSize(SizeEnum.SMALL_CONTAINER), 1200));
        this.containers.put(ContainerType.LARGE,
                new Container(this.sizeRepository.getSize(SizeEnum.LARGE_CONTAINER), 1800));
    }

    public Container getContainer(ContainerType type) {
        return this.containers.get(type);
    }
}
