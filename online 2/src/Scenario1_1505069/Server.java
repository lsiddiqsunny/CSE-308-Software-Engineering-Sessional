package Scenario1_1505069;

import java.util.ArrayList;
import java.util.List;

public class Server {
    List<Participant> collegue;
    List<Participant> friend;
    Server(){
        collegue=new ArrayList<>();
        friend=new ArrayList<>();
    }
    void AddFriend(Friend f){
        friend.add(f);
    }
    void AddCollegue(Collegue c){
        collegue.add(c);
    }
    void Send(Participant p,String t){
        String[] x=t.split(" ");

        if(t.charAt(0)=='A'){
            t=t.substring(1,t.length());
            for(Participant P:collegue){
                if(P==p) continue;
                P.recieve(t);
            }
            for(Participant P:friend){
                if(P==p) continue;
                P.recieve(t);
            }

        }
        else  if(t.charAt(0)=='F'){
            t=t.substring(1,t.length());

            for(Participant P:friend){
                if(P==p) continue;
                P.recieve(t);
            }
        }
        else  if(t.charAt(0)=='C'){            t=t.substring(1,t.length());

            for(Participant P:collegue){
                if(P==p) continue;
                P.recieve(t);
            }
        }
    }
}
