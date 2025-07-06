package main.java.store;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        //Adding the products

        store.addProduct(new BulkProduct("A",50,3,130));
        store.addProduct(new BulkProduct("B",30,2,45));
        store.addProduct(new Product("C",20));
        store.addProduct(new Product("D",15));

        // Combination of 2 products
        store.addCombo(new Combo("C","D",30));
        String[] productNames = {"A","B","C","D"};
        
        //Creating cart by using Key,Value pairs using HashMap
        Map<String, Integer> cart = new HashMap<>();
        for(int i=0;i<productNames.length;i++){
            String productName = productNames[i];
            System.out.print("Enter quantity for product " +productName +" :");
            int quantity= scanner.nextInt();
            cart.put(productName,quantity);
        }

    // calculation the total amount to be paid

        int total = store.calculateCartTotal(cart);
        System.out.println("Total Cart Cost: $" + total);
        scanner.close();
    }

    
}
