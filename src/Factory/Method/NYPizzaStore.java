package Factory.Method;

import Factory.NYStyleCheesePizza;
import Factory.Pizza;

/**
 * Created by lenovo on 2017/6/4.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else{
            return null;
        }
    }
}
