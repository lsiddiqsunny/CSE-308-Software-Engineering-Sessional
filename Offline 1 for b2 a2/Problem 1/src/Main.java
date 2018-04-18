

public class Main {

    public static void main(String[] args) {

        OrderBuilder or=new OrderBuilder();
        Meal m=or.preparemeal();
        m.showItems();
    }
}
