package pro.sky.skyprospring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }
    public boolean addBasket(ArrayList<Integer> id){
        return basket.addPurchases(id);



    }
    public List<Integer> printAll(){

        return basket.printALL();
    }


}
