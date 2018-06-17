import java.util.ArrayList;
import java.util.List;

public class InfoTransferSystem {
    private List<Student> students=new ArrayList<>();
    private  String mssg="";
    public void register(Student s){
        if(students.indexOf(s)!=-1){
            System.out.println("Already registered for the system.\n");
            return;

        }
        students.add(s);
        System.out.println("Successfully registered for the system.\n");
    }
    public void unregister(Student s){
        if(students.indexOf(s)!=-1){
            students.remove(s);
            System.out.println("Successfully removed for the system.\n");
            return;
        }
        System.out.println("Not registered for the system.\n");

    }
    public void setInfo(String s){
        mssg=s;
        notifyAllStudent();
    }
    public String getInfo(){
        return mssg;
    }

    public void registerList(){
        for(Student s: students){
            System.out.println("Id "+s.getId()+": "+s.getName());
        }
    }
    public void notifyAllStudent(){
        for(Student s: students){
            s.Update(mssg);
        }
    }
}
