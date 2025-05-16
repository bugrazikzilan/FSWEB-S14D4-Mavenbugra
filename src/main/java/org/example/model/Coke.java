package org.example.model;

public class Coke extends  ProductForSale {
    private boolean isDiet;


    public Coke(String description, double price, String type) {
        super(description, price, type);
    }

    public Coke(String description, double price, String type, boolean isDiet) {
        super(description, price, type);
        this.isDiet = isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("Is Diet?: " + isDiet);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "isDiet=" + isDiet +
                '}';
    }
}
