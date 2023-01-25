package com.phsafi.market.shoppingcart;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ShoppingCartBusiness {

    public List<ShoppingCartModel> itens = Arrays.asList(
            new ShoppingCartModel(1, "Laptop", 2556.99f, 45),
            new ShoppingCartModel(2, "GPU", 4556.99f, 12),
            new ShoppingCartModel(3, "CPU", 758.99f, 36),
            new ShoppingCartModel(4, "Cooler", 58.99f, 152)
    );

    public Optional<ShoppingCartModel> getItemById(int id){
        return itens.stream().filter(item -> item.getId() == id).findFirst();
    }

    public List<ShoppingCartModel> getItensByFilter(ShoppingCartFilter filter){
        return itens.stream().filter(item ->
                        item.getName().contains(filter.getParcialName()) &&
                        item.getValue() <= filter.getMaxValue() &&
                        item.getValue() >= filter.getMinValue()
        ).collect(Collectors.toList());
    }
}
