public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Fan is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
