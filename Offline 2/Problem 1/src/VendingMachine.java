public class VendingMachine {
    private  State state;
    public VendingMachine(){
        state=null;
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return this.state;
    }
}
