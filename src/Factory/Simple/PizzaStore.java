package Factory.Simple;

import Factory.Pizza;

/**
 * Created by lenovo on 2017/6/4.
 */
public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        return pizza;
    }
    public static void main(String args[]){
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());
    }
}
