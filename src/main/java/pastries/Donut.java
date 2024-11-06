package pastries;

public class Donut extends Pastry {
    boolean hasSprinkles;


    DonutType type;

    public DonutType getType() {
        return type;
    }

    public Donut(double price, Flavor flavor, boolean hasSprinkles, DonutType type) {
        super(price, flavor);
        this.hasSprinkles = hasSprinkles;
        this.type = type;
    }


    public boolean isHasSprinkles() {
        return hasSprinkles;
    }
}
