package org.nurbek.shipping.domain.repositories;

import org.nurbek.shipping.domain.enums.ContainerType;
import org.nurbek.shipping.domain.models.Container;

public interface ContainerRepository {
    public Container getContainer(ContainerType type);
}
