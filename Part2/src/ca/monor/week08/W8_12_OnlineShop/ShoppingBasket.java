package ca.monor.week08.W8_12_OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> purchaseMap = new HashMap<String, Purchase>();

    public void add(String product, int price) {
        if (!purchaseMap.keySet().contains(product)) {
            purchaseMap.put(product, new Purchase(product, price));
            purchaseMap.get(product).increaseAmount();
        }
        else purchaseMap.get(product).increaseAmount();
    }

    public int price() {
        int price = 0;
        for (String k :
                purchaseMap.keySet()) {
            price += purchaseMap.get(k).price();
        }
        return price;
    }

    public void print() {
        for (Purchase purchase :
                purchaseMap.values()) {
            System.out.println(purchase);
        }
    }
}
