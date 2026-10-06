package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Long getId() { return id; }

    public String getName() { return name; }

    //The name of the product is no longer displayed after I type the ID and press execute

    public double getPrice() { return price; }
}
