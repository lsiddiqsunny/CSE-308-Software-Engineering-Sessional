package Scenario1_1505069;

public class Main {

    public static void main(String[] args) {
	Server s=new Server();
	Collegue c1=new Collegue(s,"A");
	Collegue c2=new Collegue(s,"B");
	Friend f1=new Friend(s,"C");
	Friend f2=new Friend(s,"D");
	s.AddCollegue(c1);
	s.AddCollegue(c2);
	s.AddFriend(f1);
	s.AddFriend(f2);
	c1.send("CHello");
	f1.send("AHey");

    }
}
