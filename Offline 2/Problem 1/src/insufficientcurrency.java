public class insufficientcurrency implements State {
    @Override
    public void doAction() {
        System.out.println("Not sufficient money entered.\n");
    }
}
