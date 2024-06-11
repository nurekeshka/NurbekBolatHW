package org.nurbek.shipping.domain.repositories.impl;

import java.util.EnumMap;

import org.nurbek.shipping.domain.enums.ItemEnum;
import org.nurbek.shipping.domain.enums.SizeEnum;
import org.nurbek.shipping.domain.models.Item;
import org.nurbek.shipping.domain.repositories.ItemRepository;
import org.nurbek.shipping.domain.repositories.SizeRepository;

public class ItemRepositoryInMemoryImpl implements ItemRepository {
    private final EnumMap<ItemEnum, Item> items;

    public ItemRepositoryInMemoryImpl() {
        SizeRepository sizeRepository = new SizeRepositoryInMemoryImpl();

        this.items = new EnumMap<>(ItemEnum.class);

        this.items.put(ItemEnum.LAPTOP, new Item("Laptop", sizeRepository.getSize(SizeEnum.LAPTOP_ITEM), 6.5));
        this.items.put(ItemEnum.MOUSE, new Item("Mouse", sizeRepository.getSize(SizeEnum.MOUSE_ITEM), 0.2));
        this.items.put(ItemEnum.DESKTOP, new Item("Desktop", sizeRepository.getSize(SizeEnum.DESKTOP_ITEM), 20));
        this.items.put(ItemEnum.SCREEN, new Item("Screen", sizeRepository.getSize(SizeEnum.SCREEN_ITEM), 2.6));
    }

    @Override
    public Item getItem(ItemEnum type) {
        return this.items.get(type);
    }
}
