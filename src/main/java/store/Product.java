package main.java.store;

public class Product {
    protected String name;
    protected int unitPrice;
    // Creating the constructor 
    public Product(String name, int unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;  
    }

    public int calculateTotal(int quantity){
        return unitPrice * quantity;
    }

    public String getName(){
        return name;
    }

}
