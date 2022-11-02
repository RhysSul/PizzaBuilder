package Pizza;

import java.util.ArrayList;

import Pizza.Toppings.Topping;

public class Pizza {
    ArrayList<Topping> toppings = new ArrayList<Topping>();

    public void addTopping(Topping cheese) {
        toppings.add(cheese);
    }

    public void printToppings() {
        for (Topping topping : toppings) {
            System.out.println(topping.getToppingName());
        }
    }
}
