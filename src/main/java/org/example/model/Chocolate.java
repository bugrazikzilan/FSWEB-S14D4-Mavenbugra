package org.example.model;

public class Chocolate extends ProductForSale {

    private String color;

    public Chocolate(String description, double price, String type) {
        super(description, price, type);
    }

    public Chocolate(String description, double price, String type, String color) {
        super(description, price, type);
        this.color = color;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("Color: " + color);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color='" + color + '\'' +
                '}';
    }
}
