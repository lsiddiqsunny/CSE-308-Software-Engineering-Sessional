public class EuropaDeco extends JerseyDecoration {
    public EuropaDeco(Jersey j) {
        super(j);
    }

    @Override
    int getCost() {
        return 15;
    }
}
