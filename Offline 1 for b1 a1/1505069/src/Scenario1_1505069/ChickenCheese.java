package Scenario1_1505069;

public class ChickenCheese extends ChickenBurger {
    @Override
    public String patty() {
        return "Chicken";
    }

    @Override
    public String sauce() {
        return "Mastered sauce";
    }

    @Override
    public String cheese() {
        return "Extra Cheese";
    }

    @Override
    public float price() {
        return 165.0f;
    }

    @Override
    public String burgername() {
        return "Chicken Cheese Burger";
    }
}
