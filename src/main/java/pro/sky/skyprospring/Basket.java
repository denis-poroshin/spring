package pro.sky.skyprospring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope // Разграничивает пользователей
public class Basket {
    private final List<Integer> purchases;

    public Basket(List<Integer> purchases) {
        this.purchases = purchases;
    }

    public boolean addPurchases(ArrayList<Integer> integer){
        return purchases.addAll(integer);

    }
    public List<Integer> printALL(){
        if (purchases.isEmpty()) {
            throw new NullPointerException();
        }
        return Collections.unmodifiableList(purchases);

    }


    @Override
    public String toString() {
        return "Basket{" +
                "purchases=" + purchases +
                '}';
    }

    public List<Integer> getPurchases() {
        return purchases;
    }
}
