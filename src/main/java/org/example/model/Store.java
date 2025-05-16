package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];


        products[0] = new Bread("Wheat Bread", 1.00, "Healthy rich quality bread", "Wheat");
        products[1] = new Chocolate("White Chocolate", 6.00,"Sweet White Chocolate", "White");
        products[2] = new Coke("Zero calorie coke", 1.50, "Pepsi", true);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}