package org.nurbek.shipping.mocks;

import java.util.EnumMap;

import org.nurbek.inject.Guice;
import org.nurbek.inject.Injector;
import org.nurbek.shipping.application.initialization.BasicModule;
import org.nurbek.shipping.domain.enums.ItemEnum;
import org.nurbek.shipping.domain.models.Order;
import org.nurbek.shipping.domain.repositories.ItemRepository;

public class MocksRepository {
    public static Order getOrder() {
        Injector injector = Guice.createInjector(new BasicModule());

        EnumMap<ItemEnum, Integer> map = MocksRepository.getOrderMap();
        ItemRepository itemRepository = injector.getInstance(ItemRepository.class);

        Order order = new Order();

        for (ItemEnum type : map.keySet()) {
            order.addItem(itemRepository.getItem(type), map.get(type));
        }

        return order;
    }

    public static EnumMap<ItemEnum, Integer> getOrderMap() {
        EnumMap<ItemEnum, Integer> map = new EnumMap<>(ItemEnum.class);

        map.put(ItemEnum.LAPTOP, 100);
        map.put(ItemEnum.MOUSE, 200);
        map.put(ItemEnum.DESKTOP, 150);
        map.put(ItemEnum.SCREEN, 200);

        return map;
    }
}
