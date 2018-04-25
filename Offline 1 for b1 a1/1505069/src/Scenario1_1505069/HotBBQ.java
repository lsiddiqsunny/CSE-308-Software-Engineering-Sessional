package Scenario1_1505069;

public class HotBBQ extends ChickenBurger {
    @Override
    public String patty() {
        return "BBQ Chicken";
    }

    @Override
    public String sauce() {
        return "Chili sauce";
    }

    @Override
    public String cheese() {
        return "Normal Cheese";
    }

    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String burgername() {
        return "Hot Chicken BBQ Burger";
    }
}
