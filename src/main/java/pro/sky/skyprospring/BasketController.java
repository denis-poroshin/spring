package pro.sky.skyprospring;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/store")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
    @RequestMapping("/order/add")
    public boolean addBasket(@RequestParam ("idBasket") ArrayList<Integer> idBasket){
        return basketService.addBasket(idBasket);
    }
    @RequestMapping("/order/get")
    public List<Integer> addBasket(){
        return basketService.printAll();

    }
}
