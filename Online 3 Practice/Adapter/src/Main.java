import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true){
            System.out.println("1.Buy a jersey\n2.Exit");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            if(ch==2) break;
            if(ch!=1){
                System.out.println("Wrong Choice.Try again");
                continue;
            }
            int total=0;
            Jersey j=null;
            System.out.println("1.Buy a home jersey\n2.Buy an away jersey\n3.Buy a third jersey");
            ch=sc.nextInt();
            if(ch>3){
                System.out.println("Wrong Choice.Try again");
                continue;
            }
            if(ch==1){j=new HomeJersey();
            }
            else if(ch==2){
                j=new AwayJersey();
            }
            else j=new ThirdJersey();
            total+=j.getPrice();
            System.out.println("Do you want name?[0 for no and 1 for yes]");
            ch=sc.nextInt();
            NameDeco nameDeco=new NameDeco(j);
            if(ch==0){
                nameDeco.setOwnerName("");
            }
            else{sc.nextLine();
               String name=sc.nextLine();
               nameDeco.setOwnerName(name);
               total+=nameDeco.getCost();

            }


            System.out.println("Do you want number?[0 for no and 1 for yes]");
            ch=sc.nextInt();
            NumberDeco numberDeco=new NumberDeco(j);
            if(ch==0){
                numberDeco.setNumber("");
            }
            else{sc.nextLine();
                String num=sc.nextLine(); nameDeco.setNumber(num);
                total+=numberDeco.getCost();

            }
            System.out.println("Do you want crest?[0 for no and 1 for yes]");
            ch=sc.nextInt();
            JerseyDecoration jerdeco=null;
            if(ch==0){
                jerdeco=null;
                numberDeco.settournamentName("");
            }
            else{
                System.out.println("1.FA Cup\n2.Premier leauge\n3.Europa League\n4.Champions LEAGUE");
                ch=sc.nextInt();
                if(ch==1){
                    jerdeco=new FACupDeco(j);
                    jerdeco.settournamentName("FA CUP");
                    total+=jerdeco.getCost();

                }
                else if(ch==2){
                    jerdeco=new PremiereDeco(j);
                    jerdeco.settournamentName("Premier leauge");
                    total+=jerdeco.getCost();

                }
                else if(ch==3){
                    jerdeco=new EuropaDeco(j);
                    jerdeco.settournamentName("Europa League");
                    total+=jerdeco.getCost();

                }
                else if(ch==4){
                    jerdeco=new ChampDeco(j);
                    jerdeco.settournamentName("Champion");
                    total+=jerdeco.getCost();

                }

            }
            System.out.print(j.getName());
            if(nameDeco.getOwnerName().length()!=0){
                System.out.print(" for "+nameDeco.getOwnerName());
            }
            if(nameDeco.getNumber().length()!=0){
                System.out.print(" with number "+numberDeco.getNumber());
            }
            if( jerdeco!=null && jerdeco.tournamentName().length()!=0){
                System.out.print(" playing in "+jerdeco.tournamentName());
            }
            System.out.println("\nprice: "+total);



        }

    }
}
