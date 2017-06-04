package Factory.Abstract;

/**
 * Created by lenovo on 2017/6/4.
 */
public class PizzaTest {
    public static void main(String args[]){
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        pizza.prepare();
        System.out.println(pizza.toString());
    }
}
