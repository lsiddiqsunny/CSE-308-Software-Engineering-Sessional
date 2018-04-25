package Scenario1_1505069;

public class MexicanBeef extends BeefBurger {
    @Override
    public String patty() {
        return "Beef";
    }

    @Override
    public String sauce() {
        return "Mexican Sauce";
    }

    @Override
    public String cheese() {
        return "No cheese";
    }

    @Override
    public float price() {
        return 165.0f;
    }

    @Override
    public String burgername() {
        return "Mexican Beef Burger";
    }
}
