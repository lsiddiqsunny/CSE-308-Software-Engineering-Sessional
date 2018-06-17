import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InfoTransferSystem cr=new InfoTransferSystem();
        Student1 s1=new Student1("A","1","1@buet.ac.bd");
        Student1 s2=new Student1("B","2","2@buet.ac.bd");
        Student1 s3=new Student1("C","3","1@buet.ac.bd");
        while(true){
            System.out.println("Choose an option : \n1.Register A Student\n" +
                    "2.Unregister A Student\n" +
                    "3.Update A Massage\n" +
                    "4.Register List\n" +
                    "5.Exit\n");
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            if(n==1){
                System.out.println("Choose a student : \n" +
                        "1. A , id = 1 \n" +
                        "2. B , id = 2 \n" +
                        "3. C , id =3 \n");
                n=sc.nextInt();
                if(n==1){
                    cr.register(s1);

                }
                else if(n==2){
                    cr.register(s2);
                }
                else if(n==3){
                    cr.register(s3);
                }
                else{
                    System.out.println("Wrong choice.\n");
                }

            }
            else if(n==2){
                System.out.println("Choose a student : \n" +
                        "1. A , id = 1 \n" +
                        "2. B , id = 2 \n" +
                        "3. C , id =3 \n");
                n=sc.nextInt();
                if(n==1){
                    cr.unregister(s1);

                }
                else if(n==2){
                    cr.unregister(s2);
                }
                else if(n==3){
                    cr.unregister(s3);
                }

                else{
                    System.out.println("Wrong choice.\n");
                }

            }
            else if(n==3){
                sc.nextLine();
                String mssg=sc.nextLine();
                cr.setInfo(mssg);
            }
            else if(n==4){
                cr.registerList();
            }
            else {
                break;
            }
        }

    }
}
