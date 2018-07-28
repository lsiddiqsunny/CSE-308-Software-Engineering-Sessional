public class PremiereDeco extends JerseyDecoration {
    public PremiereDeco(Jersey j) {
        super(j);
    }

    @Override
    int getCost() {
        return 10;
    }
}
