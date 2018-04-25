package Scenario2_1505069;

import java.util.Scanner;

public class CoffeeMaker {
    public static Coffee prepareCoffe(){
        Coffee c=null;
        System.out.println("Do you prefer sugar? Yes/No ? ");
        Scanner sc=new Scanner(System.in);
        String op=sc.nextLine();
        if(op.equals("Yes")){
            System.out.println("What type of coffee you want?\n1.CoffeeA\n2.CoffeeB");
            int n=sc.nextInt();
            if(n==1){
                c=new CoffeeA();
            }
            else c=new CoffeeB();
        }
        else{
            c=new CoffeeC();
        }

        return c;
    }
}
