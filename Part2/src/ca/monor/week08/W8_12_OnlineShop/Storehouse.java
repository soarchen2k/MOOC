package ca.monor.week08.W8_12_OnlineShop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Product> productCollection = new HashMap<String, Product>();
    private Map<String, Integer> priceMap = new HashMap<String, Integer>();

    public Map<String, Product> getProductCollection() {
        return productCollection;
    }

    public void addProduct(String product, int price, int stock) {
        productCollection.put(product, new Product(product, price, stock));
    }

    public int price(String product) {
        if (productCollection.keySet().contains(product)) {
            return productCollection.get(product).getPrice();
        }
        return -99;
    }

    public int stock(String product) {
        Map<String, Integer> stocks = new HashMap<String, Integer>();

        for (String a :
                productCollection.keySet()) {
            stocks.put(a, productCollection.get(a).getStock());
        }
        if (stocks.keySet().contains(product)) {
            return stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stock(product) >= 1) {
            productCollection.get(product).setStock(productCollection.get(product).getStock() - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<String>();
        for (String a :
                productCollection.keySet()) {
            set.add(a);
        }
        return set;
    }
}
