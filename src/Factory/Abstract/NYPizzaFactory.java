package Factory.Abstract;

/**
 * Created by lenovo on 2017/6/4.
 */
public class NYPizzaFactory implements PizzaFactory {
    @Override
    public String getMaterial() {
        return "纽约的面粉";
    }

    @Override
    public String getPractice() {
        return "纽约的做法";
    }

    @Override
    public String getLocation() {
        return "纽约";
    }
}
