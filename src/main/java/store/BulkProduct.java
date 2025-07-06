package main.java.store;


public class BulkProduct extends Product{
    private int bulkQuantity;
    private int bulkPrice;

    public BulkProduct(String name, int unitPrice,int bulkQuantity, int bulkPrice){
        super(name,unitPrice);
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;

        }
        @Override
        public int calculateTotal(int quantity){
            int bulkGroups = quantity /bulkQuantity;
            int remaining = quantity % bulkQuantity;
            int bulkCombos = (bulkGroups*bulkPrice)+ (remaining*unitPrice);

            return bulkCombos;

    }
}
