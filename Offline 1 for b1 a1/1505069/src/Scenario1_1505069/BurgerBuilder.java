package Scenario1_1505069;

import java.util.Scanner;

public class BurgerBuilder {
    public static Burger prepareBurger(){
        Burger b=new Burger();
        Scanner sc=new Scanner(System.in);

        System.out.println("How many burger you want? ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("What kind of burger you want?\n1.Chicken\n2.Beef");
            int op=sc.nextInt();
            if(op==1){
                System.out.println("Choose option for your chicken burger:\n1.Tandori Chicken Burger\n2.Chicken Cheese Burger\n3.Hot BBQ Burger");
                int chop=sc.nextInt();
                if(chop==1){
                    b.addBurger(new Tandori());
                }
                else if(chop==2){
                    b.addBurger(new ChickenCheese());
                }
                else b.addBurger(new HotBBQ());

            }
            else{
                System.out.println("Choose option for your beef burger:\n1.Mexican Beef Burger\n2.Beef Cheese Burger\n3.Beef Steak Burger");
                int chop=sc.nextInt();
                if(chop==1){
                    b.addBurger(new MexicanBeef());
                }
                else if(chop==2){
                    b.addBurger(new BeefCheese());
                }
                else b.addBurger(new BeefSteak());

            }
        }
        System.out.println("\nPlease check your ordered items:\n");
        b.showOrder();
        System.out.println("\n----------------------------------\nNet payment:  "+b.getCost());

       return b;
    }
}
