package Factory.Abstract;

/**
 * Created by lenovo on 2017/6/4.
 */
public class CheesePizza extends Pizza {
    PizzaFactory factory;
    public CheesePizza(PizzaFactory factory){
        this.factory = factory;
    }

    void prepare() {
        System.out.println("Preparing "+name+"的披萨中...");
        material = factory.getMaterial();
        practice = factory.getPractice();
    }
}
