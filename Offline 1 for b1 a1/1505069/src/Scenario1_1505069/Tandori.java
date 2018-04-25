package Scenario1_1505069;

public class Tandori extends ChickenBurger{
    @Override
    public String patty() {
        return "Tandori chicken";
    }

    @Override
    public String sauce() {
        return "Tomato sauce";
    }

    @Override
    public String cheese() {
        return "No cheese";
    }

    @Override
    public float price() {
        return 160.0f;
    }

    @Override
    public String burgername() {
        return "Tandori Masala ";
    }
}
