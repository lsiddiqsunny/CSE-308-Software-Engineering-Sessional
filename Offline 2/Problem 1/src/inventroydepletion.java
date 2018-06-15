public class inventroydepletion implements State {
    @Override
    public void doAction() {
        System.out.println("Not enough product.\n");
    }
}
