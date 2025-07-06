package main.java.store;

import java.util.Map;

public class Combo {
    private String product1;
    private String product2;
    private int comboPrice;

    public Combo(String product1,String product2,int comboPrice){
        this.product1 = product1;
        this.product2 = product2;
        this.comboPrice = comboPrice;
    }

    public int applyCombo(Map<String, Integer> cart){
        int count1 = cart.getOrDefault(product1, 0);
        int count2 =cart.getOrDefault(product2, 0);
        if(combos > 0);
        cart.put(product1, count1 - combos);
        cart.put(product2, count2 - combos);
    }
    return combos * comboPrice;
    
}
