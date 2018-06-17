import java.util.ArrayList;
import java.util.List;

public class InfoTransferSystem {
    private List<Student> students=new ArrayList<>();
    private  String mssg="";
    public void register(Student s){
        if(students.indexOf(s)!=-1){
            System.out.println("Already registerd for the system.\n");
            return;

        }
        students.add(s);
    }
    public void unregister(Student s){
        if(students.indexOf(s)!=-1){
            students.remove(s);

            return;
        }
        System.out.println("Not registerd for the system.\n");

    }
    public void setInfo(String s){
        mssg=s;
    }
    public String getInfo(){
        return mssg;
    }
    public void notifyAllStudent(){
        for(Student s: students){
            s.Update(mssg);
        }
    }
}
