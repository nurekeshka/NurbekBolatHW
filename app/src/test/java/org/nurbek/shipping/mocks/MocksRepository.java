package org.nurbek.shipping.mocks;

import java.util.EnumMap;

import org.nurbek.shipping.domain.enums.ItemEnum;

public class MocksRepository {
    public static EnumMap<ItemEnum, Integer> getOrderMap() {
        EnumMap<ItemEnum, Integer> map = new EnumMap<>(ItemEnum.class);

        map.put(ItemEnum.LAPTOP, 100);
        map.put(ItemEnum.MOUSE, 200);
        map.put(ItemEnum.DESKTOP, 150);
        map.put(ItemEnum.SCREEN, 200);

        return map;
    }
}
