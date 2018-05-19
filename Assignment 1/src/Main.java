import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Context context=new Context();
        Scanner sc=new Scanner(System.in);
        StartState startState=new StartState();
        startState.doAction(context);
       // System.out.println(startState.toString());
        while(true){
            System.out.println("Enter your choose: \n 1. Low speed \n 2.Medium Speed \n 3.High Speed \n 4.Stop the fan\n");
            int n=sc.nextInt();
            if(n==1){
                HighSpeedState highSpeedState=new HighSpeedState();
                highSpeedState.doAction(context);
            }
            if(n==2){
                MediumSpeedState mediumSpeedState=new MediumSpeedState();
                mediumSpeedState.doAction(context);
            }
            if(n==3){
                LowSpeedState lowSpeedState=new LowSpeedState();
                lowSpeedState.doAction(context);
            }
            if(n==4){
                ExitState exitState=new ExitState();
                exitState.doAction(context);
                break;
            }
        }


    }
}
