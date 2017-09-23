package Decorator;

/**
 * Created by huangjunxiong on 2017/9/24.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.50 + beverage.cost();
    }
}
