package Factory.Method;

import Factory.ChicagoStyleCheesePizza;
import Factory.Pizza;

/**
 * Created by lenovo on 2017/6/4.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else{
            return null;
        }
    }
}
