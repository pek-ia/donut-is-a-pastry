package pastries;

public enum DonutType {
    CRULLER("this is a twisted raised donut"),
    CAKE("A crumbly confection"),
    RAISED("Light and Fluffy"),
    BEAR_CLAW("Looks like a bear claw"),
    FILLED("Full of goo");

    final String description;
    DonutType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
