public class ChampDeco extends JerseyDecoration {
    public ChampDeco(Jersey j) {
        super(j);
    }

    @Override
    int getCost() {
        return 20;
    }
}
