import Pizza.PizzaBuilder;
import Pizza.PizzaDirector;
import Pizza.VegetarianPizzaBuilder;
import Pizza.Pizza;
public class Main {
    public static void main(String[] args){
        PizzaDirector pizzaDirector = new PizzaDirector();

        System.out.println("Pizza with cheese and pepper:");
        
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaDirector.constructCheeseAndPepperPizza(pizzaBuilder);
        Pizza pizza = pizzaBuilder.getResult();        
        pizza.printToppings();
        
        System.out.println("===================================");
        
        
        System.out.println("Vegetarian pizza with meat and pepper:");
        
        PizzaBuilder veggiePizzaBuilder = new VegetarianPizzaBuilder();
        pizzaDirector.constructPepperAndMeatPizza(veggiePizzaBuilder);
        Pizza veggiePizza = veggiePizzaBuilder.getResult();
        veggiePizza.printToppings();
        
        System.out.println("===================================");
    }
}