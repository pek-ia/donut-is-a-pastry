package pastries;

public class MainApp {
    public static void main(String[] args) {

        Pastry p = new Cake(25., Flavor.CHOCOLATE, 3, "White Buttercream");
        Donut d = new Donut(.5, Flavor.VANILLA, true, DonutType.CAKE);
        if (d.getType() == DonutType.CAKE){
            System.out.println(d.getFlavor());
        }


        int input = 0;
        System.out.println("You selected " + Flavor.values()[input]);
        System.out.println("That's " + Flavor.valueOf("CHOCOLATE"));
    }
}
