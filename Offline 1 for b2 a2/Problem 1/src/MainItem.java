public abstract class MainItem implements Item{
    public abstract  float price();
    public abstract String name();
    public packing pack(){
        return new Bag();
    }

}
