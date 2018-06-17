public class Student1 extends Student {
    String name,id,email;
    Student1(String n,String roll,String mail){
        name=n;
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

    @Override
    String getName() {
        return name;
    }
}
