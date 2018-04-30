package Scenario2_1505069;

public class Main {

    public static void main(String[] args) {

        CoffeeMaker c=getCoffeeMaker.getCoffeeshop();
        Coffee coffee=c.prepareCoffe();

        System.out.println("You chose "+coffee.haveSugar());
    }
}
