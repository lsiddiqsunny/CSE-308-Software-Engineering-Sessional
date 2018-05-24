public class LowSpeedState implements State {
    public void doAction(Context context) {
        System.out.println("Fan is in low speed state");
        context.setState(this);
    }

    public String toString(){
        return "Low Speed State";
    }
}
