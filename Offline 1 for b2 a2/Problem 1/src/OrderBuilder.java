import java.util.Scanner;

public class OrderBuilder {
    public Meal preparemeal(){
        Scanner sc=new Scanner(System.in);
        Meal m=new Meal();

        System.out.println("Enter choice for main item: ");
        System.out.println("1.Hamburger\n2.CheeseBurger\n3.ChickenBurger");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                m.addItem(new Hamburger());
                break;
            case 2:
                m.addItem(new Cheeseburger());
                break;
            case 3:
                m.addItem(new Cheeseburger());
                break;
        }
        System.out.println("Enter choice for side item: ");
        System.out.println("1.Chicken Fries\n2.Potato Fries");
         ch=sc.nextInt();
        switch (ch){
            case 1:
                m.addItem(new Chickenfries());
                break;
            case 2:
                m.addItem(new Potatofries());
                break;

        }

        System.out.println("Enter choice for drink item: ");
        System.out.println("1.Coke\n2.Pepsi");
        ch=sc.nextInt();
        switch (ch){
            case 1:
                m.addItem(new Coke());
                break;
            case 2:
                m.addItem(new Pepsi());
                break;

        }


        System.out.println("Enter choice for toy item: ");
        System.out.println("1.Dinosaur\n2.Car");
        ch=sc.nextInt();
        switch (ch){
            case 1:
                m.addItem(new Dinosaurtoy());
                break;
            case 2:
                m.addItem(new Cartoy());
                break;

        }

        return m;
    }

}
