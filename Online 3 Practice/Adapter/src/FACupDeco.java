public class FACupDeco extends JerseyDecoration {
    public FACupDeco(Jersey j) {
        super(j);
    }

    @Override
    int getCost() {
        return 8;
    }
}
