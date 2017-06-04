package Factory.Abstract;

/**
 * Created by lenovo on 2017/6/4.
 */
public class ChicagePizzaFactory implements PizzaFactory {
    @Override
    public String getMaterial() {
        return "芝加哥的面粉";
    }

    @Override
    public String getPractice() {
        return "芝加哥的面粉";
    }

}
