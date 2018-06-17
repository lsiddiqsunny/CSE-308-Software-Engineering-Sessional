public class Student1 extends Student {
    String id,email;
    Student1(String roll,String mail){
        id=roll;
        email=mail;
    }
    @Override
    void Update(String s) {
        System.out.println("Id "+id+": \""+ s+"\" \nThis massage will be sent to "+email);
    }

    @Override
    String getId() {
        return id;
    }
}
