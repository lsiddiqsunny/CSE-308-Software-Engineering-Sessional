public class NumberDeco extends JerseyDecoration {
    public NumberDeco(Jersey j) {
        super(j);
    }

    @Override
    int getCost() {

        return jersey.getNumber().length()*3;
    }
}
