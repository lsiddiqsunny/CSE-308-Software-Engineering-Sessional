public abstract class Toy implements Item{
    @Override
    public abstract String name() ;

    @Override
    public float price() {
        return 0;
    }

    @Override
    public packing pack() {
        return new Bag();
    }
}
