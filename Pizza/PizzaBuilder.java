package Pizza;

import Pizza.Toppings.Cheese;
import Pizza.Toppings.Meat;
import Pizza.Toppings.Pepper;

public class PizzaBuilder implements Builder {
    protected Pizza pizza;
    
    public PizzaBuilder() {
        this.reset();
    }
    public void addMeat(){
        pizza.addTopping(new Meat());
    }
    
    public void reset() {
        pizza = new Pizza();
    }
    
    public void addCheese() {
        pizza.addTopping(new Cheese());
    }

    public void addPepper(){
        pizza.addTopping(new Pepper());
    }

    public Pizza getResult(){
        Pizza pizza = this.pizza;
        this.reset();
        return pizza;
    }
}
