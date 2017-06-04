package Factory.Abstract;

/**
 * Created by lenovo on 2017/6/4.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaFactory factory = new NYPizzaFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(factory);
            pizza.setName("纽约口味的披萨");
        }
        return pizza;
    }
}
