package Factory.Simple;

import Factory.CheesePizza;
import Factory.GreekPizza;
import Factory.Pizza;

/**
 * Created by lenovo on 2017/6/4.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
