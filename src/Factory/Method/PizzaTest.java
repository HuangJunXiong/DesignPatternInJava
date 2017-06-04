package Factory.Method;

import Factory.Pizza;

/**
 * Created by lenovo on 2017/6/4.
 */
public class PizzaTest {
    public static void main(String args[]){
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.toString());
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.toString());
    }
}
