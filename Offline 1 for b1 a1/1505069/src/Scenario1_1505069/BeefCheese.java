package Scenario1_1505069;

public class BeefCheese extends BeefBurger {
    @Override
    public String patty() {
        return "Beef";
    }

    @Override
    public String sauce() {
        return "Tomato";
    }

    @Override
    public String cheese() {
        return "Extra cheese";
    }

    @Override
    public float price() {
        return 170.f;
    }

    @Override
    public String burgername() {
        return "Beef cheese burger";
    }
}
