public abstract class Drinks implements Item{
    public  abstract String name();
    public abstract float price();
    public packing pack(){
        return  new Cup();
    }
}
