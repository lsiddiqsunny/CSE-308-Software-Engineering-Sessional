import java.util.Scanner;

public class ChainOfResponsibility {
    public static Taka500Dispenser AbstractDispenser() {
        Taka500Dispenser c1=new Taka500Dispenser();
        Taka100Dispenser c2=new Taka100Dispenser();
        Taka20Dispenser c3=new Taka20Dispenser();
        Taka10Dispenser c4=new Taka10Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(null);
        return c1;
    }


    public static void main(String[] args) {
        System.out.println("Enter your desired amount: ");
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        while(amt%10!=0){
            System.out.println("Amount should be multple of 10 takas.\nTry again");
            System.out.println("Enter your desired amount: ");
            amt=sc.nextInt();
        }
        AbstractDispenser().dispense(new Currency(amt));

    }
}
