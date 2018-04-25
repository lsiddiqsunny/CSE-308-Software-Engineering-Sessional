package Scenario1_1505069;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private List<BurgerItem> items = new ArrayList<BurgerItem>();
    public void addBurger(BurgerItem newBurger){
        items.add(newBurger);
    }
    public float getCost(){
        float cost = 0.0f;

        for (BurgerItem item : items) {
            cost += item.price();
        }
        return cost;
    }
    public void showOrder(){
        int co=1;
        for(BurgerItem item:items){
            System.out.println(co+". "+ item.burgername()+" Patty: "+item.patty()+ " Cheese: "+item.cheese()+" Sauce: "+item.sauce()+ " Price: "+item.price());
            co++;
        }

    }
}
