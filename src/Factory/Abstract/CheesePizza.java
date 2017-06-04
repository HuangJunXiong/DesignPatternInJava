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
        location = factory.getLocation();
        material = factory.getMaterial();
        practice = factory.getPractice();
    }

    @Override
    public String toString() {
        return "[name:"+super.getName()+";location:"+location+";material:"+material
                +";practice:"+practice+"]";
    }
}
