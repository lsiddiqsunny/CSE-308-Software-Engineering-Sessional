public class ExitState implements State {
    public void doAction(Context context) {
        System.out.println("Fan is in exit state");
        context.setState(this);
    }

    public String toString(){
        return "Exit State";
    }
}
