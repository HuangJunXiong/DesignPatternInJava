package Factory.Method;

import Factory.Pizza;

/**
 * Created by lenovo on 2017/6/4.
 */
public abstract class PizzaStore {
    abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        return pizza;
    }
}
