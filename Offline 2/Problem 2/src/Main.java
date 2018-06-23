import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InfoTransferSystem cr=new InfoTransferSystem();
        Student student[]=new Student[3];
        student[0]=new Student1("A","1","1@buet.ac.bd");
        student[1]=new Student1("B","2","2@buet.ac.bd");
        student[2]=new Student1("C","3","1@buet.ac.bd");
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
                student[0].getId()+" "+student[0].getName()+"\n"+
                student[1].getId()+" "+student[1].getName()+"\n"+
                student[2].getId()+" "+student[2].getName()+"\n");
                n=sc.nextInt();
                if(n<=3){
                    cr.register(student[n-1]);
                }
                else{
                    System.out.println("Wrong choice.\n");
                }

            }
            else if(n==2){
                System.out.println("Choose a student : \n" +
                        student[0].getId()+" "+student[0].getName()+"\n"+
                        student[1].getId()+" "+student[1].getName()+"\n"+
                        student[2].getId()+" "+student[2].getName()+"\n");
                n=sc.nextInt();
                if(n<=3){
                    cr.unregister(student[n-1]);
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
