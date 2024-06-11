package org.nurbek.shipping.domain.repositories.impl;

import java.util.EnumMap;

import org.nurbek.shipping.domain.enums.SizeEnum;
import org.nurbek.shipping.domain.models.Size;
import org.nurbek.shipping.domain.repositories.SizeRepository;

public class SizeRepositoryInMemoryImpl implements SizeRepository {
    private final EnumMap<SizeEnum, Size> sizes;

    public SizeRepositoryInMemoryImpl() {
        this.sizes = new EnumMap<>(SizeEnum.class);

        this.sizes.put(SizeEnum.SMALL_CONTAINER, new Size(2.59, 2.43, 6.06));
        this.sizes.put(SizeEnum.LARGE_CONTAINER, new Size(2.59, 2.43, 12.01));

        this.sizes.put(SizeEnum.LAPTOP_ITEM, new Size(0.6, 0.5, 0.5));
        this.sizes.put(SizeEnum.MOUSE_ITEM, new Size(0.3, 0.3, 0.2));
        this.sizes.put(SizeEnum.DESKTOP_ITEM, new Size(1.0, 1.5, 0.5));
        this.sizes.put(SizeEnum.SCREEN_ITEM, new Size(1.2, 1.4, 0.8));
    }

    @Override
    public Size getSize(SizeEnum type) {
        return this.sizes.get(type);
    }
}
