public class HighSpeedState implements State{
    public void doAction(Context context) {
        System.out.println("Fan is in high speed state");
        context.setState(this);
    }

    public String toString(){
        return "High Speed State";
    }
}
