package Scenario2_1505069;

public class Main {

    public static void main(String[] args) {
        Coffee c=CoffeeMaker.prepareCoffe();
        System.out.println("You chose "+c.haveSugar());
    }
}
