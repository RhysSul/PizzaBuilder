package Pizza;

import Pizza.Toppings.Tofu;

public class VegetarianPizzaBuilder extends PizzaBuilder{
    public void addMeat(){
        pizza.addTopping(new Tofu());
    }
    
}
