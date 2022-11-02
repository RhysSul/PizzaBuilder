package Pizza;
public class PizzaDirector {
    public void constructCheeseAndPepperPizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.addCheese();
        pizzaBuilder.addPepper();
    }

    public void constructPepperAndMeatPizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.addPepper();
        pizzaBuilder.addMeat();
    }
}
