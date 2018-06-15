import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            VendingMachine vendingMachine=new VendingMachine(100);
            vendingMachine.setProduct();

            while(true){
                System.out.println("Enter your choice:\n 1. Pepsi - 16\\- \n 2. Coka-cola - 18\\- \n 3. 7up - 15\\- \n 4. Exit\n");
                Scanner sc=new Scanner(System.in);
                int ch=sc.nextInt();
                int money=0;
                if(ch>4){
                    System.out.println("Wrong choice.\n");
                    continue;
                }
                if(ch==4) break;
                if(vendingMachine.getProductAmount(ch-1)==0){
                    vendingMachine.setState(new inventroydepletion());
                }
                else{

                    System.out.println("Enter Your Money : ");
                    money=sc.nextInt();
                    if(vendingMachine.getProductPrice(ch-1)>money){
                        vendingMachine.setState(new insufficientcurrency());
                    }
                    else if(vendingMachine.getProductPrice(ch-1)==money){
                        vendingMachine.setState(new productwithnochange());
                        vendingMachine.getProduct(ch-1);
                    }
                    else{
                        vendingMachine.setState(new productwithchange());
                        vendingMachine.getProduct(ch-1);
                    }
                }
                vendingMachine.getState().doAction();


            }
            vendingMachine.setState(new ExitingVendingMachine());
            vendingMachine.getState().doAction();



    }
}
