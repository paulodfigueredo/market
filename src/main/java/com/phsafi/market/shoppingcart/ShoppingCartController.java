package com.phsafi.market.shoppingcart;

import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("cart")
public class ShoppingCartController {

    @Autowired
    public ShoppingCartBusiness shoppingCartBusiness;

    @GetMapping
    public ShoppingCartModel get(@RequestParam(value = "idItem") int idItem) {
        return shoppingCartBusiness.getItemById(idItem).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Item Not Found")
        );
    }

    @PostMapping("list")
    public List<ShoppingCartModel> list(@RequestBody ShoppingCartFilter filter) {
        return shoppingCartBusiness.getItensByFilter(filter);
    }
}
