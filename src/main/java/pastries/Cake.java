package pastries;

public class Cake extends Pastry {
    int numLayers;
    String frostingFlavor;

    public Cake(double price, Flavor flavor, int numLayers, String frostingFlavor) {
        super(price, flavor);
        this.numLayers = numLayers;
        this.frostingFlavor = frostingFlavor;
    }

    public int getNumLayers() {
        return numLayers;
    }

    public String getFrostingFlavor() {
        return frostingFlavor;
    }
}
