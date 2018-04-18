import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        int co=0;

        for (Item item : items) {
            if(co==0){
                System.out.print("Main ");
            }
            else if(co==1){
                System.out.print("Side ");
            }
            else if(co==2){
                System.out.print("Drink ");
            }
            else{
                System.out.print("Toy ");
            }
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.pack().pack());
            System.out.println(", Price : " + item.price());
            co++;
        }
    }
}
