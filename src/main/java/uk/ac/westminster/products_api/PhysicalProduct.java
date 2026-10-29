package uk.ac.westminster.products_api;
// A PhysicalProduct IS-A Product: it is a product that has
// to be picked, packed and shipped.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;
    // TODO (a): empty no-arg constructor for Jackson
    public PhysicalProduct() {
    }
    // TODO (b): full constructor.
// First line must be super(id, name, price);
// then assign this.weightKg and this.dimension
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    // TODO (c): getWeightKg() and getDimensions()
    public double getWeightKg() { return weightKg; }
    public String getDimensions() { return dimensions; }
    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
