package Scenario1_1505069;

public class Collegue implements Participant{
    private Server server;
    String Name,desi;
    Collegue(Server s,String name){
        server=s;
        Name=name;
        desi="College";
    }
    public void send(String s){
        System.out.println("Massage sent from "+Name);

        server.Send(this,s);
    }
    public void recieve(String r){
        System.out.println("Name : "+Name+"\nStatus : "+desi+"\nMassage: "+r);
    }
}
