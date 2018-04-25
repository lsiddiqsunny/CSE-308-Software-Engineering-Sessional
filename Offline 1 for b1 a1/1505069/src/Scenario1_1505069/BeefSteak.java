package Scenario1_1505069;

public class BeefSteak extends  BeefBurger {
    @Override
    public String patty() {
        return "Beef Steak";
    }

    @Override
    public String sauce() {
        return "Chili sauce";
    }

    @Override
    public String cheese() {
        return "Yes";
    }

    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String burgername() {
        return "Beef Steak Burger";
    }
}
