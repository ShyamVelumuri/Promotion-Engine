package main.java.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private Map<String, Product> products = new HashMap<>();
    private List<Combo> combos = new ArrayList<>();
    
    public void addProduct(Product product){
        products.put(product.getName(), product);
    }

    public void addCombo(Combo combo){
        combos.add(combo);
    }

    public int calculateCartTotal(Map<String, Integer> cart){
        int total = 0;

        for(Combo combo :combos){
            total += combo.applyCombo(cart);
        }

        for(Map.Entry<String, Integer> entry : cart.entrySet()){
            String name = entry.getKey();
            int qty =entry.getValue();
            if(qty>0 && products.containsKey(name)){
                total += products.get(name).calculateTotal(qty);
            }
        }

        return total;

    }
}
