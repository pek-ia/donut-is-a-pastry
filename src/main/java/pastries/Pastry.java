package pastries;

public class Pastry {
    double price;
    Flavor flavor;

    public Pastry(double price, Flavor flavor) {
        this.price = price;
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public Flavor getFlavor() {
        return flavor;
    }
}
