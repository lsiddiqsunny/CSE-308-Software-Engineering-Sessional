public class VendingMachine {
    private  State state;
    int currentMoney;
    public VendingMachine(int cm){
        state=null;
        this.currentMoney=cm;
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return this.state;
    }
}
