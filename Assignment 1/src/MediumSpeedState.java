public class MediumSpeedState implements State {
    public void doAction(Context context) {
        System.out.println("Fan is in medium speed state");
        context.setState(this);
    }

    public String toString(){
        return "Medium Speed State";
    }
}
